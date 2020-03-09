#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define N 5

typedef struct bank{
	char name[50];
	float amount;
	int day,month,year;	
}bank;

void account_data(bank *accounts, int i);
void account_info(bank *accounts, char *username);

int main(void){
	bank *accounts;
	int i;
	char username[50];
	accounts = malloc(N*sizeof(bank));
	for(i=0; i<N; i++){
		account_data(accounts,i);
	}
	
	printf("Give user's name for account details: \n");
	fgets(username, 50, stdin);
	account_info(accounts, username);

	return 0;
}

void account_data(bank *accounts, int i)
{
	printf("Give the name of user %d: \n",i+1);
	fgets(accounts[i].name, 50, stdin);
	printf("Give the deposit's amount of account %d: \n",i+1);
	scanf("%f",&accounts[i].amount);	
	printf("Give the deposit's date of account %d (dd/mm/yyyy) : \n",i+1);
	scanf("%d/%d/%d",&accounts[i].day, &accounts[i].month, &accounts[i].year);

	getc(stdin); //clear standard input	
}

void account_info(bank *accounts, char *username){
	float total = 0;
	int i, occurences = 0;
	for(i=0; i<N; i++){
		if(strcmp(accounts[i].name,username)==0){
			total += accounts[i].amount;
			occurences++;
			printf("Deposit's amount: %.2f, date: %d/%d/%d.\n",accounts[i].amount, 
accounts[i].day, accounts[i].month, accounts[i].year);
		}
	}
	if(occurences==0){
		printf("There is no account for this name.\n");
	}else if(occurences>1){
		printf("The total amount of money for this name is %.2f\n",total);
	}
}
