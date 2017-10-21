package de.c24.finacc.klt.persistance.dao;

import de.c24.finacc.klt.persistance.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Integer>
{

}