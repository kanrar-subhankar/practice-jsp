package bean;

public class salary {
	private int empid;
	private long financialyear;
	private String month;
	private int basicpay;
	private int performancepay;
	private int incometax;
	private int foodcoupon;
	private int totalsalary;
	public salary(int empid, long financialyear, String month, int basicpay, int performancepay, int incometax,
			int foodcoupon, int totalsalary) {
		super();
		this.empid = empid;
		this.financialyear = financialyear;
		this.month = month;
		this.basicpay = basicpay;
		this.performancepay = performancepay;
		this.incometax = incometax;
		this.foodcoupon = foodcoupon;
		this.totalsalary = totalsalary;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public long getFinancialyear() {
		return financialyear;
	}
	public void setFinancialyear(long financialyear) {
		this.financialyear = financialyear;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public int getBasicpay() {
		return basicpay;
	}
	public void setBasicpay(int basicpay) {
		this.basicpay = basicpay;
	}
	public int getPerformancepay() {
		return performancepay;
	}
	public void setPerformancepay(int performancepay) {
		this.performancepay = performancepay;
	}
	public int getIncometax() {
		return incometax;
	}
	public void setIncometax(int incometax) {
		this.incometax = incometax;
	}
	public int getFoodcoupon() {
		return foodcoupon;
	}
	public void setFoodcoupon(int foodcoupon) {
		this.foodcoupon = foodcoupon;
	}
	public int getTotalsalary() {
		return totalsalary;
	}
	public void setTotalsalary(int totalsalary) {
		this.totalsalary = totalsalary;
	}
	
}
