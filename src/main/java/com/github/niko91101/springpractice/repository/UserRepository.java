package com.github.niko91101.springpractice.repository;

import com.github.niko91101.springpractice.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    boolean findByName(String name);

    boolean getUsersById(long id);
}
