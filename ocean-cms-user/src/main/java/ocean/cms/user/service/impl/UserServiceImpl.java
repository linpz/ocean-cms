package ocean.cms.user.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import ocean.cms.user.entity.User;
import ocean.cms.user.mapper.UserMapper;
import ocean.cms.user.service.UserService;
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
