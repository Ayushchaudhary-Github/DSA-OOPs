#include<stdio.h>

int main(){
    int sum;
    int ar[]={1,2,3};

    for (int i=0;i<3;i++){
        sum=sum+ar[i];
    }
    printf("%d",sum);

}