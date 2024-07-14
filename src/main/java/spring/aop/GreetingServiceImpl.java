package spring.aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("greeting")
public class GreetingServiceImpl implements GreetingService {

	@Value("안녕")
   private String greeting;

   public void setGreeting(String greeting) {
      this.greeting = greeting;
   }

   @Override
   public void sayHello(String name) {
      System.out.println("sayHello : " + greeting + " : " + name);

   }

   @Override
   public void sayGoodbye(String name) throws Exception{
      System.out.println("sayGoodbye : " + greeting + " : " + name);
      throw new Exception("예외 강제 발생");
   }
}