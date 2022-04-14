
package com.cygent.utils;

abstract class car
{
	 public   abstract  void honda();
	 public   abstract  void honda1(); 
	 public   abstract  void honda2();
}

class a extends car
{

	@Override
	public  void honda() 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void honda1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void honda2() {
		// TODO Auto-generated method stub
		
	}
	
}
class A  extends a
{
	final int a =3;
	void A1()
	
	{
		super.honda();
		System.out.println("A");
		
	}
}

class B extends A
{
	void B1()
	{
		System.out.println("B");
	}
	 
}
class C extends A
{
	C()
	{
		System.out.println("Con");
	}
	void c1()
	{
		System.out.println("C");
	}
	 
}

class D extends C 
{
	void c1()
	{
		System.out.println("D");
	}
	int add(int a, int b)
	{
		return a+b;
	}
	float add()
	{
		return a ;
		
	}
	int add(int a, int b,int c)
	{
		return a+b+c;
	}
}

interface va
{
	void o1();
}
class g1 implements va
{

	@Override
	public void o1() {
		// TODO Auto-generated method stub
		
	}
	
}

class N1 {
	static final  int w = 90;
	
	 	
	public static void main(String[] args) 
	{

		
		  //C cObject = new C();
		  //D dObject = new D();
		//cObject.c1();
		//dObject.c1();
		  //System.out.println(dObject.add(2, 3));
		  //System.out.println(dObject.add(2, 3,5));
		  System.out.println(w);
		  //System.out.println(cObject.a);
			/*
			 * cObject.c1(); cObject.B1(); cObject.A1();
			 */
		  car c = new a();
		  va G1 = new g1();
		
	}
	


}
