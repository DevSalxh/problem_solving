#include <iostream>
#include <string>
#include <algorithm>

using namespace std;

int main() {
    int t;
    cin >> t;

    while (t--) {
        string a, b;
        cin >> a >> b;

        int i = a.size() - 1;
        int j = b.size() - 1;
        int carry = 0;

        string ans;

        while (i >= 0 || j >= 0 || carry) {
            int sum = carry;

            if (i >= 0)
                sum += a[i--] - '0';

            if (j >= 0)
                sum += b[j--] - '0';

            ans += char(sum % 10 + '0');
            carry = sum / 10;
        }

        reverse(ans.begin(), ans.end());

        cout << ans << '\n';
    }
}