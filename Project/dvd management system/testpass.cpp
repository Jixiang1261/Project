#include<iostream>
#include<fstream>
#include<conio.h>
#include<stdio.h>
#include<string>
using namespace std;

void register_user();
void show_user();
void login_user();
void modify_user();
void main_menu();

void register_user(){
     string username;
     string password;

     cout << "Enter your name:";
     cin >> username;
     cout << "Enter your password";
     cin >> password;

     ofstream user;
     user.open("user.txt" , ios :: app);
     user << endl;
     user << username;
     user << endl;
     user << password;
     user.close();
}

void show_user(){
     string username;
     string password;
     ifstream user;
     user.open("user.txt");

     user >> username;
     user >> password;

     while(!user.eof()){
        cout << "username:" << username << endl;
        cout << "password:" << password << endl;

        user >> username;
        user >> password;

     }
     getch();
}

/*void login_user(){
     string username;
     string password;
     string loginname;
     string loginpassword;
     ifstream user;
     user.open("user.txt");
     user >> password;
     user >> username;

     retry:
     cout << "Enter your name:" << endl;
     cin >> loginname;
     cout << "Enter your password :" << endl;
     cin >> loginpassword;

     while(!user.eof()){
        if(loginname == username){
            if(loginpassword == password){
                cout << "welcome back" << endl;
            }
            else
                cout << "Wrong" << endl;
                getch();
                goto retry;
        }
        else
            cout << "invalid" << endl;
            getch();
            goto retry;
     }
}
*/
void modify_user(){








}

void delete_user(){
    string username;
    string password;
    string name;
     cout << "enter the name want to delete" << endl;
     cin >> name;
     ifstream user;
     user.open("user.txt");
     ofstream note;
     note.open("note.txt");

     user >> username;
     user >> password;

     while(!user.eof()){
      if(username != name){
        note << endl;
        note << username;
        note << endl;
        note << password;
      }
      else
        cout << "Record deleted" << endl;

     user >> username;
     user >> password;

     }
     note.close();
     user.close();
     remove("user.txt");
     rename("note.txt", "user.txt");

}
main(){
   int i;
    cout << "1.register user" << endl;
    cout << "2.show user" << endl;
    cout << "3.login user"<< endl;
    cin >> i;
    switch(i){
    case 1:
    register_user();
    break;
    case 2:
    show_user();
    break;
    /*case 3:
    login_user();
    break;*/
    case 4:
    delete_user();
    break;
    default:cout << "invalid" << endl;
            getch();
            system("cls");
            main();

}
}
