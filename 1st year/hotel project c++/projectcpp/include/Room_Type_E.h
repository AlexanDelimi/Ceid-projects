#ifndef ROOM_TYPE_E_H
#define ROOM_TYPE_E_H

#include <Room.h>


class Room_Type_E : public Room
{
    public:
        Room_Type_E();
        ~Room_Type_E();
        Room_Type_E(int maximum_capacity, double price_per_person);
        bool check_discount();
        // if you are the first reservation of the month you get a discount 25%

        double pricing();
    private:
        bool check;
};

#endif // ROOM_TYPE_E_H
