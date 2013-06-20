package be.e2partners.curriculum.dao.impl;

import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import be.e2partners.curriculum.dao.UserDao;
import be.e2partners.curriculum.domain.User;

@Repository
public class UserDaoImpl extends GenericHibernateDaoImpl<User, Long> implements UserDao {

	@Override
	public User findByUserName(String userName) {
		TypedQuery<User> qry = getEntityManager().createQuery("select u from User u where u.userName = :userName", User.class);
		qry.setParameter("userName", userName);
		return qry.getSingleResult();
	}

}
