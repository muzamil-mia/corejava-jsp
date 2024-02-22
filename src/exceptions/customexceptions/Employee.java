package exceptions.customexceptions;

public class Employee {
	String name;
	private double sal;
	String job;

	public Employee(String name, String job, double sal) throws SalaryInvalidException  {
		this.name = name;
		this.job = job;
		if (sal > 1000) {
			this.sal = sal;
		} else {
			try {
				throw new SalaryInvalidException();
			} finally {
				System.out.println("enter the valid salary");
			}
		}
	}
	
	public void setSal(double sal) throws SalaryInvalidException  {
		if(sal > 1000) {
			this.sal = sal;
		}else {
			try {
				throw new SalaryInvalidException();
			} finally {
				System.out.println("emter the valid salary");
			}
		}
	}
	
	public void display() {
		System.out.println("Ename: " + this.name + "Job: " + this.job + "Salary: " + this.sal);
	}
}
