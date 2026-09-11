using System;
using System.Linq;

const int INF = 1_000_000;

string BAD = "2025";
string GOOD = "2026";
char[] ALPH = { '0', '2', '5', '6' };

int CharId(char c)
{
    if (c == '0') return 0;
    if (c == '2') return 1;
    if (c == '5') return 2;
    return 3; // '6'
}

// ---------- Build automaton ----------
int[,] nxt = new int[4, 4];

for (int st = 0; st < 4; st++)
{
    for (int ci = 0; ci < 4; ci++)
    {
        char c = ALPH[ci];
        string cur = BAD.Substring(0, st) + c;

        int ns = 0;
        for (int k = Math.Min(4, cur.Length); k >= 0; k--)
        {
            if (cur.EndsWith(BAD.Substring(0, k)))
            {
                ns = k;
                break;
            }
        }
        nxt[st, ci] = ns;
    }
}

int t = int.Parse(Console.ReadLine());

while (t-- > 0)
{
    int n = int.Parse(Console.ReadLine());
    string s = Console.ReadLine();

    // ---------- Option 1: Force "2026" ----------
    int costMake2026 = INF;

    for (int i = 0; i + 3 < n; i++)
    {
        int cost = 0;
        for (int j = 0; j < 4; j++)
            if (s[i + j] != GOOD[j])
                cost++;

        costMake2026 = Math.Min(costMake2026, cost);
    }

    // ---------- Option 2: Remove all "2025" ----------
    int[,] dp = new int[n + 1, 4];
    for (int i = 0; i <= n; i++)
        for (int j = 0; j < 4; j++)
            dp[i, j] = INF;

    dp[0, 0] = 0;

    for (int i = 0; i < n; i++)
    {
        for (int st = 0; st < 4; st++)
        {
            if (dp[i, st] == INF) continue;

            foreach (char c in ALPH)
            {
                int ns = nxt[st, CharId(c)];
                if (ns == 4) continue; // forbidden "2025"

                int cost = dp[i, st] + (s[i] == c ? 0 : 1);
                dp[i + 1, ns] = Math.Min(dp[i + 1, ns], cost);
            }
        }
    }

    int costRemove2025 = Enumerable.Range(0, 4).Min(j => dp[n, j]);
    Console.WriteLine(Math.Min(costMake2026, costRemove2025));
}
