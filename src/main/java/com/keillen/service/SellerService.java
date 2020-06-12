package com.keillen.service;

import com.keillen.dataobject.SellerInfo;

/*卖家端*/
public interface SellerService {
    //通过openid查询卖家端信息
    SellerInfo findSellerInfoByOpenid(String openid);
}
