class prac1
{
static int p;
 int q;
 prac1(int q)
 {
   this.q=q;
   this.p=90;
 }
 static{
  p=34;
  }
  public static int mul()
  {
   return p*2;
  }
  public static void main(String args[])
  {
     int t[]=new int[23];
     for(int i=0;i<2;i++)
     {
         t[i]=p;
         p++;
         System.out.println("Hi\n"+t[i]);    
     }
     
  }
}