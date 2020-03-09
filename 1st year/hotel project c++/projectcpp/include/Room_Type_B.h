#ifndef ROOM_TYPE_B_H
#define ROOM_TYPE_B_H

#include <Room_Type_A.h>


class Room_Type_B : public Room_Type_A
{
    public:
        Room_Type_B();
        virtual ~Room_Type_B();
        Room_Type_B(int maximum_capacity, double price_per_person, double price, int disc);
        int getDiscount_per_day() { return discount_per_day; }
        void setDiscount_per_day(int val) { discount_per_day = val; }
        double pricing();//esoda dwmatiou
        bool cancelation(int cancelID);//methodos akurwshs


    private:
        int discount_per_day;
};

#endif // ROOM_TYPE_B_H
