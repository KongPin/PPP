package edu.ynu.entity;

import java.util.Date;

public class ReserveProjectEntity {
	private int Pid;//��Ŀ���
	private String Pname;//��Ŀ����
	private String Parea;//��Ŀ���ڵ�
	private String Pindust;//��Ŀ������ҵ
	private String PCS;//��Ŀ�������ݼ���ģ
	private double Pinvest;//��Ŀ��Ͷ��
	private String Pway;//�������뷽ʽ
	private String Poper;//����õ�PPP����
	private String Prespon;//����������
	private String Pphone;//��������ϵ��ʽ
	private Date PRT;//����ʱ��
	
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
