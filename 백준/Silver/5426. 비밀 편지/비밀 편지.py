import math

n = int(input())

for i in range(n):
    secret = input()
    secret_list = []
    for j in range(int(math.sqrt(len(secret)))):
        secret_list.append(secret[j*int(math.sqrt(len(secret))):(j+1)*int(math.sqrt(len(secret)))])
    sub = ""
    for j in range(int(math.sqrt(len(secret)))-1, -1 ,-1):
        for k in range(int(math.sqrt(len(secret)))):
            sub += secret_list[k][j]
    print(sub)