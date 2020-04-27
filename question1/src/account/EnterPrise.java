package account;

import java.time.LocalDate;
import java.util.ArrayList;

import Insurance.Insurance;

public class EnterPrise extends Account {

	@Override
	public int compareTo(Account o) {
		
		return 0;
	}

	@Override
	public void addPolicy(ArrayList<Insurance> insuranceList, Insurance insurance, LocalDate beginDate,
			LocalDate finishDate) {
		
		
	}

}
