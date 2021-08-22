package ocean.cms.user.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import ocean.cms.user.entity.Role;
import ocean.cms.user.mapper.RoleMapper;
import ocean.cms.user.service.RoleService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 角色 服务实现类
 * </p>
 *
 * @author mp
 * @since 2021-06-15
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements RoleService {

}
