//TODO: to be implemented
def mergeLists(head1, head2):

    tempHead1 = head1
    tempHead2 = head2

    newHead = head1 if head1.data < head2.data else head2

    if newHead == None:
        return None

    if newHead.next != None:
        newHead = newHead.next

    while not (tempHead1 == None and tempHead2 == None):

        if tempHead1 == None:
            newHead.next = tempHead2

        if tempHead2 == None:
            newHead.next = tempHead1

        if newHead.next == None:
            newHead = tempHead1 if tempHead1.data < tempHead2.data else tempHead2
