/**
 *Qiyuan Chen
   This class provides a method to convert numbers in a zip code to
      a bar code
*/
public class BarCode
{
   private int x;
   public BarCode(int n)
   {
	x=n;
   }


   public String getCode()
   {
      String barCode="|";
      int check=0;
      Digit A=new Digit(x%10);
      Digit B=new Digit((x/10)%10);
      Digit C=new Digit((x/100)%10);
      Digit D=new Digit((x/1000)%10);
      Digit E=new Digit((x/10000)%10);

      if((total=(x%10)+((x/10)%10)+((x/100)%10)+((x/1000)%10)+((x/10000)%10)%10)!=0){
      	check=((x%10)+((x/10)%10)+((x/100)%10)+((x/1000)%10)+((x/10000)%10)l)%10;
      }else if((total=(x%10)+((x/10)%10)+((x/100)%10)+((x/1000)%10)+((x/10000)%10))%10)==0){
      	check=0;
      }
      Digit checks=new Digit(check);
      barCode=barCode+E.getCode();
      barCode=barCode+D.getCode();
      barCode=barCode+C.getCode();
      barCode=barCode+B.getCode();
      barCode=barCode+A.getCode();
      barCode=barCode+checks.getCode();
      barCode=barCode+("|");



      return barCode;
   }



   private int zip;
}

