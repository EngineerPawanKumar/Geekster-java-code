
public class Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 83405198;
		int count = 0;
		if(n==0) {
			System.out.print("1");
			}
		else {
			while(n!=0) {
				n = n/10;
				count = count+1;
			}
			{
				System.out.println(count);
				}
		}
		

	}

}
