#include <iostream>

using namespace std;

class Kouti
{
private:
    double length;
    double breadth;
    double height;
public :
    double calculateOgkos(double length,double breadth,double height)
    {
       return length * breadth * height;
    }
};

int main()
{
    Kouti KoutiA;
    Kouti KoutiB;

    KoutiA.calculateOgkos(2.0,3.2,6.0);
    cout << "Volume of KoutiA : " << KoutiA.calculateOgkos(2.0,3.2,6.0) << endl;

    KoutiB.calculateOgkos(2.5,4.0,5.0);
    cout << "Volume of KoutiB : " << KoutiB.calculateOgkos(2.5,4.0,5.0) << endl;
    return 0;
}

