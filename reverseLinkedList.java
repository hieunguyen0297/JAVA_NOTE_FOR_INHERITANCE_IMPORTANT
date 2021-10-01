public static <T> void reverse(SinglyLinkedList<T> list){
    //Write -- Your -- Code
    //Call SinglyLinkedList<T>.Node //Not Node
    //Call list.headNode, not this.headNode
    SinglyLinkedList<T>.Node next = null;
    SinglyLinkedList<T>.Node currentNode = list.headNode;
    SinglyLinkedList<T>.Node previous = null;

    //Loop through the list
    //Think about pointer visualization to reverse the linkedlist
    //Instead gong  -> // we now go <-
    //We swap each node
    while(currentNode != null){

        //nextNode is considered temp to save the the nextNode of currentNode
        //swap method
        next = currentNode.nextNode;
        //make the currentNode's nextnode point back at previous node
        currentNode.nextNode = previous;
        //set previous equal to current node
        previous = currentNode;
        //move currentNode to next
        currentNode = next;
        
    }

    //at the end of list, we point the head of list to the previous node which is the last node
    list.headNode = previous;

}