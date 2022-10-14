n = int(input());

cnt = 1;
div = 10**9 + 7;

while(n):
    cnt *= n - 1;
    n -= 2;
    cnt %= div;

print(int(cnt));