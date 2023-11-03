package com.example.coupon.template.api.enums;

import java.util.stream.Stream;
import lombok.AllArgsConstructor;
import lombok.Getter;


/**
 * The CouponType class defines several different types of coupons,
 * and the convert method can return a description corresponding to the encoding of the coupon.
 */
@Getter
@AllArgsConstructor
public enum CouponType {
    UNKNOWN("unknown", 0),
    MONEY_OFF("moneyOff", 1),
    DISCOUNT("discount", 2),
    RANDOM_DISCOUNT("randomDiscount", 3),
    LONELY_NIGHT_MONEY_OFF("doubleCoupon", 4)
    ;

    private final String desc;
    private final Integer code;

    public static CouponType convert(Integer code) {
        return Stream.of(values())
                .filter(bean -> bean.code.equals(code))
                .findFirst()
                .orElse(UNKNOWN);
    }
}
