package lection004;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class task001 {

   public static void main(String[] args) {
       LinkedList<Integer> ll = new LinkedList<>();
       ll.add(1);
       Queue<Integer> ql = new LinkedList<>();
       ql.add(4);
       ql.remove(); // удаляется тот элемент, который был в 1 очередь добавлен
       PriorityQueue<Integer> pq = new PriorityQueue<>();
       pq.add(123);
       pq.add(3);
       pq.add(13);
       pq.add(1);
       System.out.println(pq);
       System.out.println(pq.poll());
       System.out.println(pq.poll());
       System.out.println(pq.poll());

       Deque<Integer> dq = new ArrayDeque<>();
       dq.add(1);
   }
}
