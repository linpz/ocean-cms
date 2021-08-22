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
 * 角色
 * </p>
 *
 * @author mp
 * @since 2021-06-15
 */
@Data
@TableName("kms_role_")
@ApiModel(value="Role对象", description="角色")
public class Role {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    @TableId(value = "id_", type = IdType.ASSIGN_ID)
    private String id;

    @ApiModelProperty(value = "角色名称")
    @TableField("name_")
    private String name;

    @ApiModelProperty(value = "用户状态（1、正常；2、停用）")
    @TableField("status_")
    private Integer status;


}
