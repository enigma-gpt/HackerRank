def getMax(operations):
    # Write your code here

    stack = []

    for element in operations:
        print(element)

        if element.startswith('1'):
            splitedElementOne = element.split(' ')
            operationOneValue = splitedElementOne[1]

            print('operation: 1, value ', operationOneValue)
            stack.append(operationOneValue)

        elif element.startswith('2'):
            stack.pop()

        else:
            print()



getMax(['1 97',
        '2',
        '1 20',
        '2',
        '1 26',
        '1 20',
        '2',
        '3',
        '1 91',
        '3'])