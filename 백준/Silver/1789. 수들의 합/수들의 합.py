n = int(input());
max = 1;
while(True):
    if n >= max:
        n -= max;
        max += 1;
    else:
        break;

print(max-1);