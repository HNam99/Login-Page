package com.example.loginnew2.security.auth;

import com.example.loginnew2.security.model.AppUser;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Collections;

public class UserDetailImp implements UserDetails {
    private AppUser appUser;

    public UserDetailImp(AppUser appUser){
        super();
        this.appUser = appUser;
    }

    @Override
    public Collection<? extends GrantedAuthority>  getAuthorities(){
        return Collections.singleton(new SimpleGrantedAuthority(appUser.getRole()));
    }

    @Override
    public String getPassword() {
        return appUser.getPassword();
    }

    @Override
    public String getUsername() {
        return appUser.getUserName();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

}
