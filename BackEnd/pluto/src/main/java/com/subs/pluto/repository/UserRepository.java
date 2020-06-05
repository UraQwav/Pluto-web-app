package com.subs.pluto.repository;

import com.subs.pluto.entity.PlUsers;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<PlUsers, Long> {
    List<PlUsers> findAllBy();
}
