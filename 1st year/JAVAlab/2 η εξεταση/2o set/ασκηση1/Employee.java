public abstract class Employee
{
//Variables
private String name,afm;
private int EmpId;
private static int counter=1;
//methods
public void setName(String namae) 
{
name=namae;
}
public String getName()
{
return name;
}
public void setAfm(String neafm)
{
afm=neafm;
}
public String getAfm()
{
return afm;
}
public int getEmpId()
{
return EmpId;
}
public void setEmpId(int EmpId)
{
this.EmpId=EmpId;
}
void setcounter(int counteri)
{
this.counter=counteri;
}
int getcounter()
{
return counter;
}
abstract int payment();
int getPayment()
{
return payment();
}
}
