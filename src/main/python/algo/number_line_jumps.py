if (x1 > x2 and v1 > v2) or (x2 > x1 and v2 > v1) or (x1 != x2 and v1 == v2):
    return 'NO'

if x1 == x2:
    return 'YES'

greaterSpeed = v1 if v1 > v2 else v2
slowerSpeed = v1 if v1 < v2 else v2

xHigher = x1 if x1 > x2 else x2
xLower = x1 if x1 < x2 else x2


xDiff = xHigher - xLower
# 20 - 4 = 16

vDiff = greaterSpeed - slowerSpeed
# 3 - 1 = 2

if vDiff == 0:
    'NO'

return 'YES' if xDiff % vDiff == 0 else 'NO'
