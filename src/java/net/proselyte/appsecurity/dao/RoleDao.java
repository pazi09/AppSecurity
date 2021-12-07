package net.proselyte.appsecurity.dao;

import net.proselyte.appsecurity.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleDao extends JpaRepository<Role, Long> {
}
