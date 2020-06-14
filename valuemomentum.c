#include<stdio.h>
int main(){
int a[5]={1,2,3,4,5};
int i;
for(i=0;i<5;i++)
{
printf("%d ",(char)a[i]);
if((char)a[i]==42)
printf("%d\n",a[i]);
else
printf("FAIL\n");
}
return 0;
}