package com.bs.lec19.member.dao;

import com.bs.lec19.member.Macro;
import com.bs.lec19.member.Member;

public interface IMemberDao {
	void memberInsert(String memId, String memPw, String memMail, String memPhone1, String memPhone2, String memPhone3);
	void macroInsert(Macro macro);
	void memberInsert(Member member);
	Member memberSelect(String memId, String memPw);
	void memberUpdate();
	void memberDelete();
}
