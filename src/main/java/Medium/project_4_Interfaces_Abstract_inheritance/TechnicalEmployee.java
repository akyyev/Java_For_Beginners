package Medium.project_4_Interfaces_Abstract_inheritance;

public class TechnicalEmployee extends Employee{

	private int checkIns;
	private static double tech_Salary = 75000;
	
	public TechnicalEmployee(String name) {
		super(name, tech_Salary);
		this.checkIns=0;
	}

	@Override
	public String employeeStatus() {
		return getEmployeeID()+ " "+getName()+ " has "+checkIns+" successful check ins";
	}

	public int getCheckIns() {
		return checkIns;
	}
	public void setCheckIns() {
		this.checkIns++;
	}
	
}

class TechnicalLead extends TechnicalEmployee{
	
	private double techLeadSalary = super.getBaseSalary()*1.3;
	
	
	public TechnicalLead(String name) {
		super(name);
		setBaseSalary(techLeadSalary);
		
		
	}

	
}


class SoftwareEngineer extends TechnicalEmployee{
	
	private boolean codeAccess;
	
	public SoftwareEngineer(String name) {
		super(name);
		codeAccess = false;
	}
	
	public boolean getCodeAccess() {
		return codeAccess;
	}
	
	public void setCodeAccess(boolean access) {
		this.codeAccess = access;
	}
	
	public int getSuccessfulCheckIns() {
		return getCheckIns();
	}
	
	
	//not completed
	public boolean checkInCode() {
		return false;
	}
	
	
}