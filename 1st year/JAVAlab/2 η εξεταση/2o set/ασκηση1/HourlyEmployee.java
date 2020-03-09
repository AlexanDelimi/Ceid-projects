public class HourlyEmployee extends Employee
{
   //idiothtes
    private int hoursWorked=0,hourlyPayment=0;
    
    //methodoi
   public void sethoursWorked(int hoursWorked)
   {
       this.hoursWorked=hoursWorked;
    }
   public int gethoursWorked()
   {
       return hoursWorked;
    }
    public void sethourlyPayment(int hourlyPayment)
    {
     this.hourlyPayment=hourlyPayment;
    }
    public int gethourlyPayment()
    {
    return hourlyPayment;
    }
    public int payment()
    {
    return hoursWorked*hourlyPayment;
    }
    void increasecounter()
    {
    int i=0;
    i =getcounter();
    i++;
    setcounter(i);
    }
    public void HourlyEmployee()
    {
        setEmpId(getcounter());
        increasecounter();
        
    }
}
