L = list(map(int, input().split()))

for i in range(1, 10):
    if L.count(i) == 3:
        print(10000 + (i * 1000))
        break
    elif L.count(i) == 2:
        print(1000 + (i * 100))
        break


if L[0] != L[1] and L[0] != L[2] and L[1] != L[2]:
    print(max(L) * 100)