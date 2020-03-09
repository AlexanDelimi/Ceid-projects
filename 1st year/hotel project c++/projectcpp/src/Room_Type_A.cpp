#include "Room_Type_A.h"
#include"Room.h"
Room_Type_A::Room_Type_A()
{
    //ctor
}

Room_Type_A::~Room_Type_A()
{
    //dtor
}
Room_Type_A:: Room_Type_A(int maximum_capacity, double price_per_person, double price): Room(maximum_capacity, price_per_person)
{
	//kanei gia thn megisth xwrithkothta kai gia thn timh ana atomo oti kai o constructor ths Room
	price_per_day = price;//thetei thn thmh an hmera ish me thn timh sto orisma
}
//methods
double Room_Type_A:: pricing()// esoda apo to dwmatio
{
	double price = 0;//arxikopoihsh esodvn sto 0
	int f = 0;//metrhths hmerwn me krathsh arxikopoieitai sto 0
	for (int i = 1; i < N; i++)//diatrexei ton pinaka diathesimothtas
	{
		if (availability[i] != 0)//an to keli tou pinaka den einai keno
		{
			f++;//auksanei o metrhths  hmerwn
		}
		price = price_per_day*f;//esoda = timh ana hmera epi tis hmeres me krathsh sto dwmatio
	}
	return price;//epistrefei ta esoda
	}
