package com.liuyong.commons.myclass;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class useforconsumer {

    public String hu(){
        return "服务消费者调用公共模块成功";
    }
}
