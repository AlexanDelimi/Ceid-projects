#include <stdlib.h>
#include <iostream>
#include <vector>
using namespace std;
int main()
{
vector<int> vec;
int i;
cout << "vector size = " << vec.size() << endl;
for(i = 0; i < 7; i++){ vec.push_back(i);
}
cout << "extended vector size = " << vec.size() << endl;
vector<int>::iterator v = vec.begin(); while( v != vec.end()) {
cout << "value of v = " << *v << endl; v++;}
vec.resize(10,5);
cout << "reduced vector size = " << vec.size() << endl;
vector<int>::iterator c = vec.begin(); while( c != vec.end()) {
cout << "value of c = " << *c << endl; c++;
}
return 0;
}
