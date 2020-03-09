public class MarriedPerson extends Person {
	private int children;
	//Constructor
	public MarriedPerson(String lastname, String firstname, int age, float salary,int sex, int children) {
		super(lastname, firstname, age, true, salary, sex);
		this.children = children;
	}
	//Get
	public int getNoOfChildren() { return children; }
	//Set
	public void setNOC(int noc) { children = noc; }
	public void setMarried(boolean marmar) {
		super.setMarried(true);
		}
	public void setSalary(MarriedPerson spouse){
		if(spouse.getSex() == this.getSex());
		this.setSalary(this.getSalary() + spouse.getSalary());
	}
	//printInfo
	public void printInfo(){
		super.printInfo();
		System.out.print("Also has ");
		if (getNoOfChildren()==0){
			System.out.print("no");
		}else{System.out.print(getNoOfChildren());}
		System.out.println(" children.");
	}
} 