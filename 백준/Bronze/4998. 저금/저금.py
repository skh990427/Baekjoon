try:
    while True:
        n, b, m = map(float, input().split())
        count = 0

        while n < m:
            n *= (1 + b / 100)

            count += 1
        print(count)
except : exit()