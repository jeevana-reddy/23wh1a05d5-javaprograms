package programs;

public class parameter_constructor {
	int x ;
	public parameter_constructor(int y )  {
		x = y ;
	}

	public static void main(String[] args) {
		parameter_constructor myObj = new parameter_constructor(256);
		System.out.println(myObj.x);
		

	}

}
