int Iterations = int.Parse(Console.ReadLine());

while (Iterations-- > 0)
{
    int n = int.Parse(Console.ReadLine());
    string[] Array = Console.ReadLine().Split();

    int currentZeros = 0;
    int maxZeros = 0;

    for (int i = 0; i < n; i++)
    {
        if (Array[i] == "0")
        {
            currentZeros++;
            if (currentZeros > maxZeros)
                maxZeros = currentZeros;
        }
        else
        {
            currentZeros = 0;
        }
    }

    Console.WriteLine(maxZeros);
}