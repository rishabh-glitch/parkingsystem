package com.backend.parkingsystem.repository;

import java.sql.SQLException;

import com.backend.parkingsystem.entity.Login;
import com.backend.parkingsystem.entity.User;

public interface UserDao {
	public boolean registerUser(User user) throws SQLException;

	public boolean login(Login login) throws SQLException;

	public User readUserProfileById(long userId) throws SQLException;

	public User readUserProfileByEmail(String email) throws SQLException;

	public User updateUserProfile(User user) throws SQLException;

	public boolean deleteUserById(long userId) throws SQLException;

	public Login changePassword(Login login) throws SQLException;
}
