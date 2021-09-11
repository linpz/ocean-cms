package ocean.cms.user.controller.manage;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import ocean.cms.user.dto.ArticleQueryDTO;
import ocean.cms.user.entity.Article;
import ocean.cms.user.service.ArticleService;
import ocean.cms.user.vo.ArticleVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 文章 前端控制器
 * </p>
 *
 * @author mp
 * @since 2021-06-15
 */
@RestController
@RequestMapping("/manage/article")
public class ArticleController {

    @Autowired
    ArticleService articleService;

    @GetMapping("list")
    public List<ArticleVO> list(ArticleQueryDTO articleQueryDTO) {
        return articleService.list(articleQueryDTO.getTitle(), articleQueryDTO.getContent());
    }


}
