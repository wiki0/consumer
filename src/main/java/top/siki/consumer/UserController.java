package top.siki.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author: yangfan
 * @date: 18-3-27 下午5:50
 * @description:
 */
@RestController
public class UserController {
    @Autowired
    private RestTemplate restTemplate;
    @GetMapping("user/{id}")
    public User findById(@PathVariable Long id) {
        return this.restTemplate.getForObject("http://localhost:8760/"+id,User.class);
    }
}
