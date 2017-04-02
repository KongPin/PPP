package edu.ynu.entity;

public class SelectedCondition {
	private String province;//所选省份
	private String industry;//所选行业
	private String demonstration;//示范级别
	private Double capital;//投资金额
	
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getIndustry() {
		return industry;
	}
	public void setIndustry(String industry) {
		this.industry = industry;
	}
	public String getDemonstration() {
		return demonstration;
	}
	public void setDemonstration(String demonstration) {
		this.demonstration = demonstration;
	}
	public Double getCapital() {
		return capital;
	}
	public void setCapital(Double capital) {
		this.capital = capital;
	}

}
