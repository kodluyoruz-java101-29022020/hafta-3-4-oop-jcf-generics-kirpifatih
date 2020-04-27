package Manager;

import java.util.ArrayList;
import java.util.List;
import User.User;
import adress.adres;
public class AddressManager {

public static void addUserAdres(User user , adres adres) {
		
		if(user!= null) {
			
			if(user.getUadres() == null) {
				
				List<adres> addressList = new ArrayList<>();
				addressList.add(adres);
				
				user.setUadres(addressList); 
				
			}
				System.out.println(user.getUadres().add(adres));		
							
		}
	
		
	}
   public static void deleteUserAdres(User user,int index) {
	
	
      if (user != null) {
  	  if(user.getUadres() != null) {
    
          if (user.getUadres().size() > 0) {
              user.getUadres().remove(index);
          }
  	  }
      }
	
	
	
	
}
}
