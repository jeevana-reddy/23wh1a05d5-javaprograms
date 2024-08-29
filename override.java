package Programs;
class Animal {
	void move() {
		System.out.println("It is a Animal class");
	}
}
class cheetah extends  Animal{
	void move() {
		System.out.println("It is a cheetah class");
	}
}
public class override {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cheetah d1 = new cheetah();
		d1.move();
	}

}
