package spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

   public static void main(String[] args) {
      ApplicationContext container = new GenericXmlApplicationContext("aopTest.xml");
      GreetingService greeting = container.getBean("greeting", GreetingService.class);
      greeting.sayHello("김자바");
      try {
		greeting.sayGoodbye("김자바");
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
      
   }

}