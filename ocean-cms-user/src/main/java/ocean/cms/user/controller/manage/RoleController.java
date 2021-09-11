package ocean.cms.user.controller.manage;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.plugins.pagination.PageDto;
import ocean.cms.user.dto.RoleAddDTO;
import ocean.cms.user.dto.RoleQueryDTO;
import ocean.cms.user.dto.RoleUpdateDTO;
import ocean.cms.user.entity.Role;
import ocean.cms.user.entity.User;
import ocean.cms.user.service.RoleService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * <p>
 * 角色 前端控制器
 * </p>
 *
 * @author mp
 * @since 2021-06-15
 */
@RestController
@RequestMapping("/manage/role")
public class RoleController {

    @Autowired
    RoleService roleService;

    @GetMapping("list")
    public List<Role> list(RoleQueryDTO roleQueryDTO) {
        LambdaQueryWrapper<Role> wrapper = Wrappers.lambdaQuery(Role.class)
                .eq(StringUtils.isNotBlank(roleQueryDTO.getName()), Role::getName, roleQueryDTO.getName())
                .eq(roleQueryDTO.getStatus() != null, Role::getStatus, roleQueryDTO.getStatus());
        return roleService.list(wrapper);
    }

    @GetMapping("page")
    public Page<Role> page(RoleQueryDTO roleQueryDTO) {
        Long current = roleQueryDTO.getCurrent();
        Long size = roleQueryDTO.getSize();
        if (current == null) {
            current = 1L;
        }
        if (size == null) {
            size = 10L;
        }
        PageDto<Role> pageDTO = new PageDto<>(current, size);
        LambdaQueryWrapper<Role> wrapper = Wrappers.lambdaQuery(Role.class)
                .eq(StringUtils.isNotBlank(roleQueryDTO.getName()), Role::getName, roleQueryDTO.getName())
                .eq(roleQueryDTO.getStatus() != null, Role::getStatus, roleQueryDTO.getStatus());
        return roleService.page(pageDTO, wrapper);
    }

    @PostMapping("create")
    public Role create(@Valid @RequestBody RoleAddDTO roleAddDTO) {
        Role role = new Role();
        BeanUtils.copyProperties(roleAddDTO, role);
        roleService.save(role);
        return role;
    }

    @PutMapping("update")
    public Role update(@Valid @RequestBody RoleUpdateDTO roleUpdateDTO) {
        Role role = roleService.getById(roleUpdateDTO.getId());
        if (role == null) {
            throw new RuntimeException("角色信息不存在");
        }
        BeanUtils.copyProperties(roleUpdateDTO, role);
        roleService.updateById(role);
        return role;
    }

    @DeleteMapping("delete")
    public String delete(@RequestParam("id") String id) {
        return String.valueOf(roleService.removeById(id));
    }
}
