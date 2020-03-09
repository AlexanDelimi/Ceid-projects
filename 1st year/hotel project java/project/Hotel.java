import java.util.ArrayList;
import java.util.List;

public class Hotel {
private String hotel_name;//onoma ksenodoxeiou
ArrayList <Room> rooms_of_hotel= new ArrayList<Room>();//lista me dwmatia tou ksenodoxeiou
ArrayList <Booking> bookings_of_hotel= new ArrayList<Booking>();//lista me krathseis tou ksenodoxeiou
//constructor
Hotel()
{
    
}
//methods 
public void  add_Room(Room Vroom)//prosthiki dwmatiou sthn lista dwmatiwn tou ksenodoxeiou
{
    rooms_of_hotel.add(Vroom);
}

Room retrieval_of_room_by_code(int code)//euresh dwmatiou apo ton arithmo tou
{
    for(int i = 0;i<= this.rooms_of_hotel.size() -1;i++)//gia i apo 0 ews kai to megethos ths listas
    //twn dwmatiwn tou ksenodoxeio-1 me bhma 1
    if (code==rooms_of_hotel.get(i).getRoom_code())//an o kwdikos pou dinoume sto orisma 
    //einai isos me ton arithmo kapoiou dwmatiou sth lista 
    {
        return rooms_of_hotel.get(i);//epistrefei auto to dwmatio
    
    }
    return null;// epistrefei keno
    
}

Booking retrieval_of_booking_by_code(int code)//euresi kratisis mesw kwdikou
{
    for(int i = 0;i<= this.bookings_of_hotel.size() -1;i++)//gia i apo 0 ews kai to megethos ths 
    //listas    twn kratisewn tou ksenodoxeio-1 me bima 1
    if (code==bookings_of_hotel.get(i).getBooking_code())//an o kwdikos pou dinoume sto orisma 
    //einai isos me ton kwdiko kapoias krathshs sth lista 
        return bookings_of_hotel.get(i);//epistrefei auti ti kratisi
    return null;// epistrefei keno
    }

public boolean add_booking_to_Room(Booking Waroom , int code)//prosthiki krathshs se dwmatio
{
    boolean success=false;//epiixia arxikopoihmenh sto lathos
    success=retrieval_of_room_by_code(code).new_booking(Waroom);
    if(success)//an to dwmatio me ton kwdiko pou dwsame sto orisma kanei thn krathsh tou orismatos
    {
        bookings_of_hotel.add(Waroom);//prosthese thn krathsh 
        //sth lista me tis krathseis tu ksenodoxeiou
        System.out.println("Booking was succesfull! The booking code is"+Waroom.getBooking_code());
        // ektupwse to apotelesma
        }
    else 
        {
        System.out.println("Booking was not succesfull!");//omoiws
        }
    return success;//epestrepse thn epitixia
}

public int add_booking(Booking jim)//prosthiki krathshs
    { 
    int value=0;//timh=0
    for(int i = 0;i<= this.rooms_of_hotel.size() -1;i++)//gia i apo 0 ews kai 
    //to megethos ths listas twn dwmatiwn tou ksenodoxeio-1 me bhma 1
    {
        if(rooms_of_hotel.get(i).new_booking(jim))//an ginetai nea krathsh me ta stoixeia ths krathshs tou orismatos
        //se kapoio dwmatio ths listas 
        {
            bookings_of_hotel.add(jim);//prosthetei thn krathsh tou orismatos sth lista twn krathsewn 
            System.out.println("Booking was succesfull!The booking code is "+jim.getBooking_code());
            return value=rooms_of_hotel.get(i).getRoom_code();//epistrefei ton arithmo tou dwmatiou pou egine h krathsh
        }   
}
    
    
        System.out.println("Booking was not succesfull!");
    
    return value;//epistrefei thn timh
}

public boolean booking_cancellation(int booking_code)//akurwsh krathshs
{
    Booking res = this.retrieval_of_booking_by_code(booking_code);
    if(res != null)//an brei krathsh me ton kwdiko sto orimsa
        {
            res.getRoom().cancellation(booking_code);//akurwnei thn krathsh apo to dwmatio ths
                for(int i =0;i<=bookings_of_hotel.size()-1;i++)//gia i apo 0 ews kai to megethos ths 
    //listas twn kratisewn tou ksenodoxeio-1 me bima 1                
                if(bookings_of_hotel.get(i).getBooking_code() == booking_code){bookings_of_hotel.remove(i);};
                //an uparxei krathsh sth lista me ton kwdiko pou dinoume sto orisma afairese to apo thn lista
                System.out.println("Succesfull cancellation of the booking with code"+booking_code);
                return true;//epistrefei alhthes
            }
        
    
    System.out.println("The cancellation was NOT succesfull :-(!!!");
    return false;//epistrefei pseudes
}

public double calculate_income(int room_code)//ypologismos esodwn tou dwmatiou
{
    return retrieval_of_room_by_code(room_code).pricing();//epistrefei ta esoda tou dwmatiou me ton arithmo pou dwsame sto orisma
    }
public double calculate_income()//ypologismos synolikwn esodwn
{
    double total=0;//arxikopoietai to synolo twn esodwn sto 0
    for(int i = 0;i<= this.rooms_of_hotel.size() -1;i++)//gia i apo 0 ews kai 
    //to megethos ths listas twn dwmatiwn tou ksenodoxeio-1 me bhma 1
        total=rooms_of_hotel.get(i).pricing() + total;//synolo= proigoumeno synolo + ta esoda tou dwmatiou me arithmo i sthn lista
    
    return total;//epestrepse to teliko synolo
    }
public void booking_plan()//plano twn krathsewn tou ksenodoxeiou
{
    
    System.out.print("Room\t");
    for (int i=1; i<=30; i++)
    {
        if (i<10)System.out.print("0");
        System.out.print(""+i+" ");}
    System.out.println();
    for(int i = 0;i <= this.rooms_of_hotel.size() -1;i++)
    {
        System.out.print(" "+rooms_of_hotel.get(i).getRoom_code()+"\t");
        for(int k=1; k<=30; k++)
        if(rooms_of_hotel.get(i).availability[k]!=null){
            System.out.print(" * ");
        }
        else {
            System.out.print(" _ ");
        }
        System.out.println("");
    }
}
public String getHotel_name() {
    return hotel_name;
}

public void setHotel_name(String hotel_name) {
    this.hotel_name = hotel_name;
}
public ArrayList<Room> getRooms_of_hotel(){
        return rooms_of_hotel;
    }
}
