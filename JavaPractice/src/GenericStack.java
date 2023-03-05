import java.util.ArrayList;

public class GenericStack<E> {
	private ArrayList<E> list= new ArrayList<E>();
	
	public void push(E o)
	{
		list.add(o);
	}
	public int size()
	{
		return list.size();
	}
	public E peek()
	{
		return list.get(list.size()-1);
	}
	public E  pop(){
		E o= list.get(list.size()-1);
		list.remove(list.size()-1);
		return o;
	}
	public boolean isEmpty()
	{
		return list.isEmpty();
	}
	
	public String toString()
	{
		return "Stack :"+list.toString();
	}
	public static void main(String[] args) {
		GenericStack<Integer> a= new GenericStack();
		a.push(45);
		System.out.println(a.toString());
	}

}
