#include<iostream>
using namespace std;
class Complex{
    private :
    int real,img;
    public:
    Complex(){
        real=0;
        img=0;
    }
    Complex(int r,int i){
        real=r;
        img=i;
    }
    Complex operator+(Complex c){
        Complex temp;
        temp.real=real+c.real;
        temp.img=img+c.img;
        return temp;
    }
    void Display(){
        cout<<real<<"+i"<<img<<endl;
    }

};
int main(){
Complex c1(1,1);
Complex c2(2,1);
Complex c3(3,1);

Complex c4=c1+c2+c3;

c4.Display();
return 0;
}