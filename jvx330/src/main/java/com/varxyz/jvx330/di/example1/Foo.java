package com.varxyz.jvx330.di.example1;

public class Foo {
	private Bar bar;
	
	public Foo() {//set get을 쓰려면 아규먼트가 없는 생성자가 필요하다
		System.out.println("Foo() constructor is called -->foo2");
	}
	
	public Foo(Bar bar) {
		this.bar = bar;
		System.out.println("Foo(bar) constructor is called -->foo");
	}
	
	public void setBar(Bar bar) {
		this.bar = bar;
		System.out.println("setBar() is called -->foo2");
	}
	
	public String toString() {
		return "[Foo :" + hashCode() + "]";
	}
}
