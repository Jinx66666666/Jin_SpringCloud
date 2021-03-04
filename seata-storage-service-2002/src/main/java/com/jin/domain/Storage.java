package com.jin.domain;

import lombok.Data;

/**
 * @author: Jin
 * @Date: 2021/3/4 16:33
 * @Description: Storage
 * @version: V1.0
 */

@Data
public class Storage {

    private Long id;

    /**
     * 产品id
     */
    private Long productId;

    /**
     * 总库存
     */
    private Integer total;

    /**
     * 已用库存
     */
    private Integer used;

    /**
     * 剩余库存
     */
    private Integer residue;
}

