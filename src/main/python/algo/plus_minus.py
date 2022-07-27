#
# Complete the 'plusMinus' function below.
#
# The function accepts INTEGER_ARRAY arr as parameter.
#

def plusMinus(arr):
    # Write your code here

    positive=0
    zero=0
    negative=0

    for element in arr:
        if element > 0:
            positive = positive+1
        elif element == 0:
            zero = zero+1
        else:
            negative = negative+1

    print(format(positive/len(arr), '.6f'))
    print(format(negative/len(arr), '.6f'))
    print(format(zero/len(arr), '.6f'))