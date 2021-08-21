package ocean.cms.user.service.impl;

import io.kms.entity.ArticleContent;
import io.kms.mapper.ArticleContentMapper;
import io.kms.service.ArticleContentService;
import io.kms.common.base.ServiceImpl;
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
