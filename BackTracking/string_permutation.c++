#include <iostream>
#include<string.h>
using   namespace   std;

char A[20];
char str[3]={'a','b','c'};
int n=3;
int i,counter=0;
void swap(int a,int b){
    char temp=str[a];
    str[a]=str[b];
    str[b]=temp;
}
void bin(int l,int h,string a){
    if(l==h){
        for(int i=0;i<n;i++)
            cout<<a[i];
            cout<<endl;
    }
    else{
        for(int i=l;i<h;i++){
            swap(a[l],a[i]);
            bin(l+1,h,a);
            swap(a[l],a[i]);
        }
    }
}
int main()
{
    bin(0,3,str);
    return 0;
}