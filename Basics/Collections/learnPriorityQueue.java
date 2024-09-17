import java.util.PriorityQueue;

public class learnPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        // will implement min heap
        //PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.offer(1);
        pq.offer(2);
        pq.offer(4);
        pq.offer(5);
        pq.offer(6);

        System.out.println(pq);
        
    }
    
}
