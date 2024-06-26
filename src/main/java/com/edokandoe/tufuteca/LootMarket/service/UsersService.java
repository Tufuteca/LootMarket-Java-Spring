package com.edokandoe.tufuteca.LootMarket.service;

import com.edokandoe.tufuteca.LootMarket.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersService {
    @Autowired
    private UsersRepository usersRepository;
}
