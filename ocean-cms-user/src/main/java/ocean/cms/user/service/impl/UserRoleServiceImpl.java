package ocean.cms.user.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import ocean.cms.user.entity.UserRole;
import ocean.cms.user.mapper.UserRoleMapper;
import ocean.cms.user.service.UserRoleService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户角色 服务实现类
 * </p>
 *
 * @author mp
 * @since 2021-06-15
 */
@Service
public class UserRoleServiceImpl extends ServiceImpl<UserRoleMapper, UserRole> implements UserRoleService {

}
