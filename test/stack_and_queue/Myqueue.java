package leetcode.test.stack_and_queue;
import java.util.Arrays;
public class Myqueue {//circular queue
    int[] array;
    int head; // 已经插入元素的第一个位置
    int tail;
    //int size;
    public Myqueue(int cap){
        array = new int[cap];
    }
    public boolean isFull(){
        return (tail + 1) % array.length == head;
    }
    public boolean isEmpty(){
        return tail == head;
    }
    public void offerFirst(int val){
        if (isFull()){
            array = Arrays.copyOf(array, 2*array.length);
        }
        array[tail] = val;
        tail = (tail + 1) % array.length;//这里tail更新后始终指向可以插入元素的第一个位置,也就是该位置现在为空。
    }
    public int pollFirst(){
        if (isEmpty()){
            throw new RuntimeException("the queue is empty");
        }
        int val = array[head];
        head = (head + 1) % array.length;
        return val;
    }
    public int peekFirst(){
        if (isEmpty()){
            throw new RuntimeException("the queue is empty");
        }
        return array[head];
    }
}
