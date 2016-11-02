package docker;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by vijaymuvva on 1/11/16.
 */
@RestController
public class DockerHelloWorldCtrl {

    @RequestMapping("/sayHelloDocker")
    public String sayHelloDocker() {
        return "Hello, Happy Dockerizing :-) Hello Ransika";
    }
}
