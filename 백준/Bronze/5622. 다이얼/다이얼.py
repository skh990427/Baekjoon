alpabet = ['ABC', 'DEF', 'GHI', 'JKL', 'MNO', 'PQRS', 'TUV', 'WXYZ'];

word = input();

sec = 0;

for i in range(len(word)):
    for j in alpabet:
        if word[i] in j:
            sec += alpabet.index(j) + 3;

print(sec);