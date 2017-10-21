package de.c24.finacc.klt.service;

import de.c24.finacc.klt.persistance.entity.User;

import java.util.List;


public interface UserService {

	public List<User> findAll();

	public User save(User user);

	public void delete(Integer id);

	public String validate(Integer age);

}
