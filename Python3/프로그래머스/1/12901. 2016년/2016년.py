import datetime

def solution(a, b):
    day = datetime.date(2016, a, b)
    dict = ("MON","TUE","WED","THU","FRI","SAT","SUN")
    answer = dict[day.weekday()]
    return answer