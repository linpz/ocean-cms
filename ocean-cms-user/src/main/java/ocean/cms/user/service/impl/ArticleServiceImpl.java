package ocean.cms.user.service.impl;

import io.kms.entity.Article;
import io.kms.mapper.ArticleMapper;
import io.kms.service.ArticleService;
import io.kms.common.base.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 文章 服务实现类
 * </p>
 *
 * @author mp
 * @since 2021-06-15
 */
@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article> implements ArticleService {

}
