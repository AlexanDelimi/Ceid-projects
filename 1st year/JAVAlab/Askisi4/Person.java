public class Person {
	private String lastname;
	private String firstname;
	private int age;
	private boolean married;
	private float salary;
	public static final int MALE = 0;
	public static final int FEMALE = 1;
	private int sex; 
	//Constructor
	public Person (String lastname, String firstname, int age, boolean married, float salary, int sex) {
		this.lastname = new String(lastname);
		this.firstname = new String(firstname);
		this.age = age;
		this.married = married;
		this.salary = salary;
		this.sex = sex;
	}
	//Getters
	public String getLastName() { return lastname; }
	public String getFirstName() { return firstname; }
	public boolean isMarried() { return married; }
	public int getAge() { return age; }
	public float getSalary() { return salary; }
	public int getSex() {return sex; }
	//Setters
	public void setLastName(String ln) { lastname = ln; }
	public void setFirstName(String fn) { firstname = fn; }
	public void setAge(int a) { age = a; }
	public void setMarried(boolean mar) { married = mar; }
	public void setSalary(float sal) { salary = sal; }
	public void setSex(int se) {sex = se; }
	//printInfo
	public void printInfo(){
		System.out.print(getFirstName()+" "+getLastName()+" is a "+getAge()+" years old ");
		if(sex==0){
			System.out.print("male");
		}else{System.out.print("female");}
		System.out.print(", gets a "+getSalary()+" Euros salary and is");
		if (isMarried() == false){System.out.print(" not");}
		System.out.println(" married.");
	}
} 