N, M = map(int, input().split())

result = 0
for i in range(N):
    data = list(map(int, input().split()))
    min_num = 10001 
    for j in data:
        min_num = min(min_num, j)
    result = max(min_num, result)

print(result)
