package ocean.cms.user.controller.manage;


import ocean.cms.user.entity.User;
import ocean.cms.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 用户 前端控制器
 * </p>
 *
 * @author mp
 * @since 2021-06-15
 */
@RestController
@RequestMapping("/manage/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("list")
    public List<User> list() {
        return userService.list();
    }

}
