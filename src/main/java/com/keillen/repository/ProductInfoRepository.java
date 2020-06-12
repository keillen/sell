package com.keillen.repository;

import com.keillen.dataobject.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductInfoRepository extends JpaRepository<ProductInfo, String> {

    /*查询上下商品*/
    List<ProductInfo> findByProductStatus(Integer productStatus);
}
