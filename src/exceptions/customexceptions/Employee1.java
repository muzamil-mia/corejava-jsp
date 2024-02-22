package exceptions.customexceptions;

public class Employee1 {
	String name;
	String job;
	private double sal;
	
	public Employee1(String name, String job, double sal){
		if(sal > 1000) {
			this.sal = sal;
		} else {
			try {
				throw new SalaryIncorrectException("invalid salary");
			}catch (SalaryIncorrectException ex) {
				System.out.println(ex);
			}
		}
		this.name = name;
		this.job = job;
	}
	
	public void setSal(double sal) {
		if(sal > 1000) {
			this.sal = sal;
		} else {
			try {
				throw new SalaryIncorrectException("invalid hike");
			}catch (SalaryIncorrectException ex) {
				System.out.println(ex);
			}
		}
	}
	public void display() {
		System.out.println("Ename: " + this.name + " Job: " + this.job + " Salary: " + this.sal);
	}
}
