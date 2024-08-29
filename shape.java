package Programs;
import java.util.*;

class shape_1 {
	int x,y;
	void getArea() {
		System.out.println("It is a get area method.");
	}
}
class Rectangle extends  shape_1{
	void getArea() {
		Scanner input = new Scanner(System.in);
		System.out.println("enter x: ");
		int x = input.nextInt();
		System.out.println("enter y: ");
		int y = input.nextInt();
		System.out.println("Area is :" + x*y);
	}
}
public class shape {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle d1 = new Rectangle();
		d1.getArea();
	}
}
