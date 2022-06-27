package com.varxyz.jv251.exception;

//@SupperessWarnings("serial")
public class CustomerNotFoundException extends EntityNotFoundException {
	public CustomerNotFoundException(String msg) {
		super(msg);
	}
}
