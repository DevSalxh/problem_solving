using System.Data;

using var reader = new StreamReader(Console.OpenStandardInput());
using var writer = new StreamWriter(Console.OpenStandardOutput());

int n = -1;
int row = -1;
int col = -1;

while (n++ < 4)
{
    string line = reader.ReadLine()!;
    if (line.Contains('1'))
    {
        row = n;
        int[] array = line.Split().Select(int.Parse).ToArray();
        for (int i = 0 ; i < 5 ; i++)
        {
            if (array[i] == 1)
            {
                col = i;
                break;
            }
        }
    }
}

writer.WriteLine(Math.Abs(row - 2) + Math.Abs(col - 2));
