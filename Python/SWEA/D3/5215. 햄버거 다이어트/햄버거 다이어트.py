T = int(input())

for test_case in range(1, T + 1):
    n, l = map(int, input().split())
    dp = [0] * (l + 1)
    arr = []
    for i in range(n):
        arr.append(list(map(int, input().split())))

    for taste_score, current_cal in arr:
        for cal in range(l, current_cal - 1, -1):
            dp[cal] = max(dp[cal], dp[cal - current_cal] + taste_score)

    print(f"#{test_case}",dp[l])