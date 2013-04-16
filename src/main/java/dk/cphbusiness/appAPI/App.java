package dk.cphbusiness.appAPI;

import dk.cphbusiness.appAPI.dtos.EvaluationDTO;
import dk.cphbusiness.appAPI.dtos.ItemDTO;
import dk.cphbusiness.appAPI.dtos.MemberDTO;
import dk.cphbusiness.appAPI.etos.IllegalStateETO;
import dk.cphbusiness.appAPI.etos.NullPointerETO;

public class App implements IAppAPI {

	public void lendItem(MemberDTO fromMember, MemberDTO toMember, ItemDTO item)
			throws NullPointerETO, IllegalStateETO {
		// TODO Auto-generated method stub
		
	}

	public void createMember(MemberDTO newMember) throws NullPointerETO,
			IllegalStateETO {
		// TODO Auto-generated method stub
		
	}

	public void createItem(ItemDTO item) throws NullPointerETO, IllegalStateETO {
		// TODO Auto-generated method stub
		
	}

	public void searchItems(String searchTerm) throws NullPointerETO,
			IllegalStateETO {
		// TODO Auto-generated method stub
		
	}

	public void evaluateItem(EvaluationDTO evalution, ItemDTO item,
			MemberDTO evaluator) throws NullPointerETO, IllegalStateETO {
		// TODO Auto-generated method stub
		
	}

	public void evaluateLender(EvaluationDTO evaluation, MemberDTO evaluatee,
			MemberDTO evaluator) throws NullPointerETO, IllegalStateETO {
		// TODO Auto-generated method stub
		
	}

	public void evaluateBorrower(EvaluationDTO evaluation, MemberDTO evaluatee,
			MemberDTO evaluator) throws NullPointerETO, IllegalStateETO {
		// TODO Auto-generated method stub
		
	}

	public void evaluateHandBack(EvaluationDTO evaluation, ItemDTO item,
			MemberDTO evaluatee, MemberDTO evaluator) throws NullPointerETO,
			IllegalStateETO {
		// TODO Auto-generated method stub
		
	}

	public void checkMemberProfile(MemberDTO member) throws NullPointerETO,
			IllegalStateETO {
		// TODO Auto-generated method stub
		
	}

}
