package com.levy.Dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.levy.hibernateClass.User;

public class UserDaoImp extends HibernateDaoSupport implements  UserDao {

	@Autowired  
    public void setSessionFactoryOverride(SessionFactory sessionFactory)  
    {  
  
        super.setSessionFactory(sessionFactory);  
    }  
	@Override
	public void save(User user) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(user);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(findById(id));
	}

	@Override
	public User findById(int id) {
		// TODO Auto-generated method stub
	   return	(User)this.getHibernateTemplate().get(User.class, id);
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		String sql = "from User";
		return (List<User>)this.getHibernateTemplate().find(sql);
	}

	public void update(User user) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(user);
	}
   
}
