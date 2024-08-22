package programms;
import java.util.Scanner;
public class scannerclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner A = new Scanner(System.in);
		System.out.println("enter your name:");
		String name = A.nextLine();
		System.out.println("enter your Roll number:");
		String rollno = A.nextLine();
		System.out.println("enter your Branch:");
		String branch = A.nextLine();
		System.out.println("name: "+ name +"\nRoll number: " + rollno + "\nBranch: "+ branch);
		

	}

}
