package com.varxyz.jvx330.di.example5.ex1;

public class MemberServiceImp implements MemberService{
	
	public void addMember(String id, String passwd) {
		System.out.println("New member inserted :" + id +"/" + passwd);
	}
	
}
