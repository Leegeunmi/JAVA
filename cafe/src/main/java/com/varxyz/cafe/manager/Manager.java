package com.varxyz.cafe.manager;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Manager {
	private long mid;
	private String branchName;
	private String managerName;
	private String phone;
	private String passwd;
	private Date regDate;
	
	public Manager() {
		
	}
	
	public Manager(long mid) {
		this.mid = mid;
	}
}
