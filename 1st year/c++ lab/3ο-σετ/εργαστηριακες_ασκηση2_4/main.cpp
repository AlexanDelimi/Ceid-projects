#include <iostream>
using namespace std;
class Polygon {
    protected:
        int width,
        height;
    public:
        void set_values (int a, int b)
        {
        width=a; height=b;
        }
};
class PaintCost{
    public:
        int getCost(int area)
        {
        return area * 70;
        }
};
class Rectangle: public Polygon, public PaintCost {
    public:
        int area ()
        { return width * height; }
};
class Triangle : public Polygon {
    public :
        int area()
        {
            return (width * height)/2;
        }
};

int main () {
    Rectangle rect;
    rect.set_values (5,8);
    cout << "Emvadon orthogoniou: " << rect.area() << '\n';
    cout << "Synoliko kostos xrwmatos: " << rect.getCost(rect.area()) << "euro" << '\n';
    Triangle trig;
    trig.set_values(6,2);
    cout << "Embadon trigonou: " << trig.area() << endl ;
    return 0;
}
