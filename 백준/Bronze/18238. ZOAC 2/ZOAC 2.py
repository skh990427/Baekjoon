word = input();

start = 'A';
sec = 0;

for i in word:
    left = ord(start) - ord(i);
    right = ord(i) - ord(start);

    if left < 0:
        left += 26;
    elif right < 0:
        right += 26;
    sec += min(left, right);
    start = i;

print(sec);