class Class_s2{
static int i;
 int p;
 static void set_ds(Class_s2 a){
 a.p=90;
 i++;
 }
 static{
 i=90;
 System.out.println("Hi How are you: "+ i);
 }
 public static void main(String args[])
 {
   System.out.println("In main");
   Class_s2 b=new Class_s2();
   set_ds(b);
   System.out.println("This is "+b.p+"  and the static is "+i);
 }
 
}