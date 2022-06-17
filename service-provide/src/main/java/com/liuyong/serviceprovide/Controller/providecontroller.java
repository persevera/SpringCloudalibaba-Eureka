package com.liuyong.serviceprovide.Controller;

import com.liuyong.commons.myclass.useforprovide;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class providecontroller {

    useforprovide  provide=new useforprovide();

    @RequestMapping("/getinfo")
    @ResponseBody
    public  String  getinfo(){
        return  provide.he();
    }
}
