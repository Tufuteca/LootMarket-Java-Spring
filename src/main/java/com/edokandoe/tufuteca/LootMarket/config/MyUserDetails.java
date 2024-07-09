package com.edokandoe.tufuteca.LootMarket.config;


import com.edokandoe.tufuteca.LootMarket.model.Users;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class MyUserDetails implements UserDetails {

    private Users user;

    private MyUserDetails(Users user){
        this.user = user;
    }


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities(){
        if(user !=null && user.getRole() != null){
            switch (user.getRole().getTitle()){
                case "ADMIN":
                    return Arrays.asList(new SimpleGrantedAuthority("ROLE_ADMIN"));
                case "USER":
                    return Arrays.asList(new SimpleGrantedAuthority("ROLE_USER"));
                default:
                    return Collections.emptyList();
            }

        }
        return Collections.emptyList();
    }

    @Override
    public String getPassword() {return user.getPassword();}

    @Override
    public String getUsername() {return user.getLogin();}

    @Override
    public boolean isAccountNonExpired() {return true;}

    @Override
    public boolean isAccountNonLocked() {return true;}

    @Override
    public boolean isCredentialsNonExpired() {return true;}

    @Override
    public boolean isEnabled() {return true;}


}
