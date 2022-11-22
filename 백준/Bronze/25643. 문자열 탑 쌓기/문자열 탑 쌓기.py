n, m = map(int, input().split())
l = []
for _ in range(n):
    l.append(input())

for i in range(n-1):
    str1 = l[i]
    str2 = l[i+1]

    flag = False

    for j in range(1, m + 1):
        if str1[m - j:] == str2[:j]:
            flag = True
            break
        if str1[:j] ==  str2[m - j:]:
            flag = True
            break
    if not flag:
        print(0)
        exit(0)
print(1)