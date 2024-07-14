package spring.di;

public class Foo {
	Bar bar;
	Baz baz;
	String str;
	int i;
//	public Foo(String str, int i) {
//		System.out.println("생성자 String str, int i");
//	}
	public Foo(String str, double i) {
		System.out.println("생성자 String str, double i");
	}
//	public Foo(String str, String str1) {
//		System.out.println("생성자 String str, String str1");
//	}
	
	public Foo(Bar bar, Baz baz, String str, int i) {
		this.bar = bar;
		this.baz = baz;
		this.str = str;
		this.i = i;
	}
	public Foo(Bar bar, Baz baz) {
		this.bar = bar;
		this.baz=baz; 
	}
	public void doFoo() {
		System.out.println("Foo.doFoo 실행");
		bar.doBar();//의존 관계
		System.out.println(i+" "+str);
	}
}
