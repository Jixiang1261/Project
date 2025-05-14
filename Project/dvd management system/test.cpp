#include<iostream>
#include<stdio.h>
#include<stdlib.h>
#include<fstream>
#include<string.h>
#include<conio.h>
#include<dos.h>
#include<time.h>
#include"main.cpp"
using namespace std;


void inter();
void customer();
void pass();
void admin();
void borrowDVD();


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
    cout<<"\n\t\t1.View DVDList\n\n\t\t2.Search for a DVD\n\n\t\t3.Modify/Add DVD\n\n\t\t4.Borrow DVD\n\n\t\t5.Main menu\n\n\t\t6.Change Password\n\n\t\t7.Close\n";
    cout<<"\n\t\tEnter your choice : ";
    cin>>i;
        switch(i){
            case 1:system("cls");
                   viewDVD();
                   break;
            case 2:system("cls");

                   break;
            case 3:system("cls");
                   addDVD();
                   break;
            case 4:system("cls");
                   borrowDVD();
                   break;
            case 5:system("cls");
                   inter();
                   break;
            case 7:exit(0);
            default:cout<<"\n\t\tPlease enter correct option :(";
            getch();
            system("cls");
            admin();
        }
}

void pass(){
     string pass = "admin";
     string input;
     system("cls");
     cout << "Enter the password(admin)" << endl;
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

void borrowDVD(){
     int d;
     int id;
     int quantity;
     string name;

     cout << "Enter id: ";
     cin >> d;

     fp=fopen("stf.dat","rb");
     while(fread(&a,sizeof(a),1,fp)!=0){
        if(a.id==d){
            cout << "ID : " << a.id << endl;
            cout << "Name : " << a.name << endl;
            cout << "Category : " << a.cat << endl;
            cout << "Quantity : " << a.qty << endl;
            cout << "Price : " << a.price << endl;
            cout << "Enter the quantity : " << endl;
            cin >> quantity;
            a.qty= a.qty - quantity;
            fseek(fp,0,SEEK_END);
            fwrite(&a,sizeof(a),1,fp);
            fclose(fp);
        }
        else
            cout << "No DVD with this ID!!" << endl;
            getch();
            system("cls");
            admin();
     }



}


int main(){
    inter();
    getch();
    return 0;
};
