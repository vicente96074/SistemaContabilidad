package com.softquark.siscontable.repository;

import com.softquark.siscontable.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Augusto Vicente
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
