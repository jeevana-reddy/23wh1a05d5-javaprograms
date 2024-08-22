package programms;

public class method_overloading {
	public int sum(int x) {
		return x+x;
	}
	public int sum(int x,int y) {
		return x+x+y+y;
	}
	public double sum(double x,double y) {
		return (x+y);
	}

	public static void main(String[] args) {
		method_overloading s = new method_overloading();
		System.out.println(s.sum(24));
		System.out.println(s.sum(23,67));
		System.out.println(s.sum(23.5,89.7));
		
		// TODO Auto-generated method stub

	}

}
