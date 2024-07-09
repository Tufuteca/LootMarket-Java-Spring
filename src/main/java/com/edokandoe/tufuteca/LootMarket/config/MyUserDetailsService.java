package com.edokandoe.tufuteca.LootMarket.config;

import com.edokandoe.tufuteca.LootMarket.model.Users;
import com.edokandoe.tufuteca.LootMarket.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MyUserDetailsService {

    @Autowired
    private UsersRepository usersRepository;

    @Override
    public UserDetails loadByUsernameOrEmail(String username) throws UsernameNotFoundException{
        Optional<Users> user = usersRepository.findByUsername(username);
        return user.map(MyUserDetails::new)
                .orElseThrow(() -> new UsernameNotFoundException(username+ "not found"));
    }
}
