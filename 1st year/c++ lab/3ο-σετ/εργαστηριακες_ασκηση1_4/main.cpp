#include <iostream>

using namespace std;

class Kouti
{
private:
    double length;
    double breadth;
    double height;
public :
    double calculateOgkos()
    {
       return length * breadth * height;
    }
    void setMikos(double mikos)
    {
        length = mikos;
    }
    void setPlatos(double platos)
    {
        breadth = platos;
    }
    void setYpsos(double ypsos)
    {
        height = ypsos;
    }
    Kouti operator+(const Kouti& b)
    {
    Kouti kouti;
    kouti.length = this->length + b.length;
    kouti.breadth = this->breadth + b.breadth;
    kouti.height = this->height + b.height;
    return kouti;
    }
};

int main()
{
    Kouti KoutiA;
    Kouti KoutiB;
    Kouti KoutiC;

    KoutiA.setMikos(2.0);
    KoutiA.setPlatos(3.2);
    KoutiA.setYpsos(6.0);

    KoutiB.setMikos(2.5);
    KoutiB.setPlatos(4.0);
    KoutiB.setYpsos(5.0);

    KoutiA.calculateOgkos();
    cout << "Volume of KoutiA : " << KoutiA.calculateOgkos() << endl;

    KoutiB.calculateOgkos();
    cout << "Volume of KoutiB : " << KoutiB.calculateOgkos() << endl;

    KoutiC = KoutiA + KoutiB;

    KoutiC.calculateOgkos();
     cout << "Volume of KoutiC : " << KoutiC.calculateOgkos();
    //return 0;
}
