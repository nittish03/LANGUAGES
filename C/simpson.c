#include <stdio.h>
#include <math.h>
double f(double x) {
    return 1.0 / (1.0 + x * x);}
double simpson_38(double a, double b, int n) {
    if (n % 3 != 0) {
        printf("n must be a multiple of 3.\n");
        return -1;}
    double h = (b - a) / n; 
    double sum = f(a) + f(b); 
    for (int i = 1; i < n; i++) {
        if (i % 3 == 0) {
            sum += 2 * f(a + i * h);  
        } else {
            sum += 3 * f(a + i * h); }}
    return (3 * h / 8) * sum;}
int main() {
    printf("Name : Nittish \nClass : IT-C\nRoll No : 175\n");
    double a, b; 
    int n;     
    printf("Enter the lower limit : ");
    scanf("%lf", &a);
    printf("Enter the upper limit : ");
    scanf("%lf", &b);
    printf("Enter the number of sub-intervals (n, multiple of 3): ");
    scanf("%d", &n);
    if (n % 3 != 0) {
        printf("Error: n must be a multiple of 3.\n");
        return 1;}
    double result = simpson_38(a, b, n);
    if (result != -1) {
        printf("The approximate value of the integral is: %.6lf\n", result);}
    return 0;
}
