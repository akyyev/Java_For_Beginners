package Beginner.day55_Polymorphisim;
import java.util.ArrayList;
import java.util.Arrays;
abstract class ScrumTeam{
    
    public String Name , JobTitle;
    public double Salary;
    
    public abstract void DailyStandUp();
    public abstract void Demo();
    
    public void getEmployeeInfo() {
        System.out.println("=====================================");
        System.out.println("Employee Name: "+Name);
        System.out.println("Job Title: "+JobTitle);
        System.out.println("Salary: $"+Salary);
        System.out.println("=====================================");
    }
}
class Testers extends ScrumTeam {
    /*
     Name, JobTitle, Salary
     */
    public Testers(String Name, String JobTitle, double Salary ) {
        this.Name = Name;
        this.JobTitle = JobTitle;
        this.Salary = Salary;
    }
    
    public void DailyStandUp() {
        System.out.println("Tester "+Name+" is talking");
    }
    
    public void Demo() {
        System.out.println("Tester "+Name+" is doing demo");
    }
}
class Developers extends ScrumTeam{
    /*
     Name, JobTitle, Salary
     */
    public Developers(String Name, String JobTitle, double Salary) {
        this.JobTitle =JobTitle;
        this.Name =Name;
        this.Salary = Salary;
    }
    
    
    public void DailyStandUp() {
        System.out.println("Developer "+Name+" is talking");
    }
    
    public void Demo() {
        System.out.println("Developer "+Name+" is doing demo");
    }
    
    
}
public class BOA {
    public static void main(String[] args) {
        ScrumTeam Kelly = new Testers("Kelly", "SDET", 130000);
        ScrumTeam Vera = new Testers("Vera", "Automation Tester", 100000);
        ScrumTeam Mary = new Testers("Mary Holly", "Manual Tester", 40000);
    
        ScrumTeam[] testers = {Kelly,  Vera, Mary};
        /*
        for( ScrumTeam each: testers ) {
            each.getEmployeeInfo();
        }
        */
        
        ScrumTeam Jane= new Developers("Jane", "Senior Developer", 150000);
        ScrumTeam Miranda = new Developers("Miranda", "Junior Developer", 130000);
        ScrumTeam Parsa = new Developers("Parsa", "Medium Developer", 220000);
        ScrumTeam Delare = new Developers("Dilara", "Devloper", 200000);
        
        ScrumTeam[] dev = { Jane, Miranda, Parsa, Delare};
        /*
        for( ScrumTeam each: dev ) {
            each.getEmployeeInfo();
        }
        */
        
        ArrayList<ScrumTeam> scrum = new ArrayList<>();
        scrum.addAll(  Arrays.asList(testers) );
        scrum.addAll(  Arrays.asList(dev) );
        
        for(ScrumTeam each: scrum ) {
            each.getEmployeeInfo();
        }
        
        
        
    }
    
    
    
}

