package com.edokandoe.tufuteca.LootMarket.repository;

import com.edokandoe.tufuteca.LootMarket.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<Users,Long> {
}
