class test3 extends abs1{
 private int j;
 test3(int r){
 j=r;
 }
 void mul(int t)
 {
   System.out.println("Hi Its me: "+ 2*t*j);
 }
 public static void main(String agrs[])
 {
      test3 t=new test3(324);
    t.mul(3);
 }
}
