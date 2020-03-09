#include "Hotel.h"
#include <iostream>
Hotel::Hotel()
{
    //ctor
}

Hotel::~Hotel()
{
    //dtor
}
void Hotel:: add_Room(Room* Vroom)//prosthiki dwmatiou sthn lista dwmatiwn tou ksenodoxeiou
{
	rooms_of_hotel.push_back(Vroom);
}
//void Hotel:: operator||(Room* Vroom){rooms_of_hotel.push_back(Vroom);}//add_Room prosthiki dwmatiou sthn lista dwmatiwn tou ksenodoxeiou

Room* Hotel:: retrieval_of_room_by_code(int code)//euresh dwmatiou apo ton arithmo tou
{
	for (int i = 0; i <=(int)rooms_of_hotel.size() - 1; i++)//gia i apo 0 ews kai to megethos ths listas
															 //twn dwmatiwn tou ksenodoxeio-1 me bhma 1
		if (code == rooms_of_hotel.at(i)->getRoom_code())//an o kwdikos pou dinoume sto orisma
														 //einai isos me ton arithmo kapoiou dwmatiou sth lista
		{
			return rooms_of_hotel.at(i);//epistrefei auto to dwmatio

		}
	return 0;// epistrefei keno

}

Booking* Hotel:: retrieval_of_booking_by_code(int code)//euresi kratisis mesw kwdikou
{
	for (int i = 0; i <= (int)bookings_of_hotel.size() - 1; i++)//gia i apo 0 ews kai to megethos ths
																//listas    twn kratisewn tou ksenodoxeio-1 me bima 1
		if (code == bookings_of_hotel.at(i)->getBooking_code())//an o kwdikos pou dinoume sto orisma
															   //einai isos me ton kwdiko kapoias krathshs sth lista
			return bookings_of_hotel.at(i);//epistrefei auti ti kratisi
	return 0;// epistrefei keno
}

bool Hotel:: add_booking_to_Room(Booking* Waroom, int code)//prosthiki krathshs se dwmatio
{
	bool success = false;//epiixia arxikopoihmenh sto lathos
	success = retrieval_of_room_by_code(code)->new_booking(Waroom);
	if (success)//an to dwmatio me ton kwdiko pou dwsame sto orisma kanei thn krathsh tou orismatos
	{
		bookings_of_hotel.push_back(Waroom);//prosthese thn krathsh
									  //sth lista me tis krathseis tu ksenodoxeiou
	cout<<"Booking was succesfull! The booking code is"<< Waroom->getBooking_code()<<endl;
		// ektupwse to apotelesma
	}
	else
	{
		cout<<"Booking was not succesfull!"<<endl;//omoiws
	}
	return success;//epestrepse thn epitixia
}
int Hotel:: operator&&(Booking* jim)//add_booking
{
	add_booking(jim);
}
int Hotel:: add_booking(Booking* jim)//prosthiki krathshs
{
	int value = 0;//timh=0
	for (int i = 0; i <= (int)rooms_of_hotel.size() - 1; i++)//gia i apo 0 ews kai
															 //to megethos ths listas twn dwmatiwn tou ksenodoxeio-1 me bhma 1
	{
		if (rooms_of_hotel.at(i)->new_booking(jim))//an ginetai nea krathsh me ta stoixeia ths krathshs tou orismatos
												   //se kapoio dwmatio ths listas
		{
			bookings_of_hotel.push_back(jim);//prosthetei thn krathsh tou orismatos sth lista twn krathsewn
			cout<<"Booking was succesfull!The booking code is " << jim->getBooking_code()<<endl;
			return value = rooms_of_hotel.at(i)->getRoom_code();//epistrefei ton arithmo tou dwmatiou pou egine h krathsh
		}
	}


	cout<<"Booking was not succesfull!"<<endl;

	return value;//epistrefei thn timh
}

 bool Hotel:: booking_cancellation(int booking_code)//akurwsh krathshs
{
	Booking *res = retrieval_of_booking_by_code(booking_code);
	if (res !=0 )//an brei krathsh me ton kwdiko sto orimsa
	{
		res->getRoom().cancellation(booking_code);//akurwnei thn krathsh apo to dwmatio ths
		for (int i = 0; i <= (int)bookings_of_hotel.size() - 1; i++)//gia i apo 0 ews kai to megethos ths
															   //listas twn kratisewn tou ksenodoxeio-1 me bima 1
			if (bookings_of_hotel.at(i)->getBooking_code() == booking_code) { bookings_of_hotel.erase(bookings_of_hotel.begin()+i); };
		//an uparxei krathsh sth lista me ton kwdiko pou dinoume sto orisma afairese to apo thn lista
		cout<<"Succesfull cancellation of the booking with code" << booking_code<<endl;
		return true;//epistrefei alhthes
	}


	cout<<"The cancellation was NOT succesfull :-(!!!"<<endl;;
	return false;//epistrefei pseudes
}

 double Hotel:: calculate_income(int room_code)//ypologismos esodwn tou dwmatiou
{
	return retrieval_of_room_by_code(room_code)->pricing();//epistrefei ta esoda tou dwmatiou me ton arithmo pou dwsame sto orisma
}

 double Hotel:: calculate_income()//ypologismos synolikwn esodwn
{
	double total = 0;//arxikopoietai to synolo twn esodwn sto 0
	for (int i = 0; i <=(int)rooms_of_hotel.size() - 1; i++)//gia i apo 0 ews kai
															 //to megethos ths listas twn dwmatiwn tou ksenodoxeio-1 me bhma 1
		total = rooms_of_hotel.at(i)->pricing() + total;//synolo= proigoumeno synolo + ta esoda tou dwmatiou me arithmo i sthn lista

	return total;//epestrepse to teliko synolo
}
 void Hotel:: booking_plan()//plano twn krathsewn tou ksenodoxeiou
{

	cout<<"Room\t";
	for (int i = 1; i < N; i++)
	{
		if (i<10)cout<<"0";
		cout<<"" << i <<" ";
	}
	cout<<endl;
	for (int v = 0; v <= (int)rooms_of_hotel.size() - 1; v++)
	{
		cout<<" " << rooms_of_hotel.at(v)->getRoom_code() <<"\t";
		for (int k = 1; k < N; k++)
			if (rooms_of_hotel.at(v)->getAvailability(k) != 0) {
				cout<<" * ";
			}
			else {
				cout<<" _ ";
			}
			cout<<endl;
	}
}
bool Hotel:: operator-=(int* booking_code)//booking_cancellation
{
    return booking_cancellation(*booking_code);
}
double Hotel:: operator||(int &room_code){return calculate_income(room_code);}

vector <Room*> Hotel:: getRooms_of_hotel() {
	return rooms_of_hotel;
}
