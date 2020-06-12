package com.keillen.controller;

import com.keillen.common.utils.qrcode.PoolCache;
import com.keillen.common.utils.qrcode.ScanPool;
import com.keillen.enums.ResultEnum;
import com.keillen.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;
import java.util.UUID;

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
    public ModelAndView logout(Map<String, Object> map) {
        map.put("url", "/sell/seller/index");
        return new ModelAndView("common/success", map);
    }
}
