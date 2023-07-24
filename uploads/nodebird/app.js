const express = require('express');
const cookieParser = require('cookie-parser');
const morgan = require('morgan');
const path = require('path');
const session = require('express-session');
const nunjucks = require('nunjucks');
const dotenv = require('dotenv');
const passport = require('passport');

dotenv.config();
const pageRouter = require('./routes/page');
const authRouter = require('./routes/auth');  // 인증 라우터
const { sequelize } = require('./models');  // db 연동
const passportConfig = require('./passport'); // passport 로그인
const postRouter = require('./routes/post');  // 업로드
const userRouter = require('./routes/user');

const app = express();
passportConfig();

app.set('port', process.env.PORT || 8001);
app.set('view engine', 'html');
nunjucks.configure('views', { // 템플릿 엔진 설정 -> views 폴더 안의 파일 렌더링 지정
  express: app,
  watch: true,
});

sequelize.sync({ force: false })
  .then(() => {
    console.log('데이터베이스 연결 성공');
  })
  .catch((err) => {
    console.error(err);
  });

app.use(morgan('dev')); // 개발 버전 로그 출력
app.use(express.static(path.join(__dirname, 'public')));  // 정적 데이터 -> public 폴더에서 찾기
app.use(express.json());
app.use(express.urlencoded({ extended: false }));
app.use(cookieParser(process.env.COOKIE_SECRET)); // cookie parsing
app.use(session({
  resave: false,
  saveUninitialized: false,
  secret: process.env.COOKIE_SECRET,
  cookie: {
    httpOnly: true,
    secure: false,
  },
}));
app.use(passport.initialize());
app.use(passport.session());
app.use('/post', postRouter);
app.use('/img', express.static(path.join(__dirname, 'uploads')));
app.use('/user', userRouter);

app.use('/', pageRouter); // 페이지 Router -> 요청 시
app.use('/auth', authRouter);

app.use((req, res, next) => { // router가 없을 경우 다음 미들웨어로 이동
  const error =  new Error(`${req.method} ${req.url} 라우터가 없습니다.`);
  error.status = 404;
  next(error);
});

app.use((err, req, res, next) => {  // 에러 처리 미들웨어
  res.locals.message = err.message;
  res.locals.error = process.env.NODE_ENV !== 'production' ? err : {};
  res.status(err.status || 500);  // 에러 객체 안의 상태코드 / 추적 메시지 출력
  res.render('error');  // view 폴더 안의 error.html 문서 실행
});

app.listen(app.get('port'), () => { // 접속할 포트 내용 출력
  // 해당 port 번호로 접속하면 router 미들웨어들이 실행된다.
  console.log(app.get('port'), '번 포트에서 대기중');
});
