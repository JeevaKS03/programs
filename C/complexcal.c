#include<stdio.h>
#include<stdbool.h>

void cal(){
    char ope;
    double num1;
    double num2;
    double result;
    
    printf("\nEnter an operator (+,-,*,/):");
    scanf(" %c",&ope);
    printf("Enter number 1: ");
    scanf("%lf",&num1);
    printf("Enter number 2: ");
    scanf("%lf",&num2);
        
        if(ope=='+'){
          result =num1 + num2;
          printf("\nresult: %.2lf",result);
          }
        else  if  (ope=='-'){
          result =num1 - num2;
          printf("\nresult: %.2lf",result);  
          }
        else  if (ope=='*'){
          
          result =num1 * num2;
          printf("\nresult: %.2lf",result);  
          }
        else  if (ope=='/'){
          result =num1 / num2;
          printf("\nresult: %.2lf",result);  
          }
        
        else{
          printf("%c is not valid",ope);
          }
    char exit; 
    printf("\nDo you want to continue [Y/N]!\n");
    scanf(" %c",&exit);
    switch(exit){
      case 'y':
      cal();
      case 'n':
      break;
    }
}
int main()
{
    printf("\nWELCOME");
    printf("\nSimple C Calculator!");
     cal();
 return 0;
}
