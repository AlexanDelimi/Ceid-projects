#include "Room.h"
#include<iostream>
using namespace std;
Room::~Room()
{
    //dtor
}
int Room:: metritis = 0;
Room::Room()
{
	room_code = ++metritis;//o metrhths auksanetai gia kathe stigmiotypo dwmatio kai ginetai o arithmos dwmatiou
}


Room::Room(int cap, double price) {
	room_code = ++metritis;//o metrhths auksanetai gia kathe stigmiotypo dwmatiou
						   //kai ginetai o arithmos dwmatiou
	maximum_capacity = cap;//thetei thn megisth xwrithkothta
	price_per_person = price;//thetei thn timh
}
//methods
bool Room::new_booking(Booking* booketo) { //elexgei an ginetai kainouria krathsh kai thn kanei
	if (maximum_capacity < booketo->getPeople()) {//elegxei an h xwrithkothta einai mikroterh apo ta atoma
		return false;
	} //an einai epistrefei false kai termatizei
	if(booketo->getArrival()+booketo->getDays_of_accomodation()-1<=30){
		for (int j = booketo->getArrival(); j <= (booketo->getArrival() + booketo->getDays_of_accomodation() - 1); j++)
			//gia j apo thn mera afiksh mexri thn hmera pou tha fygoun(hmera afikshs+ meres pou menoun)
			if (availability[j] != 0) {//an h diahesimothta ekeinh thn hmera den einai kenh (exei yparksei krathsh se auto to dwmatio gia autes ths meres dhladh
				return false;
			}//epistrefei false kai termatizei

		for (int j = booketo->getArrival(); j <= (booketo->getArrival()  + booketo->getDays_of_accomodation()- 1); j++)
			{
			    //cout<<"Mphka"<<endl;//to j einai idio me to j apo thn prohgoumenh for
			availability[j] =booketo; }//bazei se kathe keli ths diathesimothtas tou dwmatiou ekeinou tou dwmatiouta stoixeia ths krathshs
		booketo->setRoom(this);//thetei thn anafora thw krathshs se auto to dwmatio
		//cout<<"Mphka"<<endl;
		return true;  //epistrefei true kai termatizei

	}
	else{
		cout << "Out of Range error: " << endl;
	//uparxei periptwsh na dothoun meres pou den einai sta oria tou pinaka diathesimothtas

		return false;//tote epistrefei false
	}}




 double Room:: pricing(){//ypologizei ta esoda tou dwmatiou sto orisma
	double price = 0;
	for (int i = 1; i<N; i++) {//gia kathe keli tou pinaka diathesimothtas
		if (availability[i]!= 0) {//an auto to keli den einai keno
			price = price + price_per_person*((availability[i])->getPeople());//prosthetei sthn prohgoumenh timh
																		 //thn timh ana atomo epi ta atoma pou tha menoun ekeinh thn mera
		}
	}return price;//kai epistrefei ta telika esoda tou dwmatiou
}

 bool Room::cancellation(int cancelID) {//akurwnei mia krathsh

	int i = 0;
	for (i = 1; i<N; i++) {//gia kathe keli tou pinaka diathesimothtas (30)
		if (this->availability[i] != 0 && this->availability[i]->getBooking_code() == cancelID) {//an auto to keli den einai adeio
			this->availability[i] = 0;//an o kvdikow tou orismatos
																//einai idios me ton kwdiko krathshs sth kratshs se auto to keli
				//ekenwnei to sygkekrimeno keli
			}
		}
	return true;//epistrefei true

}

double Room:: plentitude()
{//plhrothta
	double completeness_counter = 0;//metrhths plhrothtas
	double  plentitude;//plhrothta
	int a=0;
	for (int i = 1; i<N; i++) {//gia kathe keli tou pinaka diathesimothtas (30)
		a++;
		if (availability[i]!= 0) {//an auto to keli den einai adeio
			completeness_counter++;// auksanetai o metrhths plhrothtas
		}
	}
	plentitude = (completeness_counter / a) * 100;//plhrothta tois ekato einai to posa kelia
												  //tou pinaka diathesimothtas einai gemata /ola ta kelia epi 100
	return plentitude;}//epistrefetai to pososto plhrothtas


