#include <iostream>
#include <vector>
#include <stdlib.h>

using namespace std;
int main()
{
vector<int> vec;
int i;
cout << "vector size = " << vec.size() << endl;
for(i = 0; i < 7; i++)
{
		vec.push_back(10 + rand() % 90);
        //vec.push_back(i);
}
cout << "extended vector size = " << vec.size() << endl;
for(i = 0; i < vec.size(); i++)
{
    cout << "Vector [" << i << "] = " << vec[i] << endl;
}
vector<int>::iterator v = vec.begin();
 while( v != vec.end()) {
cout << "value of v = " << *v << endl;
v++;
}
 vec.resize(5);
 cout << "reduced vector size = " << vec.size() << endl;
 for(i = 0; i < 5; i++)
{
		vec.push_back(10 + rand() % 90);
        //vec.push_back(i);
}
for(i = 0; i < 5; i++)
{
    cout << "Vector [" << i << "] = " << vec[i] << endl;
}
}

