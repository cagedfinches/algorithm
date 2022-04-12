package leetcode.test.stack_and_queue;
import leetcode.test.stack_and_queue.ListNode;

public class Linkqueue {
    ListNode head;
    ListNode tail;
    int size;
    public Linkqueue(){

    }
    public void offerFirst(int val){
        ListNode newNode = new ListNode(val);
        if (head == null){
            head = newNode;
            tail = newNode;
        }
        else {
            tail.next = newNode;
            tail = tail.next;
            newNode.next = null;
        }
        size++;
    }
    public int pollFirst(){
        if (isEmpty()){
            throw new RuntimeException("the queue is empty");
        }
        int val = head.val;
        head = head.next;
        size--;
        return val;
    }
    public int peekFirst(){
        if (isEmpty()){
            throw new RuntimeException("the queue is empty");
        }
        return head.val;
    }
    public boolean isEmpty(){
        return head == null;
    }
    public int size(){
        return size;
    }
}
