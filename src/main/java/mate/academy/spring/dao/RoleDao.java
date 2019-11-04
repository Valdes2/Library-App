package mate.academy.spring.dao;

import java.util.List;

import mate.academy.spring.entity.Role;

public interface RoleDao {

    void addRole(Role role);

    Role getRoleByName(String name);

    List<Role> getAllRoles();
}
