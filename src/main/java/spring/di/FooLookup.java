package spring.di;

public class FooLookup {
	private Baz baz;
	
	public void doFooLookup() {
		System.out.println("FooLookup 실행");
		baz = getBaz();
		baz.doBaz();
	}
	
	//lookup메서드 - 컨테이너사 Baz타입의 bean을 꺼내서 넘겨줌
	public Baz getBaz() {
		return null;
	}
}
