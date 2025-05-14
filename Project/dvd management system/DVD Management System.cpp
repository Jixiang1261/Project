#include<iostream>
#include<stdio.h>
#include<stdlib.h>
#include<fstream>
#include<string.h>
#include<conio.h>
#include<dos.h>
#include<time.h>
#include<iostream>
using namespace std;

class Dvd{
   public:

        void interface();
        void customer();
        void pass();
        void admin();
        void password();
        void addDVD(void);
        void deleteDVD(void);
        void editDVD(void);
        int  getdata();
        int  checkid(int);



        FILE *fp,*ft,*fs;
};

char catagories[][15]={"Movies","Series","Musics","Animated","Adults"};

struct DVD{
int id;
char stname[20];
char name[20];
char available[20];
int qty;
int price;
int count;
char *cat;
};

struct DVD a;


void Dvd::interface(){
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
               interface();
    }
}

void Dvd::customer(){
    int i;

    cout<<"\n\tCUSTOMER\n";
    cout<<"\n\t\t1.View DVD List\n\n\t\t2.Search for a DVD\n\n\t\t3.Main menu\n\n\t\t4.Close \n";
    cout<<"\n\t\tEnter your choice : ";
    cin>>i;

    switch(i){
        case 3:system("cls");
               interface();
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

    cout<<"\n\tADMIN\n";
    cout<<"\n\t\t1.View DVDList\n\n\t\t2.Search for a DVD\n\n\t\t3.Modify/Add DVD\n\n\t\t4.Issue DVD\n\n\t\t5.Main menu\n\n\t\t6.Change Password\n\n\t\t7.Close\n";
    cout<<"\n\t\tEnter your choice : ";
    cin>>i;
        switch(i){
            case 2:system("cls");
                   addDVD();
            case 5:system("cls");
                   interface();
                   break;
            case 7:exit(0);
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
        interface();
}

void Dvd::addDVD(void){
    system("cls");
    int i;
    int s;
    cout<<"\n\tCHOOSE YOUR CATEGORIES\n";
    cout<<"========================================================";
    cout<<"\n\t\t1.Movies\n\n\t\t2.Series\n\n\t\t3.Musics\n\n\t\t4.Animated \n\n\t\t5.Adults \n\n\t\t7.Back to main menu \n\n\t\t";
    cout<<"\n\t\tEnter your choice : ";

      scanf("%d",&s);

        if(s==7)
           interface() ;
           system("cls");

           fp=fopen("stf.dat","ab+");
             if(getdata()==1){
               a.cat=catagories[s-1];
               fseek(fp,0,SEEK_END);
               fwrite(&a,sizeof(a),1,fp);
               fclose(fp);

               system("cls");
               cout << "The record is sucessfully saved" <<endl;
               cout << "Save any more?(Y / N):" << endl;

            reinput:
              if(getch()=='n' || getch()=='N'){
                system("cls");
                interface();
              }
              else if (getch()=='y' || getch()=='Y'){
                system("cls");
                addDVD();
              }
              else
                cout << "Invalid option." << endl;
                goto reinput;

}

}

int Dvd::getdata(){
    int t;
    int s;
    cout<<"\n\tEnter the Information Below\n";
    cout<<"========================================================";
    cout<<"\n\t\tCategory:\n\n\t\t%s," << catagories[s-1] << "\n\n\t\tDVD ID:\n\n\t\t";
    cout<<"\n\t\tEnter your choice : ";

    scanf("%d",&t);
     if(checkid(t) == 0){
            cout << "\aThe id already exists\a" << endl;
            getch();
            interface();
            return 0;
      }
       a.id=t;

    cout<<"DVD Name:"<<endl;
    cout<< "%s" << a.name <<endl;
    cout<<"Availability:"<<endl;
    cout<<"%s" << a.available << endl;
    cout<<"Quantity:" <<endl;
    cout<<"%i"<< &a.qty <<endl;
    cout<<"Price:" << endl;

    scanf("%i",&a.price);
    return 1;
}

int Dvd::checkid(int t){

    rewind(fp);
    while(fread(&a,sizeof(a),1,fp)==1)
       if(a.id==t)
          return 0;

          return 1;
}

int main(){
    Dvd obj;
    obj.interface();
    getch();
    return 0;
}
