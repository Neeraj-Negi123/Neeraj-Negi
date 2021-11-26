class A
{
public void m()
{
System.out.println("we are in A class");
}
}

class B extends A
{
public void n()
{
System.out.println("we are in B class");
}
}

class C extends A
{
public void o()
{
System.out.println("we are in c class");
}
}

class D extends A
{
public void p()
{
System.out.println("we are in d class");
}
}

class E
{
public static void main(String args[])
{

D obj1=new D();
obj1.p();
obj1.m();
System.out.print("\n");

C obj2=new C();
obj2.o();
obj2.m();
System.out.print("\n"); 

B obj3=new B();
obj3.n();
obj3.m();
System.out.print("\n");
}
}