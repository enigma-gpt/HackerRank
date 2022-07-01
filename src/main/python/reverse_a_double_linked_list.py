def reverse(llist):
    # Write your code here

    newNode = None
    previousNode = None

    while llist is not None:

        print(1)
        newNode = DoublyLinkedListNode(llist.data)
        newNode.next = previousNode
        newNode.prev = llist.next
        previousNode = newNode

        llist = llist.next

    return newNode