package be.e2partners.curriculum.dao.impl;

import junit.framework.Assert;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import be.e2partners.curriculum.dao.BaseDaoTest;
import be.e2partners.curriculum.dao.UserDao;
import be.e2partners.curriculum.domain.User;

public class UserDaoImplTest extends BaseDaoTest {

	private final Logger log = LoggerFactory.getLogger(UserDaoImplTest.class);

	@Autowired
	private UserDao userDao;

	@Test
	public void testFindByUserNameReturnsAUserForAGivenUserName() {
		User result = userDao.findByUserName("brojo");
		log.info("User found : " + result);
		Assert.assertEquals("brojo", result.getUserName());
	}

}
