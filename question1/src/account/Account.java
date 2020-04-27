package account;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import Enums.AuthenticationStatus;
import Insurance.Insurance;
import Manager.AddressManager;
import User.User;
import adress.adres;
import exception.InvalidAuthenticationException;


 public abstract class Account implements Comparable <Account> {
	    

	   protected User user;
	    protected List<Insurance> insuranceList;
	    protected AuthenticationStatus authenticationStatus = AuthenticationStatus.FAIL;

	    public Account(User user, List<Insurance> insuranceList, AuthenticationStatus authenticationStatus) {
	        this.user = user;
	        this.insuranceList = insuranceList;
	        this.authenticationStatus = authenticationStatus;
	    }

	    public Account() {
	    	
	    }
	    public final void showUserInfo() {
	        if (this.user != null) {
	            StringBuilder builder = new StringBuilder();
	            builder.append("Name :");
	            builder.append(this.user.getName());
	            builder.append("SurName : ");
	            builder.append(this.user.getSurname());
	            builder.append("Email : ");
	            builder.append(this.user.getEmail());
	            
	            builder.append("Last login Date System:");
	            builder.append(this.user.getLastLoginDate());
	            System.out.println(builder.toString());
	        } 
	        else {
	            System.out.println("user null");
	        }
	    }
	    
	    public Account(User user) {
			this.user = user;
		}

		public User getUser() {
			return user;
		}
		public ArrayList<Insurance> getInsuranceList() {
			return (ArrayList<Insurance>) insuranceList;
		}
		public AuthenticationStatus getAuthenticationStatus() {
			return authenticationStatus;
		}

		public void setUser(User user) {
			this.user = user;
		}
		public void setInsuranceList(ArrayList<Insurance> insuranceList) {
			this.insuranceList = insuranceList;
		}
		public void setAuthenticationStatus(AuthenticationStatus authenticationStatus) {
			this.authenticationStatus = authenticationStatus;
		}
		
		public void addAddress(adres adresType) {
			AddressManager.addUserAdres(user, adresType);
		}
		public void removeAddress(adres adresType,int index) {
			AddressManager.deleteUserAdres(user, index);
		}

		public abstract void addPolicy(ArrayList<Insurance> insuranceList,Insurance insurance,LocalDate beginDate,LocalDate finishDate);
		
	    
	    public boolean login(Account account, String email, String pass) throws InvalidAuthenticationException {
			User loggedInUser = account.getUser();
			if(loggedInUser.getEmail().equals(email) && loggedInUser.getPassword().equals(pass)){
				authenticationStatus = AuthenticationStatus.SUCCESS;
				loggedInUser.setLastLoginToSystemDate(new Date());
				return true;
			}else{
				throw new InvalidAuthenticationException("NOT LOGIN");
			}
		}
	    
	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (!(o instanceof Account)) return false;
	        Account account = (Account) o;
	        return getUser().equals(account.getUser()) &&
	                getInsuranceList().equals(account.getInsuranceList()) &&
	                getAuthenticationStatus() == account.getAuthenticationStatus();
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(getUser(), getInsuranceList(), getAuthenticationStatus());
	    }
	    
	   
}
