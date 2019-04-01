package colorArray;

import java.util.ArrayList;
import java.util.List;


public class ColorArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] colors = {"R","G","B"};
		for (int i=0;i<colors.length; i++) {
			System.out.println(colors[i]);
		}
		
		String [] [] colors2 = new String [3][];
		
		
		List <String> strlist = new ArrayList<String>();
		strlist.add("R");
		strlist.add("G");
		strlist.add("B");
		
		MyList myl= new MyList();
		myl.add("A");
		myl.add("B");
		myl.add("C");
		myl.add("D");
		myl.add("E");
		myl.add("F");
		myl.add("G");
		myl.add("H");
		myl.add("I");
		
		myl.remove(3);
		
		for (int i=0;i<myl.size(); i++) {
			System.out.println(myl.get(i));
		}
	}
	
	public static class MyList{
		String [] _store;
		int _curr;
		int _max;
		
		public MyList() {
			_store =new String[2];
			_curr=0;
			_max=2;
		}
		
		private void resize(int s) {
			String[] newstore= new String [s];
			_max=s;
			for (int i=0;i<_curr;i++) {
				newstore[i]=_store[i];
			}
			_store=newstore;
		}
		
		
		public void add(String s) {
			if(_curr==_max) {
				resize(_max*2);
			}
			_curr++;
			_store[_curr-1]=s;
		}
		
		public int size() {
			return _curr;
		}
		
		public String get(int i) {
			return _store[i];
		}
		
		public void remove(int a) {
			if (a+1!=_curr) {
				for(int i=a+1;i<_curr;i++) {

					_store[i-1]=_store[i];

				
				}
			}
			_store[_curr-1]=null;
			_curr--;
		}
	}

}
