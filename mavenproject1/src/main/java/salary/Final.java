package salary;

public class Final extends Hrapf {
	double i;
	public void total()
	{
		i = (a+c+g)-(h+b);
		System.out.println("Total Salary= Rs"+ i + "/-");
	}

	public static void main(String[] args) {
		Final j = new Final();
		j.salary1(40000,1500, 7000);
		j.salary2();
		j.total();
		
		
		// TODO Auto-generated method stub

	}

}
