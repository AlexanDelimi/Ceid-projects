#include  <iostream>
#include  <cstdlib>


using namespace std;

class student
{
    private:
    string name,surname;
    int AM;
    public:
    virtual void message()
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
    int dipl_grade;
    public:
    int  get_dipl_grade();
};

class PhD: public student
{
    private:
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
    student *S1;
    student S2;
    S1 = & S2;
    undergrad U1 ;
    S1 = & U1;
    MSc M1;
    PhD Ph1;
    S1 = & Ph1;



    student * Message[4] = {&S2,&U1,&M1,&Ph1};
    for(int i = 0; i <4; i++)
    {
        Message[i] -> message();

    }

    system("pause");
    return 0;
}

