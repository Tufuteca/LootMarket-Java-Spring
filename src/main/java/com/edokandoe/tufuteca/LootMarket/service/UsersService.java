package com.edokandoe.tufuteca.LootMarket.service;

import com.edokandoe.tufuteca.LootMarket.model.Users;
import com.edokandoe.tufuteca.LootMarket.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsersService {
    @Autowired
    private UsersRepository usersRepository;

    public Optional<Users> findByLogin(String name) {
        return usersRepository.findByLogin(name);
    }
}
