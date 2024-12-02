import java.util.*;

class SumofNo {

	public static void main(String[] args) {
		Vector v = new Vector();
		v.add(100);
		v.add(200);
		v.add(300);
		v.add(400);
		v.add(500);
		v.add(600);
		int sum=0;
		for(Object obj:v)
		{
			sum=sum+(int)obj;
		}
		System.out.println("sum of all value is "+sum);
	}

}