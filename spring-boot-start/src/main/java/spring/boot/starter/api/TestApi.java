package spring.boot.starter.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.boot.repositories.TestRepository;

/**
 *
 * @author Pradip
 */
@RestController
public class TestApi {

    @Autowired
    private TestRepository repositoryImpl;

    @GetMapping("/test")
    public String getName() {
        return "pradip";
    }
}
