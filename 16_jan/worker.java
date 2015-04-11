class Worker extends Employee
{ 
 private int time_lim;
 Worker(String s,int e,int sa,int time)
 {
   super(s,e,sa);
   time_lim=time;
   
 }
 
 int getime()
 {
  return time_lim; 
 }
}