package ocean.cms.user.controller.manage;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.plugins.pagination.PageDto;
import ocean.cms.user.dto.UserAddDTO;
import ocean.cms.user.dto.UserQueryDTO;
import ocean.cms.user.dto.UserUpdateDTO;
import ocean.cms.user.entity.User;
import ocean.cms.user.service.UserService;
import org.apache.ibatis.annotations.Delete;
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

    @GetMapping("page")
    public Page<User> page(UserQueryDTO userQueryDTO) {
        Long current = userQueryDTO.getCurrent();
        Long size = userQueryDTO.getSize();
        if (current == null) {
            current = 1L;
        }
        if (size == null) {
            size = 10L;
        }
        PageDto<User> pageDTO = new PageDto<>(current, size);
        LambdaQueryWrapper<User> wrapper = Wrappers.lambdaQuery(User.class)
                .eq(StringUtils.isNotBlank(userQueryDTO.getName()), User::getName, userQueryDTO.getName())
                .eq(userQueryDTO.getStatus()!=null, User::getStatus, userQueryDTO.getStatus());
        return userService.page(pageDTO, wrapper);
    }

    @PostMapping("create")
    public User create(@Valid @RequestBody UserAddDTO userAddDTO) {
        User user = new User();
        BeanUtils.copyProperties(userAddDTO, user);
        userService.save(user);
        return user;
    }

    @PutMapping("update")
    public User update(@Valid @RequestBody UserUpdateDTO userUpdateDTO) {
        User user = userService.getById(userUpdateDTO.getId());
        if(user == null) {
            throw new RuntimeException("用户信息不存在.");
        }
        BeanUtils.copyProperties(userUpdateDTO, user);
        userService.updateById(user);
        return user;
    }

    @DeleteMapping("delete")
    public String delete(@RequestParam("id") String id) {
        return String.valueOf(userService.removeById(id));
    }
}
