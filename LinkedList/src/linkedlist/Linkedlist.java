package linkedlist;


public class Linkedlist {
	
	private int _size=0;
	private Node _first=null;
	private Node _last=null;

	String get(int index) {
		Node current=_first;
		for (int i=0;i<index; i++)
			current=current._next;
		return current._value;
	}
	
	void add (String element) {
		Node temp = new Node(element);
		if (_last!=null)_last._next=temp;
		_last= temp;
		if (_first==null)_first= _last;
		_size++;
	}
	
	void remove(int index) {
		if (_size==0) return;
		
		if (index == 0) {
			_first = _first._next;
			_size--;
			return;
		}
		
		Node current=_first;
		Node next = _first._next;
		for (int i=0;i<index-1; i++) {
			current=current._next;
			next= next._next;
		}
		current._next= next._next;
		_size--;
		
	}
	
	void print() {
		Node current = _first;
		while (current != null) {
			System.out.println(current._value);
			current= current._next;
		}
	}
	
	int size() {
		return _size;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Linkedlist a= new Linkedlist();
		a.add("Apple");
		a.add("kiwi");
		a.add("mango");
		a.add("banana");
		
		System.out.println(a.size());
		a.print();
		System.out.println();
		a.remove(2);
		a.print();
		
		System.out.println();
		a.remove(0);
		a.print();
		
		System.out.println();
		a.remove(1);
		a.print();

	}

}
