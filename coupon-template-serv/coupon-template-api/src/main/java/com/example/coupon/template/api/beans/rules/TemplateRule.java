package com.example.coupon.template.api.beans.rules;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TemplateRule {

    // The discounts you can enjoy
    private Discount discount;

    // The maximum number of coupons each person can receive
    private Integer limitation;

    private Long deadline;
}
