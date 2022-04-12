package leetcode.test.stack_and_queue;
import java.util.Arrays;
public class Mystack{
    public int[] array;
    public int head;
    public Mystack (int cap){
        array = new int[cap];
        head = -1;
    }
    public int size(){
        return head + 1;
    }
    public boolean isEmpty(){
        return head == -1;
    }
    public boolean isFull(){
        return head == array.length - 1;
    }
    public int pollLast(){
        return isEmpty() ? null : array[head--];
    }
    public void offerFirst(int val){
        if(isFull()){
            array = Arrays.copyOf(array, 2*array.length);
        } 
        array[++head] = val;
    }
    public int peekLast(){
        return isEmpty() ? null : array[head];
    }
}

    