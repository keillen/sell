package com.imooc.service;

import com.imooc.dataobject.SellerInfo;

/*卖家端*/
public interface SellerService {
    //通过openid查询卖家端信息
    SellerInfo findSellerInfoByOpenid(String openid);
}
