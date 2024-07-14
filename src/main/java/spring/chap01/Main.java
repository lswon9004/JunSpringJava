package spring.chap01;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {
	// BeanFactory : 컨테이너
	public static void main(String[] args) {
		// Resource resource = new ClassPathResource("applicationContext.xml");
		ApplicationContext beanFactory = new GenericXmlApplicationContext("applicationContext.xml");
		WriteArticleService articleService = 
				beanFactory.getBean("writeArticleServiceImpl", WriteArticleService.class);
		articleService.write(new Article());
	}
}
