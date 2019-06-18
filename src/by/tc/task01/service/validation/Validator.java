 package by.tc.task01.service.validation;



import by.tc.task01.entity.criteria.Criteria;

public class Validator {
	
	public static <E> boolean criteriaValidator(Criteria<E> criteria) {
		// you may add your own code here
		String tempGroupName;
		boolean isCriteriaParamsEmpty;
		
		tempGroupName = criteria.getGroupSearchName().getSimpleName();
		
		isCriteriaParamsEmpty = criteria.getCriteria().isEmpty();
		
		
		if (tempGroupName == null || isCriteriaParamsEmpty == true || tempGroupName == "") {
			return false;
		} 
		return true;
	}

}

//you may add your own new classes