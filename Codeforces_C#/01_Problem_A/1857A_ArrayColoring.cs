int Iterations = int.Parse(Console.ReadLine());

while (Iterations-- > 0)
{
    int ArraySize = int.Parse(Console.ReadLine());
    int Sum = Console.ReadLine()
        .Split(' ',StringSplitOptions.RemoveEmptyEntries)
        .Select(int.Parse)
        .Sum();

    Console.WriteLine(Sum % 2 == 0 ? "YES" : "NO");
}