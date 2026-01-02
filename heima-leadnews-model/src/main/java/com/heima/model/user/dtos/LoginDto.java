package com.heima.model.user.dtos;

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

    private String phone;
    /**
     * 密码
     */
    private String password;


}
