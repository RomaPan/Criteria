package by.tc.task01.entity.criteria;

import java.util.HashMap;
import java.util.Map;

public class Criteria<E> {

	private Class<E> groupSearchName;
	private Map<E, Object> criteria = new HashMap<E, Object>();
	
	public Criteria(Class<E> groupSearchName) {
		this.groupSearchName = groupSearchName;
	}
	
	public Class<E> getGroupSearchName(){
		return groupSearchName;
	}
	
	public Map<E, Object> getCriteria(){
		return criteria;
	}

	public void add(E searchCriteria, Object value) {
		criteria.put(searchCriteria, value);
	}

	@Override
	public String toString() {
		return "Criteria [groupSearchName=" + getGroupSearchName().getSimpleName() + ", criteria=" + getCriteria() + "]";
	}
	
	// you may add your own code here
	
	

}
