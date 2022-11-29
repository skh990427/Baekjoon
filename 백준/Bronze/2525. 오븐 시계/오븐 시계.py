h, m = map(int, input().split())
time_min = int(input())

m += time_min
while m >= 60:
    m -= 60
    h += 1

if h >= 24:
    h -= 24

print(h, m)