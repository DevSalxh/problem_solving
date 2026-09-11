prompt = int(input())
output = "abcd" * (prompt // 4) + "abcd"[0 : prompt % 4]
print(output)