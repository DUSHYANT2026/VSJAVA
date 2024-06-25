// #include<iostream>
// using namespace std;
// int main(){
//     int n;
//     cin>>n;
//     for(int i=0; i<=n; i++)
//     cout << i <<" JAI SHREE RAM, JAI HANUMAN" <<endl;
//     return 0;
// }




#include <bits/stdc++.h>
using namespace std;
class Rectangle {
public:
    int length;
    int breadth;
    Rectangle(int l, int b){
        length = l;
        breadth = b;
    }

    int getArea() {
        return length * breadth;
    }
};

int main() {
    int length , breadth;
    cin>>length>> breadth;
    Rectangle rect(length, breadth);

    cout << "Area of the rectangle: " << rect.getArea() << endl;

    return 0;
}

