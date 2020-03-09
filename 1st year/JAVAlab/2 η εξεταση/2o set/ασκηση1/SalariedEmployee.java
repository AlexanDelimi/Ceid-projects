public class SalariedEmployee extends Employee
{
    //Variables
    private int salary=0;
    //methods
    public void setsalary(int salary)
    {
      this.salary=salary;
    }
    public int payment()
    {
        return salary;
    }
    void increasecounter()
   {
    int i=0;
    i =getcounter();
    i++;
    setcounter(i);
   }
   
     public void SalariedEmployee()
    {
        setEmpId(getcounter());
        increasecounter();              
    }
    
}
  