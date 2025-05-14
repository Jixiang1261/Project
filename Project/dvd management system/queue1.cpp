#include <iostream>
#include <cstdlib>
#include <conio.h>
#define SIZE 20
using namespace std;

void booking();


class queue
{
    int *arr;       // array to store queue elements
    int capacity;   // maximum capacity of the queue
    int front;      // front points to the front element in the queue (if any)
    int rear;       // rear points to the last element in the queue
    int count;      // current size of the queue

public:
    queue(int size = SIZE);     // constructor
    ~queue();                   // destructor

    void dequeue();
    void enqueue(int x);
    int peek();
    int size();
    bool isEmpty();
    bool isFull();
    void showQueue(queue que);

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
    // check for queue underflow
    if (isEmpty())
    {
        cout << "Underflow\nProgram Terminated\n";
        exit(EXIT_FAILURE);
    }

    cout << "Removing " << arr[front] << endl;

    front = (front + 1) % capacity;
    count--;
}
void queue::enqueue(int item)
{
    // check for queue overflow
    if (isFull())
    {
    }

    cout << "Inserting " << item << endl;

    rear = (rear + 1) % capacity;
    arr[rear] = item;
    count++;
}

// Utility function to return the front element of the queue
int queue::peek()
{
    return arr[front];
}

// Utility function to return the size of the queue
int queue::size() {
    return count;
}

// Utility function to check if the queue is empty or not
bool queue::isEmpty() {
    return (size() == 0);
}

// Utility function to check if the queue is full or not
bool queue::isFull() {
    return (size() == capacity);
}

void booking(){
     queue q(6);
     char ans;
     char ans1;
     int cho;
     char name;
     int counter = 0;

     system("cls");
     cout << "\n\t\tBooking\n\t" <<endl;
     cout << "=======================================================";
     cout << "\n\t\t1.Booking\n\n\t\t2.Checkout\n\n\t\t3.Main menu" << endl;
     cin >> cho;
       if(cho == 1){
         cout << "Booking for a Room (Y/N)" << endl;
            cin >> ans;
            if(ans == 'y' || ans == 'Y'){
               cout << "Enter your Name:" << endl;
               cin >> name;
                if(counter = 0){
                   cout << "Booking for 1P.M. to 3P.M.? (Y/N)"<< endl;
                   cin >> ans1;
                   if(ans1 == 'Y' || ans1 == 'y'){
                    q.enqueue(name);
                    counter = counter + 1;
                    getch();
                    booking();
                   }
                   else if(ans1 == 'n' || ans1 == 'N'){
                    cout << "Back to Booking Menu...." << endl;
                    getch();
                    booking();
                   }
                   else
                    cout << "Invalid option!!"<< endl;
                    getch();
                    booking();
                }
                else if(counter = 1){
                   cout << "Booking for 3P.M. to 5P.M.? (Y/N)"<< endl;
                   cin >> ans1;
                   if(ans1 == 'Y' || ans1 == 'y'){
                    q.enqueue(name);
                    counter = counter + 1;
                    getch();
                    booking();
                   }
                   else if(ans1 == 'n' || ans1 == 'N'){
                    cout << "Back to Booking Menu...." << endl;
                    getch();
                    booking();
                   }
                   else
                    cout << "Invalid option!!"<< endl;
                    getch();
                    booking();
                }
                else if(counter = 2){
                   cout << "Booking for 5P.M. to 7P.M.? (Y/N)"<< endl;
                   cin >> ans1;
                   if(ans1 == 'Y' || ans1 == 'y'){
                    q.enqueue(name);
                    counter = counter + 1;
                    getch();
                    booking();
                   }
                   else if(ans1 == 'n' || ans1 == 'N'){
                    cout << "Back to Booking Menu...." << endl;
                    getch();
                    booking();
                   }
                   else
                    cout << "Invalid option!!"<< endl;
                    getch();
                    booking();
                }
                else if(counter = 3){
                   cout << "Booking for 1P.M. to 3P.M. tomorrow? (Y/N)"<< endl;
                   cin >> ans1;
                   if(ans1 == 'Y' || ans1 == 'y'){
                    q.enqueue(name);
                    counter = counter + 1;
                    getch();
                    booking();
                   }
                   else if(ans1 == 'n' || ans1 == 'N'){
                    cout << "Back to Booking Menu...." << endl;
                    getch();
                    booking();
                   }
                   else
                    cout << "Invalid option!!"<< endl;
                    getch();
                    booking();
                }
                else if(counter = 4){
                   cout << "Booking for 3P.M. to 5P.M. tomorrow? (Y/N)"<< endl;
                   cin >> ans1;
                   if(ans1 == 'Y' || ans1 == 'y'){
                    q.enqueue(name);
                    counter = counter + 1;
                    getch();
                    booking();
                   }
                   else if(ans1 == 'n' || ans1 == 'N'){
                    cout << "Back to Booking Menu...." << endl;
                    getch();
                    booking();
                   }
                   else
                    cout << "Invalid option!!"<< endl;
                    getch();
                    booking();
                }
                else if(counter = 5){
                   cout << "Booking for 5P.M. to 7P.M. tomorrow? (Y/N)"<< endl;
                   cin >> ans1;
                   if(ans1 == 'Y' || ans1 == 'y'){
                    q.enqueue(name);
                    counter = counter + 1;
                    getch();
                    booking();
                   }
                   else if(ans1 == 'n' || ans1 == 'N'){
                    cout << "Back to Booking Menu...." << endl;
                    getch();
                    booking();
                   }
                   else
                    cout << "Invalid option!!"<< endl;
                    getch();
                    booking();
                }
                else
                    cout << "Queue is full come back next time" << endl;
                    getch();
                    booking();
        }
           else
               booking();
       }

        else if(cho = 2){
          cout << "Checkout Customer Using the Room now?(Y/N)"<< endl;
          if(counter = 0){
            cout << "The First Customer Now in the Queue is " << q.peek() << endl;
          }
          cin >> ans1;
          if(ans1 == 'y' || ans1 == 'Y'){
             q.dequeue();
             counter = counter - 1;
             cout << "Checked out"<< endl;
             getch();
             booking();
    }
          else if(ans1 == 'n' || ans1 == 'N'){
             booking();
          }
          else
            cout << "Invalid option!" << endl;
             booking();
    }
    else if(cho = 3){
           system("cls");
           return;
    }
    else
        cout<<"\n\t\tPlease enter correct option :(";
        getch();
        system("cls");
        booking();
    }



