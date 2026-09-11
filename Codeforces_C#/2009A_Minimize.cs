int Iterations = int.Parse(Console.ReadLine());

while (Iterations-- > 0)
{
    string[] Input = Console.ReadLine().Split();
    int A = int.Parse(Input[0]);
    int B = int.Parse(Input[1]);

    Console.WriteLine(B - A);
}