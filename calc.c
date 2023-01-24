#include <stdio.h>
#include <conio.h>
//Compiler version gcc  6.3.0

void main()
{
  int n1,n2,add,sub,mul,div;
  printf("This is my First File in DCoder \n");
  printf("Press Enter to continue \n \n");
  getch();
  clrscr();
  
  printf("Now, This is a Calculator for basic Calculations \n\n");
  printf("Enter 1st number: ");
  scanf("%d",&n1);
  
  printf("\nEnter 2nd number: ");
  scanf("%d",&n2);
  
  add=n1+n2;
  sub=n1-n2;
  mul=n1*n2;
  div=n1/n2;
  
  printf("\n Addition    (+) = %d",add);
  printf("\n Subtraction (-) = %d",sub);
  printf("\n Multily     (*) = %d",mul);
  printf("\n Division    (/) = %d",div);
  getch();
  

}