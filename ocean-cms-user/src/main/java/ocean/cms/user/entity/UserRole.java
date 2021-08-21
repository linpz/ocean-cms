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
 * 用户角色
 * </p>
 *
 * @author mp
 * @since 2021-06-15
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("kms_user_role_")
@ApiModel(value="UserRole对象", description="用户角色")
public class UserRole extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "用户信息主键")
    @TableField("user_id_")
    private String userId;

    @ApiModelProperty(value = "角色信息主键")
    @TableField("role_id_")
    private String roleId;


}
