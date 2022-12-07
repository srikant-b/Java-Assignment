package com.nissan.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.nissan.exception.PhoneBookCustomException;

public class PhoneBookUtil {

	public static List<String> getPhoneBookList() {
		List<String> phoneBookList= new ArrayList<>();
		phoneBookList.add("9850684021");
		phoneBookList.add("8564952412");
		phoneBookList.add("9034523522");
		phoneBookList.add("7457685862");
		phoneBookList.add("8567475313");
		
		return phoneBookList;
	}
	
	public static void checkDuplicateNumber(String number, List<String> numberList) throws PhoneBookCustomException {
		Iterator<String> stringItr = numberList.iterator();
		while(stringItr.hasNext()) {
			if(stringItr.equals(number)) {
				throw new PhoneBookCustomException("Phone number already exist!!!");
			}
			return;
		}
	}
	
}
