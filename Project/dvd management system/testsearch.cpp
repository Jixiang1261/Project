#include <iostream>
#include <fstream>
#include <string>

using namespace std;

int search(void);

int main (void)
{
	cout << search() << endl;
	return 0;
}

int search(void)
{
	fstream checkStream;
	string searchString;
	string lineOfText;

	cout << "Please enter a valid name to search for: ";
	getline(cin, searchString);

	checkStream.open("student.txt", ios::in);

	for(;;)
	{
		getline(checkStream, lineOfText);

		if (checkStream.eof()) break;
		if (lineOfText.find("searchString", 0) != string::npos)
		{
			return 1;
			break;
		}
	}
	cout << "Done searching..." << endl;
	checkStream.close();
	return 0;
}
