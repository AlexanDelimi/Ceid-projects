public class Person {
private String lastname;
private String firstname;
private int age;
private boolean married;
private float salary;
public static final int MALE = 0;
public static final int FEMALE = 1;
private int sex;
public Person (String lastname, String firstname, int age, boolean married, float salary, int sex) {
this.lastname = new String(lastname);
this.firstname = new String(firstname);
this.age = age;
this.married = married;
this.salary = salary;
this.sex = sex;
}
public String getLastName() { return lastname; }
public void setLastName(String lastname){
    this.lastname =lastname;
}
public String getFirstName() { return firstname; }
public void setFirstName (String firstname){
 this.firstname=firstname;
}
public int getAge() { return age; }
public void setAge(int age){
 this.age = age;
}
public boolean isMarried() { return married; }
public void setMarried(boolean married){
 this.married = married;
}
public float getSalary() { return salary; }
public void setSalary(float salary){
 this.salary = salary;
}
public int getSex() {
	return sex;
}
public void setSex(int sex) {
	this.sex = sex;
}
public void printInfo(){
System.out.print(getFirstName()+" "+getLastName()+" is " );if(getSex()==0)System.out.print("Male");else System.out.print("Female");
System.out.print(" is "
+getAge()+" years old, gets a "+getSalary()
+" Euros salary and is");
if (isMarried() == false)
System.out.print(" not");
System.out.println(" married.");
}
}