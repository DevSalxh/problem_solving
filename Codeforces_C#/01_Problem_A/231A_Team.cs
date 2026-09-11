using var reader = new StreamReader(Console.OpenStandardInput());
using var writer = new StreamWriter(Console.OpenStandardOutput());

int problemsNumber = int.Parse(reader.ReadLine()!);
int acceptedSolution = 0;

while (problemsNumber-- > 0)
{
    string solutionConfirmationMessage = reader.ReadLine()!;
    acceptedSolution += solutionConfirmationMessage.Count(c => c == '1')>=2 ? 1 : 0;
}

writer.WriteLine(acceptedSolution);