package programs;

public class palindrome {

	public static void main(String[] args) {
		int x = 898,y,a,sum =0; 
				y = x;
				while(y != 0) {
					a = y%10;
					sum = sum + a*10 ;
					y = y / 10;
					
				}
				if(sum == x) {
					System.out.println("It is a palindrome..!");
				}
				else {
					System.out.println("It is not a palindrome..!");
						
					}
				}
	}


