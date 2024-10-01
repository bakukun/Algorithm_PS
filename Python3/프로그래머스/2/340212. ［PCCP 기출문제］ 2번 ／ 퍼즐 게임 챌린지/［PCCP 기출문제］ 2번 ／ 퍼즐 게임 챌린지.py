def solution(diffs, times, limit):
    n = len(diffs)
    max_diff = max(diffs)
    
    def total_time(level):
        total = times[0]  # Time for the first puzzle
        for i in range(1, n):
            diff = diffs[i]
            time_cur = times[i]
            time_prev = times[i - 1]
            if diff <= level:
                total += time_cur
            else:
                cnt = diff - level
                total += cnt * (time_cur + time_prev) + time_cur
                if total > limit:
                    return total  # Early exit if over limit
        return total

    low = 1
    high = max_diff
    answer = max_diff  # Initialize with maximum possible level

    while low <= high:
        mid = (low + high) // 2
        t = total_time(mid)
        if t <= limit:
            answer = mid
            high = mid - 1
        else:
            low = mid + 1
    return answer
