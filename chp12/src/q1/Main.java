package q1;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Emp emp1 = new Emp(34, "Abhay", 35000.0);
		Emp emp2 = new Emp(35, "Rahul", 45000.0);
		Emp emp3 = new Emp(36, "Sahil", 55000.0);
		List<Emp> list = new ArrayList<Emp>();
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		OprImp imp = new OprImp();
		imp.insertData(list);
		System.out.println(imp.db);
		
		imp.deleteData();
		imp.showData();
		
	}
}
