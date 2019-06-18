package by.tc.task01.main;

import by.tc.task01.entity.Appliance;

public class PrintApplianceInfo {
	
	public static void print(Appliance appliance) {
		// you may add your own code here
		
		int k = Appliance.getApplianceinstance().size();
		
		for (int i = 0; i < k; i++) {
//			System.out.println(Appliance.getApplianceinstance().get(i));
		}
		
		
		
		Appliance.getApplianceinstance().clear();
		
	}
	
	// you may add your own code here

}
