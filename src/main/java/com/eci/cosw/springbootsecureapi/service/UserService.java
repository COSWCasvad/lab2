package com.eci.cosw.springbootsecureapi.service;

import com.eci.cosw.springbootsecureapi.model.User;

import java.util.List;

/**
 * @author Santiago Carrillo
 * 8/21/17.
 */
public interface UserService
{
    List<User> getUsers();

    User getUser( String username );

    User createUser( User user ) throws Exception;

    User findUserByEmail( String email );

    User findUserByEmailAndPassword( String email, String password );
}