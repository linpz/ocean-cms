package ocean.cms.user.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import ocean.cms.user.entity.ArticleContent;
import ocean.cms.user.mapper.ArticleContentMapper;
import ocean.cms.user.service.ArticleContentService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 文章内容 服务实现类
 * </p>
 *
 * @author mp
 * @since 2021-06-15
 */
@Service
public class ArticleContentServiceImpl extends ServiceImpl<ArticleContentMapper, ArticleContent> implements ArticleContentService {

}
