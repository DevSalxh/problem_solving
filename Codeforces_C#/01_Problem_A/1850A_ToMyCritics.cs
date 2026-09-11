int t = int.Parse(Console.ReadLine());
while (t-- > 0)
{
    string[] inputs = Console.ReadLine().Split(' ');
    int a = int.Parse(inputs[0]);
    int b = int.Parse(inputs[1]);
    int c = int.Parse(inputs[2]);

    if (a + b >= 10 || a + c >= 10 || b + c >= 10)
    {
        Console.WriteLine("YES");
    }
    else
    {
        Console.WriteLine("NO");
    }
}