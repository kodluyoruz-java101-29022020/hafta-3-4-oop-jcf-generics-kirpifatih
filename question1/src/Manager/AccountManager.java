package Manager;

import java.util.TreeSet;

import account.Account;
import exception.InvalidAuthenticationException;

public class AccountManager {

	   private TreeSet<Account> accountList;

	    public TreeSet<Account> getAccountList() {
	        return accountList;
	    }

	    public void setAccountList(TreeSet<Account> accountList) {
	        this.accountList = accountList;
	    }

	    public Account loginSystem(String email, String password) {
	        for(Account account : accountList) {
	            try {
	                if(account.login(account, email, password)) {
	                    return account;
	                }
	            }catch(InvalidAuthenticationException e) {
	                System.out.println(e.getMessage());
	                return null;
	            }
	        }
	        return null;
	    }
}
