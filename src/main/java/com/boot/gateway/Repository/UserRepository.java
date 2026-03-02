package com.boot.gateway.Repository;
import com.boot.gateway.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<Users, Integer>{

    Users findByUsername(String username);

}
