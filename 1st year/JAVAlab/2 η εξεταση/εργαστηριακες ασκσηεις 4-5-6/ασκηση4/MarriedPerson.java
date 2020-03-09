public class MarriedPerson extends Person {
private int children;
public MarriedPerson(String lastname, String firstname, int age, float
salary, int sex, int children) {
super(lastname, firstname, age, true, salary, sex);
this.children = children;
}
public int getNoOfChildren() { return children; }
public void setNoofChildren(int children){
this.children = children;
}
public void printInfo(){
    System.out.print(getFirstName()+" "+getLastName()
+" is " );if(getSex()==0)System.out.print("Male");else System.out.print("Female");
System.out.print( " is "+getAge()+ " years old, gets a " + getSalary()
+" Euros salary and is" + " married with ");
if (getNoOfChildren() > 0)
System.out.print(getNoOfChildren());
else System.out.print("no");
System.out.println(" children.");}
public void setMarried(boolean married ){}
public void setSalary(MarriedPerson spouse){
if(spouse.getSex()!=this.getSex())
{
   this.setSalary(this.getSalary() + spouse.getSalary());
}
}
}