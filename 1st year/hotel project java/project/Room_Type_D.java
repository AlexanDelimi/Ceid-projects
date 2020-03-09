 

public class Room_Type_D extends Room_Type_A {
    private int minimum_people;//elaxista atoma
    Room_Type_D(){
    
    }
    Room_Type_D(int maximum_capacity,double price_per_person,double price,int people){
       super(maximum_capacity,price_per_person,price);//kanei gia thn megisth xwrithkothta 
    // gia thn timh ana atomo kai gia thn timh ana hmera oti kai o constructor ths Room_Type_A
        this.minimum_people=people;////thetei ton elaxisto arithmo atomwn apo to orisma
       }
    public int getMinimum_people() {
        return minimum_people;
    }

    public void setMinimum_people(int minimum_people) {
        this.minimum_people = minimum_people;
    }
    //To book this type of room you have to be more than a minimum number of people 
    boolean new_booking(Booking booketo)
    {
        if(this.maximum_capacity < booketo.getPeople()&& minimum_people>booketo.getPeople()){
             //elegxei an threitai h megisth xwritikothta kai o elaxistos arithmos atomwn 
            return false;//an den threitai epistrefei false
        } 
        //alliws kanei oti kai h new_booking
        try{
         for(int j = booketo.getArrival();j <=(booketo.getArrival() + booketo.getDays_of_accomodation()-1);j++) 
         if(this.availability[j] != null){
            return false;}                                                  
         
          for(int j = booketo.getArrival();j <=(booketo.getArrival()-1 + booketo.getDays_of_accomodation());j++) 
          this.availability[j] = booketo;      
          //System.out.println("sdjfiofgohsigokhaoi");
          booketo.setRoom(this);
          return true;  
             
            }
        catch(java.lang.ArrayIndexOutOfBoundsException e){
            return false;
        }
    }
    //this type of room cannot cancel its booking
    boolean cancelation(int cancelID)//yperkalyptei thn methodo akurwshs wste na mhn ginetai
    {
        System.out.println("Cancelling is not possible with this kind of room");
        boolean control=false;
        return control;
    }
}

