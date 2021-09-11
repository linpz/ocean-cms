package ocean.cms.user.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import ocean.cms.user.entity.Article;
import ocean.cms.user.mapper.ArticleMapper;
import ocean.cms.user.service.ArticleService;
import ocean.cms.user.vo.ArticleVO;
import org.springframework.stereotype.Service;

import java.util.List;

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

    @Override
    public List<ArticleVO> list(String title, String content) {
        return getBaseMapper().list(title, content);
    }
}
