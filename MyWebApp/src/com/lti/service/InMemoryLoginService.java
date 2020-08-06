package com.lti.service;

import java.util.HashMap;

public class InMemoryLoginService {
	
	private HashMap<String,String> users =new HashMap<String,String>();
	
	
	public LoginService() {
		
		users.put("mayank", "123");
		users.put("Deepali", "456");
		users.put("kartik", "789");
	}

	public boolean authenciate(String uname, String pwd) {
		if(users.containsKey(uname))
			if(users.get(uname).equals(pwd))
				return true;
		return false;
		//if(uname.equals("mayank") && pwd.equals("123"))
		//	return true;
		//	else
		//		return false
	}

			
}
