package com.imooc.controller;

import com.imooc.dataobject.SellerInfo;
import com.imooc.enums.ResultEnum;
import com.imooc.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
@RequestMapping("/seller")
public class SellerUserController {

    @Autowired
    private SellerService sellerService;

    @GetMapping("/login")
    public ModelAndView login(@RequestParam("openid") String openid,
                              Map<String, Object> map){
        //1.openid去和数据库里的数据匹配
//        SellerInfo sellerInfo = sellerService.findSellerInfoByOpenid(openid);
//        if (sellerInfo == null){
//            map.put("msg", ResultEnum.LOGIN_FAIL.getMessage());
//            map.put("url", "/sell/seller/order/list");
//            return new ModelAndView("common/error");
//        }
        return null;
    }

    @GetMapping("/logout")
    public void logout(){

    }
}
