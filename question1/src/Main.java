import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import Manager.AccountManager;
import Manager.AddressManager;
import User.User;
import account.Account;
import adress.BusinesAdres;
import adress.HomeAdres;
import adress.adres;

public class Main {
	static User user;
	static Scanner scanner = new Scanner(System.in);
	static ArrayList<adres> Uadres = new ArrayList<adres>();	
	static AddressManager addressManager = new AddressManager();
	

	public static void main(String[] args) {
		
		createCustomer();
	}

	public static AccountManager createCustomer() {
		
		Set<Account> accountSet = new TreeSet<Account>();
		
		
		AccountManager accountManager = new AccountManager(accountList); 
		PersonalInfo();
		AdresInfo();
		return accountManager;

	}
	
	
public static void PersonalInfo() {
		
		System.out.println("Musteri bilgisi giriniz:");
		
		System.out.println("Email giriniz:");
		String email = scanner.nextLine();
		
		System.out.println("Password giriniz:");
		String password = scanner.nextLine();
		
		System.out.println("Login başarılı ");

		
		User user = new User("fatih", "kirpi", email, password, "Developer", 23, Uadres, null);
		System.out.println(user.getName() + " " + user.getSurname() + " " + user.getEmail() + " " + 
		user.getPassword() + " "+user.getJob() + " " + user.getAge() + " " +user.getUadres());

		System.out.println("kişi eklendi\n");
		
		
		
	}


public static void AdresInfo() {
	
	System.out.println("Ev adresi :");

	HomeAdres Hadres = new HomeAdres("istanbul", "çekmeköy", "37");
	AddressManager.addUserAdres(user, Hadres);
	
	System.out.println(Hadres.getCity() + " " + Hadres.getAdresDetail() + " " + Hadres.getzipCode());
	System.out.println("Adres girildi.\n");
	
	
	System.out.println("iş adresi :");
	
	BusinesAdres Badres = new BusinesAdres("istanbul", "Bomonti", "34");
	AddressManager.addUserAdres(user, Badres);

	System.out.println(Badres.getCity() + " " + Badres.getAdresDetail() + " " + Badres.getzip());
	System.out.println("Adres girildi.");

	
	

	
}
	
}
