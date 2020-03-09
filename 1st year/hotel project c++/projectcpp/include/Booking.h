#ifndef BOOKING_H
#define BOOKING_H
#include <string>
#include "Room.h"
using namespace std;
class Room;
class Booking
{
    public:
        Booking();
        virtual ~Booking();
        Booking(string name, int arrival1, int days, int people1);

        string getName_of_client() { return name_of_client; }
        void setName_of_client(string val) { name_of_client = val; }
        int getBooking_code() { return booking_code;}
        void setBooking_code(int val) { booking_code = val; }
        int getCounter() { return counter; }
        void setCounter(int val){counter=val;}
        int getArrival() { return arrival; }
        void setArrival(int val) { arrival = val; }
        int getDays_of_accomodation() { return days_of_accomodation; }
        void setDays_of_accomodation(int val) { days_of_accomodation = val; }
        int getPeople() { return people; }
        void setPeople(int val) { people = val; }
        Room getRoom();
        void setRoom(Room *val);


    private:
        string name_of_client;
        int booking_code;
        static int counter;
        int arrival;
        int days_of_accomodation;
        int people;
        Room *room;
};

#endif // BOOKING_H
