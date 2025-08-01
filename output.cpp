#include <iostream>
#include <string>
using namespace std;

class Student{
    public:
        void setName(string value)
        {
            this->name = value;
        }
        void setGrades(int value1, int value2)
        {
            this->grade1 = value1;
            this->grade2 = value2;
        }
        void calculateAverage()
        {
            int sum = 0;
            sum = this->grade1 + this->grade2;
            this->average = sum / 2;
        }
        float getAverage()
        {
            return this->average;
        }
        string getStatus()
        {
                if (this->average >= 70) {
        return "Approved";
    } else {
        return "Failed";
    }
        }
        void showInfo()
        {
            cout << "Student: " << this->name << endl;
            cout << "Average: " << this->average << endl;
            cout << "Status: " << this->getStatus() << endl;
        }
    private:
        string name = "Mario";
        int grade1;
        int grade2;
        float average;
};

int sum(int a, int b) {
    return a + b;
}

int main() {
    cout << "Holaa" << endl;
    return 0;
}
