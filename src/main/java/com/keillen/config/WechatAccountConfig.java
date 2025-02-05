package com.keillen.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "wechat")
public class WechatAccountConfig {

    private String mpAppId;

    private String mpAppSecret;

    /*商户号*/
    private String mchId;

    /*商品密钥*/
    private String mchKey;

    /*商品证书路径*/
    private String keyPath;
}
