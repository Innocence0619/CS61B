/**这个好像就是龟兔赛跑的悖论，就是说后者永远追不上前者。*/
public class AT{
   public static void main(String[] args){
      double Apos = 0;
      double Tpos = 100;
      int Aspeed = 20;
      int Tspeed = 10;
      double Sumtime = 0;
      
      while(Apos < Tpos){
      System.out.println("At time:" + Sumtime);
      System.out.println("A is at:" + Apos) ;
         System.out.println("T is at:"+ Tpos);
         
      double Reachtime =   (Tpos - Apos) / Aspeed;
         Apos = Apos + Aspeed * Reachtime;
         Tpos = Tpos + Tspeed * Reachtime;
         Sumtime = Sumtime + Reachtime;
      }
     
}
}
