class CheckLoop {
    //Detects loop in the given linked list
    public static <T> boolean detectLoop(SinglyLinkedList<T> list) {
        //Write -- Your -- Code
        //1 -> 2 -> 3 -> 1 => return true
        //1 -> 2 -> 3 -> null => return false
        SinglyLinkedList<T>.Node temp = list.headNode;
        SinglyLinkedList<T>.Node current = list.headNode;
        
        //traverse through loop, check repeat node'value => there is loop
        while(current.nextNode != null){
            if(current.nextNode.data == temp.data){
                return true;
            }
            current = current.nextNode;
        }

        //retrun false if there is no loop detected
        return false;
    }
}