package leetcode.test.stack_and_queue;
import leetcode.test.stack_and_queue.ListNode;

public class Linkstack {
    ListNode head;
    public Linkstack(){
        head = null;
    }
    public void offerFirst(int val){
        ListNode newNode = new ListNode(val);
        newNode.next = head;
        head = newNode;
    }
    public int pollLast(){
        if(isEmpty()){
            throw new RuntimeException("the stack is empty");
        }
        int val = head.val;
        head = head.next;
        return val;
    }
    public int peekLast(){
        if (isEmpty()){
            throw new RuntimeException("the stack is empty");
        }
        return head.val;
    }
    public boolean isEmpty(){
        return head == null;
    }
    public int size(){
        ListNode curr = head;
        int n = 0;
        while (curr != null){
            n++;
            curr = curr.next;
        }
        return n;
    }
}
