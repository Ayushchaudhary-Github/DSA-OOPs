#include<iostream>
using namespace std;

class Add{
    int a,b;

    public:

    void getdata();
    void sumdata();
};

void Add::getdata(){
    cout<<"Enter the valuee of a";
    cin>>a;
    cout<<"Enter the value of b";
    cin>>b;
    }

void Add::sumdata(){
    int sum;
    sum=a+b;

    cout<<"The sum of a and b is "<<sum;
    
    }

int main(){
    Add a;
    a.getdata();
    a.sumdata();
    return 0;
}