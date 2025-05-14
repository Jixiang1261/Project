#include<queue>
#include<string.h>
#include<iostream>
using namespace std;

class Dvd {
  public:
   int id;
   int quantity;
   string name;
   Dvd(int id, string name, int quantity){
       id = getid;
       name = getname;
       quantity = getquantity;}
   ~Dvd();
   int getid;
   int getquantity;
   string getname;

};


int main(){
    Dvd(int id, string name, int quantity);
    cout << "enter id" << endl;
    cin >> getid;
    cout << "enter name" << endl;
    cin >> getname;
    cout << "enter quantity" << endl;
    cin >> getquantity;
const queue( const Container& con );
  queue<string> waiting_line;
  while( waiting_line.size() < 5 ) {
    cout << "Welcome to the line, please enter your name: ";
    string s;
    getline( cin, s );
    waiting_line.push(s);
  }

  while( !waiting_line.empty() ) {
    cout << "Now serving: " << waiting_line.front() << endl;
    waiting_line.pop();
  }
}
