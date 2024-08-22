package programms;
import java.util.Scanner;

public class interest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner A = new Scanner(System.in);
		System.out.println("enter your percentage:");
		double p = A.nextDouble();
		System.out.println("enter your Roll time:");
		double t = A.nextDouble();
		System.out.println("enter your rate:");
		double r = A.nextDouble();
		double  i = (p*t*r)/100;
		System.out.println("INTERESET :"+ i);
	}

}
