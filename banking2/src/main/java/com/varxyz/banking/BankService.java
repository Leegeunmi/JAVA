package com.varxyz.banking;

import java.util.List;

import com.varxyz.banking.command.AccountCommand;
import com.varxyz.banking.command.CustomerCommand;
import com.varxyz.banking.domain.Account;
import com.varxyz.banking.domain.Customer;

public interface BankService {
	void addCustomer(CustomerCommand customerCommand);
	void addAccounts(AccountCommand accountCommand);
	List<AccountCommand> getAccounts(String email);
	List<AccountCommand> getAllAccounts();
	void doTransfer(double money, String withdrawAccountNum, String depositAccountNum);
	double getBalance(String accountNum);
	void saveInterest(double interestRate, String AccountNum);
}
