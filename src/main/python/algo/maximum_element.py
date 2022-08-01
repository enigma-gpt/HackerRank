def get_max(operations):
    # Write your code here

    out = []
    stack = []

    for element in operations:

        if element.startswith('1'):
            split_element_one = element.split(' ')
            operation_one_value = int(split_element_one[1])
            newElem = stack[-1] if stack and stack != [] and operation_one_value < stack[-1] else operation_one_value
            stack.append(newElem)

        elif element.startswith('2'):
            stack.pop()

        else:
            out.append(stack[-1])

    return out


out = get_max(['1 97',
         '2',
         '1 20',
         '2',
         '1 26',
         '1 20',
         '2',
         '3',
         '1 91',
         '3'])

print(out)
