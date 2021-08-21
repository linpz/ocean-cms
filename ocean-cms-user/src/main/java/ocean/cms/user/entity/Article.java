package ocean.cms.user.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * <p>
 * 文章
 * </p>
 *
 * @author mp
 * @since 2021-06-15
 */
@Data
@TableName("kms_article_")
@ApiModel(value="Article对象", description="文章")
public class Article {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "文章标题")
    @TableField("title_")
    private String title;

    @ApiModelProperty(value = "文章内容")
    @TableField("article_content_id_")
    private String articleContentId;

    @ApiModelProperty(value = "更新时间")
    @TableField("revise_time_")
    private LocalDateTime reviseTime;

    @ApiModelProperty(value = "更新者")
    @TableField("revisor_")
    private String revisor;


}
