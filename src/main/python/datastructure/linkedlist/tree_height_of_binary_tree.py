def height(root):
    return heightRecursive(root, 0)

def heightRecursive(node, height):

    out1 = height
    out2 = height
    if node.left is not None:
        out1 = heightRecursive(node.left, height + 1)

    if node.right is not None:
        out2 = heightRecursive(node.right, height + 1)

    return out1 if out1 >= out2 else out2
