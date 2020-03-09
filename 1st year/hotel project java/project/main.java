 
import java.util.Random;

import java.util.Scanner;
public class main {

    public static void main(String[] args) {
        Hotel tokyo =new Hotel();//ftiaxnoume ena kainourio ksenodoxeio
        int mode=0;//arxikopoioume thn katsastash sto 0
        //ftiaxnoume 10 dwmatia 2 apo kathe typo kai thetoume ta xarakthristika tous
        Room_Type_A a1 =new Room_Type_A();
        a1.setMaximum_capacity(9);
        a1.setPrice_per_person(20);
        a1.setPrice_per_day(10);
        tokyo.add_Room(a1);
        Room_Type_A a2 =new Room_Type_A();
        a2.setMaximum_capacity(9);
        a2.setPrice_per_person(20);
        a2.setPrice_per_day(10);
        tokyo.add_Room(a2);
        Room_Type_B b1 =new Room_Type_B();
        b1.setMaximum_capacity(9);
        b1.setPrice_per_person(20);
        b1.setPrice_per_day(10);
        b1.setDiscount_per_day(5);
        tokyo.add_Room(b1);
        Room_Type_B b2 =new Room_Type_B();
        b2.setMaximum_capacity(9);
        b2.setPrice_per_person(20);
        b2.setPrice_per_day(10);
        b2.setDiscount_per_day(5);
        tokyo.add_Room(b2);
        Room_Type_C c1 =new Room_Type_C();
        c1.setMaximum_capacity(9);
        c1.setPrice_per_person(20);
        c1.setMinimum_people(3);
        c1.setMinimum_days(5);
        tokyo.add_Room(c1);
        Room_Type_C c2 =new Room_Type_C();
        c2.setMaximum_capacity(9);
        c2.setPrice_per_person(20);
        c2.setMinimum_people(3);
        c2.setMinimum_days(5);
        tokyo.add_Room(c2);
        Room_Type_D d1 =new Room_Type_D();
        d1.setMaximum_capacity(9);
        d1.setPrice_per_person(20);
        d1.setMinimum_people(3);
        tokyo.add_Room(d1);
        Room_Type_D d2 =new Room_Type_D();
        d2.setMaximum_capacity(9);
        d2.setPrice_per_person(20);
        d2.setMinimum_people(3);
        tokyo.add_Room(d2);
        Room_Type_E e1 =new Room_Type_E();
        e1.setMaximum_capacity(9);
        e1.setPrice_per_person(20);
        tokyo.add_Room(e1);
        Room_Type_E e2 =new Room_Type_E();
        e2.setMaximum_capacity(9);
        e2.setPrice_per_person(20);
        tokyo.add_Room(e2);
        Scanner scan= new Scanner(System.in);
         Random rand = new Random();
        while(mode!=7){
            int arrival0 = rand.nextInt(30) +1;//pairnei enan tyxaio arithmo apo 0-30
            int days0 =rand.nextInt(31 - arrival0)+1;//pairnei enan tyxaio arithmo wste na mhn yperbainei to 30
            int people0 = rand.nextInt(5);    //pairnei ena tyxaio arithmo apo 0-5    
            String[] listName =new String[]{"Takis","Nikos","Alex","Babis","Sylvia","Magdalini","Omiros","Jimmy","Giorgos","Zhshs"};
            //^ftiaxnoume enan pinaka me tyxaia onomata
            int posit = rand.nextInt(9);//paragoume enan tyxaio arithmo apo 0-9
            String clientName = listName[posit];//kai etsi pairnoume ton teleutaio tuxaio arithmo ws thesi tou pinaka onomatwn
            Booking every = new Booking(clientName,arrival0,days0,people0);//ftiaxnoume mia krathsh me ta tyxaia auta stoixeia
            tokyo.add_booking(every);//kai thn prosthetei sthn lista me tiw krathseis
            if(rand.nextInt(3) == 0)//paragoume enan tyxaio arithmo apo 0-3 kai an einai 0 (25% pithanothta)
            {
                int posit0 = rand.nextInt(tokyo.bookings_of_hotel.size());//pairnoume enan tyxaio arithmo apo 0 ews to megethos ths listas twn krathsewn  
                tokyo.booking_cancellation(tokyo.bookings_of_hotel.get(posit0).getBooking_code());//kai akyrwnei thn krathsh se ekeinh thn thesh sth lista
            }
            
            
            
            
            System.out.println("What do you want to do ?" );
            System.out.println("Press 1 to add a booking ");
            System.out.println("Press 2 to cancel a booking  ");
            System.out.println("Press 3 to print hotels' booking ");
            System.out.println("Press 4 to print all the rooms of the hotel");
            System.out.println("Press 5 to view the hotels' booking plan");
            System.out.println("Press 6 to view the income");
            System.out.println("Press 7 to exit");
            System.out.println("Press any other integer for next loop");
            try {
                mode= scan.nextInt();//o xrhsths dinei ena akeraio
            }
            catch(java.util.InputMismatchException e){
            System.out.println(e);
            }
            switch(mode){
            case 1:
                Booking jim1=new Booking();//dhmiourgoume mia krathsh
                //parakatv arxikopoioume ta stoixea ths
                String name;
                int arrival=0;
                int days=0;
                int people=0;
                boolean code=false;
                int room_code=0;
                try {
                    scan.nextLine();
                    System.out.println("Give me your name please"); 
                    name= scan.nextLine();
                    }
                    catch(java.util.InputMismatchException e){
                    System.out.println(e);
                    name =scan.nextLine();
                    }
                
                jim1.setName_of_client(name);//bazoume thn eisodo apo to plhktrlogio sto onoma pelath
                
                try {
                    
                    System.out.println("Give me your arrival day please");
                    arrival= scan.nextInt();
                    }
                    catch(java.util.InputMismatchException e){
                    System.out.println(e);
                    arrival =scan.nextInt();
                    }
                
                jim1.setArrival(arrival);//bazoume thn eisodo apo to plhktrlogio sth afiksi
                
                try {                   
                    System.out.println("Give me the days you will be staying please");
                    days= scan.nextInt();
                    }
                    catch(java.util.InputMismatchException e){
                    System.out.println(e);
                    days =scan.nextInt();
                    }
                
                jim1.setDays_of_accomodation(days);//bazoume thn eisodo apo to plhktrlogio stis meres diamonhs
                
                try{
                    System.out.println("Give me the number of people that will stay please");
                    people=scan.nextByte();
                    }
                    catch(java.util.InputMismatchException e){
                    System.out.println(e);
                    people=scan.nextByte();
                    }
                
                jim1.setPeople(people);//bazoume thn eisodo apo to plhktrlogio sta atoma
                
                
                try {
                    System.out.println("Do you want a certain room (true for yes false for no)");
                    code= scan.nextBoolean();
                    scan.nextLine();
                    }
                    catch(java.util.InputMismatchException e){
                    System.out.println(e);
                    }
                //an h eisodos apo to plhktrlogio einai true
                if (code){
                    try {
                    System.out.println("Give me the room number please");
                     room_code= scan.nextInt();
                    }
                    catch(java.util.InputMismatchException e){
                    System.out.println(e);
                     room_code= scan.nextInt();
                    }
                
                    if(tokyo.retrieval_of_room_by_code(room_code)!=null) //me thn eisodo apo to plhktrlogio anazhtoume to dwmatio me auton ton arithmo
                    {
                        tokyo.add_booking_to_Room(jim1,room_code);//kai an to broume tou prosthetoume thn krathsh 
                    
                    }
                    }
                
                   else {
                    
                            tokyo.add_booking(jim1);//alliws prosthetoume thn krathsh sto ksenodoxeio kai se ena tuxaio dwmatio
                    
                }
                
                
                break;
            case 2:
                int cancel_code=0;
                try {
                    System.out.println("Give me the booking ID you want to cancel please");
                     cancel_code= scan.nextInt();
                    }
                    catch(java.util.InputMismatchException e){
                    System.out.println(e);
                     cancel_code= scan.nextInt();
                    }
                tokyo.booking_cancellation(cancel_code);//bazoume thn eisodo apo to plhktrlogio sto orisma thw akyrwshs
                break;
            case 3:
            System.out.println("Booking code Name of Client Room code");
                for(int i = 0; i <=tokyo.bookings_of_hotel.size()-1; i++) {
                    System.out.print(tokyo.bookings_of_hotel.get(i).getBooking_code()+"\t ");
                    System.out.print(tokyo.bookings_of_hotel.get(i).getName_of_client()+" \t");
                    System.out.println(tokyo.bookings_of_hotel.get(i).getRoom().getRoom_code());
                }
                break;
            case 4:
            System.out.println("room code plentitude Income from this room");
                for(int i = 0; i < tokyo.rooms_of_hotel.size(); i++) {
                    System.out.print(tokyo.rooms_of_hotel.get(i).getRoom_code()+" ");
                    System.out.print(tokyo.rooms_of_hotel.get(i).plentitude()+" " );
                    System.out.println(tokyo.rooms_of_hotel.get(i).pricing());
                }
                break;
            case 5:
                tokyo.booking_plan();
                break;
            case 6:
                int room_codes=1;
                code=false;
                try {
                    System.out.println("Do you want the income for a certain room (true for yes false for no)");
                    code= scan.nextBoolean();
                    }
                    catch(java.util.InputMismatchException e){
                    System.out.println(e);
                    }
                
                if (code)//bazoume thn eisodo apo to plhktrlogio sth synthiki ths if kai an einai true
                {
                    try {
                    System.out.println("Give me the room number please");
                     room_codes= scan.nextInt();
                    }
                    catch(java.util.InputMismatchException e){
                    System.out.println(e);
                     room_codes= scan.nextInt();
                    }
                    if(tokyo.retrieval_of_room_by_code(room_codes)!=null)
                    {
                        System.out.println(tokyo.calculate_income(room_codes));//epistrefoume thn eisodo gia auto to dematio
                    }
                
                }
                else {
                    System.out.println(tokyo.calculate_income());//alliws epistrefoume ta synolika esoda
                }
                break;
            
                
            
            
            }
            
        }
        
        

    }



}
