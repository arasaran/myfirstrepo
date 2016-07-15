package com.cg.demo.repo;

import com.cg.demo.beans.Account;

public class Accountrep implements AccountRepo{
	private Account [] accounts=new Account[2];

	public boolean save(Account a)
	{
		//accounts=Arrays.copyOf(accounts,50);
		for(int i=0; i<accounts.length; i++)
		{
			if(accounts[i]==null){
				accounts[i]=a;
				return true;
			}
			
		}
		return false;
	}


	public Account findById(int accountNumber)
	{
		for(int i=0;i<accounts.length;i++)
		{
			if(accounts[i].getId()==accountNumber)
			{
				
				return accounts[i];
			}
		}
		return null;
	}




}
