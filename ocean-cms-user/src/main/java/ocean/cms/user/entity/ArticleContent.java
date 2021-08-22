package ocean.cms.user.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * <p>
 * 文章内容
 * </p>
 *
 * @author mp
 * @since 2021-06-15
 */
@Data
@TableName("kms_article_content_")
@ApiModel(value="ArticleContent对象", description="文章内容")
public class ArticleContent {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    @TableId(value = "id_", type = IdType.ASSIGN_ID)
    private String id;

    @ApiModelProperty(value = "文章内容")
    @TableField("content_")
    private String content;


}
