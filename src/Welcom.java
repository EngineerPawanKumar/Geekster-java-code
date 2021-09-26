
public class Welcom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Welcome to java");
		int n = 10;
		if(n==0) {
			System.out.print(n+" is Zero");
		}
		else if(n%2==0){
			System.out.print(n+" is even number");}
		else {
			System.out.print(n+" is odd number");
		}
		
		int n1 = 20;
		if(n1==0) {
			System.out.print(n1+" is Zero");
		}
		else if((n1%2==0) && (n1>0)){
			System.out.print(n1+" is +ve even ");}
		else if((n1%2==0) && (n1<0)) {
			System.out.print(n1+" is odd number");
		}
		else if((n1%2!=0) && (n1<0)) {
			System.out.print(n1+" is-ve odd number");
		}
		else {
			System.out.print(n1+" is +ve odd number");
		}
		int n2=-10;
		if((n2>0)||(n2<0)) {
			System.out.print(n2+" is Not Zero");
		}else {
			System.out.print(n2+" is Zero");
		}
		
		boolean value= true;
		System.out.print(!value);
		
		
		

	}

}
