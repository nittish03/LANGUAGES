#include <stdio.h>
#include <math.h>

float f(float x, float y) {
return x + y;  // Define your function here
}

void rungeKutta(float x0, float y0, float h, int steps) {
for(int i=0; i<steps; i++) {
float k1 = h * f(x0, y0);
float k2 = h * f(x0 + h/2, y0 + k1/2);
float k3 = h * f(x0 + h/2, y0 + k2/2);
float k4 = h * f(x0 + h, y0 + k3);
y0 = y0 + (k1 + 2*k2 + 2*k3 + k4) / 6;
x0 = x0 + h;
printf("Step %d: x = %0.2f, y = %0.2f\n", i+1, x0, y0);
}
}

int main() {
float x0, y0, h;
int steps;
printf("Name:Nittish \nClass : IT-C \nRoll No : 175 ( 55 )\n");
printf("Enter initial x, initial y, step size h, and number of steps:\n");
scanf("%f %f %f %d", &x0, &y0, &h, &steps);
rungeKutta(x0, y0, h, steps);
return 0;
}
