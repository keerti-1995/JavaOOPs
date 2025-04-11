
/***Abstraction** :it is nothing but hiding the implementation from the user,just giving the functionalities.
 * in abstraction class we can use both abstract and non abstract methods.
 * if we don't use initialy the class as abstract when we change the method as abstract,class will converted as abstract class.
 * in abstract class access modifires should be public or protected to methods and variables but not as private.we need to inherit the ppty from parent to child.
 * we can't create the object of abstract class.
 * if we want use ppty from parent to child should use extends keyword following the parent name.
 * 
 * 
 * Interfaces:it define contract that classes should follow it.
 * in interfaces we should use only abstract methods and abstract variables.
 * interfces allowed only public modifier,not other modifiers.
 * we should create obj with the help of child class to access the methods.
 * we use the implements keyword to connect interface,then  that child class force us to implement the body to the methods.
 * 
 * diffrences bn interfaces and abstrct class
 */
*/







* Inheritence means using the properties from parent to child by using extends keyword. 
*   we can inherit methods ,varibles.
*   but in interface we will use the methods only we only impkment the body for it in child class but in inheritence we can use ready code to child class .


imp interview questions on inheritence

1)class x
{
}
class y
{
}class z extends x,y
 is this allowed in inhertence No,because java wont support for mulitiple inheritence for this we can use interface.
 
 2)class a
 {
 int i=10;
 }
 class b extends a
 {
 int i=20;
 }
 public satic void main()
 {
 b x=new b();
 system.out.printl(i);
 }
 o/p:20
  
  suppose if they ask like
  {
  a x=new b()
  System.out.println(i);
  }
  o/p:10
  
  
  because in second time creating object ,they ctreated the object for class b but want to extract from class a.here object can access the ppty from parent class through its child class ,we use extends keyword.
 
 
 
 
 
 
