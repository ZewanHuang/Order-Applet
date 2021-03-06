package com.example.demo.response;

import lombok.Data;

@Data
public class WxCardResponse {

    /**
     * ååId.
     */
    private int productId;

    /**
     * æ°é.
     */
    private Integer productQuantity;

    public WxCardResponse(int productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
