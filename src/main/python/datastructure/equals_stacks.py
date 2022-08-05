def equalStacks(h1, h2, h3):
    # Write your code here

    h1Sum = 0
    h2Sum = 0
    h3Sum = 0

    for elem in h1:
        h1Sum = h1Sum + elem

    for elem in h2:
        h2Sum = h2Sum + elem

    for elem in h3:
        h3Sum = h3Sum + elem

    while not(h1Sum == h2Sum == h3Sum) and not(h1Sum == 0 or h2Sum == 0 or h3Sum == 0):

        if h1Sum >= h2Sum and h1Sum >= h3Sum:
            removed = h1.pop(0)
            h1Sum = h1Sum - removed

        elif h2Sum >= h1Sum and h2Sum >= h3Sum:
            removed = h2.pop(0)
            h2Sum = h2Sum - removed

        elif h3Sum >= h1Sum and h3Sum >= h2Sum:
            removed = h3.pop(0)
            h3Sum = h3Sum - removed

    return  min(h1Sum, h2Sum, h3Sum)