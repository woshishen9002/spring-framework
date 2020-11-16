package com.demo.aop.init;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @program: spring
 * @description:
 * @author: wanghui
 * @create: 2020-03-12 16:29
 */
@ComponentScan("com.demo.aop")
@EnableTransactionManagement //开启事务
public class AppConfig {

}
