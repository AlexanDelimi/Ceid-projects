#ifndef ROOM_H
#define ROOM_H
#include"Booking.h"
#define N 31
using namespace std;
class Booking;
class Room
{
    public:
        Room();
        virtual ~Room();

        int getRoom_code() { return room_code; }
        void setRoom_code(int val) { room_code = val; }
        static int getMetritis() { return metritis; }
        int getMaximum_capacity() { return maximum_capacity; }
        void setMaximum_capacity(int val) { maximum_capacity = val; }
        double getPrice_per_person() { return price_per_person; }
        void setPrice_per_person( double val) { price_per_person = val; }
        Room(int cap, double price);
        virtual bool new_booking(Booking* booketo);
        virtual double pricing();
        virtual bool cancellation(int cancelID);
        double plentitude();
        Booking* getAvailability(int i){return availability[i];}
       // bool operator|=(int cancelID);
    protected:
        int room_code;
        static int metritis;
        int maximum_capacity;
        double price_per_person;
        Booking* availability[N] ={0};
};

#endif // ROOM_H
