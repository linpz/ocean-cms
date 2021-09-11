package ocean.cms.user.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import ocean.cms.user.entity.Article;
import ocean.cms.user.vo.ArticleVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 文章 Mapper 接口
 * </p>
 *
 * @author mp
 * @since 2021-06-15
 */
public interface ArticleMapper extends BaseMapper<Article> {

    List<ArticleVO> list(@Param("title") String title, @Param("content") String content);
}
