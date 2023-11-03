package com.example.coupon.template.service;

import com.example.coupon.template.api.beans.CouponTemplateInfo;
import com.example.coupon.template.api.beans.PagedCouponTemplateInfo;
import com.example.coupon.template.api.beans.TemplateSearchParams;
import java.util.Collection;
import java.util.Map;

public interface CouponTemplateService {
    CouponTemplateInfo createTemplate(CouponTemplateInfo request);

    CouponTemplateInfo cloneTemplate(Long templateId);

    CouponTemplateInfo loadTemplateInfo(Long id);

    Map<Long,CouponTemplateInfo> getTemplateInfoMap(Collection<Long> ids);

    PagedCouponTemplateInfo search(TemplateSearchParams request);

    void deleteTemplate(Long id);
}
