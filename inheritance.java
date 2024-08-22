package programms;
class employee{
	int salary = 45600;
}
class engineer extends employee{
	int bonus = 8765;
}

public class inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		engineer obj = new engineer();
		System.out.println("salary: " + obj.salary + "\nBONUS:" + obj.bonus);

	}

}
