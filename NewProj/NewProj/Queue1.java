package NewProj;

import java.util.LinkedList;
	import java.util.PriorityQueue;
	import java.util.Queue;
public class Queue1 {
	


		public static void main (String args[]) {
			
			Queue<Integer> que = new PriorityQueue<>();
			Queue<String>  str = new PriorityQueue<>();
			
			
//			str.add("stefan");
//			str.add("elena");
			System.out.println(str);
			
			que.add(100);
			que.add(140);
			que.add(300);
			que.add(230);
			que.add(2990);
			
			System.out.println(que);
			
			
			Queue<Integer> que1 = new LinkedList<>();
			Queue<String>  str1 = new LinkedList<>();
			
			str1.add("hello");
			str1.add("heeoollle");
			str1.add("where");
			str1.add("guava");
			str1.add("ooty");
			System.out.println(str1);
			
			que1.add(560);
			que1.add(7740);
			que1.add(900);
			que1.add(230);
			que1.add(2990);
			
			System.out.println(que1);
			System.out.println(que1.peek());
			System.out.println(que1.poll());
			System.out.println(que1);
			
			System.out.println(str1.peek());
			System.out.println(str1.poll());
			
			
			System.out.println(que);
			System.out.println(que.peek());
			System.out.println(que.poll());
			System.out.println(que);
			
			System.out.println(str.peek());
			System.out.println(str.poll());
			
			System.out.println(str1.size());
			System.out.println(str1.isEmpty());
			System.out.println(str.isEmpty());
		}

	}


