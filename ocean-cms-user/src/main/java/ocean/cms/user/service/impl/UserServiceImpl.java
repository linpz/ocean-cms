package ocean.cms.user.service.impl;

import io.kms.entity.User;
import io.kms.mapper.UserMapper;
import io.kms.service.UserService;
import io.kms.common.base.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户 服务实现类
 * </p>
 *
 * @author mp
 * @since 2021-06-15
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
