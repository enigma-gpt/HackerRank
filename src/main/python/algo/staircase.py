def staircase(n):
    # Write your code here

    emptySpaceMaxIndex = n

    for stairCount in range(1, n+1):

        for i in range(1, n+1):
            if(i < emptySpaceMaxIndex):
                print(' ', end='')
            else:
                print('#', end='')

        print('')

        emptySpaceMaxIndex = emptySpaceMaxIndex - 1