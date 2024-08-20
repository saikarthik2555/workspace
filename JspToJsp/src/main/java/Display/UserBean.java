package Display;

import java.io.Serializable;

@SuppressWarnings("serial")
public class UserBean implements Serializable{
	private String uname;
	private String mid;
	private Long phno;
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
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
}
