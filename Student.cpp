#include<iostream>
using namespace std;

class employee{
    int age;
    char name[25];
    float salary;

    public:
    void getdata();
    void showdata();
};

void employee::getdata(){
    cout<<"Enter name:";
    cin>>name;
    cout<<"Enter the age";
    cin>>age;
    cout<<"Enter the salary";
    cin>>salary;
}

void employee::showdata(){
cout<<"/tEmployee details:"<<endl;
cout<<"Name:"<<name<<endl;
cout<<"Age:"<<age<<endl;
cout<<"salary:"<<salary<<endl;
}

int main(){
employee e;

e.getdata();
e.showdata();

return 0;
}
