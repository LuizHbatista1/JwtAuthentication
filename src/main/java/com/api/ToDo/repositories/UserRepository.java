package com.api.ToDo.repositories;

import com.api.ToDo.domain.user.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository  extends CrudRepository<User, String > {

    Optional <User> findByEmail(String email);

}
