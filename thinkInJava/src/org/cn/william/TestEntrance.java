package org.cn.william;

public class TestEntrance {

	public static void main(String[] args) {
		System.out.println("----new Child()");
		TestChild c = new TestChild();
		
		System.out.println("\n ----c.action()");
		c.action();
		
		TestBase b = c;
		System.out.println("\n-----b.action()");
		b.action();
		
		System.out.println("\n---b.s:" + b.s);
		System.out.println("\n---c.s:" + c.s);
			
		
	}

}
