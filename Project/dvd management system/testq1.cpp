#include <iostream>
#include <cstdlib>
#include <conio.h>
using namespace std;

// Define the default capacity of a queue
void booking();
// A class to store a queue
class queue
{
    int *arr;       // array to store queue elements
    int capacity;   // maximum capacity of the queue
    int front;      // front points to the front element in the queue (if any)
    int rear;       // rear points to the last element in the queue
    int count;      // current size of the queue

public:
    queue(int size);     // constructor
    ~queue();                   // destructor

    void dequeue();
    void enqueue(int x);
    int peek();
    int size();
    bool isEmpty();
    bool isFull();
};

// Constructor to initialize a queue
queue::queue(int size)
{
    arr = new int[size];
    capacity = size;
    front = 0;
    rear = -1;
    count = 0;
}

// Destructor to free memory allocated to the queue
queue::~queue() {
    delete[] arr;
}

// Utility function to dequeue the front element
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

// Utility function to add an item to the queue
void queue::enqueue(int item)
{
    // check for queue overflow
    if (isFull())
    {
        cout << "Overflow\nProgram Terminated\n";
        exit(EXIT_FAILURE);
    }

    cout << "Inserting " << item << endl;

    rear = (rear + 1) % capacity;
    arr[rear] = item;
    count++;
}

// Utility function to return the front element of the queue
int queue::peek()
{
    if (isEmpty())
    {
        cout << "Underflow\nProgram Terminated\n";
        exit(EXIT_FAILURE);
    }
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

queue q(6);
void booking(){
     char ans;
     char ans1;
     char ans2;
     int cho;
     int id;
     int ctr = 0;

     system("cls");
     cout << "\n\t\tBooking\n\t" <<endl;
     cout << "=======================================================";
     cout << "\n\t\t1.Booking\n\n\t\t2.Checkout\n\n\t\t3.Customer ID now using\n\n\t\t4.Main menu" << endl;
     cin >> cho;
       if(cho == 1){
         cout << "Booking for a Room (Y/N)" << endl;
            cin >> ans;
            if(ans == 'y' || ans == 'Y'){
               cout << "Enter your ID:" << endl;
               cin >> id;
                q.enqueue(id);
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

    else if(cho = 2){
          cout << "Checkout Customer Using the Room now?(Y/N)"<< endl;
          cout << "The First Customer Now in the Queue is " << q.peek() << endl;
          cin >> ans2;
          if(ans2 == 'y' || ans2 == 'Y'){
             q.dequeue();
             ctr --;
             cout << "Checked out"<< endl;
             getch();
             booking();
    }
          else if(ans2 == 'n' || ans2 == 'N'){
             booking();
          }
          else
            cout << "Invalid option!" << endl;
             booking();
    }
    else if(cho = 3){
        cout << "The  Customer Now in the Queue is " << q.peek() << endl;
        getch();
        booking();
    }
    else if(cho = 4){
           system("cls");
           return;
    }
    else
        cout<<"\n\t\tPlease enter correct option :(";
        getch();
        system("cls");
        booking();
    }

int main(){
   booking();
}
