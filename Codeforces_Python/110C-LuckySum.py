def find_lucky_number(n):
    for sevens in range(n // 7, -1, -1):
        fours = (n - sevens * 7) / 4
        if fours == int(fours) and fours >= 0:
            return "4" * int(fours) + "7" * sevens
    return "-1"

n = int(input())
print(find_lucky_number(n))