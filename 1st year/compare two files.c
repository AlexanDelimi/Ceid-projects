#include<stdio.h>
#include<stdlib.h>
#include<string.h>

int main(){

    FILE *file1, *file2, *file3;
    char *file_name1, *file_name2;
    char recognizer;
    char *ch1,*ch2,*holder;
    int num_line,option,update_line;

    file_name1 = calloc(100,sizeof(char));
    file_name2 = calloc(100,sizeof(char));

    ch1 = calloc(1024,sizeof(char));
    ch2 = calloc(1024,sizeof(char));
    holder = calloc(1024,sizeof(char));

    while(1){

        printf("1. Compare two files.\n");
        printf("2. Update one file using the differences.\n");
        printf("3. Exit\n");
        printf("Please select an option : ");
        scanf("%d",&option);
        __fpurge(stdin);

        if(option == 3) break;
        if(option == 1){
            printf("Please insert the name of the first file : ");
            gets(file_name1);
            __fpurge(stdin);
            printf("Please insert the name of the second file : ");
            gets(file_name2);
            __fpurge(stdin);

            num_line = 1;

            if((file1 = fopen(file_name1,"r"))==NULL){
                printf("Cannot open file %s. \n",file_name1);
                exit(1);
            }

            if((file2 = fopen(file_name2,"r"))==NULL){
                printf("Cannot open file %s. \n",file_name2);
                exit(1);
            }

            if((file3 = fopen("diff.txt","w"))==NULL){
                printf("Cannot open file diff.txt. \n");
                exit(1);
            }

             while(1) {
                //Reading each line from the files
                fgets(ch1,1024,file1);
                fgets(ch2,1024,file2);

                //Comparing the lines from the files
                //If they are not equal then create the difference file
                if(strcmp(ch1,ch2)){
                    fprintf(file3,"---Line %d\nFile test1.txt\n%sFile test2.txt\n%s",num_line,ch1,ch2);
                }

                num_line++;

                //If we read all the lines from either file we exit
                if(feof(file1) || feof(file2)){
                    printf("The differences are in the file : diff.txt\n\n\n");
                    break;
                }
            }

            fclose(file1);
            fclose(file2);
            fclose(file3);

        }else if(option == 2){

            printf("Please insert the name of the first file : ");
            gets(file_name1);
            __fpurge(stdin);
            printf("Please insert the name of the update file : ");
            gets(file_name2);
            __fpurge(stdin);

            if((file1 = fopen(file_name1,"r"))==NULL){
                printf("Cannot open file %s. \n",file_name1);
                exit(1);
            }

            if((file2 = fopen(file_name2,"r"))==NULL){
                printf("Cannot open file %s. \n",file_name2);
                exit(1);
            }

            if((file3 = fopen("updated.txt","w"))==NULL){
                printf("Cannot open file updated.txt. \n");
                exit(1);
            }

            num_line = 1;

            while(1) {
                //Read the first line of the difference file
                //---Line numer_of_line
                fgets(ch2,1024,file2);

                if(ch2[0] == '-'){
                    //Split the line to get the number of line
                    holder = strtok(ch2," ");
                    holder = strtok(NULL," ");
                    //Convert the number of line to an integer
                    update_line = atoi(holder);

                    //Put to the updater the lines of the first file until
                    //the update_line
                    while(num_line < update_line){
                        printf("Copying the line %d from original file to updater.\n",num_line);
                        fgets(ch1,1024,file1);
                        fprintf(file3,ch1);
                        num_line++;
                    }

                    //Go to the line where the change is
                    //---Line number
                    //File file1
                    //the_original_line
                    //File file2
                    //the_new_line <-----
                    fgets(ch2,1024,file2);
                    fgets(ch2,1024,file2);
                    fgets(ch2,1024,file2);
                    fgets(ch2,1024,file2);

                    printf("Copying the line %d from difference file to updater.\n",num_line);
                    fprintf(file3,ch2);
                    num_line++;
                    fgets(ch1,1024,file1);

                }
                //If we finish with the difference file then copy the
                //rest of the original lines to the updater file
                if(feof(file2)){
		    printf("Difference file is done. Copying the rest of the original file.\n");
                    while(!feof(file1)){
                    fgets(ch1,1024,file1);
                    if(feof(file1)) break;
                    fprintf(file3,ch1);
                    printf("Copying the line %d from original file to updater.\n",num_line);
			num_line++;
                    }

                    printf("The updated file is ready.\n\n\n");
                    break;
                }

            }

            fclose(file1);
            fclose(file2);
            fclose(file3);

        }else{
            printf("Please check the options in the menu again.\n");
            continue;
        }
    }
    
    return 0;
}
