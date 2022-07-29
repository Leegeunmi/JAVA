package com.varxyz.banking;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.varxyz.banking.command.AccountCommand;
import com.varxyz.banking.command.CustomerCommand;
import com.varxyz.banking.dao.AccountDao;
import com.varxyz.banking.dao.CustomerDao;
import com.varxyz.banking.domain.Customer;

public class TransferAccount implements BankService {
	
	//잔고가 모자란경우 예외처리를 넣을 것 _ TransferException
	
	@Autowired
	AccountDao accountDao;
	CustomerDao customerDao;

	
	@Override
	public void addCustomer(CustomerCommand customerCommand) {
		customerDao.addCustomer(customerCommand);
	}
	
	@Override
	public void addAccounts(AccountCommand accountCommand) {
		accountDao.addAccount(accountCommand);
	}
	
	@Override
	public List<AccountCommand> getAllAccounts() {
		return accountDao.getAllAccounts();
	}

	@Override
	public List<AccountCommand> getAccounts(String email) {
		return accountDao.getAccounts(email);
	}

	@Override
	public void doTransfer(double money, String withdrawAccountNum, String depositAccountNum) {
		accountDao.doTransfer(money, withdrawAccountNum, depositAccountNum);
		
	}

	@Override
	public double getBalance(String accountNum) {		
		return accountDao.getBalance(accountNum);
	}

	@Override
	public void saveInterest(double interestRate, String AccountNum) {
		accountDao.saveInterest(interestRate, AccountNum);
		
	}
	
}
	
