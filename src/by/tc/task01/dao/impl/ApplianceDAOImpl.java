package by.tc.task01.dao.impl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;


public class ApplianceDAOImpl implements ApplianceDAO{

	@Override
	public <E> Appliance find(Criteria<E> criteria){
		String categoryOfGoods;	
		Map<E, Object> criteriaSearchParams;
		
		categoryOfGoods = criteria.getGroupSearchName().getSimpleName();
		criteriaSearchParams = criteria.getCriteria();
		
		
		System.out.println("---" + categoryOfGoods+"---");
		System.out.println("Search criteria are: "+criteriaSearchParams);
		
		final String file = "resources/appliances_db.txt";
		String line = null;
		List<String> fileContent = new ArrayList<String>();
		BufferedReader buff = null;
		
		Appliance appliance = new Appliance();
		
		try {
			Reader fileReader = new FileReader(file);
			buff = new BufferedReader(fileReader);
			
			while((line = buff.readLine()) != null) {
				if (line.contains(categoryOfGoods)) {
					for (Map.Entry<E, Object> entry : criteriaSearchParams.entrySet()) {
						String key = entry.getKey().toString();
						String value = entry.getValue().toString();
						String match = key+"="+value;
						if (line.contains(match)) {
							fileContent.add(line);
							Appliance.getApplianceinstance().add(line);
							}
						}
					}
				}
			buff.close();
			
			} catch(IOException e) {
				System.err.println("An IOException was caught :" + e.getMessage());
				} finally {
					try {
						if (buff != null) {
							buff.close();
							} 
					}catch(IOException e) {
						e.printStackTrace();
						}
					}
		
		if (fileContent.isEmpty()){
			System.out.println("No entries matching your criteria were found");
		} else {
			System.out.println("Search results: ");
			for (int i = 0; i < fileContent.size(); i++) {
				System.out.println(fileContent.get(i));
			}
		}

		// you may add your own code here
		return appliance;
		
	}
	
	// you may add your own code here

}


//you may add your own new classes