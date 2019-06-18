package by.tc.task01.entity;

import java.util.ArrayList;
import java.util.List;

public class Appliance {
	// you may add your own code here
	private static final List<String> applianceInstance = new ArrayList<String>();
	

	public static List<String> getApplianceinstance() {
		return applianceInstance;
	}
	
	
}
