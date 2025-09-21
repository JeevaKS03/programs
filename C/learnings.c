#include <stdio.h>
char* get_string(char prompt[]){
    //To get an string input
    static char name[100]; //same like static in java ,c++
    printf("%s",prompt);
    //scanf("%s",&name);
    fgets(name,100,stdin);
    return name;
    //To use char* name=get_string("What is your name? ");
}

#include<string.h>
char *stringcopy(char arr[],int start,int stop){
    //To get sub string
    int len;
    if(stop-start<0){
        len=-(stop-start)+1;
    }
    else{
        len=stop-start+1;
    }
    char *str=(char *)malloc(sizeof(char)*(len));
    strncpy(str,arr+start,len);
    str[len]='\0';
    return str;
    //To use char *new=stringcpy(arr,1,3);
}

int linear_search(){
   //Search linearly simple
   int arr[] = {2,6,3,8,3,8,4};
   int inp;
   scanf("%d",&inp);
   for(int i=0;i<7;i++){
    if(arr[i]==inp){
        printf("found value at: %d",i);
        return 0;
    }
   }
   printf("Not found");
   return 0;
}

#include<stdbool.h>
void bubble_sort(int arr[],int size){
   //Bubble sort
   //Repeat n times
   //   For i from 0 to n-2 #n-2 because you can't compare last element with anything
   //       If numbers[i] and numbers[i+1] out of order
   //           Swap them
   /*
   for (int i=0;i<size-1;i++){
    for(int j=0;j<size-1;j++){
        if (arr[j]>arr[j+1]){
            int temp=arr[j+1];
            arr[j+1]=arr[j];
            arr[j]=temp;
        }
    }
   }
    */
   //Can be improved by quiting the sorting when no swaps are occured using flags
   for (int i=0;i<size-1;i++){
    bool flag=false;
    for(int j=0;j<size-1;j++){
        if (arr[j]>arr[j+1]){
            int temp=arr[j+1];
            arr[j+1]=arr[j];
            arr[j]=temp;
            flag=true;
        }
    }
    if(flag==false){
       return ;
    }
   }
}

void selection_sort(int arr[],int size){
   //Selection sort
   //For i from 0 to n-1
   //    Find smallest number between numbers[i] and numbers[n-1]
   //    Swap smallest number with numbers[i]
   
   for(int i=0;i<size;i++){
        int small_index=i; //i because each time i is the starting index
        for(int j=i;j<size;j++){
            if(arr[j]<arr[small_index]){
                small_index=j;
            }
        }
        int temp=arr[i];
        arr[i]=arr[small_index];
        arr[small_index]=temp;
   }
}
