#include <iostream>
#include <string>
using namespace std;

class Product {
    private :
        string best_name = 0;
        double best_price = 0;
        int best_score = 0;
    public:

};

int main()
{
Product best;
bool more = true;
while (more)
{
Product next;
next.read();
if (next.is_better_than(best)) best = next;
cout << "More data? (y/n) ";
string answer;
getline(cin, answer);
if (answer != "y") more = false;
}
cout << "The best value is ";
best.print();
return 0;
}
