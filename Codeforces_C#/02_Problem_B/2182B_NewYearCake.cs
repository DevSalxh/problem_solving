using System;

int t = int.Parse(Console.ReadLine());

while (t-- > 0)
{
    var parts = Console.ReadLine().Split();
    long a = long.Parse(parts[0]); // white chocolate
    long b = long.Parse(parts[1]); // dark chocolate

    long Solve(bool startWhite)
    {
        long white = a, dark = b;
        long size = 1;
        int layers = 0;
        bool whiteTurn = startWhite;

        while (true)
        {
            if (whiteTurn)
            {
                if (white < size) break;
                white -= size;
            }
            else
            {
                if (dark < size) break;
                dark -= size;
            }

            layers++;
            size *= 2;
            whiteTurn = !whiteTurn;
        }

        return layers;
    }

    long ans = Math.Max(Solve(true), Solve(false));
    Console.WriteLine(ans);
}
