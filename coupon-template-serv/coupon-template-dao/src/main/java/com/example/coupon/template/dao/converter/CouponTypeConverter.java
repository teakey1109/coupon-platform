package com.example.coupon.template.dao.converter;

import com.example.coupon.template.api.enums.CouponType;
import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter
public class CouponTypeConverter implements AttributeConverter<CouponType, Integer> {


    /**
     * Converts the value stored in the entity attribute into the
     * data representation to be stored in the database.
     *
     * @param couponCategory the entity attribute value to be converted
     * @return the converted data to be stored in the database
     * column
     */
    @Override
    public Integer convertToDatabaseColumn(CouponType couponCategory) {
        return couponCategory.getCode();
    }

    /**
     * Converts the data stored in the database column into the
     * value to be stored in the entity attribute.
     * Note that it is the responsibility of the converter writer to
     * specify the correct <code>dbData</code> type for the corresponding
     * column for use by the JDBC driver: i.e., persistence providers are
     * not expected to do such type conversion.
     *
     * @param code the data from the database column to be
     *               converted
     * @return the converted value to be stored in the entity
     * attribute
     */
    @Override
    public CouponType convertToEntityAttribute(Integer code) {
        return CouponType.convert(code);
    }
}
