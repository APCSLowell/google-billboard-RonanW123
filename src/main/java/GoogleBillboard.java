public class GoogleBillboard {
  public final static String e = "2.7182818284590452353602874713526624977572470936999595749669676277240766303535475945713821785251664274274663919320030599218174135966290435";  
  public static void main(final String[] args) {
    System.out.println("Not the right string, tests will fail!");
    System.out.println(setup());
  }
  
  public String setup(){
     for(int i = 2; i < e.length()-12; i++){
        String tenNumsS = e.substring(i, i+10);
        double tenNumsD = Double.parseDouble(tenNumsS);
          if(isPrime(tenNumsD))
            return tenNumsD + "";
     }
     return "";
  }
  //Finish this function
  public boolean isPrime(double dNum){
      for(int i = 2; i <= Math.sqrt(dNum); i++)
          if(dNum%i == 0)
              return false;
           if(dNum < 2)
              return false;
      return true; 
  }

}

