

public class GoogleBillboard {
	public final static String e = "2.7182818284590452353602874713526624977572470936999595749669676277240766303535475945713821785251664274274663919320030599218174135966290435";  
	public static void main(final String[] args) {
		System.out.println("Not the right string, tests will fail!");
	}
	

	//Finish this function
	public boolean isPrime(){
		for(int i = 0; i < e.length(); i++){
			String tenNumsS = new e.substring(i, i+10);
			double tenNumsD = Double.parseDouble(tenNumsS);
			for(int i = 2; i <= Math.sqrt(tenNumsD); i++)
 				if(tenNumsD%i == 0)
      					return false;
  				if(tenNumsD < 2)
    					return false;
		}
  		return true;
	}

}

