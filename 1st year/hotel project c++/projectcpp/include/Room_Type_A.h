#ifndef ROOM_TYPE_A_H
#define ROOM_TYPE_A_H

#include <Room.h>

using namespace std;


class Room_Type_A : public Room
{
    public:
        Room_Type_A();
        ~Room_Type_A();
        double getPrice_per_day() { return price_per_day; }
        void setPrice_per_day(double val) { price_per_day = val; }
        Room_Type_A(int maximum_capacity, double price_per_person, double price);
        double pricing();


    protected:
        double price_per_day;


};

#endif // ROOM_TYPE_A_H
