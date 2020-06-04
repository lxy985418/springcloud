package springcloud;/*
 *@author LeeXy
 *@date 2020/5/18 8:47
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

import javax.swing.*;

/**
 * @program: cloud2020
 * @description:
 * @author: LeeXy
 * @create: 2020-05-18 08:47
 **/
@EnableConfigServer
@SpringBootApplication
public class ConfigCenterMain3344 {

    public static void main(String[] args) {
        SpringApplication.run(ConfigCenterMain3344.class,args);
    }
}
