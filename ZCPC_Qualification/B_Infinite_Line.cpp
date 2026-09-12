#include <iostream>
#include <string>
#include <algorithm>
using ll = long long;
using namespace std;
 
void solve() {
    ll x1, y1, x2, y2;
    cin >> x1 >> y1 >> x2 >> y2;
    if (x1 == x2)
        cout << ++x1 << " " << y1 << " " << ++x2 << " " << y2 << endl;
    else
        cout << x1 << " " << ++y1 << " " << x2 << " " << ++y2 << endl;
}
int main() {
    int t;
    cin >> t;
    while (t--) {
        solve();
    }
}