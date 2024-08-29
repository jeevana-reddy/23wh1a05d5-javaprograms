package Programs;

public class dog {
	String name,color;
	public dog(String x,String y) {
		name = x;
		color = y;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dog myObj = new dog("cheekuta","white");
		System.out.println(myObj.name);
		System.out.println(myObj.color);


	}

}
