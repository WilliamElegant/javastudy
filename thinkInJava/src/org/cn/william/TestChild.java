package org.cn.william;

public class TestChild extends TestBase{
	public static int s;
	private int a;
	
	static {
		System.out.println("���ྲ̬����飬s��" + s);
		s = 10;
	}
	
	{
		System.out.println("����ʵ������飬 a��" + a	);
		a = 10;
	}
	
	public TestChild() {
		System.out.println("���๹�췽����a:" + a);
		a = 20;
	}
	
	protected void step(){
		System.out.println("child s:" + s + ", a: " + a);
	}
}
