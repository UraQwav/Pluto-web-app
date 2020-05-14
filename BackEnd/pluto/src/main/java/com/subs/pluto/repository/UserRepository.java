package com.subs.pluto.repository;

import com.subs.pluto.entity.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    List<User> findAllBy();
    @Query()
    Optional<User> find(String login, String password);
}
