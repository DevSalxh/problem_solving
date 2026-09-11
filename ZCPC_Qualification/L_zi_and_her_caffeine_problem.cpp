#include <iostream>
#include <vector>
#include <algorithm>
 
using namespace std;
 
void solve() {
    int n;
    cin >> n;
 
    vector<int> a(n);
    for (int i = 0; i < n; i++) {
        cin >> a[i];
    }
    sort(a.begin(), a.end());
 
    int result = -1;
    for (int i = 0; i + 2 < n; i++) {
        if (a[i] == a[i + 1] && a[i + 1] == a[i + 2]) {
            result = a[i];
            break;
        }
    }
 
    cout << result << "\n";
}
 
int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
 
    int t;
    if (cin >> t) {
        while (t--) {
            solve();
        }
    }
 
    return 0;
}