#include<iostream>
#include<stdio.h>
#include<stdlib.h>
#include<fstream>
#include<string.h>
#include<conio.h>
#include<dos.h>
#include<time.h>
using namespace std;


class Dvd{
    public:

      void inter();
      void customer();
      void pass();
      void admin();
      void borrowDVD();
      void listDVD();
      void searchDVD();
      void addDVD();
      void modifyDVD();
      void deleteDVD();
      void sortDVD();


};

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
                   borrowDVD();
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
     string name;
     string category;
     string id;
     string quantity;

     cout << "Enter DVD's ID: " << endl;
     cin >> id;
     cout << "Enter DVD's Name: " << endl;
     cin >> name;
     cout << "Enter DVD's Category" << endl;
     cin >> category;
     cout << "Enter DVD's quantity" << endl;
     cin >> quantity;

     ofstream dvd;
     dvd.open("DVD.txt" , ios :: app);
     dvd << endl;
     dvd << id;
     dvd << endl;
     dvd << name;
     dvd << endl;
     dvd << category;
     dvd << endl;
     dvd << quantity;
     dvd.close();
}

void Dvd::listDVD(){
     string name;
     string category;
     string id;
     string quantity;
     ifstream dvd;
     dvd.open("DVD.txt");

     dvd >> id;
     dvd >> name;
     dvd >> category;
     dvd >> quantity;

     while(!dvd.eof()){
        cout << "DVD's ID:" << id << endl;
        cout << "DVD's Name:" << name << endl;
        cout << "DVD's Category:" << category << endl;
        cout << "DVD's Quantity:" << quantity << endl;
        cout << "========================" << endl;

        dvd >> id;
        dvd >> name;
        dvd >> category;
        dvd >> quantity;
     }
        cout << "DVD's ID:" << id << endl;
        cout << "DVD's Name:" << name << endl;
        cout << "DVD's Category:" << category << endl;
        cout << "DVD's Quantity:" << quantity << endl;
     getch();
}

void Dvd::deleteDVD(){
     string name;
     string category;
     string id;
     string quantity;
     string idd;
     cout << "Enter the ID want to delete" << endl;
     cin >> idd;
     ifstream dvd;
     dvd.open("DVD.txt");
     ofstream temp;
     temp.open("temp.txt");

     dvd >> id;
     dvd >> name;
     dvd >> category;
     dvd >> quantity;

     while(!dvd.eof()){
      if(id != idd){
        temp << endl;
        temp << id;
        temp << endl;
        temp << name;
        temp << endl;
        temp << category;
        temp << endl;
        temp << quantity;
      }
      else
        cout << "Record deleted" << endl;

      dvd >> id;
      dvd >> name;
      dvd >> category;
      dvd >> quantity;
     }

     temp << endl;
     temp << id;
     temp << endl;
     temp << name;
     temp << endl;
     temp << category;
     temp << endl;
     temp << quantity;
     temp.close();
     dvd.close();
     remove("DVD.txt");
     rename("temp.txt", "DVD.txt");

}

void Dvd::sortDVD(){
     string name;
     string category;
     string id;
     string quantity;
     string compare1;
     string ch;
     string temp;
     string line;
     int cho;
     cout << "Choose an option"<< endl;
     cout << "\n\t\t1.By ID \n\n\t\t2.By Name\n\n\t\t3.By Category\n\n\t\t4.By Quantity\n\n\t\t5.Main menu\n" <<endl;
     cin >> cho;
     ifstream dvd;
     dvd.open("DVD.txt");
     ofstream temp1;
     temp1.open("temp1.txt");
     if(dvd && temp1){
        while(getline(dvd,line)){
            temp1 << line << "\n";
        }
     }
     dvd.close();
     temp1.close();

     switch(cho){
       case 1:system("cls");
              ifstream temp1;
              temp1.open("temp1.txt");
              temp1 << id;
              temp1 << category;
              temp1 << name;
              temp1 << quantity;
              compare1 = id;
              temp1 << id;
              temp1 << category;
              temp1 << name;
              temp1 << quantity;
              while(temp1.eof()){
              if(compare1 < id){
                 compare1 = id;
                 temp1 << id;
                 temp1 << category;
                 temp1 << name;
                 temp1 << quantity;
              }
              else
                 temp1 << id;
                 temp1 << category;
                 temp1 << name;
                 temp1 << quantity;
              }



     }

}

void Dvd::modifyDVD(){
     string name;
     string nname;
     string category;
     string ncategory;
     string id;
     string nid;
     string quantity;
     string nquantity;
     string idm;

     cout << "Enter DVD's ID That want to modify: " << endl;
     cin >> idm;
     ifstream dvd;
     dvd.open("DVD.txt");
     ofstream temp;
     temp.open("temp.txt");

     dvd >> id;
     dvd >> name;
     dvd >> category;
     dvd >> quantity;

     while(!dvd.eof()){
        if(id == idm){
            cout << "Enter new ID:" << endl;
            cin >> nid;
            cout << "Enter new Name:" << endl;
            cin >> nname;
            cout << "Enter new Category:" << endl;
            cin >> ncategory;
            cout << "Enter new quantity:" << endl;
            cin >> nquantity;

            id = nid;
            name = nname;
            category = ncategory;
            quantity = nquantity;

            temp << endl;
            temp << id;
            temp << endl;
            temp << name;
            temp << endl;
            temp << category;
            temp << endl;
            temp << quantity;
            temp << endl;

            dvd >> id;
            dvd >> name;
            dvd >> category;
            dvd >> quantity;

}
        else
            temp << endl;
            temp << id;
            temp << endl;
            temp << name;
            temp << endl;
            temp << category;
            temp << endl;
            temp << quantity;

            dvd >> id;
            dvd >> name;
            dvd >> category;
            dvd >> quantity;


     }
            temp << endl;
            temp << id;
            temp << endl;
            temp << name;
            temp << endl;
            temp << category;
            temp << endl;
            temp << quantity;
     temp.close();
     dvd.close();
     remove("DVD.txt");
     rename("temp.txt", "DVD.txt");

}

void Dvd::borrowDVD(){

}

void Dvd::searchDVD(){
     string name;
     string category;
     string id;
     string quantity;
     string sid;

     cout << "Enter DVD's ID: " << endl;
     cin >> sid;

     ifstream dvd;
     dvd.open("DVD.txt");

     dvd >> id;
     dvd >> name;
     dvd >> category;
     dvd >> quantity;

     while(!dvd.eof()){
       if(id == sid){
        cout << "DVD's ID:" << id << endl;
        cout << "DVD's Name:" << name << endl;
        cout << "DVD's Category:" << category << endl;
        cout << "DVD's Quantity:" << quantity << endl;

        dvd >> id;
        dvd >> name;
        dvd >> category;
        dvd >> quantity;
       }
       else
        dvd >> id;
        dvd >> name;
        dvd >> category;
        dvd >> quantity;
    }
      if(id == sid){
        cout << "DVD's ID:" << id << endl;
        cout << "DVD's Name:" << name << endl;
        cout << "DVD's Category:" << category << endl;
        cout << "DVD's Quantity:" << quantity << endl;
      }
      cout << "========End========" << endl;
}

int main(){
    Dvd obj;
    obj.inter();
    return 0;
}
