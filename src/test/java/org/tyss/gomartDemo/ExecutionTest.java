package org.tyss.gomartDemo;

import org.genrals.CreateAccountFindByTest;
import org.goMart.objRepo.BaseClass;
import org.testng.annotations.Test;

public class ExecutionTest extends BaseClass {
	
	
	
	@Test
	public void createAccountTest() {
//		CreateAccountTest createAccount = new CreateAccountTest(driver);
//		createAccount.setAccountPage();
		CreateAccountFindByTest test1 = new CreateAccountFindByTest();
		test1.setAccountPage();
	}

}
