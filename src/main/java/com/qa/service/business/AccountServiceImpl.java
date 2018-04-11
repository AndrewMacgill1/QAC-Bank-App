package com.qa.service.business;

import javax.inject.Inject;

import org.apache.log4j.Logger;

import com.qa.service.repository.AccountRepository;

public class AccountServiceImpl implements AccountService { //all the business logic goes here, such as banning users from accessing it etc

	private static final Logger LOGGER = Logger.getLogger(AccountService.class); //exactly like sysout, but everything goes into log file instead of pring out on sysout

	@Inject //either uses db or hashmap (the example) polymorphically based on the @Default or @Alternative on the DB repository layers
	private AccountRepository repo; //no alternative turned on, so use the default repository, goes for the default implementation
	
	@Override
	public String getAllAccounts() {
		LOGGER.info("In AccountServiceImpl getAllAccounts ");
		return repo.getAllAccounts();
	}

	@Override
	public String addAccount(String account) {
		return repo.createAccount(account);
	}

	@Override
	public String updateAccount(Long id, String account) {
		return repo.updateAccount(id, account);
	}

	@Override
	public String deleteAccount(Long id) {
		return repo.deleteAccount(id);

	}

	public void setRepo(AccountRepository repo) {
		this.repo = repo;
	}
}