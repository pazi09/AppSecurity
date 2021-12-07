package net.proselyte.appsecurity.service;

import net.proselyte.appsecurity.model.User;

public interface UserService {

    void save(User user);

    User findByUsername(String username);

}
