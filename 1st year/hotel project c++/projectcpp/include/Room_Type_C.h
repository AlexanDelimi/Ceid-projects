#ifndef ROOM_TYPE_C_H
#define ROOM_TYPE_C_H

#include <Room.h>


class Room_Type_C : public Room
{
    public:
        Room_Type_C();
        virtual ~Room_Type_C();
        Room_Type_C(int maximum_capacity, double price_per_person, int people, int days);
        int getMinimum_people() { return minimum_people; }
        void setMinimum_people(int val) { minimum_people = val; }
        int getMinimum_days() { return minimum_days; }
        void setMinimum_days(int val) { minimum_days = val; }
        bool new_booking(Booking* booketo);
    private:
        int minimum_people;
        int minimum_days;
};

#endif // ROOM_TYPE_C_H
