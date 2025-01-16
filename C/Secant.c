#include <stdio.h>
#include <math.h>

double func(double x){
    return pow(x,3) - 4*x - 9;
}

double secant(double x0, double x1){
    double f0 = func(x0);
    double f1 = func(x1);
    return x1 - (f1 * (x1 - x0)) / (f1 - f0);
}

int main() {
    printf("Name: Romanch Singh \nClass: IT-C \nRoll no: 22\n");
    printf("Secant Method \n");

    double x0, x1, x2;
    printf("Enter initial guess for x0: ");
    scanf("%lf", &x0);
    printf("Enter initial guess for x1: ");
    scanf("%lf", &x1);
    
    for(int i = 0; i < 20; i++) {
        x2 = secant(x0, x1);
        printf("Iteration: %d\n", i + 1);
        printf("Current approximation: %lf\n", x2);

        if (fabs(x2 - x1) < 0.0001) {
            printf("Root of the given equation using Secant Method is %lf\n", x2);
            break;
        }

        x0 = x1;
        x1 = x2;
    }

    return 0;
}



// #include <stdio.h>
// #include <math.h>


// double func(double x) {
//     return cos(x) - x * exp(x);
// }


// double secant(double x0, double x1) {
//     double f0 = func(x0);
//     double f1 = func(x1);
//     return x1 - (f1 * (x1 - x0)) / (f1 - f0);
// }

// int main() {
//     printf("Name: Romanch Singh \nClass: IT-C \nRoll no: 22\n");
//     printf("Secant Method \n");

//     double x0, x1, x2;
//     printf("Enter initial guess for x0: ");
//     scanf("%lf", &x0);
//     printf("Enter initial guess for x1: ");
//     scanf("%lf", &x1);
    
   
   
    
//     for(int i = 0; i < 20; i++) {
//         x2 = secant(x0, x1);
//         printf("Iteration: %d\n", i + 1);
//         printf("Current approximation: %lf\n", x2);

//         if (fabs(x2 - x1) < 0.0001) {
//             printf("Root of the given equation using Secant Method is %lf\n", x2);
//             return 0; 
//         }

//         x0 = x1;
//         x1 = x2;
//     }

//     printf("Method did not converge within the maximum number of iterations.\n");
//     return 1; 
// }