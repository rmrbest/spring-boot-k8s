package es.claranet.demo.repository;

import es.claranet.demo.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by raul on 12/06/17.
 */
public interface UserRepository extends JpaRepository<User,String> {

}
