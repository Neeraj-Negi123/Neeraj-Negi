class A
{
public void x()
{
System.out.println("we are in A class");
}
}

class B extends A
{
public void y()
{
System.out.println("we are in B class");
}
}

class C extends B
{
public void z()
{
System.out.println("we are in c class");
}
}

class D
{
public static void main(String args[])
{
C ob=new C();

ob.z();
ob.y();
ob.x();
}
}