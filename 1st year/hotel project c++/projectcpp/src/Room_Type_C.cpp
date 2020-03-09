#include "Room_Type_C.h"
#include<iostream>
Room_Type_C::Room_Type_C()
{
    //ctor
}

Room_Type_C::~Room_Type_C()
{
    //dtor
}
Room_Type_C:: Room_Type_C(int maximum_capacity, double price_per_person, int people, int days)

		: Room (maximum_capacity, price_per_person)//kanei gia thn megisth xwrithkothta kai gia thn timh ana atomo
		{
		    										  //oti kai o constructor ths Room
		minimum_people = people;//thetei ton elaxisto arithmo atomwn apo to orisma
		minimum_days = days;//thetei ton elaxisto arithmo hmerwn apo to orisma


	}
	bool Room_Type_C::new_booking(Booking* booketo) { //elexgei an ginetai kainouria krathsh kai thn kanei
	if (maximum_capacity < booketo->getPeople() || minimum_people>booketo->getPeople() || minimum_days<booketo->getDays_of_accomodation()) {
			//elegxei an threitai h megisth xwritikothta kai o elaxistos arithmos hmerwn kai atomwn
			return false;//epistrefei false an den threitai
		}
	if (maximum_capacity < booketo->getPeople()) {//elegxei an h xwrithkothta einai mikroterh apo ta atoma
		return false;
	} //an einai epistrefei false kai termatizei
	if(booketo->getArrival()+booketo->getDays_of_accomodation()-1<=30){
		for (int j = booketo->getArrival(); j <= (booketo->getArrival() + booketo->getDays_of_accomodation() - 1); j++)
			//gia j apo thn mera afiksh mexri thn hmera pou tha fygoun(hmera afikshs+ meres pou menoun)
			if (availability[j] != 0) {//an h diahesimothta ekeinh thn hmera den einai kenh (exei yparksei krathsh se auto to dwmatio gia autes ths meres dhladh
				return false;
			}//epistrefei false kai termatizei

		for (int j = booketo->getArrival(); j <= (booketo->getArrival() - 1 + booketo->getDays_of_accomodation()); j++)
			//to j einai idio me to j apo thn prohgoumenh for
			availability[j] =booketo; //bazei se kathe keli ths diathesimothtas tou dwmatiou ekeinou tou dwmatiouta stoixeia ths krathshs
		booketo->setRoom(this);//thetei thn anafora thw krathshs se auto to dwmatio
		return true;  //epistrefei true kai termatizei

	}
	else{
		cout << "Out of Range error: " <<endl;
	//uparxei periptwsh na dothoun meres pou den einai sta oria
														//tou pinaka diathesimothtas
		return false;//tote epistrefei false
	}}
