package com.example.coupon.template.api.beans;

import com.example.coupon.template.api.beans.rules.TemplateRule;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Creating a coupon template
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CouponTemplateInfo {

    private Long id;

    @NotNull
    private String name;

    @NotNull
    private String desc;

    @NotNull
    private Integer type;

    private Long shopId;

    @NotNull
    private TemplateRule rule;

    private Boolean available;
}
