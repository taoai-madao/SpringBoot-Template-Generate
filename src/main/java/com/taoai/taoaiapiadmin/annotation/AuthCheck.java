package com.taoai.taoaiapiadmin.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @version 1.0
 * @Author TaoAi
 * @Date 2023/9/25 20:21
 * @注释 权限校验,身份校验
 */

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface AuthCheck {

    /**
     * 权限检验，权限等级是否足够
     * 这里只定义了一种权限，即校验是否为管理员
     * @return
     */
    String mustRole() default "";
}
