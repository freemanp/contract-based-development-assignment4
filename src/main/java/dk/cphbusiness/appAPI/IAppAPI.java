package dk.cphbusiness.appAPI;

import dk.cphbusiness.appAPI.dtos.ItemDTO;
import dk.cphbusiness.appAPI.dtos.MemberDTO;

public interface IAppAPI {
	public void lendItem(MemberDTO fromMember, MemberDTO toMember, ItemDTO item);
}
