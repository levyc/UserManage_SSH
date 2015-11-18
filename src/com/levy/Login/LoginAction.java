package com.levy.Login;

import java.util.Iterator;
import java.util.List;

import com.levy.hibernateClass.User;
import com.levy.service.ServiceImp;
import com.opensymphony.xwork2.ActionSupport;


public class LoginAction extends ActionSupport {
	public ServiceImp serviceImp;

	public ServiceImp getServiceImp() {
		return serviceImp;
	}
	public void setServiceImp(ServiceImp serviceImp) {
		this.serviceImp = serviceImp;
	}
	private static final long serialVersionUID = 1L;
	private String name ;
	private String password;
	private String type;
	private String page="fail";
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String execute()//用findall方法找出所有用户，去与登录信息匹配
	{
		System.out.println(serviceImp);
	    User user_  = new User();
	    List<User> users = serviceImp.findAllUser();
	    Iterator<User> iterator=users.iterator();
	    while(iterator.hasNext())
	    {
	    	user_ =(User)iterator.next();
	    	if(name.trim().equals(user_.getName())&&password.trim().equals(user_.getPassword())&&type.trim().equals(user_.getType()))
	    	
	             return  SUCCESS;
	    		else return "fail" ;
	    }
		return  "fail";
		
	}
    
}
