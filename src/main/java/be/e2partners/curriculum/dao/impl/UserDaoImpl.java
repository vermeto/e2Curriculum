package be.e2partners.curriculum.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import be.e2partners.curriculum.dao.UserDao;
import be.e2partners.curriculum.domain.User;

@Repository
public class UserDaoImpl implements UserDao {

	// JPA setup
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public User findByUserName(String userName) {
		TypedQuery<User> qry = entityManager
				.createQuery(
						"select u from User u where u.userName = :userName",
						User.class);
		qry.setParameter("userName", userName);
		return qry.getSingleResult();
	}

}
