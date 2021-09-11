package ocean.cms.user.service;

import com.baomidou.mybatisplus.extension.service.IService;
import ocean.cms.user.entity.Article;
import ocean.cms.user.vo.ArticleVO;

import java.util.List;

/**
 * <p>
 * 文章 服务类
 * </p>
 *
 * @author mp
 * @since 2021-06-15
 */
public interface ArticleService extends IService<Article> {
    List<ArticleVO> list(String title, String content);
}
