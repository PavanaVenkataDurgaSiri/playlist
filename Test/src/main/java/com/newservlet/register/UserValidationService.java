package com.newservlet.register;

import java.util.HashMap;

public class UserValidationService {
	static HashMap<String,String> validate=new HashMap<String,String>();
	static {
	validate.put("pavana","1234");
	validate.put("Siri", "mypassword");
	}
	public boolean isUserValid(String user,String password)
	{
		//System.out.println(validate.get(user));
		if(validate.containsKey(user) && validate.containsValue(password))
			return true;
		return false;
		/*if(user.equals(validate.keySet()) && password.equals(validate))
			return true;
		return false;*/
		/*if(user.equals("admin") && password.equals("admin123"))
			return true;
		return false;*/
	}
}
