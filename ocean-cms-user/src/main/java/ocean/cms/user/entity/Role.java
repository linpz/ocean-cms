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
 * 角色
 * </p>
 *
 * @author mp
 * @since 2021-06-15
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("kms_role_")
@ApiModel(value="Role对象", description="角色")
public class Role extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "角色名称")
    @TableField("name_")
    private String name;

    @ApiModelProperty(value = "用户状态（1、正常；2、停用）")
    @TableField("status_")
    private Integer status;


}
