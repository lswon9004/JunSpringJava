package spring.anno;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration// 직접 bean 을 사용하는 것이 아니라 bean 생성하기 위한 클래스
public class Baz {
	
	@Bean
	public Foo makeFoo() {
	Foo f = new Foo();
	return f;
	}
}