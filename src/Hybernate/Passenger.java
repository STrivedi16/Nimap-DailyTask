package Hybernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pasenger")
public class Passenger 
{
	@Id
	private int cid;
	@Column(name="name")
	private String name;
	@Column(name="city1")
	private String city1;
	@Column(name="city2")
	private String city2;
	@Column(name="seatnum")
	private String seatnum;
	@Column(name="class")
	private String CLASS;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity1() {
		return city1;
	}
	public void setCity1(String city1) {
		this.city1 = city1;
	}
	public String getCity2() {
		return city2;
	}
	public void setCity2(String city2) {
		this.city2 = city2;
	}
	public String getSeatnum() {
		return seatnum;
	}
	public void setSeatnum(String seatnum) {
		this.seatnum = seatnum;
	}
	public String getCLASS() {
		return CLASS;
	}
	public void setCLASS(String cLASS) {
		CLASS = cLASS;
	}
}
