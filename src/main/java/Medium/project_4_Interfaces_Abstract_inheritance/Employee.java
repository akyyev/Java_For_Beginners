package Medium.project_4_Interfaces_Abstract_inheritance;

public abstract class Employee {

	
	private String name;
	private double baseSalary;
	private int id;
	private Employee manager;
	private static int employeeIDCounter=0;
	
	public Employee(String name, double baseSalary) {
		this.name = name;
		this.baseSalary = baseSalary;
		employeeIDCounter++;
		id = employeeIDCounter;
		
	}
	
	public String getName() {
		return name;
	}
	public double getBaseSalary() {
		return baseSalary;
	}
	public void setBaseSalary(double salary) {
		this.baseSalary = salary;
	}
	
	public int getEmployeeID() {
		return id;
	}
	public Employee getManager() {
		return manager;
	}
	
	public boolean equals(Employee other) {
		return this.id==other.id;
	}
	
	public String toString() {
		return id+" "+ name;
	}
	
	public abstract String employeeStatus();
}

/*
 * employee
 * 		Business Employee
 * 			Accountant
 * 			Business Lead
 * 		Technical Employee
 * 			Technical Lead
 * 			SoftwareEngineer
 */
