#include<iostream>
#include<stdio.h>
#include<string.h>
#include<conio.h>
#include"func.cpp"
#include"queue.cpp"
using namespace std;


void inter();
void customer();
void pass();
void admin();
void booking();

void inter(){
   int i;
    cout<<"\n\tDVD MANAGEMENT SYSTEM\n";
    cout<<"========================================================";
    cout<<"\n\t\t>>Login\n";
    cout<<"\n\t\t1.Customer\n\n\t\t2.Admin\n\n\t\t3.Close \n";
    cout<<"\n\t\tEnter your choice : ";

    cin>>i;

    switch(i){
        case 1:system("cls");
               customer();
               break;
        case 2:system("cls");
               pass();
               break;
        case 3:exit(0);
               break;
        default:cout<<"\n\t\tInvalid option :(";
               getch();
               system("cls");
               inter();
    }
}

void customer(){
    int i;
    cout<<"\n\tCUSTOMER\n";
    cout<<"\n\t\t1.View DVD List\n\n\t\t2.Search for a DVD\n\n\t\t3.Main menu\n\n\t\t4.Close \n";
    cout<<"\n\t\tEnter your choice : ";
    cin>>i;

    switch(i){
        case 1:system("cls");
               viewDVD();
               break;
        case 2:system("cls");
               searchDVD();
               break;
        case 3:system("cls");
               inter();
               break;
        case 4:exit(0);
               break;
        default:cout<<"\n\t\tInvalid option :(";
               getch();
               system("cls");
               customer();
    }
}

void admin(){
    int i;
    cout<<"\n\tADMIN\n";
    cout<<"\n\t\t1.View DVDList\n\n\t\t2.Search for a DVD\n\n\t\t3.Add DVD\n\n\t\t4.Edit DVD\n\n\t\t5.Delete DVD\n\n\t\t6.Booking a Room\n\n\t\t7.Main menu\n\n\t\t8.Close\n";
    cout<<"\n\t\tEnter your choice : ";
    cin>>i;
        switch(i){
            case 1:system("cls");
                   viewDVD();
                   break;
            case 2:system("cls");
                   searchDVD();
                   break;
            case 3:system("cls");
                   addDVD();
                   break;
            case 4:system("cls");
                   editDVD();
                   break;
            case 5:system("cls");
                   deleteDVD();
                   break;
            case 6:system("cls");
                   booking();
                   break;
            case 7:system("cls");
                   inter();
                   break;
            case 8:exit(0);
            default:cout<<"\n\t\tInvalid option :(";
            getch();
            system("cls");
            admin();
        }
}

void pass(){
     string pass = "admin";
     string input;
     system("cls");
     cout<<"\n\tADMIN\n";
     cout << "\n\t\tEnter the password(admin): ";
     cin >> input;
     if (input == pass){
        system("cls");
        admin();
     }
     else
        cout << "Wrong password !!!"<< endl;
        getch();
        system("cls");
        inter();
}


int main(){
    x:
    inter();
    getch();
    system("cls");
    goto x;
    return 0;
};
