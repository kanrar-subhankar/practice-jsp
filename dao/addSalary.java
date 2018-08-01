package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import bean.salary;
import util.DatabaseUtil;

public class addSalary {
	public boolean add(salary st) {
		try { 
			Connection con=DatabaseUtil.getConnection();
			PreparedStatement stmt=con.prepareStatement("select employee_id from employee");
			ResultSet rs=stmt.executeQuery();
			while(rs.next()) {
				if(rs.getInt(1)==st.getEmpid()) {
					stmt=con.prepareStatement("select financial_year,month from salary");
					ResultSet res=stmt.executeQuery();
					while(!res.next()) {
							stmt=con.prepareStatement("insert into salary values(?,?,?,?,?,?,?,?)");
							stmt.setInt(1,st.getEmpid());
							stmt.setString(2,st.getMonth());
							stmt.setLong(3,st.getFinancialyear());
							stmt.setInt(4,st.getBasicpay());
							stmt.setInt(5,st.getPerformancepay());
							stmt.setInt(6,st.getIncometax());
							stmt.setInt(7,st.getFoodcoupon());
							stmt.setInt(8,st.getTotalsalary());
							stmt.executeUpdate();
							stmt.close();
							return true;
					}
					while(res.next()) {
						if(res.getLong(1)==st.getFinancialyear() && res.getString(2).equals(st.getMonth())) {
							return false;
						}
					}
					stmt=con.prepareStatement("insert into salary values(?,?,?,?,?,?,?,?)");
					stmt.setInt(1,st.getEmpid());
					stmt.setString(2,st.getMonth());
					stmt.setLong(3,st.getFinancialyear());
					stmt.setInt(4,st.getBasicpay());
					stmt.setInt(5,st.getPerformancepay());
					stmt.setInt(6,st.getIncometax());
					stmt.setInt(7,st.getFoodcoupon());
					stmt.setInt(8,st.getTotalsalary());
					stmt.executeUpdate();
					return true;
					
				}
				else
					return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}
}
