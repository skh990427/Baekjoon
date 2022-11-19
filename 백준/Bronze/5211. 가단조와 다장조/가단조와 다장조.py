music_list = list(input().split("|"))

A = 0
C = 0
for i in music_list:
    if i[0] == 'A' or i[0] == 'D' or i[0] == 'E':
        A += 1
    elif i[0] == 'C' or i[0] == 'F' or i[0] == 'G':
        C += 1
    if i == music_list[len(music_list) - 1] and A == C:
        if i[-1] == 'A' or i[-1] == 'D' or i[-1] == 'E':
            A += 1
        elif i[-1] == 'C' or i[-1] == 'F' or i[-1] == 'G':
            C += 1

if A > C:
    print("A-minor")
else:
    print("C-major")