package spring.ch01;

public class WriteArticleServiceImpl implements WriteArticleService {

	private ArticleDao articleDao; // 컨테이너를 통해 주입. new를 통해 선언하여 만드는 것이 아닌 컨테이너가 가지고 있는 객체 중 맞는 타입의 객체를 이용하여 생성
	
	public WriteArticleServiceImpl(ArticleDao articleDao) {
		this.articleDao = articleDao; 
	}

	public void write(Article article) {

		System.out.println("WriteArticleServiceImpl.write() 메서드 실행");

		articleDao.insert(article);

	}

}
