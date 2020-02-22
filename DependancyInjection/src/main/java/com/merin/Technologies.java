package com.merin;

import org.springframework.stereotype.Component;

@Component

public class Technologies {
	
	
	private int techid;
	private String techname;
	public int getTechid() {
		return techid;
	}
	public void setTechid(int techid) {
		this.techid = techid;
	}
	public String getTechname() {
		return techname;
	}
	public void setTechname(String techname) {
		this.techname = techname;
	}
	@Override
	public String toString() {
		return "Technologies [techid=" + techid + ", techname=" + techname + "]";
	}
	public void tech()
	{
		System.out.println("completed");
	}

}
