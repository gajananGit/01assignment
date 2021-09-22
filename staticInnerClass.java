package com.cj.innerClass;
 
public class staticInnerClass {
	
	class C {
	
	}//non static inner class
	
	
	int x;//instance obj
	static int y;
	private static staticInnerClass Sic;
static {
	System.out.println("static block of outer class");
}
{
System.out.println(" non static block of outer class");
}
	public staticInnerClass() {
		System.out.println("outer constroctor class");
	}
	static void m1() {
		System.out.println("static method of outer class");
	}
	void m2() {
		class B {}//local inner class
		System.out.println("non static method of outer class");
	}
	public static void main(String[] args) {
		
		staticInnerClass. Sic=new staticInnerClass();
		//patil p=new patil();
	}

 static class patil{//static inner class
		int a;//instance obj
		static int b;
	static {
		System.out.println("static block of inner class");
	}
	{
	System.out.println(" non static block of inner class");
	}
		/*public staticInnerClass() {
			System.out.println("outer class");
		}*/
		static void inner1() {
			System.out.println("static method of inner class");
		}
		void inner2() {
			System.out.println("non static method ofinner class");
		}
		staticInnerClass sic=new staticInnerClass() {
			
		};//Anonymous inner class
		public static void main(String[] args) {
			
			staticInnerClass.patil p1=new staticInnerClass.patil();
			patil p=new patil();
			staticInnerClass Sic1=new 	staticInnerClass();
			//staticInnerClass.patil p11 = Sic.new patil();
			p.inner2();
			p.inner1();
		}

 }
 
}
