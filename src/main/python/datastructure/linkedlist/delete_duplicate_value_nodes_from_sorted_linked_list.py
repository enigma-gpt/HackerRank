def removeDuplicates(llist):

    if llist.next == None:
        return llist

    # Write your code here
    nodeFrom = None
    prevNode = llist
    nextNode = llist.next

    while nextNode != None:

        if nodeFrom == None:
            if prevNode.data == nextNode.data:
                nodeFrom = prevNode
        else:
            if prevNode.data != nextNode.data:
                nodeFrom.next = nextNode
                nodeFrom = None

        nextNode = nextNode.next
        prevNode = prevNode.next

    if nodeFrom != None:
        nodeFrom.next = nextNode

    return llist
