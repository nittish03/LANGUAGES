#include <stdio.h>
#define n 3

void printMatrix(float arr[n][2*n]) {
    for(int i=0; i<n; i++) {
        for(int j=0; j<2*n; j++) {
            printf("%0.2f ", arr[i][j]);
        }
        printf("\n");
    }
}

void gaussJordan(float arr[n][2*n]) {
    for(int i=0; i<n; i++) {
        float pivot = arr[i][i];
        for(int j=0; j<2*n; j++) {
            arr[i][j] = arr[i][j] / pivot;
        }
        for(int k=0; k<n; k++) {
            if(k != i) {
                float factor = arr[k][i];
                for(int j=0; j<2*n; j++) {
                    arr[k][j] = arr[k][j] - (factor * arr[i][j]);
                }
            }
        }
    }
}

int main() {
float arr[n][2*n];
printf("Name: Nittish\nClass: IT-C\nRoll No.: 175 ( 55 )\n");
printf("Enter the elements of the array:\n");
for(int i=0; i<n; i++) {
for(int j=0; j<n; j++) {
scanf("%f", &arr[i][j]);
}
}
for(int i=0; i<n; i++) {
for(int j=n; j<2*n; j++) {
if(i == (j - n)) arr[i][j] = 1;
else arr[i][j] = 0;
}
}
printf("\nAugmented matrix before Gauss-Jordan elimination is:\n");
printMatrix(arr);
gaussJordan(arr);
printf("\nAfter Gauss-Jordan:\n");
printMatrix(arr);
printf("\nInverse Matrix:\n");
for(int i=0; i<n; i++) {
for(int j=n; j<2*n; j++) {
printf("%0.2f ", arr[i][j]);
}
printf("\n");
}
return 0;
}
             