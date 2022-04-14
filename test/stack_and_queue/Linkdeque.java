package leetcode.test.stack_and_queue;
import leetcode.test.stack_and_queue.ListNode;
public class Linkdeque {
    ListNode head;
    ListNode tail;
    int size;
    public Linkdeque(){

    }
    public boolean isEmpty(){
        return head == null;
    }

    public void offerFirst(int val){
        ListNode newNode = new ListNode(val);
        if (head == null){
            head = newNode;
            tail = newNode;
        }
        else {
            newNode.next = head;
            head.pre = newNode;
            head = newNode;
        }
        size ++;
    }
    public void offerLast(int val){
        ListNode newNode = new ListNode(val);
        if (head == null){
            head = newNode;
            tail = newNode;
        }
        else {
            tail.next = newNode;
            newNode.pre = tail;
            tail = newNode;
        }
        size ++;
    }
    public int pollFirst(){
        if (isEmpty()){
            throw new RuntimeException("this deque is empty");
        }
        ListNode curr = head;
        head = head.next;
        head.pre = null;
        curr.next = null;
        size --;
        return curr.val;
    }
    public int pollLast(){
        if (isEmpty()){
            throw new RuntimeException("this deque is empty");
            //return null;
        }
        ListNode curr = tail;
        tail = tail.pre;
        tail.next = null;
        curr.pre = null;
        size --;
        return curr.val;
    }
    public int peekFirst(){
        if (isEmpty()){
            throw new RuntimeException("this deque is empty");
        }
        return head.val;
    }
    public int peekLast(){
        if (isEmpty()){
            throw new RuntimeException("this deque is empty");
        }
        return tail.val;
    }
    public int size(){
        return size;
    }

}
