import java.util.ArrayList;

public class MyStack {
	private ArrayList<Object> list= new ArrayList<>();
	
	public boolean isEmpty()
	{
		return list.isEmpty();
	}
	public int getSize()
	{
		return list.size();
	}
	public Object pop()
	{
		Object o = list.get(getSize()-1);
		list.remove(getSize()-1);
		return o;
	}
	public void pust(Object o) {
		 list.add(o);
	}
	public Object peek()
	{
		return list.get(getSize()-1);	
	}
	public String toString()
	{
		return "Stack :"+list.toString();
	}
}
