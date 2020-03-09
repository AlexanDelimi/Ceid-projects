#include <iostream>
#include <ctime>
#include <cstdlib>
#include <string>

#include "Room.h"
#include "Booking.h"
#include "Hotel.h"
#include "Room_Type_A.h"
#include "Room_Type_B.h"
#include "Room_Type_C.h"
#include "Room_Type_D.h"
#include "Room_Type_E.h"


using namespace std;

int main()
{
	Hotel tokyo;
	int mode = 0;
	Room_Type_A RoomA1(9,20,10);
	Room_Type_A* a1 =& RoomA1;
	tokyo.add_Room(a1);
	Room_Type_A RoomA2(9,20,10);
	Room_Type_A* a2 =& RoomA2;
	tokyo.add_Room(a2);
	Room_Type_B RoomB1(9,20,10,5);
	Room_Type_B* b1 =& RoomB1;
	tokyo.add_Room(b1);
	Room_Type_B RoomB2(9,20,10,5);
	Room_Type_B* b2 =& RoomB2;
	tokyo.add_Room(b2);
	Room_Type_C RoomC1(9,20,3,5);
	Room_Type_C* c1 =& RoomC1;
	tokyo.add_Room(c1);
	Room_Type_C RoomC2(9,20,3,5);
	Room_Type_C* c2 =& RoomC2;
	tokyo.add_Room(c2);
	Room_Type_D RoomD1(9,20,3,5);
	Room_Type_D* d1 =& RoomD1;
	tokyo.add_Room(d1);
	Room_Type_D RoomD2(9,20,3,5);
	Room_Type_D* d2 =& RoomD2;
	tokyo.add_Room(d2);
	Room_Type_E RoomE1(9,20);
	Room_Type_E* e1 =& RoomE1;
	tokyo.add_Room(e1);
	Room_Type_E RoomE2(9,20);
	Room_Type_E* e2 =& RoomE2;
	tokyo.add_Room(e2);


	while (mode != 7) {
        srand( time(0));

		int arrival0 = rand()%(31)+1;
        srand( time(0));
		int days0 = rand()%(31 - arrival0)+1;
		srand(time(0));
		int people0 =  rand()%(6)+1;
		string listName[10] { "Takis", "Nikos", "Alex", "Babis", "Sylvia", "Magdalini", "Omiros", "Jimmy", "Giorgos", "Zhshs" };
		srand( time(0));
		int posit = rand()%10;
		string clientName = listName[posit];
		//cout << "............................\n" << clientName << " " << arrival0<< " "  << days0<< " " << people0<<endl;
		Booking* ever=new Booking(clientName,arrival0,days0,people0);
		tokyo&&ever;
		if (rand()%4 == 0) {

			int posit0 = rand()%((int)tokyo.getBookings_of_hotel().size());
            int idc=tokyo.getBookings_of_hotel().at(posit0)->getBooking_code();
            int *idk=&idc;
			tokyo-=(idk);
		}

		cout << "What do you want to do ?" << endl;
		cout << "Press 1 to add a booking " << endl;
		cout << "Press 2 to cancel a booking  " << endl;
		cout << "Press 3 to print hotels' booking " << endl;
		cout << "Press 4 to print all the rooms of the hotel" << endl;
		cout << "Press 5 to view the hotels' booking plan" << endl;
		cout << "Press 6 to view the income" << endl;
		cout << "Press 7 to exit" << endl;
		cout << "Press any other number for next loop" << endl;

        cin >> mode;

		switch (mode) {
		case 1:
        {

			string name;
			int arrival = 0;
			int days = 0;
			int people = 0;
			int code = 0;
			int room_code = 0;

            cout << "Give me your name please" << endl;
            cin.ignore();
            getline(cin,name);
            //jim1->setName_of_client(name);

			cout << "Give me your arrival day please" << endl;
            cin >> arrival;
            //jim1->setArrival(arrival);

			cout << "Give me the days you will be staying please" << endl;
            cin >> days;
			//jim1->setDays_of_accomodation(days);

			cout << "Give me the number of people that will stay please" << endl;
            cin >> people;
			//jim1->setPeople(people);
            Booking* jim1=new Booking(name,arrival,days,people);
			cout << "Do you want a certain room (press 1 for yes)" << endl;
            cin >> code;

			if (code == 1) {
				cout << "Give me the room number please" << endl;
                cin >> room_code;

				if (tokyo.retrieval_of_room_by_code(room_code) != 0) {
					tokyo.add_booking_to_Room(jim1, room_code);
				}
			}
			else {
				tokyo&&jim1;
			}
			break;
        }
		case 2:
        {
			int cancel_code = 0;
			cout << "Give me the booking ID you want to cancel please" << endl;
            cin >> cancel_code;
           int* cancel=& cancel_code;
			tokyo-=cancel;
			break;
        }
		case 3:
        {
			cout << "Booking code Name of Client Room code" << endl;
			for (int i = 0; i <=(int)tokyo.getBookings_of_hotel().size()-1; i++)
            {
				cout << tokyo.getBookings_of_hotel().at(i)->getBooking_code() << "\t \t ";
				cout << tokyo.getBookings_of_hotel().at(i)->getName_of_client() << "\t \t";
				cout << tokyo.getBookings_of_hotel().at(i)->getRoom().getRoom_code() << endl;
			}
			break;
        }
		case 4:
        {
            cout << "room code plentitude Income from this room" << endl;
			for (int i = 0; i <(int) tokyo.getRooms_of_hotel().size(); i++) {
				cout << tokyo.getRooms_of_hotel().at(i)->getRoom_code() << "\t \t ";
                cout << tokyo.getRooms_of_hotel().at(i)->plentitude() << "\t \t ";
				cout << tokyo.getRooms_of_hotel().at(i)->pricing() << endl;
			}
			break;
        }
		case 5:
        {
			tokyo.booking_plan();
			break;
        }
		case 6:
        {
			int room_codes = 1;
			int code = 0;
			cout << "Do you want the income for a certain room (1 for yes)" << endl;
            cin >> code;

			if (code == 1) {
				cout << "Give me the room number please" << endl;
                cin >> room_codes;

            if (tokyo.retrieval_of_room_by_code(room_codes) != 0) {
                cout << tokyo.calculate_income(room_codes) << endl;
				}
			} else {
				cout << tokyo.calculate_income() << endl;
			}
			break;
        }
    }
}
}
