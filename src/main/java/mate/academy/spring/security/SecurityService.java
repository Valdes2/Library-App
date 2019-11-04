package mate.academy.spring.security;

import mate.academy.spring.entity.User;

public interface SecurityService {

    User getAuthenticatedUser();
}
