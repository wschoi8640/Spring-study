package com.bs.lec19.member.service;

import com.bs.lec19.member.Macro;
import com.bs.lec19.member.Member;

public interface IMemberService {
	void memberRegister(String memId, String memPw, String memMail, String memPhone1, String memPhone2, String memPhone3);
	void memberRegister(Member member);
	void macroRegister(Macro macro);
	Member memberSearch(String memId, String memPw);
	void memberModify();
	void memberRemove();
}
