package service;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Qualifier;

import dao.WordDao;
import word.WordSet;

// 컨테이너에서 이름이 일치하는 객체를 찾는다.
// 생성자 별도로 만들어줘야 하는지 체크하기
public class WordRegisterServiceUseResource {

	@Resource
//	@Qualifier("usedDao")
	private WordDao wordDao;
	
	public WordRegisterServiceUseResource() {
		
	}
	
	public WordRegisterServiceUseResource(WordDao wordDao) {
		this.wordDao = wordDao;
	}
	
	public void register(WordSet wordSet) {
		String wordKey = wordSet.getWordKey();
		if(verify(wordKey)) {
			wordDao.insert(wordSet);
		} else {
			System.out.println("The word has already registered.");
		}
	}
	
	public boolean verify(String wordKey){
		WordSet wordSet = wordDao.select(wordKey);
		return wordSet == null ? true : false;
	}
	
	//@Resource
	public void setWordDao(WordDao wordDao) {
		this.wordDao = wordDao;
	}
	
}