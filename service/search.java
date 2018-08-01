package service;

import bean.Employee;
import dao.fetchEmployee;

public class search {
	fetchEmployee e=new fetchEmployee();
	public Employee fetch(String name,String d) {
		Employee ex=e.fetch(name, d);
		//System.out.println(ex.getEmpid());
		return ex;
	}
}
