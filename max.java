
import java.util.*;
import java.util.function.*;
public class max {

	public static void main(String[] args) {
		Vector v = new Vector();
		v.add(100);
		v.add(200);
		v.add(300);
		v.add(400);
		v.add(500);
		v.add(600);
		int max=(int)v.get(0);
		
		for(Object obj:v) {
			if((int)obj>max)
			{
				max=(int)obj;
			}
		}
		System.out.println("Max  value " + max);
	}

}
