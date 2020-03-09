 
public class Room_Type_C extends Room{
	private int minimum_people,minimum_days;//elaxistos arithmos atomwn kai elaxistos arithmos hmerwn
	//constructor
	Room_Type_C(){
		
	}
	Room_Type_C(int maximum_capacity,double price_per_person,int people,int days)
	{  super(maximum_capacity,price_per_person);//kanei gia thn megisth xwrithkothta kai gia thn timh ana atomo 
	    //oti kai o constructor ths Room
	    this.minimum_people=people;//thetei ton elaxisto arithmo atomwn apo to orisma
	    this.minimum_days=days;//thetei ton elaxisto arithmo hmerwn apo to orisma
	   
	   
	   }
	   //methods
	public int getMinimum_people() {
		return minimum_people;
	}

	public void setMinimum_people(int minimum_people) {
		this.minimum_people = minimum_people;
	}

	public int getMinimum_days() {
		return minimum_days;
	}

	public void setMinimum_days(int minimum_days) {
		this.minimum_days = minimum_days;
	}
	
	boolean new_booking(Booking booketo)//yperkalyptei thn methodo ths roo  new_booking 
	{
			if(this.maximum_capacity < booketo.getPeople()&& this.minimum_people>booketo.getPeople()&&this.minimum_days<booketo.getDays_of_accomodation()){
            //elegxei an threitai h megisth xwritikothta kai o elaxistos arithmos hmerwn kai atomwn 
			    return false;//epistrefei false an den threitai
			 }                                     
        //alliws kanei oti kai h new_booking ths Room
			 try{
         for(int j = booketo.getArrival();j <=(booketo.getArrival() + booketo.getDays_of_accomodation()-1);j++) 
         if(this.availability[j] != null){
            return false;}                                                  
         
          for(int j = booketo.getArrival();j <=(booketo.getArrival()-1 + booketo.getDays_of_accomodation());j++) 
          this.availability[j] = booketo;      
          booketo.setRoom(this);
          return true;  
             
            }
        catch(java.lang.ArrayIndexOutOfBoundsException e){
            return false;
		}
		}
}
