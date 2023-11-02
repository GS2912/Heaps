import java.util.*;

public class Heaps {
  public static void main(String[] args) {
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    pq.add(56);
    pq.add(34);
    pq.add(99);
    pq.add(35);
    while (!pq.isEmpty()) {
      System.out.println(pq.peek());
      pq.remove();
    }
  }
}
