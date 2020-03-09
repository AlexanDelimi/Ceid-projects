#ifndef ROOM_TYPE_D_H
#define ROOM_TYPE_D_H

#include <Room_Type_A.h>


class Room_Type_D : public Room_Type_A
{
    public:
        Room_Type_D();
        virtual ~Room_Type_D();
        Room_Type_D(int maximum_capacity, double price_per_person, double price, int people);
        int getMinimum_people() { return minimum_people; }
        void setMinimum_people(int val) { minimum_people = val; }
        //To book this type of room you have to be more than a minimum number of people
        bool new_booking(Booking* booketo);

        //this type of room cannot cancel its booking
        bool cancelation(int cancelID);//yperkalyptei thn methodo akurwshs wste na mhn ginetai

    private:
        int minimum_people;
};

#endif // ROOM_TYPE_D_H
