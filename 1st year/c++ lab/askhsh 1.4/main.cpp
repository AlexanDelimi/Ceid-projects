#include <iostream>

using namespace std;
class Kouti
{
private:
double length; double breadth; double height;
public:
    double calculateogkos()
	{
    double ogkos =length*breadth*height;
    return ogkos;
    }
   void setMhkos(double len){
    length=len;
    }
    void setPlatos(double bread){
    breadth=bread;
    }
    void setYpsos(double hei){
    height=hei;}
    
	double getMhkos(){
    return length;
    }
    double getPlatos(){
    return  breadth;
    }
    double getYpsos(){
    return height;}
     Kouti operator+(const Kouti& b);
};

int main()
{
    Kouti KoutiA;
    Kouti KoutiB;
    Kouti KoutiC;

    KoutiA.setMhkos(2.0);
    KoutiA.setPlatos(3.2);
    KoutiA.setYpsos(6.0);
    KoutiB.setMhkos(2.5);
    KoutiB.setPlatos(4.0);
    KoutiB.setYpsos(5.0);
    cout << "Volume of KoutiA : " << KoutiA.calculateogkos() << endl;
    cout << "Volume of KoutiB : " << KoutiA.calculateogkos()<< endl;
    KoutiC=KoutiA+KoutiB;
    cout<<"Volume of KoutiC : "<<KoutiC.calculateogkos()<< endl;
    return 0;

}
Kouti Kouti:: operator+(const Kouti& b)
{
Kouti kouti;
kouti.setMhkos( this->length + b.length); kouti.setPlatos ( this->breadth + b.breadth); kouti.setYpsos( this->height + b.height); return kouti;
}
