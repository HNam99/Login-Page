package com.example.loginnew2.repo;

import com.example.loginnew2.security.model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<AppUser, Long> {
    AppUser findAppUserByUserName(String userName);

}
