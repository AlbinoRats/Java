
public class Digit
{
   private String bar;
   private int zipcode;
   public Digit(int n)
   {
		zipcode=n;

   }


   public String getCode()
   {
   	if(zipcode==0){
   		bar="||:::";
   	}else if(zipcode==1){
   		bar=":::||";
   	}else if(zipcode==2){
   		bar="::|:|";
   	}else if(zipcode==3){
   		bar="::||:";
   	}else if(zipcode==4){
   		bar=":|::|";
   	}else if(zipcode==5){
   		bar=":|:|:";
   	}else if(zipcode==6){
   		bar=":||::";
   	}else if(zipcode==7){
   		bar="|:::|";
   	}else if(zipcode==8){
   		bar="|::|:";
   	}else if(zipcode==9){
   		bar="|:|::";
   	}
   		return bar;





   }

   private int zip;
}