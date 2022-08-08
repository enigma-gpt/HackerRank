def levelOrder(root):
    #Write your code here

    stack = []
    stack.append(root)
    print(root.info, end=' ')

    while len(stack) > 0:
        removed = stack.pop(0)
        if removed.left is not None:
            print(removed.left.info, end=' ')
            stack.append(removed.left)
        if removed.right is not None:
            print(removed.right.info, end=' ')
            stack.append(removed.right)