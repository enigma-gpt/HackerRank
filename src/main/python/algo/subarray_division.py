def birthday(s, d, m):
    # Write your code here

    out = 0
    sSize = len(s)
    i = 0
    for elem in s:

        if i + m > sSize:
            break

        sum = 0
        for current in range(i, i+m):
            sum += s[current]

        if sum == d:
            out += 1

        i +=1

    return out
