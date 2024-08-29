package Programs;

public class Computer {
	class processor{
		public void displayDetails() {
			System.out.println("brand : Dell");
			System.out.println("speed : 234 rpm");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer myObj1 = new Computer();
		Computer.processor myObj = myObj1.new processor();
		myObj.displayDetails();
		}

}
