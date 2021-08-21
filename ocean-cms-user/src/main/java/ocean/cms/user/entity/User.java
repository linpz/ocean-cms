package ocean.cms.user.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import io.kms.common.base.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 用户
 * </p>
 *
 * @author mp
 * @since 2021-06-15
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("kms_user_")
@ApiModel(value="User对象", description="用户")
public class User extends BaseEntity {

    private static final long serialVersionUID = 1L;

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
