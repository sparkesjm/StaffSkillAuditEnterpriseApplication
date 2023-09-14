package com.example.identity.infrastructure;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<AppUserJpa, Long> {
    @Query("FROM application_user u WHERE u.userName=:username AND u.password=:password")
    Optional<AppUserJpa> findUserByUsernameAndPassword(String username, String password);
}
