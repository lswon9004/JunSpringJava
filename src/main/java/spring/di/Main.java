package spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// 컨테이너 생성 -> xml문서 읽어서 빈 생성, 의존성 객체 주입, 사용 기다림
		AbstractApplicationContext context = new GenericXmlApplicationContext("diTest.xml");
		Bar b = context.getBean("bar", Bar.class);
		b.doBar();
		Foo f = context.getBean("foo", Foo.class);
		f.doFoo();
		System.out.println(b==f.bar);
		Fooo fo = context.getBean("fooo", Fooo.class);
		fo.doFooo();
		FooLookup flu = context.getBean("fooLookup",FooLookup.class);
		flu.doFooLookup();
		
		context.registerShutdownHook();//컨테이너 강종
	}

}
