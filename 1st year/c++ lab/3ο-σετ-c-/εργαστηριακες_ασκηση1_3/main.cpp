#include<iostream>
using namespace std;
int main(){
    cout<<" give me the size of the arrays"<<endl;
    int x;
    cin>>x;
    const int a=x;
    const int b=x;
cout<<"First set of numbers:"<<endl;
int first[a][b], second[a][b];
int i,j;
for( i=0;i<a;i++){
cout<<"Enter two integers: "<<i+1<<endl;
for( j=0;j<b;j++){
cin>>first[i][j];
}
}
cout<<"\n\n\nSecond set of numbers:"<<endl;
for( i=0;i<a;i++){
cout<<"Enter two more integers: "<<i+1<<endl;
for( j=0;j<b;j++){
cin>>second[i][j];
}
}
for( i=0;i<a;i++){
        for( j=0;j<b;j++){
first[i][j]=first[i][j]+second[i][j];
}
}
cout<<"The results are:"<<endl;
for( i=0;i<a;i++){
        for( j=0;j<b;j++){

            cout<<first[i][j]<<endl;

        }
}
return 0;
}
