N = int(input())
count = 0

# 큰 단위부터 차례대로 확인
coin_types = [500, 100, 50, 10]

for coin in coin_types:
    count += N // coin  # 반복문을 실행해 해당 화폐로 거슬러 줄 수 있는 동전 개수 세기
    N %= coin

print(count)
