#ifndef HOTEL_H
#define HOTEL_H
#include"Booking.h"
#include"Room.h"
#include<vector>
class Hotel
{
    public:
        Hotel();
        ~Hotel();
        string getHotel_name() { return hotel_name; }
       // void setHotel_name(string val) { hotel_name = val; }
        double operator||(int & room_code);//setter tou onomatos tou ksenodoxeiou
        void  add_Room(Room* Vroom);//prosthiki dwmatiou sthn lista dwmatiwn tou ksenodoxeiou
        Room* retrieval_of_room_by_code(int code);//euresh dwmatiou apo ton arithmo tou
        Booking* retrieval_of_booking_by_code(int code);//euresi kratisis mesw kwdikou
        bool add_booking_to_Room(Booking* Waroom, int code);//prosthiki krathshs se dwmatio
        int add_booking(Booking* jim);//prosthiki krathshs
        bool booking_cancellation(int booking_code);//akurwsh krathshs
        double calculate_income(int room_code);//ypologismos esodwn tou dwmatiou
        double calculate_income();//ypologismos synolikwn esodwn
        void booking_plan();
        int operator&&(Booking* jim);
        bool operator-=(int* booking_code);
//        void operator||(Room* Vroom);
        vector <Room*> getRooms_of_hotel();
        vector <Booking*> getBookings_of_hotel(){return bookings_of_hotel;}
    private:
        string hotel_name;
        vector <Room*> rooms_of_hotel;//lista me dwmatia tou ksenodoxeiou
        vector <Booking*> bookings_of_hotel ;//lista me krathseis tou ksenodoxeiou
};

#endif // HOTEL_H
