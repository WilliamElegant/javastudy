package org.cn.william;

public class TestBase {
	public static int s;
	private int a;
	
	static {
		System.out.println("���ྲ̬����飬s��" + s);
		s = 1;
	}
	
	{
		System.out.println("����ʵ������飬 a��" + a	);
		a = 1;
	}
	
	public TestBase() {
		System.out.println("���๹�췽����a:" + a);
		a = 2;
	}
	
	protected void step(){
		System.out.println("base s:" + s + ", a: " + a);
	}
	
	public void action() {
		System.out.println("base start");
		step();
		System.out.println("start end");
	}
}
