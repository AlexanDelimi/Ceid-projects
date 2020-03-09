#include<stdio.h>

#define WORDLENGTH 30
#define TRIES 10

/* Required function for the game */
int initializeDashedWord(char myArray[], int size);
int printDashedWord(char myArray[], int size);
/* This function checks the array with the actual word and if the letter
    the user put is correct then it updates the dashed array and returns
    1, if not then it returns 0*/
int updateDashedWord(char myArray1[], char myArray2[] , int size, char letter);
int printSketch();
/* If all letters have been found (meaning there are no dashes inside the
    dashedWord array) it returns 0, else it returns 1*/
int winningCondition(char myArray[], int size);

int main(void){

    int wordLength;
    char myWord[WORDLENGTH];
    char dashedWord[WORDLENGTH];
    char letter;
    int tries = TRIES;

    printf("Please insert a word for the hangman game : ");
    gets(myWord);
    wordLength = strlen(myWord);

    /* Initializing the dashed array with dashes */
    initializeDashedWord(dashedWord,wordLength);

    /* if there are no tries left or there are no dashes inside the
        dashed array then the game is over */
    while(tries > 0 && winningCondition(dashedWord,wordLength) != 0){

        system("cls");

        printSketch();

        printf("\n");
        printf("Current State : ");
        printDashedWord(dashedWord,wordLength);
        printf("Tries Left : %d\n", tries);

        printf("Please insert a letter: ");
        letter = getchar();
        if(letter == '\n') continue;

        if(!updateDashedWord(myWord, dashedWord, wordLength, letter)) tries--;


    }

    if(tries == 0){

        printf("Sorry you have no tries left...\n");
        printf("You lost :(\n");
        printf("The word was : ");
        printDashedWord(myWord,wordLength);

    }else{

        printf("Final state : ");
        printDashedWord(dashedWord,wordLength);
        printf("Congratulations! You won!");

    }


    return 0;
}


int initializeDashedWord(char myArray[], int size){

    int i;

    for(i = 0; i < size; i++){

        myArray[i] = '_';

    }

    return 0;
}

int printDashedWord(char myArray[], int size){

    int i;

    for(i = 0; i < size; i++){

        printf("%c ", myArray[i]);

    }
    printf("\n");

    return 0;
}

int updateDashedWord(char myArray1[], char myArray2[] , int size, char letter){

    int i;
    int failedTry = 0;

    for(i = 0; i < size; i++){

        if(myArray1[i] == letter){

            myArray2[i] = letter;
            failedTry = 1;

        }


    }

    return failedTry;

}

int printSketch(){

    printf(" *   _________ \n");
    printf(" *   |/   |  \n");
    printf(" *   |    0  \n");
    printf(" *   |   /|\\ \n");
    printf(" *   |   / \\ \n");
    printf(" * ");
    printf(" _|__________ \n");

}

int winningCondition(char myArray[], int size){

    int i;
    int win = 0;

    for(i = 0; i < size; i++){

        if( myArray[i] == '_'){
            win = 1;
        }

    }
    printf("\n");

    return win;
}
