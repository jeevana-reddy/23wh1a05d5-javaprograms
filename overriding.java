package programms;
class animal{
	public void display()
	{
		System.out.println("IT IS A DOG");
	}
}
class dog extends animal{
	public void display() {
		System.out.println("IT IS A GOOD DOG");
	}
}
public class overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dog d1 = new dog();
		d1.display();

	}

}
