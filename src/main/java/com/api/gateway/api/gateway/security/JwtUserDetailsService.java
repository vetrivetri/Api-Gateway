package com.api.gateway.api.gateway.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class JwtUserDetailsService implements UserDetailsService{


    @Autowired
    UsersDatabase usersDatabase;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UsersDetails usersDetails = null;
        if (!username.isEmpty()) {

            usersDetails = usersDatabase.getUserDetails(username);
            if(! (usersDetails == null)){
            return usersDetails;}
            else {
                throw new UsernameNotFoundException("User not found with username: " + username);
            }
        } else {
            throw new UsernameNotFoundException("User not found with username: " + username);
        }
    }
}
