import khyati.ds.*;

class MainClass{
	public static void main(String args[]){
		SinglyLinkedList<Integer> l=new SinglyLinkedList<>();
		l.addFirst(1);
		l.addLast(2);
		l.addLast(2);
		l.addLast(1);
		System.out.println(l.isPalindrome());
		l.addLast(5);
		System.out.println(l.findMiddle());
		System.out.println(l.toString());
		l.reverse();
		System.out.println(l.toString());
		l.addFirst(6);
		l.addLast(7);
		System.out.println(l.toString());
		System.out.println(l.findMiddle());
		System.out.println(l.findNthLast(3));
		System.out.println(l.isPalindrome());
//		DoublyLinkedList<Integer> l=new DoublyLinkedList<>();
//		l.addFirst(2);
//		l.addLast(3);
//		l.addLast(4);
//		System.out.println(l.toString());
//		l.reverse();
//		System.out.println(l.toString());
//		l.removeFirst();
//		System.out.println(l.toString());
	}
}