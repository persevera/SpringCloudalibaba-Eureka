package com.liuyong.serviceconsumer.Controller;

import com.liuyong.commons.myclass.useforconsumer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;


@Slf4j
@Controller
public class consumercontroller {
   useforconsumer consumer=new useforconsumer();

    @Resource
    private RestTemplate restTemplate;

    private  static  final String PAYMENT_KEY="http://service-provide/provide/";

    @RequestMapping("/getinfo")
    @ResponseBody
    public  String  getinfo(String name){
        log.info("服务提供者调用服务消费者成功");
        log.info("服务消费者调用公共模块成功了哟"+consumer.hu());
        return  restTemplate.postForObject(PAYMENT_KEY + "getinfo", name, String.class);
    }
}
