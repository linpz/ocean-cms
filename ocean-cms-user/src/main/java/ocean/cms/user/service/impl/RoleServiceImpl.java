package ocean.cms.user.service.impl;

import io.kms.entity.Role;
import io.kms.mapper.RoleMapper;
import io.kms.service.RoleService;
import io.kms.common.base.ServiceImpl;
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
