package com.keillen.controller;

import com.keillen.common.utils.qrcode.PoolCache;
import com.keillen.common.utils.qrcode.ScanPool;
import com.keillen.dto.OrderDTO;
import com.keillen.enums.ResultEnum;
import com.keillen.exception.SellException;
import com.keillen.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;
import java.util.UUID;

/*微信支付*/
@Controller
@RequestMapping("/pay")
public class PayController {

    @Autowired
    private OrderService orderService;

//    @GetMapping("/create")
//    public String create(@RequestParam("orderId") String orderId,
//                         @RequestParam("returnUrl") String returnUrl){
        //1.查询订单
//        OrderDTO orderDTO = orderService.findOne(orderId);
//        if (orderDTO == null){
//            throw new SellException(ResultEnum.ORDER_NOT_EXIST);
//        }

        //发起支付
//    }

    @RequestMapping("/create")
    public String create(@RequestParam("orderId") String orderId,
                         @RequestParam("returnUrl") String returnUrl,
                         Map<String, Object> map){
        //1.查询订单
        OrderDTO orderDTO = orderService.findOne(orderId);
        if (orderDTO == null){
            throw new SellException(ResultEnum.ORDER_NOT_EXIST);
        }
//        map.put("returnUrl", returnUrl.startsWith("http://") ? returnUrl : URLEncoder.encode(returnUrl, "utf-8"));
        return  "pay";
    }
}
