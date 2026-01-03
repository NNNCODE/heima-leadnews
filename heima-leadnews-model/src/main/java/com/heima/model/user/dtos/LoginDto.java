package com.heima.model.user.dtos;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author Nmh
 * @version 1.0
 * @description TODO
 * @date 12/18/2025
 */
@Data
public class LoginDto {
    /**
     * 手机号码
     */
    @ApiModelProperty(value = "手机号", required = true)
    private String phone;
    /**
     * 密码
     */
    @ApiModelProperty(value = "密码", required = true)
    private String password;


}
