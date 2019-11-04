package mate.academy.spring.service;

import java.util.List;

import mate.academy.spring.entity.Role;

public interface RoleService {
    void addRole(Role role);

    Role getRoleByName(String name);

    List<Role> getAllRoles();
}
