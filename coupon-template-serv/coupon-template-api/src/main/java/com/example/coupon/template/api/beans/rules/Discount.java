package com.example.coupon.template.api.beans.rules;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Discount {

    /*
     * For the full reduction coupon - quota is the amount of money subtracted in cents
     * For discount coupons - quota is a discount (100 represents the original price), 90 is a 10% discount
     * For random immediate reduction coupons -quota is the highest random immediate reduction
     * For evening special coupons - the quota is the daytime discount amount and doubles the evening discount
     */
    private Long quota;

    // the minimum order amount to use the coupon, in cents
    private Long threshold;
}
