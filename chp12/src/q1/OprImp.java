package q1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class OprImp implements Operations {
	List<Emp> db = new ArrayList<Emp>();
	@Override
	public void insertData(List<Emp> emps) {
		db.addAll(emps);
		
	}

	@Override
	public void deleteData() {
	db.remove(2);
	System.out.println(db);
	}

	@Override
	public void updateData(int age) {
		Iterator<Emp> iterator = db.iterator();
		while (iterator.hasNext()) {
			Emp emp = (Emp) iterator.next();
			if(emp.getAge() == age) {
			
				emp.setSal(age);
				
		}
		
		}
	}

	@Override
	public void showData() {
		Iterator<Emp> it = db.iterator();
		if (it.hasNext()) {
			System.out.println(db);
		}
	}
	
	@Override
	public void searchData() {
		
	}

}
