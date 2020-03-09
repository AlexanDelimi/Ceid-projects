#include "Room_Type_E.h"

Room_Type_E::Room_Type_E()
{
    //ctor
}

Room_Type_E::~Room_Type_E()
{
    //dtor
}
Room_Type_E:: Room_Type_E(int maximum_capacity, double price_per_person): Room(maximum_capacity, price_per_person)
{

}
bool Room_Type_E:: check_discount()
{
	check = true;
	for (int c = 1; c < 31; c++) {
		if (availability[c] != 0) {
			check = false;
		}
	}
	return check;
}// if you are the first reservation of the month you get a discount 25%
double Room_Type_E:: pricing() {
	double price = 0;
	for (int c = 1; c < 31; c++) {
		if (availability[c]!=0) {
			price = price + price_per_person*(availability[c])->getPeople();
		}
		if (check_discount() == true) {
			price = price - price * 25 / 100;
		}
	}return price;
}
