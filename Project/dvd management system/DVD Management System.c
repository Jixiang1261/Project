#include<iostream>
#include<stdio.h>
#include<stdlib.h>
#include<fstream>
#include<string.h>
#include<conio.h>
using namespace std;

class Dvd{
   public:
       char bookname[100],auname[50],sc[20],sc1[50];
       int q,B,p;
    Dvd(){
        strcpy(bookname,"NO Book Name");
        strcpy(auname,"No Author Name");
        strcpy(sc,"No Book ID");
        strcpy(sc1,"No Book ID");
        q=0;
        B=0;
        p=0;
    }
        void interface();
        void customer();//student
        void pass();
        void admin();//librarian
        void password();

};
void Dvd::interface()
{
   int i;
    cout<<"\n\tDVD MANAGEMENT SYSTEM\n";
    cout<<"========================================================"
    cout<<"\n\t\t>>Login\n";
    cout<<"\n\t\t1.Customer\n\n\t\t2.Admin\n\n\t\t3.Close \n";
    cout<<"\n\t\tEnter your choice : ";

    cin>>i;

    switch(i);{
        case 1:customer();
               break;
        case 2:admin();
               break;
        case 3:exit();
               break;
        default:cout<<"\n\t\tInvalid option :(";
               getch();
               system("cls");
               interface();
    }
}
void Dvd::customer()
{
    int i;

    cout<<"\n\tCUSTOMER\n";
    cout<<"\n\t\t1.View DVD List\n\n\t\t2.Search for a DVD\n\n\t\t3.Main menu\n\n\t\t4.Close \n";
    cout<<"\n\t\tEnter your choice : ";
    cin>>i;

    switch(i);{
        case 1:dvdlist();
               break;
        case 2:search();
               break;
        case 3:system("cls");
               get();
               break;
        case 4:exit();
               break;
        default:cout<<"\n\t\tPlease enter correct option :(";
               getch();
               system("cls");
               admin();
    }
}
void Dvd::admin()
{
    int i;

    cout<<"\n\tADMIN\n";
    cout<<"\n\t\t1.View DVDList\n\n\t\t2.Search for a DVD\n\n\t\t3.Modify/Add DVD\n\n\t\t4.Issue DVD\n\n\t\t5.Main menu\n\n\t\t6.Change Password\n\n\t\t7.Close\n";
    cout<<"\n\t\tEnter your choice : ";
    cin>>i;
        switch(i)
        {
            case 1:booklist(2);
                     break;
            case 2:see(2);
                     break;
            case 3:modify();
                     break;
            case 4:issue();
                     break;
            case 5:system("cls");
                     get();
                     break;
            case 6:password();
                    break;
            case 7:exit(0);
            default:cout<<"\n\t\tPlease enter correct option :(";
            getch();
            system("cls");
            librarian();
        }
}
