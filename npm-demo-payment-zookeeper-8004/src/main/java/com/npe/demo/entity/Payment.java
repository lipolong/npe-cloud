package com.npe.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author lp
 * @date 2021-04-13
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Payment implements Serializable {

    private Long id;
    private String serial;
}
