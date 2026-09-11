using var reader = new StreamReader(Console.OpenStandardInput());
using var writer = new StreamWriter(Console.OpenStandardOutput());

int testingCase = int.Parse(reader.ReadLine()!);
while (testingCase-- > 0)
{
    string word = reader.ReadLine()!;
    if (word.Length < 10)
    {
        writer.WriteLine(word);
    }
    else
    {
        writer.WriteLine($"{word[0]}{word.Length-2}{word[^1]}");
    }
}