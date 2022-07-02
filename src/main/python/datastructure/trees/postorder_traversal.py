def postOrder(root):
    #Write your code here
    postOrderRecursive(root)

def postOrderRecursive(node):

    if node.left is not None:
        postOrderRecursive(node.left)

    if node.right is not None:
        postOrderRecursive(node.right)

    print(node.info, end=" ")