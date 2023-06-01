package spring.ch01;

public class MySQLArticleDao implements ArticleDao {

	public void insert(Article article) {

		System.out.println("MySQLArticleDao.insert() 실행");

	}

}
