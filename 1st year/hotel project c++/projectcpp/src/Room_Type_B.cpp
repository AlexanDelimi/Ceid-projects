#include "Room_Type_B.h"
#include<iostream>
using namespace std;
Room_Type_B::Room_Type_B()
{
    //ctor
}

Room_Type_B::~Room_Type_B()
{
    //dtor
}
Room_Type_B:: Room_Type_B (int maximum_capacity, double price_per_person, double price, int disc):Room_Type_A(maximum_capacity, price_per_person, price) {
	//kanei gia thn megisth xwrithkothta
																		// gia thn timh ana atomo kai gia thn timh ana hmera oti kai o constructor ths Room_Type_A
	discount_per_day = disc;//orizei thn ekptwsh ana hmera mesw tou orismatos
}
double Room_Type_B:: pricing()//esoda dwmatiou
{
	double price = 0;//arxikopoihsh twn esdwn sto 0
	double discount, todays_price;//ekptwsh kai timh kathe meras
	int d = 0;//metrhths
	for (int i = 1; i < N; i++)//diatrexei ton pinaka diathesimothtas
	{
		if (availability[i]!= 0)//an to keli tou pinaka den einai keno
		{
			d++;//auksanei ton metrhth
			discount = discount_per_day*d;//ekptwsh = ekptwsh ana hmera*hmera
			todays_price = price_per_day - discount;//timh kathe allhs meras=timh ana hmera meion thn ekptwsh
			if (todays_price<price_per_day / 2.0)//h timh kathe hmeras den mporei na einai mikroterh apo th mish ths arxikhs
			{
				todays_price = price_per_day / 2.0;
			}
			price = price + todays_price;//esoda = prohgoumena esoda + esoda kathe hmeras
		}
	}
	return price;//epistrefei ta esoda
}

bool Room_Type_B:: cancelation(int cancelID)//methodos akurwshs
{
	bool control = false;//elegxos= pseudhs
	cout<<"Cancelling is not possible with this kind of room"<<endl;
	return control;//epistrefei ton elegxo
};
