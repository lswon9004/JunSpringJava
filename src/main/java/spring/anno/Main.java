package spring.anno;

import org.springframework.beans.BeansException;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		try (AbstractApplicationContext context = new GenericXmlApplicationContext("annoTest.xml")) {
			Foo f = context.getBean("foo", Foo.class);
			f.doFoo();
			
			context.registerShutdownHook();
		} catch (BeansException e) {
			e.printStackTrace();
		}
	}

}
