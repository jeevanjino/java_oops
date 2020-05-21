package exercise;

public class Employee {
	int sal;
	int hr;
	public void getinfo(int salary,int hours)
	{
		sal=salary;
		hr=hours;
		if(sal<500)
		{
			Addsal();
		}
		if (hr>6)
		{
			Addwork();
		}
	}
	public int Addsal()
	{ 
		sal+=10;
		return sal;
		
	}
	public int  Addwork()
	{
		
		
			sal+=5;
		
		return sal;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee s=new Employee();
		s.getinfo(700,8);
		System.out.println(s.sal);
		

	}    

}
