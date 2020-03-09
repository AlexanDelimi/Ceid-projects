 

public class Booking {
    private String name_of_client;//to onoma tou pelath
    private  int booking_code;// o monadikos kwdikos dwmatiou
    private static int counter=0;// metritis twn krathsewn
    private int arrival;//Hmera afiksis
    private int days_of_accomodation;//meres poy tha meinoun
    private int people;//atoma pou tha meinoun
    private Room room;//"Anafora se antikeimeno typou dvmatio"
    //constructor
    Booking ()
    {
        this.booking_code=++Booking.counter ;//auksanei ton metriti kathe fora pou ginetai krathsh
    //kai ginetai okvdikos krathshs 
    }
    Booking(String name,int arrival,int days,int people){
        this.booking_code=++Booking.counter ;//auksanei ton metriti kathe fora pou ginetai krathsh
        this.name_of_client=name;//thetei to onoma ths kainoyrias krathsh me to onoma sto orisma
        this.arrival=arrival;//omoiws gia thn mera afikshs
        this.days_of_accomodation=days;//omoiws gia tis meres diamonhs
        this.people=people;//omoiws gia ta atoma pou tha meinoun
    }

    //methods
    public void setRoom(Room mushRoom)//thetei to se poio dwmatio tha anaferetai h metabliti dwmatio
    {
        this.room=mushRoom;     
    }
    public String getName_of_client() //getter tou onomatos pelath
    {
        return name_of_client;
    }
    public void setName_of_client(String name_of_client) //setter tou onomatos pelath
    {
        this.name_of_client = name_of_client;
    }
    
    public int getArrival() {//getter ths hmeras afikshs
        return arrival;
    }
    public void setArrival(int arrival) {//setter ths hmeras afikshs
        this.arrival = arrival;
    }
    public int getDays_of_accomodation() {//getter twn hmerwn diamonhs
        return days_of_accomodation;
    }
    public void setDays_of_accomodation(int days_of_accomodation) {//setter twn hmerwn diamonhs
        this.days_of_accomodation = days_of_accomodation;
    }
    public int getPeople() {//getter twn atomwn 
        return people;
    }
    public void setPeople(int people) {//setter twn atomwn 
        this.people = people;
    }
    public int getBooking_code()//getter tou kvdikou krathshs
    {
        return this.booking_code;
    }
    public Room getRoom()////getter ths anaforas se dwmatio
    {
        return this.room;
    }
    
}


