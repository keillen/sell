package com.keillen.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.keillen.dataobject.OrderDetail;
import com.keillen.enums.OrderStatusEnum;
import com.keillen.enums.PayStatusEnum;
import com.keillen.utils.EnumUtil;
import com.keillen.utils.serializer.Date2LongSerializer;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/*订单数据传输对象*/
@Data
//@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)//字段为null时，不返回
//@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrderDTO {

    /*订单id*/
    private String orderId;

    /*买家名字*/
    private String buyerName;

    /*买家手机号*/
    private String buyerPhone;

    /*买家地址*/
    private String buyerAddress;

    /*买家微信Openid*/
    private String buyerOpenid;

    /*订单总金额*/
    private BigDecimal orderAmount;

    /*订单状态，默认为0新下单*/
    private Integer orderStatus;

    /*支付状态，默认为0未支付*/
    private Integer payStatus;

    /*创建时间*/
    @JsonSerialize(using = Date2LongSerializer.class)
    private Date createTime;

    /*更新时间*/
    @JsonSerialize(using = Date2LongSerializer.class)
    private Date updateTime;

    private List<OrderDetail> orderDetailList;

    @JsonIgnore//转成json格式时忽略该方法
    public OrderStatusEnum getOrderStatusEnum(){
        return EnumUtil.getByCode(orderStatus, OrderStatusEnum.class);
    }

    @JsonIgnore
    public PayStatusEnum getPayStatusEnum(){
        return EnumUtil.getByCode(payStatus, PayStatusEnum.class);
    }
}
