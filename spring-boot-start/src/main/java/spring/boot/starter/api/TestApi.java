package spring.boot.starter.api;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.boot.entity.Test;
import spring.boot.repositories.TestRepository;

/**
 *
 * @author Pradip
 */
@RestController
public class TestApi {

    @Autowired
    private TestRepository repositoryImpl;

    @GetMapping("/save")
    public String saveTest() {
        Test test = new Test();
        test.setName("test");
        repositoryImpl.save(test);
        return "Successfully Added";
    }

    @GetMapping("/get")
    public List<Test> getTest() {
        return repositoryImpl.findAll();

    }
}
