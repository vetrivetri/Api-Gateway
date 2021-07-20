package com.api.gateway.api.gateway.security;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

public class UsersDetails implements UserDetails {
    private String username;

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public String getUsername() {
        return this.username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }

//    private String username;
//    private String password;
//    private Collection<GrantedAuthority> listOfgrantedAuthorities = new ArrayList<>();
//
//    public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public Collection<GrantedAuthority> getListOfgrantedAuthorities() {
//        return listOfgrantedAuthorities;
//    }
//
//    public void setListOfgrantedAuthorities(Collection<GrantedAuthority> listOfgrantedAuthorities) {
//        this.listOfgrantedAuthorities = listOfgrantedAuthorities;
//    }
}
