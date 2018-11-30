package com.consumer;

import com.api.service.IHelloService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author: linhuanjie
 * @description:
 * @createTime : 2018-11-30 18:27
 * @email: lhuanjie@qq.com
 */
public class ConsumerTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:springmvc.xml");
        context.start();

        IHelloService helloService = (IHelloService) context.getBean("helloService");
        System.out.println(helloService.sayHello("QAQ"));

        try {
            System.in.read();   // 按任意键退出
        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }
}
