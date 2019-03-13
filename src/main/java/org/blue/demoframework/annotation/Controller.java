package org.blue.demoframework.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author 郑煜
 * @Title: Controller
 * @ProjectName demoframework
 * @Description:标注一个控制器
 * @date 2019/3/13上午 01:17
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Component
public @interface Controller {
}
