package net.proselyte.appsecurity.dao;

import net.proselyte.appsecurity.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserDao extends JpaRepository<User, UUID> {
    User findByUsername(String username);
}
