package q1;

import java.util.List;

public interface Operations {
	
	public void deleteData();
	public void updateData(int age);
	public void showData();
	public void searchData();
	public void insertData(List<Emp> emps);
}
