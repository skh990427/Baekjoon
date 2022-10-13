n = int(input());

line = 1;
cnt = 1;

while(True):
    if n > cnt:
        n -= cnt;
        cnt += 1;
        line += 1;
    else:
        break;

if line % 2 == 0:
    print("{0}/{1}" .format(1+(n-1), line-(n-1)));
else:
    print("{0}/{1}".format(line-(n-1), 1+(n-1)));