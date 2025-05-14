#include <iostream>
#include <cstdlib>
#include <conio.h>
#define SIZE 20
using namespace std;

void booking();

class queue
{
    int *arr;
    int capacity;
    int front;
    int rear;
    int count;

public:
    queue(int size = SIZE);
    ~queue();

    void dequeue();
    void enqueue(int x);
    int peek();
    int size();
    bool isFull();
};

queue::queue(int size)
{
    arr = new int[size];
    capacity = size;
    front = 0;
    rear = -1;
    count = 0;
}

queue::~queue() {
    delete[] arr;
}

void queue::dequeue()
{

    cout << "Removing " << arr[front] << endl;

    front = (front + 1);
    count--;
}

void queue::enqueue(int item)
{
    cout << "Inserting " << item << endl;

    rear = (rear + 1) ;
    arr[rear] = item;
    count++;
}

int queue::peek()
{
    return arr[front];
}

int queue::size() {
    return count;
}

bool queue::isFull() {
    return (size() == capacity);
}

queue q(3);
void booking(){
     system("cls");
     char ans;
     char ans1;
     char ans2;
     int cho;
     int id;

     cout << "\n\t\tBooking\n\t" <<endl;
     cout << "=======================================================";
     cout << "\n\t\t1.Booking\n\n\t\t2.Checkout\n\n\t\t3.Main menu" << endl;
     cin >> cho;
       switch(cho){
    case 1:cout << "Booking for a Room (Y/N)" << endl;
           cin >> ans;
            if(ans == 'y' || ans == 'Y'){
                if(q.isFull()){
                    cout << "Queue is Full Come Back Next time"<<endl;
                    getch();
                    booking();
                    break;
                }
                else
                   cout << "Enter your ID:" << endl;
                   cin >> id;
                   q.enqueue(id);
                   getch();
                   booking();
                   break;
            }
           else
               booking();
               break;


    case 2:cout << "Checkout Customer Using the Room now?(Y/N)"<< endl;
           cout << "The First Customer Now in the Queue is " << q.peek() << endl;
           cin >> ans2;
             if(ans2 == 'y' || ans2 == 'Y'){
                q.dequeue();
                cout << "Checked out"<< endl;
                getch();
                booking();
                break;
          }
             else if(ans2 == 'n' || ans2 == 'N'){
                booking();
                break;
          }
             else
                cout << "Invalid option!" << endl;
                booking();
                break;

   case 3:cout << "Return to Main Menu...."<< endl;
          getch();
          return;
   default:cout<<"\n\t\tInvalid option :(";
           getch();
           booking();
     }

}
