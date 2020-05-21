



/*Create a class named 'Member' having the following members:
Data members
1 - Name
2 - Age
3 - Phone number
4 - Address
5 - Salary
It also has a method named 'printSalary' which prints the salary of the members.
Two classes 'Employee' and 'Manager' inherits the 'Member' class.
The 'Employee' and 'Manager' classes have data members 'specialization' 
and 'department' respectively. Now, assign name, age, phone number, address 
and salary to an employee and a manager by making an object of both of these 
classes and print the same.*/





 package exercise1;

 class Ans {
	int age;
	String no;
	String Address,name;
	int salary;
	public void printSalary()
	{
		System.out.println(salary);
	}
	
}

class Employee extends Ans{
  String specialization;
}

class Manager extends Ans{
  String department;
}


public class Members{
	public static void main(String[] args) {
	System.out.println("main");
	Employee e = new Employee();
	    e.name = "xyz";
	    e.age = 23;
	    e.no = "986****";
	    e.Address = "xyzxyz";
	    e.salary = 1231;
	    e.specialization = "xyzxyz";
	    

	    Manager m = new Manager();

	}

}

