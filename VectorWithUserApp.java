import java.util.*;
public class VectorWithUserApp
{
	public static void main(String []arg)
	{
		Vector v=new Vector();
		Employee emp1=new Employee();
		emp1.setId(1);
		emp1.setName("ABC");
		emp1.setSal(10000);
		
		Employee emp2 = new Employee();
		emp2.setId(2);
		emp2.setName("MNO");
		emp2.setSal(20000);
		
		Employee emp3 = new Employee();
		emp3.setId(3);
		emp3.setName("XYZ");
		emp3.setSal(30000);
		
		Employee emp4 = new Employee();
		emp4.setId(4);
		emp4.setName("PQR");
		emp4.setSal(50000);
		
		v.add(emp1);
		v.add(emp2);
		v.add(emp3);
		v.add(emp4);
		
		for(Object obj:v)
		{
			Employee emp=(Employee)obj;
			System.out.println(emp.getId()+"\t"+emp.getName()+"\t"+emp.getSal());
			
		}

	}
}