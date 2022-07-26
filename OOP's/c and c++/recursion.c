#include<stdio.h>

int fun(int n){
    if(n==0){
        return 1;
    }
    else{
        return n*fun(n-1);
    }
}

int main(){
    int k;
    k = fun(2);
    printf("%d",fun(2));
}
