package spring.anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import jakarta.annotation.Resource;

@Component
public class Foo {
	
	@Resource
	@Autowired
	Bar bar;
	
	@Value("안녕")
	String str;
	
	public void doFoo() {
		System.out.println("Foo.doFoo() 실행");
		bar.doBar();//의존 관계
		System.out.println("문자열 주입 : "+str);
	}
	
	@PostConstruct
	public void start() {
		System.out.println("초기화 : start()");
	}
	
	@PreDestroy
	public void stop() {
		System.out.println("소멸 : stop()");
	}
}
