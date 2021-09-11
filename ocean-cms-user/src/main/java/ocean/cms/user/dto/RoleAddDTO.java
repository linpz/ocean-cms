package ocean.cms.user.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class RoleAddDTO {
    @NotBlank(message = "角色名称不能为空")
    private String name;
    @NotNull(message = "角色状态不能为空")
    private Integer status;
}
