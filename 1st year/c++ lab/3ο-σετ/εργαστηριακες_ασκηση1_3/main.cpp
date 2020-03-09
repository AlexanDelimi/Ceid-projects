#include<iostream>
using namespace std;
int main(){
    cout<<"First set of numbers:"<<endl;
    int first[2][2], second[2][2];
    int i,j;
        for( i=0;i<2;i++){
            cout<<"Enter two integers: "<<i+1<<endl;
            for( j=0;j<2;j++){
            cin>>first[i][j];
           }
        }
    cout<<"\n\n\nSecond set of numbers:"<<endl;
        for( i=0;i<2;i++){
            cout<<"Enter two more integers:"<<i+1<<endl;
            for( j=0;j<2;j++){
            cin>>second[i][j];
            }
        }
        for( i=0;i<2;i++){
        for( j=0;j<2;j++){
        first[i][j]=first[i][j]+second[i][j];
        }
        }
        for( i=0;i<2;i++){
        for( j=0;j<2;j++){
        cout <<"The first array has this values " << first[i] << "and " << first[j];
        }
        }
    return 0;
}
