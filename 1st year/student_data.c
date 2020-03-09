#include <stdio.h>
#include <stdlib.h>
#define N 4


typedef struct student{
	char name[25];
	char surname[25];
	float grade;
	int tries;
	int year;

}student;

void student_data(student *students, int i);
void prints(student *students);

int main(void){
	student *students;
	int i;
	students = malloc(N*sizeof(student));
	for(i=0; i<N; i++){
		student_data(students,i);	
	}
	prints(students);

return 0;
}

void student_data( student *students, int i){
	printf("-----------------------------------\n");
	printf("Give the name of student %d: \n",i+1);
	fgets(students[i].name, 25, stdin);
	printf("Give the surname of student %d: \n",i+1);
	fgets(students[i].surname, 25, stdin);
	printf("Give the grade of student %d: \n",i+1);
	scanf("%f",&students[i].grade);
	printf("Give the number of times student %d tried : \n",i+1);
	scanf("%d",&students[i].tries);
	printf("Give the year of student %d: \n",i+1);
	scanf("%d",&students[i].year);
	getc(stdin); //clear standard input	
}

void prints(student *students){
	int i, maxT, maxY = 0;
	float maxG = 0;
	for(i=0; i<N; i++){
		if(students[i].grade > maxG)
			maxG = students[i].grade;
		if(students[i].tries > maxT)
			maxT = students[i].tries;
		if(students[i].year > maxY)
			maxY = students[i].year;
	}
	printf("+++++++++++++++++++++++++++++++++++++++++++++++++\n");
	printf("The largest grade is: %.1f by:\n",maxG);
	for(i=0; i<N; i++){
		if(students[i].grade == maxG)
			printf("%s %s\n",students[i].name, students[i].surname);
	}
	
	printf("+++++++++++++++++++++++++++++++++++++++++++++++++\n");
	printf("The maximum number of tries is: %d by:\n",maxT);
	for(i=0; i<N; i++){
                if(students[i].tries == maxT)
                        printf("%s %s\n",students[i].name, students[i].surname);
	}	
	printf("+++++++++++++++++++++++++++++++++++++++++++++++++\n");
	        printf("The maximum number of years is: %d by:\n",maxY);
        for(i=0; i<N; i++){
                if(students[i].year == maxY)
                        printf("%s %s\n",students[i].name, students[i].surname);
	}
}
