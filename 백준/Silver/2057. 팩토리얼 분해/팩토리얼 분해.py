def factorial(n):
    if n == 0:
        return 1
    else:
        return n * factorial(n - 1)


N = int(input())

if N == 0:
    print("NO")
    exit(0)
else:
    for i in range(20, -1, -1):
        if N >= factorial(i):
            N -= factorial(i)
if N == 0:
    print("YES")
else:
    print("NO")