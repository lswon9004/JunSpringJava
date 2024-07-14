package spring.di;

public class Baz {
	public void doBaz() {
		System.out.println("Baz.doBaz 실행");
	}
	public void start() {
		System.out.println("커스텀 초기화 메서드");
	}
	public void stop() {
		System.out.println("커스텀 소멸 메서드");
	}
}