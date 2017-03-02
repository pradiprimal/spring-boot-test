package spring.boot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.boot.entity.Test;

/**
 *
 * @author Pradip
 */
public interface TestRepository extends JpaRepository<Test, Long> {

}
