package com.jin.service;

/**
 * @author: Jin
 * @Date: 2021/3/4 16:34
 * @Description: StorageService
 * @version: V1.0
 */
public interface StorageService {
    /**
     * 扣减库存
     */
    void decrease(Long productId, Integer count);
}
