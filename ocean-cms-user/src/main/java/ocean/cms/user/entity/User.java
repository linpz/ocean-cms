package ocean.cms.user.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * <p>
 * 用户
 * </p>
 *
 * @author mp
 * @since 2021-06-15
 */
@Data
@TableName("kms_user_")
@ApiModel(value="User对象", description="用户")
public class User {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    @TableId(value = "id_", type = IdType.ASSIGN_ID)
    private String id;

    @ApiModelProperty(value = "用户名称")
    @TableField("name_")
    private String name;

    @ApiModelProperty(value = "用户密码")
    @TableField("password_")
    private String password;

    @ApiModelProperty(value = "用户状态（1、正常；2、停用）")
    @TableField("status_")
    private Integer status;


}
