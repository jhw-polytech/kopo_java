import java.util.Random;

public class Figure {


    int num;
    int ran1, ran2;
    double data;

    Random r= new Random(); 
    
    void Fig(int num) {
      this.num = num;
      
      if(num==1) {
         this.ran1=r.nextInt(9)+2; //2-10사이의 난수 추출
         this.ran2=r.nextInt(9)+2;
         this.data=ran1*ran2;
      }
      if(num==2) {
         this.ran1=r.nextInt(9)+2;
         this.data=ran1*ran1;
         
      }
      if(num==3) {
         this.ran1=r.nextInt(9)+2;
         this.ran2=r.nextInt(9)+2;
         this.data=ran1*ran2*0.5;
      }
      if(num==4) {
         this.ran1=r.nextInt(9)+2;
         this.data=(3.14)*ran1*ran1;
      }
      
     
  }
   
}
