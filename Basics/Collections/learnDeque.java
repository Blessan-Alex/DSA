import java.util.ArrayDeque;

public class learnDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> adq = new ArrayDeque<>();

        adq.offer(24);
        adq.offerLast(56); // same as offer
        adq.offerFirst(80);
    }
}
