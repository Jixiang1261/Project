#include<iostream>
#include<windows.h>
#include<stdio.h>
#include<stdlib.h>
#include<fstream>
#include<string.h>
#include<conio.h>
#include<dos.h>
#include<time.h>
using namespace std;


main(){
  int *arr;
  int cap = 10;
  int rear = 0;
  int front = 0;
  int test;
  int count;
  cin >> test;
  if(test = 1){
    front = (front + 1) % cap;
    count--;
    cout << front;
  }
  else if(test = 2){
    rear = (rear + 1) % cap;
    arr[rear] = rear;
    count++;
    cout << rear;
  }
  else
   cout << "ntg" ;


}
