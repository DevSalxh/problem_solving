#include <iostream>
#include <string>
#include <algorithm>
#include <cmath>
using ll = long long;
using namespace std;

int main() {
    int t;
    cin >> t;
    while (t--) {
        ll x;
        cin >> x;
        int p = 31;
        bool batataWin = false;
        ll powerOfTwo = pow(2, p);
        while (x > 0) {
            if (powerOfTwo % 2 == 0) {
                batataWin = !batataWin;
            }
            x -= powerOfTwo;
        }
        if (batataWin)
            cout << "Batata" << endl;
        else
            cout << "Moon" << endl;
    }
}
