package com.jin.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: Jin
 * @Date: 2021/2/2 10:14
 * @Description: Payment
 * @version: V1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment {

    private long id;
    private String serial;

}
