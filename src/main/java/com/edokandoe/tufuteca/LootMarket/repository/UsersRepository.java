package com.edokandoe.tufuteca.LootMarket.repository;

import com.edokandoe.tufuteca.LootMarket.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long> {
    Optional<Users> findByLogin(String login);
}

