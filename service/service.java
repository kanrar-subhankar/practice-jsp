package service;
import bean.salary;
import dao.addSalary;
public class service {
	addSalary s=new addSalary();
	public boolean comeDAO(salary st) {
		return s.add(st);
	}
}	
