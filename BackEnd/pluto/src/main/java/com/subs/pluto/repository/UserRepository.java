package com.subs.pluto.repository;

import com.subs.pluto.entity.qwert;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<qwert, Long> {
    List<qwert> findAllBy();

}
