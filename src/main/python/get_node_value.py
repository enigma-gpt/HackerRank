def getNode(llist, positionFromTail):
    # Write your code here
    targetNode = llist
    i=0
    while llist != None:
        if i > positionFromTail:
            targetNode = targetNode.next
        llist = llist.next
        i = i + 1

    return targetNode.data