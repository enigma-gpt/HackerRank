def inOrder(root):
    #Write your code here
    inOrderRecursive(root)

def inOrderRecursive(node):

    if node.left is not None:
        inOrderRecursive(node.left)

    print(node.info, end=" ")

    if node.right is not None:
        inOrderRecursive(node.right)