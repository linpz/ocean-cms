package ocean.cms.user.controller.manage;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import ocean.cms.user.dto.UserAddDTO;
import ocean.cms.user.dto.UserQueryDTO;
import ocean.cms.user.entity.User;
import ocean.cms.user.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.beans.BeanMap;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
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
    public List<User> list(UserQueryDTO userQueryDTO) {
        LambdaQueryWrapper<User> wrapper = Wrappers.lambdaQuery(User.class)
                .eq(StringUtils.isNotBlank(userQueryDTO.getName()), User::getName, userQueryDTO.getName())
                .eq(userQueryDTO.getStatus()!=null, User::getStatus, userQueryDTO.getStatus());
        return userService.list(wrapper);
    }

    @PostMapping("create")
    public User create(@Valid @RequestBody UserAddDTO userAddDTO) {
        User user = new User();
        BeanUtils.copyProperties(userAddDTO, user);
        userService.save(user);
        return user;
    }
}
