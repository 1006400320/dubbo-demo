package com.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author: linhuanjie
 * @description:
 * @createTime : 2018-11-30 18:34
 * @email: lhuanjie@qq.com
 */
public class ProviderTest {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:springmvc.xml");
        context.start();

        System.out.println("Dubbo provider start...");

        try {
            System.in.read();   // 按任意键退出
        } catch (
                IOException e) {
            e.printStackTrace();
        }

    }

}
