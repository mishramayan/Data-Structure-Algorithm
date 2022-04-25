public class Solution {
    Node head;

    public boolean GetNth(int index){
        Node current = head;

        // int counter = 0;
        while(current != null){
            if(current.data == index){
                return true;
            }
            // counter++;
            current = current.next;
        }
        return false;
    }

    public void push(int new_data)
    {
        /* 1. alloc the Node and put data*/
        Node new_Node = new Node(new_data);
 
        /* 2. Make next of new Node as head */
        new_Node.next = head;
 
        /* 3. Move the head to point to new Node */
        head = new_Node;
    }
}
