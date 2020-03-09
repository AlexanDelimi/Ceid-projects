#include  <iostream>
#include  <cstdlib>


using namespace std;

class student
{
    private:
    string name,surname;
    int AM;
    public:
    void message()
        {
        cout<<"Hello, I am message() defined in superclass Student \n";
        }
};
class undergrad : public student
{
    private:
    int entrance_order;
    int passed_courses;
    public:
    void message()
        {
        cout<<"Hello, I am message() defined in  class undergraduate student \n";
        }
};

class MSc: public student
{
    private:
    string dipl_dept;
    string thesis;
    public:
    int  get_dipl_grade();
};

class PhD: public student
{
    private: private:string name,surname;int AM;
    string PhD_title,professor;
    int start_month,start_yearQ;
    public:
    void message()
        {
        cout<<"Hello, I am message() defined in  class Phd student\n";
        }

};


int  main()
{
    student S1;
    undergrad U1 ;
    MSc M1;
    PhD Ph1;

    S1.message(); //grammh 1
    U1.message(); //grammh 2
    M1.message(); //grammh 3
    Ph1.message(); //grammh 4

    S1 = U1;
    S1.message(); //grammh 5
    system("pause");
    return 0;
}

