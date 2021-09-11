package ocean.cms.user.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class UserUpdateDTO {
    private String id;
    @NotBlank(message = "用户名称不能为空")
    private String name;
    @NotBlank(message = "密码不能为空")
    private String password;
    @NotNull(message = "用户状态不能为空")
    private Integer status;
}
