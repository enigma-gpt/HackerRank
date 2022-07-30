def miniMaxSum(arr):
    # Write your code here

    arr.sort()

    val1 = arr[0]
    val2 = arr[1]
    val3 = arr[2]
    val4 = arr[3]
    val5 = arr[4]

    print(val1+val2+val3+val4, end=' ')

    print(val2+val3+val4+val5, end='')