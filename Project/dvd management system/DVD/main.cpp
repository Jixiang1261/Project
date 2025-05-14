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
       char name[100], id[20];
       int q,B,p;

       Dvd(){
           strcpy(name,"DVD Name");
           strcpy(id,"DVD ID");
           q=0;
           B=0;
           p=0;
    }

      void inter();
      void customer();
      void pass();
      void admin();
      void getdata();
      void borrowDVD();
      void listDVD(int i);
      void searchDVD(int x);
      void addDVD();
      void modifyDVD();
      void deleteDVD();
      int category(int);
      void show(int i);


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
               listDVD(i);
               break;
        case 2:system("cls");
               searchDVD(x);
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
                   listDVD(i);
                   break;
            case 2:system("cls");
                   searchDVD(x);
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

void Dvd::getdata(){

        int i;
        fflush(stdin);
        cout << "\n\t\tEnter the details :-\n";
        cout << "\n\t\tEnter DVD's Name : ";
        cin.getline(name,100);
            for(i = 0; name[i] != '\0'; i++){
                if(name[i] >= 'a' && name[i] <= 'z')
                    name[i] -= 32;
                    }
                    cout<<"\n\t\tEnter Book's ID : ";
                    cin.getline(id,20);
                    cout<<"\n\t\tEnter Book's Price : ";
                    cin>>p;
                    cout<<"\n\t\tEnter Book's Quantity : ";
                    cin>>q;

}

int Dvd::category(int x){
      int i;
      cout<<"\n\t\tChoose one Category :-\n";
      cout<<"\n\t\t1.Movies\n\n\t\t2.Series\n\n\t\t3.Music\n\n\t\t4.Games\n\n\t\t5.Animated\n\n\t\t6.Go to menu\n";
      cout<<"\n\t\tEnter youur choice : ";
      cin>>i;
      switch(i)
      {
          case 1: return 1;
                  break;
          case 2: return 2;
                  break;
          case 3: return 3;
                  break;
          case 4: return 4;
                  break;
          case 5: return 5;
                  break;
          case 6: system("cls");
                  if(x==1)
                  customer();
                  else
                  admin();
          default: cout<<"\n\t\tPlease enter correct option :(";
                   getch();
                   system("cls");
                   category(x);
        }
  }

void Dvd::show(int i){

    cout << "\n\t\tDVD Name : " << name << endl;
    cout << "\n\t\tBook's ID : " << id << endl;
    cout << "\n\t\tBook's Price : " << p << endl;
    cout << "\n\t\tBook's Quantity : " << q << endl;
}

void Dvd::addDVD(){
     char ch,st1[100];
     int i=0,b,cont=0;
            B=category(2);
            system("cls");
            getdata();
            ofstream outf("DVD.txt",ios::app|ios::binary);
            outf.write((char*)this,sizeof(*this));
            outf.close();
            cout<<"\n\t\tDVD added.\n";

}

void Dvd::listDVD(int i){
        int b,r=0;
        system("cls");
        b=category(i);
        system("cls");
        ifstream intf("DVD.txt",ios::binary);
        if(!intf)
            cout<<"\n\t\tFile Not Found.";
        else{
            cout<<"\n\t    ************ DVD List ************ \n\n";
            intf.read((char*)this,sizeof(*this));
            while(!intf.eof()){
                if(b==B){
                    if(q==0 && i==1){
                    }
                    else{
                        r++;
                        cout<<"\n\t\t********** "<<r<<". ********** \n";
                        show(i);
                    }
                }
                intf.read((char*)this,sizeof(*this));
            }
        }
          cout<<"\n\t\tPress any key to continue.....";
          getch();
          system("cls");
            if(i==1)
                customer();
            else
                admin();

}

void Dvd::searchDVD(int x){
    int i,b,cont=0;
    char ch[100];
    system("cls");
    b=category(x);
    ifstream intf("DVD.txt",ios::binary);
    if(!intf){
        cout<<"\n\t\tFile Not Found.\n";
        cout<<"\n\t\t->Press any key to continue.....";
        getch();
        system("cls");
        if(i==1)
            customer();
            else
            admin();
        }

      system("cls");
      cout<<"\n\t\tChoose one option :-\n";
      cout<<"\n\t\t1.Search By Name\n\n\t\t2.Search By DVD's ID\n";
      cout<<"\n\t\tEnter Your Choice : ";
      cin>>i;
      fflush(stdin);
      intf.read((char*)this,sizeof(*this));
      if(x==1){
          cout<<"\n\t\tEnter DVD's Name : ";
          cin.getline(ch,100);
          system("cls");
          while(!intf.eof()){
            for(i=0;b==B&&q!=0&&name[i]!='\0'&&ch[i]!='\0'&&(ch[i]==name[i]||ch[i]==name[i]+32);i++);
            if(name[i]=='\0'&&ch[i]=='\0'){
                        cout<<"\n\t\tDVD Found :-\n";
                        show(i);
                        cont++;
                        break;
                }
             intf.read((char*)this,sizeof(*this));
        }
    }
          else if(i==2){
          cout<<"\n\t\tEnter DVD's ID : ";
          cin.getline(ch,100);
          system("cls");
          while(!intf.eof()){
              for(i=0;b==B&&q!=0&&id[i]!='\0'&&ch[i]!='\0'&&ch[i]==id[i];i++);
              if(id[i]=='\0'&&ch[i]=='\0'){
                    cout<<"\n\t\tDVD Found :-\n";
                    show(x);
                    cont++;
                    break;
                }
          intf.read((char*)this,sizeof(*this));
          }
        }
          else{
             cont++;
             cout<<"\n\t\tPlease enter correct option :(";
             getch();
             system("cls");
             searchDVD(x);
          }
        intf.close();
        if(cont==0)
        cout<<"\n\t\tThis DVD is not available :( \n";

    cout<<"\n\t\tPress any key to continue.....";
    getch();
    system("cls");
    if(x==1)
    customer();
    else
    admin();
}

void Dvd::modifyDVD(){
    char ch,st1[100];
    int i=0,b,cont=0;
      system("cls");
      b=category(2);
      ifstream intf1("DVD.txt",ios::binary);
      if(!intf1){
            cout<<"\n\t\tFile Not Found\n";
            cout<<"\n\t\tPress any key to continue.....";
            getch();
            system("cls");
            admin();
        }
            intf1.close();
            system("cls");
            fflush(stdin);
            cout<<"\n\t\tEnter DVD's ID : ";
            cin.getline(st1,100);
            system("cls");
            fstream intf("DVD.txt",ios::in|ios::out|ios::ate|ios::binary);
            intf.seekg(0);
            intf.read((char*)this,sizeof(*this));
             while(!intf.eof()){
                for(i=0;b==B&&id[i]!='\0'&&st1[i]!='\0'&&st1[i]==id[i];i++);
                if(id[i]=='\0'&&st1[i]=='\0'){
                    cont++;
                    getdata();
                    intf.seekp(intf.tellp()-sizeof(*this));
                    intf.write((char*)this,sizeof(*this));
                    break;
                }
            intf.read((char*)this,sizeof(*this));
        }

      intf.close();
            if(cont==0){
                cout<<"\n\t\tDVD Not Found.\n";
                cout<<"\n\t\tPress any key to continue.....";
                getch();
                system("cls");
                modifyDVD();
            }
            else
                cout<<"\n\t\tUpdate Successful.\n";
}

void Dvd::deleteDVD(){
  char ch,st1[100];
  int i=0,b,cont=0;
   system("cls");
   b=category(2);
   ifstream intf1("DVD.txt",ios::binary);
    if(!intf1){
        cout<<"\n\t\tFile Not Found\n";
        cout<<"\n\t\tPress any key to continue.....";
        getch();
        intf1.close();
        system("cls");
        customer();
    }
        intf1.close();
        fflush(stdin);
        system("cls");
        cout<<"\n\t\tEnter DVD's ID : ";
        cin.getline(st1,100);
        ofstream outf("temp.txt",ios::app|ios::binary);
        ifstream intf("DVD.txt",ios::binary);
        intf.read((char*)this,sizeof(*this));
        while(!intf.eof()){
            for(i=0;b==B&&id[i]!='\0'&&st1[i]!='\0'&&st1[i]==id[i];i++);
            if(id[i]=='\0'&&st1[i]=='\0'){
                cont++;
                intf.read((char*)this,sizeof(*this));
            }
            else{
                outf.write((char*)this,sizeof(*this));
                intf.read((char*)this,sizeof(*this));
            }
        }
        outf.close();
        intf.close();
        remove("DVD.txt");
        rename("temp.txt","DVD.txt");

            if(cont==0){
                cout<<"\n\t\tDVD Not Found.\n";
                cout<<"\n\t\tPress any key to continue.....";
                getch();
                system("cls");
                deleteDVD();
            }
            else
                cout<<"\n\t\tDeletion Successful.\n";

}

void Dvd::sortDVD(){
    int i = 0;

    cout<<"\n\tChoose one option\n";
    cout<<"\n\t\t1.By ID\n\n\t\t2.By Name\n\n\t\t3.By quantity\n\n\t\t4.Main menu \n";
    cout<<"\n\t\tEnter your choice : ";
    cin >> i;



}

void Dvd::borrowDVD(){
     /*int d;
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

*/

}

int main(){
    Dvd obj;
    obj.inter();
    getch();
    return 0;
};

