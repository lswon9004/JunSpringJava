package spring.di;

public class Fooo {
	Bar bar;
	String str;
	int i;

	public void doFooo() {
		System.out.println("Fooo.doFooo실행");
		bar.doBar();
		System.out.println(i + " " + str);
	}

	public void setBar(Bar bar) {
		this.bar = bar;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public void setI(int i) {
		this.i = i;
	}

}
