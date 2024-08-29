package Programs;
class inheritance {
	int salary = 60000;
}
class Engineer extends inheritance {
	int bonus = 10000;
}
class Test{
	public static void main(String[]args)
	{
		Engineer e1 = new Engineer();
		System.out.println("Salary"+e1.salary+"\n bonus"+e1.bonus);
	}
}
