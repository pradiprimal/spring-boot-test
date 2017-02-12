package spring.boot.starter.api;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Pradip
 */
@RestController
public class TestApi {

    private final JpaRepository jpaRepository;

    @Autowired
    public TestApi(JpaRepository jpaRepository) {
        this.jpaRepository = jpaRepository;
    }

    @GetMapping("/name")
    public List<String> getName() {
        List<String> names = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            names.add("pradip Rimal");
        }
        return names;
    }
}
