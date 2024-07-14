package spring.chap01;

import org.springframework.stereotype.Repository;

@Repository
public class MySQLArticleDao implements ArticleDao {

	public void insert(Article article) {
		System.out.println("MySQLArticleDao.insert() 실행");
	}
}
