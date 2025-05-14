#include<iostream>
#include<cstring>
#include<cstdlib>
#include<iomanip>
#include<windows.h>
#include<dos.h>
#include<conio.h>
#include<cstdio>

using namespace std;

class Dvd{
    public:

      void inter();
      void customer();
      void pass();
      void admin();
      /*void borrowDVD();*/
      void listDVD();
      void searchDVD();
      void addDVD();
      void modifyDVD();
      void deleteDVD();
     /* void sortDVD();*/


};

struct datac{
   char name[20];
   char category[20];
   int id;
   int quantity;
   int price;

};

int num;
datac cd[20],cdtemp[20],cdsort[20],cdsort1[20];

int main(){
   Dvd obj;
   obj.inter();
   return 0;
}

void Dvd::inter(){
   int i;
    cout<<"\n\t\t\tDVD MANAGEMENT SYSTEM\n";
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

void Dvd::customer(){
    int i;
    int x;
    cout<<"\n\tCUSTOMER\n";
    cout<<"\n\t\t1.View DVD List\n\n\t\t2.Search for a DVD\n\n\t\t3.Main menu\n\n\t\t4.Close \n";
    cout<<"\n\t\tEnter your choice : ";
    cin>>i;

    switch(i){
        case 1:system("cls");
               listDVD();
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

void Dvd::admin(){

    int i;
    int x;
    cout<<"\n\tADMIN\n";
    cout<<"\n\t\t1.View DVDList\n\n\t\t2.Search for a DVD\n\n\t\t3.Add DVD\n\n\t\t4.Modify DVD\n\n\t\t5.Delete DVD\n\n\t\t6.Borrow DVD\n\n\t\t7.Main menu\n\n\t\t8.Close\n";
    cout<<"\n\t\tEnter your choice : ";
    cin>>i;
        switch(i){
            case 1:system("cls");
                   listDVD();
                   break;
            case 2:system("cls");
                   searchDVD();
                   break;
            case 3:system("cls");
                   addDVD();
                   break;
            case 4:system("cls");
                   modifyDVD();
                   break;
            case 5:system("cls");
                   deleteDVD();
                   break;
            case 6:system("cls");
                   /*borrowDVD();*/
                   break;
            case 7:system("cls");
                   inter();
                   break;
            case 8:exit(0);
            default:cout<<"\n\t\tPlease enter correct option :(";
            getch();
            system("cls");
            admin();
        }
}

void Dvd::pass(){
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

void Dvd::addDVD(){
    int num = 1;
    cout<<"Enter The Information"<<endl;
     for(int i=0;i<=num-1;i++){
         cout<<" Name  ";
         cin>>cd[i].name;
         cout<<"Category  ";
         cin>>cd[i].category;
         cout<<"ID ";
         cin>>cd[i].id;
         cout<<"Quantity  ";
         cin>>cd[i].quantity;
         cout<<"Price  ";
         cin>>cd[i].price;
 }
  cout<<"going to main menu";
  getch();
  inter();
}

void Dvd::listDVD(){
   system("cls");
   int num = 1;
    cout << "       List of DVD        " << endl;;
    cout<<endl;
    cout<<"     Name     Categoty     ID     Quantity    Price(RM)(Per Day) "<<endl;
    cout<<"    =============================================================="<<endl;
      for(int i=0;i<=num-1;i++){
         cout<<setw(13)<<cd[i].name;
         cout<<setw(6)<<cd[i].category;
         cout<<setw(15)<<cd[i].id;
         cout<<setw(10)<<cd[i].quantity;
         cout<<setw(15)<<cd[i].price;
         cout<<endl;
 }
    cout<<"going to main menu";
    getch();
    inter();
}

void Dvd::searchDVD(){
 system("cls");
    int num = 1;
  cout <<"Welcome To Search Of Employee Database "<< endl;
  cout<<endl;
  cout<<endl;
  int jobcode;
  cout<<"You Can Search Only By Jobcode Of An Employee";
  cout<<"Enter Code Of An Employee                    ";
 cin>>jobcode;
 for(int i=0;i<=num-1;i++)
   {
    if(cd[i].id==jobcode)
    {
    cout<<"     Name     Code     Designation     Years(EXP)     Age ";
 cout<<"     ------------------------------------------------------                                  ";
  cout<<setw(13)<<cd[i].name;
  cout<<setw(6)<<cd[i].id;
  cout<<setw(15)<<cd[i].category;
  cout<<setw(10)<<cd[i].quantity;
  cout<<setw(15)<<cd[i].price;
  cout<<endl;
 }
  }
    cout<<"going to main menu";
 getch();
 inter();
}

void Dvd::deleteDVD(){
 system("cls");
   int num = 1;
   int id;
   int check;
   printf("Delete An Entry");
   cout<<endl;
   cout<<"Enter An JobCode To Delete That Entry  ";
   cin>>id;
   int i;
   for(i=0;i<=num-1;i++)
   {
    if(cd[i].id==id)
    {
      check=i;
    }
   }
   for(i=0;i<=num-1;i++)
   {
    if(i==check)
    {
    continue;
    }
    else
    {
    if(i>check)
    {
     cdtemp[i-1]=cd[i];
    }
    else
    {
    cdtemp[i]=cd[i];
    }
     }
   }
  num--;
  for(i=0;i<=num-1;i++)
  {
   cd[i]=cdtemp[i];
  }
}

void Dvd::modifyDVD(){
    system("cls");
      int jobcode;
      printf("          Edit An Entry           ");
      cout<<endl;
      cout<<endl;
      int i;
      char option;
      cout<<"Enter An jobcode To Edit An Entry----  ";
      cin>>jobcode;
      for(i=0;i<=num-1;i++){
        if(cd[i].id==jobcode){
         cout<<"Name  ";
         cin>>cd[i].name;
         cout<<"Category  ";
         cin>>cd[i].category;
         cout<<"ID ";
         cin>>cd[i].id;
         cout<<"Quantity  ";
         cin>>cd[i].quantity;
         cout<<"Price  ";
         cin>>cd[i].price;
}

      }
}
