print('[', end='')
first = 1
for xx in range(0, x+1):
    for yy in range(0, y+1):
        for zz in range(0, z+1):
            if xx + yy + zz == n:
                continue
            else:
                if first == 0:
                    print(', ', end='')
                else:
                    first = 0

                print('[', xx, ', ', yy, ', ', zz, ']', end='', sep='')

print(']', end='')