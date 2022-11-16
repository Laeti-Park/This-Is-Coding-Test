# N : List 개수 / M : 더하는 횟수 / N : 특정한 숫자 연속 횟수
N, M, K = map(int, input().split())
data = list(map(int, input().split()))
sum = 0

data.sort()
max_first = data[N - 1]
max_second = data[N - 2]

# 시간을 줄이기 위해서는 다음과 같은 식으로 푸는 게 좋다.
# int(M / (K + 1) * K + M % (K + 1))
max_count = int(M / (K + 1) * K)
max_count += M % (K + 1)

sum += max_count * max_first
sum += (M - max_count) * max_second

print(sum)