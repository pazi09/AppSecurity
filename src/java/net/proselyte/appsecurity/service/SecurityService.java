package net.proselyte.appsecurity.service;

public interface SecurityService {

    String findLoggedInUsername();

    void autoLogin(String username, String password);
}
