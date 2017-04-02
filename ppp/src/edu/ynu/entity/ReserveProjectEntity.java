package edu.ynu.entity;

import java.util.Date;

public class ReserveProjectEntity {
	private int Pid;//项目编号
	private String Pname;//项目名称
	private String Parea;//项目所在地
	private String Pindust;//项目所属行业
	private String PCS;//项目建设内容及规模
	private double Pinvest;//项目总投资
	private String Pway;//政府参与方式
	private String Poper;//拟采用的PPP操作
	private String Prespon;//责任人名字
	private String Pphone;//责任人联系方式
	private Date PRT;//发布时间
	
	public int getPid() {
		return Pid;
	}
	public void setPid(int pid) {
		Pid = pid;
	}
	public String getPname() {
		return Pname;
	}
	public void setPname(String pname) {
		Pname = pname;
	}
	public String getParea() {
		return Parea;
	}
	public void setParea(String parea) {
		Parea = parea;
	}
	public String getPindust() {
		return Pindust;
	}
	public void setPindust(String pindust) {
		Pindust = pindust;
	}
	public String getPCS() {
		return PCS;
	}
	public void setPCS(String pCS) {
		PCS = pCS;
	}
	public double getPinvest() {
		return Pinvest;
	}
	public void setPinvest(double pinvest) {
		Pinvest = pinvest;
	}
	public String getPway() {
		return Pway;
	}
	public void setPway(String pway) {
		Pway = pway;
	}
	public String getPoper() {
		return Poper;
	}
	public void setPoper(String poper) {
		Poper = poper;
	}
	public String getPrespon() {
		return Prespon;
	}
	public void setPrespon(String prespon) {
		Prespon = prespon;
	}
	public String getPphone() {
		return Pphone;
	}
	public void setPphone(String pphone) {
		Pphone = pphone;
	}
	public Date getPRT() {
		return PRT;
	}
	public void setPRT(Date pRT) {
		PRT = pRT;
	}

}
