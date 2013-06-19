package be.e2partners.curriculum.dao;

import be.e2partners.curriculum.domain.User;

public interface UserDao {

	User findByUserName(String userName);

}
