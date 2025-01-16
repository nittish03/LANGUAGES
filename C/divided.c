#include <stdio.h>
int main() {
    printf("Name : Nittish \nClass : IT-C \nRoll no. : 55 \n");
    int n;
    printf("Enter the number of data points: ");
    scanf("%d", &n);
    double x[n], y[n];
    for (int i = 0; i < n; i++) {
        printf("Enter the value of x[%d]: ", i);
        scanf("%lf", &x[i]);
        printf("Enter the value of y[%d]: ", i);
        scanf("%lf", &y[i]);
    }
    double x_value;
    printf("Enter the value to interpolate: ");
    scanf("%lf", &x_value);
    // Calculate divided differences
    double f[n][n];
    for (int i = 0; i < n; i++) {
        f[i][0] = y[i];
    }
    for (int j = 1; j < n; j++) {
        for (int i = 0; i < n - j; i++) {
            f[i][j] = (f[i + 1][j - 1] - f[i][j - 1]) / (x[i + j] - x[i]);
        }}
    // Newton's interpolation formula
    double interpolated_value = f[0][0];
    double term = 1.0;
    for (int i = 1; i < n; i++) {
        term *= (x_value - x[i - 1]);
        interpolated_value += f[0][i] * term;
    }
    printf("Interpolated value at x = %lf is %lf\n", x_value, interpolated_value); 
return 0;}