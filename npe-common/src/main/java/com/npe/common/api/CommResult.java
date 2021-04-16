package com.npe.common.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author lp
 * @date 2021-04-13
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommResult<T> {

    private Integer code;
    private String msg;
    private T data;

    public CommResult(Integer code, String msg){
       this(code,msg,null);
    }

}
