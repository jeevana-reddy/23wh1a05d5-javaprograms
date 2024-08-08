package programs;

public class multiple_objects {
	int x = 30;
	float y = 45;

	public static void main(String[] args) {
		multiple_objects myObj = new multiple_objects();
		multiple_objects myObj1 = new multiple_objects();
		multiple_objects myObj2 = new multiple_objects();
		System.out.println(myObj.x);
		System.out.println(myObj1.x);
		System.out.println(myObj2.y);
		

	}

}
