package dk.cphbusiness.appAPI;

import dk.cphbusiness.appAPI.dtos.ItemDTO;
import dk.cphbusiness.appAPI.dtos.MemberDTO;
import dk.cphbusiness.appAPI.etos.IllegalStateETO;
import dk.cphbusiness.appAPI.etos.NullPointerETO;

public class App implements IAppAPI {

	public void lendItem(MemberDTO fromMember, MemberDTO toMember, ItemDTO item)
			throws NullPointerETO, IllegalStateETO {
		
	}

}
