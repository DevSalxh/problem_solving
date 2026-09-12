#include <iostream>
#include <vector>
#include <algorithm>
#include <map>
using ll = long long;
using namespace std;

void solve() {
    ll n;
    cin >> n;
    vector<ll> a(n);
    ll total_sum = 0;
    map<ll, ll> sum_of_value;

    for ( int i = 0 ; i < n ; i ++) {
        cin >> a[i];
        total_sum += a[i];
        sum_of_value[a[i]] += a[i];
    }

    ll max_sum = total_sum;

    for (auto const& [val, sum_val] : sum_of_value) {
        ll current_sum = total_sum - sum_val;
        max_sum = max(max_sum, current_sum);
    }

    cout << max_sum << endl;
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