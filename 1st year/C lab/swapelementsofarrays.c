#include<stdio.h>

#define ARRLENGTH 10

int printArray(float myArray[], int size);
int swapElement(float myArray[], int element);

int main(void){

    float myArray[ARRLENGTH];
    int i,j;

    for(i=0; i<ARRLENGTH; i++){

        printf("Give a number for the array[%d] ", i +1);
        scanf("%f", &myArray[i]);

    }

    printf("\n");
    printf("The current state of your array\n");
    printArray(myArray, ARRLENGTH);
    printf("\n");

    for(i=0; i<=ARRLENGTH; i++){
        for(j=ARRLENGTH-1;j>=i+1; j--){

                if(myArray[j] < myArray[j-1]){

                    swapElement(myArray,j);
                    printf("Swap %d<->%d \t:", j,j+1);
                    printArray(myArray, ARRLENGTH);

                }

        }
    }

}

int printArray(float myArray[], int size){

    int i;

    for(i=0; i<size; i++){

        printf("%f ", myArray[i]);

    }
    printf("\n");

    return 0;

}

int swapElement(float myArray[], int j){

    float middleElement;

    middleElement = myArray[j];
    myArray[j] = myArray[j-1];
    myArray[j-1] = middleElement;

    return 0;
}
