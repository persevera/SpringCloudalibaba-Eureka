package com.liuyong.commons.myclass;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class useforprovide {


    public  String  he(){
        return  "服务提供者调用公共模块成功了";
    }
}
