#include<stdio.h>
#include <math.h>
double f(double x){
    return 1/(1+x*x);
}
int main(){

    printf("Name :  Nittish \n Class : IT-C \n Roll No : 175\n");
    int a , b,n;
    printf("Enter the lower limit");
    scanf("%d",&a);
    printf("Enter the upper limit");
    scanf("%d",&b);
    printf(" Number of sub intervals = ");
    scanf("%d",&n);

    double h=(b-a)/n;
    double sum=f(a)+f(b);
    for(int i =1;i<n;i++){
        double x =a+i*h;
        if(i%3==0){
            sum+=2*f(x);
        }
        else{
            sum+=3*f(x);
        }
    }
    double integ = (3*h*sum)/8.0;
    printf("\n Required Integration = %0.4f",integ);
 return 0;
}