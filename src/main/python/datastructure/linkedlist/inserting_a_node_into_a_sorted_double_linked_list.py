def sortedInsert(llist, data):
    # Write your code here

    current = llist
    previous = None
    newNode = None

    if current.data >= data and current.prev is None:
        newNode = DoublyLinkedListNode(data)
        bindNextNode(newNode, current)
        return newNode

    while current is not None:
        if current.data >= data:
            newNode = DoublyLinkedListNode(data)
            bindNextNode(newNode, current)
            bindPrevNode(newNode, previous)
            break

        previous = current
        current = current.next

    if newNode is None:
        newNode = DoublyLinkedListNode(data)
        bindPrevNode(newNode, previous)

    return llist

def bindNextNode(newNode, nextNode):
    nextNode.prev = newNode
    newNode.next = nextNode

def bindPrevNode(newNode, prevNode):
    prevNode.next = newNode
    newNode.prev = prevNode
