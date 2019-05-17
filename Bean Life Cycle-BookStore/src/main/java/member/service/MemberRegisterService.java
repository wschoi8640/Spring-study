package member.service;

import org.springframework.beans.factory.annotation.Autowired;

import member.Member;
import member.dao.MemberDao;

public class MemberRegisterService {

	@Autowired
	private MemberDao memberDao;
	
	public MemberRegisterService() { }
	
	public void register(Member member) {
		memberDao.insert(member);
	}
}
