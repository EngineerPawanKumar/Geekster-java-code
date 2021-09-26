
public class PrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=10,i;
		boolean isPrime = true;
		for(i=2;i<n;i++)
		{
			if (n%i == 0){
			System.out.println(n+"is not a prime number");
			isPrime = false;
			break;
			}
		}
		
		
		if(isPrime == true) {
			System.out.println(n+"is a prime number");
		}
			}
				
			
		}
	

	
