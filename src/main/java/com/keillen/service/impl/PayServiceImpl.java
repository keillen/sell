package com.keillen.service.impl;

import com.keillen.dto.OrderDTO;
import com.keillen.service.PayService;
import com.lly835.bestpay.service.impl.BestPayServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class PayServiceImpl implements PayService {

    @Override
    public void create(OrderDTO orderDTO) {

        BestPayServiceImpl bestPayService = new BestPayServiceImpl();
//        bestPayService.setWxPayH5Config();
    }
}
