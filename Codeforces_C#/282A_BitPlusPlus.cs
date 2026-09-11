using var reader = new StreamReader(Console.OpenStandardInput());
using var writer = new StreamWriter(Console.OpenStandardOutput());

int numberOfStatement = int.Parse(reader.ReadLine()!);

int x = 0;

while (numberOfStatement-- > 0){
    string statement = reader.ReadLine()!;
    if (statement[1] == '+')
    {
        x += 1;
    } 
    else
    {
        x -= 1;    
    }
}

writer.WriteLine(x);