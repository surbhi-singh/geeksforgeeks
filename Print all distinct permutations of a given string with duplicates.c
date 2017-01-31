// C program to print all permutations with duplicates allowed
#include <stdio.h>
#include <string.h>
 
/* Function to swap values at two pointers */
void swap(char *x, char *y)
{
    char temp;
    temp = *x;
    *x = *y;
    *y = temp;
}
 
/* Function to print permutations of string
   This function takes three parameters:
   1. String
   2. Starting index of the string
   3. Ending index of the string. */
void permute(char *a, int l, int r)
{
   int i;
   int flag = 0;
   if (l == r)
     printf("%s\n", a);
   else
   {
       for (i = l; i <= r; i++)
       {
       	for(int j = l; j<i; j++)
       	{
       		//printf("checking %c with %c \n", *(a+j), *(a+i));
       		if(*(a+j) == *(a+i))
       		{
       			//printf("inside if loop\n");
       			flag = 1;
       			break;
       		}
       	}
       	if(flag != 1)
       	{
       	if((i != l && *(a+l) != *(a+i)) || (i==l))
       	{
          swap((a+l), (a+i));
          permute(a, l+1, r);
          swap((a+l), (a+i)); //backtrack
       	}
       	}
       }
   }
}
 
/* Driver program to test above functions */
int main()
{
    char str[] = "ACBC";
    int n = strlen(str);
    permute(str, 0, n-1);
    return 0;
}