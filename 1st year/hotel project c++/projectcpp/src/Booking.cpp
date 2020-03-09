#include "Booking.h"

using namespace std;
Booking::~Booking()
{
    //dtor
}
 int Booking::counter = 0;
Booking:: Booking()//auksanei ton metriti kathe fora pou ginetai krathsh
{
	booking_code = ++counter;
}
    Booking:: Booking(string name, int arrival1, int days, int people1) {
	setBooking_code(++counter);//auksanei ton metriti kathe fora pou ginetai krathsh
	setName_of_client(name);//thetei to onoma ths kainoyrias krathsh me to onoma sto orisma
	setArrival(arrival1);//omoiws gia thn mera afikshs
	setDays_of_accomodation(days);//omoiws gia tis meres diamonhs
	setPeople( people1);//omoiws gia ta atoma pou tha meinoun
}
        Room Booking:: getRoom() { return *room; }
        void Booking:: setRoom(Room *val) { room = val; }
