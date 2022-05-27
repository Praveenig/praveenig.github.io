package TASK;

import java.util.Comparator;

public class DoDComparator implements Comparator{
	public int compare(Object obj1,Object obj2)
	{
		Person p1 = (Person)obj1;
		Person p2 = (Person)obj2;
	
		if(p1.getDod()==p2.getDod())
		{
			return 0;
		}
			else if(p1.getDod()>p2.getDod())
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}

}
