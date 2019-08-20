package com.qst.eurekaclient;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@EnableEurekaClient
public class EurekaClientApplication {
   /* @Autowired
    private EurekaClient client;*/

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientApplication.class, args);
    }

    @RequestMapping("/info")
    public String test() {
        return "test";
    }


    @RequestMapping("/test")
    public String testClient() {
       /*InstanceInfo instanceInfo = client.getNextServerFromEureka("service-hi", false);
        return instanceInfo.getHomePageUrl();*/
       return  "lizifu";

    }

}
