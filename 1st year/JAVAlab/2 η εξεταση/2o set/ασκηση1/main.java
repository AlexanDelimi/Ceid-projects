import java.util.*;
public class main
{

    public static void main(String args[])
    {
         List<Employee> a1 = new ArrayList();
         SalariedEmployee employee1=new SalariedEmployee(); 
        employee1.setName("Tzortzhs");
        employee1.setAfm("72340002");
        employee1.setsalary(3000);
         a1.add(0,employee1);
         HourlyEmployee employee2=new HourlyEmployee();
         employee2.setName("Zina");
        employee2.setAfm("8145821");
        employee2.sethoursWorked(210);   
        employee2.sethourlyPayment(20);
        a1.add(1,employee2);
       for(int i=0; i<a1.size();i++)
       {
           System.out.println("Employee ID: "+a1.get(i).getEmpId());
           System.out.println("Employee Name: "+a1.get(i).getName());
           System.out.println("Employee Afm: "+a1.get(i).getAfm());
           System.out.println("Employee payment: "+a1.get(i).getPayment());
           
           
        }
        
        
        
    }
}