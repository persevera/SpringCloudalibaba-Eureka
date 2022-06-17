package com.liuyong.serviceprovide2.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class providecontroller {

    @Value("${server.port}")
    private  String  port;

    @RequestMapping("/getinfo")
    @ResponseBody
    public  String  getinfo(){
        return  "服务提供者"+port+"被调用";
    }
}
