package ocean.cms.user.controller;

import ocean.cms.user.dto.UserDTO;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @PostMapping(value = "/login")
    public String login(@RequestBody UserDTO userDTO) {
        UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(userDTO.getName(), userDTO.getPassword());
        SecurityUtils.getSubject().login(usernamePasswordToken);
        return "login ok!";
    }

    @GetMapping("/")
    public String index() {
        Subject subject = SecurityUtils.getSubject();
        return subject.getPrincipal().toString();
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/logout")
    public String logout() {
        return "login";
    }

    @GetMapping(value = "/error")
    public String error() {
        return "error";
    }
}
