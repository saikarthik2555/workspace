package using_3techniques;

import java.io.Serializable;

@SuppressWarnings("serial")
public class AdminBean implements Serializable{
	private String Uname;
	private String pswd;
	private String fname;
	private String lname;
	private String addr;
	private String mid;
	private Long phno;
	
	public AdminBean() {
		
	}

	public String getUname() {
		return Uname;
	}

	public void setUname(String uname) {
	}

	public String getPswd() {
		return pswd;
	}

	public void setPswd(String pswd) {
		this.pswd = pswd;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getMid() {
		return mid;
	}

	public void setMid(String mid) {
		this.mid = mid;
	}

	public Long getPhno() {
		return phno;
	}

	public void setPhno(Long phno) {
		this.phno = phno;
	}

	@Override
	public String toString() {
		return "AdminBean [Uname=" + Uname + ", pswd=" + pswd + ", fname=" + fname + ", lname=" + lname + ", addr="
				+ addr + ", mid=" + mid + ", phno=" + phno + "]";
	}
	

}

