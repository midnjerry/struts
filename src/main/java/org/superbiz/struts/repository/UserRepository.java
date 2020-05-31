package org.superbiz.struts.repository;

import org.springframework.data.repository.CrudRepository;
import org.superbiz.struts.model.User;

public interface UserRepository extends CrudRepository<User, Long> {
}
