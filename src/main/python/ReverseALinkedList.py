def reverse(llist):
    ret = reverseRecursive(llist, llist)
    llist.next = None
    return ret

def reverseRecursive(node, previousNode):
    nd = None

    if node.next != None:
        nd = reverseRecursive(node.next, node)

    elif node.next == None:
        node.next = previousNode
        return node
    node.next = previousNode
    return nd