package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import bean.Employee;
import util.DatabaseUtil;

public class fetchEmployee {
	public Employee fetch(String name,String d) {
		try {
			Connection con=DatabaseUtil.getConnection();
			PreparedStatement st=con.prepareStatement("select * from employee");
			ResultSet rs=st.executeQuery();
			while(rs.next()) {
				if(rs.getString(2).equals(name) && rs.getString(3).equals(d)) {
					Employee e=new Employee();
					e.setEmpid(rs.getInt(1));
					e.setEmpname(rs.getString(2));
					e.setDesignation(rs.getString(3));
					e.setExperience(rs.getInt(4));
					e.setContactnum(rs.getLong(5));
					e.setAddress(rs.getString(6));
					e.setStatus(rs.getString(7));
					return e;
				}
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
