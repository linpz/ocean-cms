package ocean.cms.user.service.impl;

import io.kms.entity.UserRole;
import io.kms.mapper.UserRoleMapper;
import io.kms.service.UserRoleService;
import io.kms.common.base.ServiceImpl;
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
