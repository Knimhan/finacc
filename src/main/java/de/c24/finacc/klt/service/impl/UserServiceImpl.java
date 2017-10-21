package de.c24.finacc.klt.service.impl;

import de.c24.finacc.klt.service.UserService;
import de.c24.finacc.klt.persistance.dao.UserRepository;
import de.c24.finacc.klt.persistance.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {


	@Autowired
	private UserRepository userRepository;

	@Override
	public List<User> findAll() {
		return userRepository.findAll();
	}

	@Override
	public User save(User user) {
		return userRepository.save(user);
	}

	@Override
	public void delete(Integer id) {
		User user = userRepository.findOne(id);
		if (user != null) {
			userRepository.delete(user);
		}

	}

	@Override
	public String validate(Integer age) {

		if (age < 18)
			return "too young";
		else if (age > 67)
			return "too old";
		else if (isPrime(age))
			return "funny";
		else
			return "OK";
	}

	boolean isPrime(int number) {
		for (int i = 2; 2 * i < number; i++) {
			if (number % i == 0)
				return false;
		}
		return true;
	}
}