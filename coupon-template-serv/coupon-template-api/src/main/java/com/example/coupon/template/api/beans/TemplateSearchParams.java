package com.example.coupon.template.api.beans;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TemplateSearchParams {

    private Long id;

    private String name;

    private Integer type;

    private Long shopId;

    private Boolean available;

    private int page;

    private int pageSize;

}
