package com.backend.parkingsystem.service;

import com.backend.parkingsystem.entity.Login;
import com.backend.parkingsystem.entity.User;
import com.backend.parkingsystem.exceptions.DuplicateUserException;
import com.backend.parkingsystem.exceptions.InvalidLoginCredintialException;
import com.backend.parkingsystem.exceptions.NoSuchUserException;

public interface UserService {
	public boolean registerUser(User user) throws DuplicateUserException;

	public boolean login(Login login) throws InvalidLoginCredintialException;

	public User findUserProfileById(long userId) throws NoSuchUserException;

	public User findUserProfileByEmail(String email) throws NoSuchUserException;

	public User modifyUserProfile(User user) throws NoSuchUserException;

	public boolean deleteUserById(long userId) throws NoSuchUserException;

	public Login changePassword(Login login) throws InvalidLoginCredintialException;

	public void forgotPassword(String loginId) throws NoSuchUserException;

	public void forgotLoginId(String email) throws NoSuchUserException;
}
