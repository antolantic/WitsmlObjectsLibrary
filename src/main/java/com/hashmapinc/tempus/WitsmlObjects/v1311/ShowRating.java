package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShowRating.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre> {@code
 * <simpleType name="ShowRating">
 *   <restriction base="{http://www.witsml.org/schemas/131}abstractTypeEnum">
 *     <enumeration value="none"/>
 *     <enumeration value="very poor"/>
 *     <enumeration value="poor"/>
 *     <enumeration value="fair"/>
 *     <enumeration value="good"/>
 *     <enumeration value="very good"/>
 *     <enumeration value="unknown"/>
 *   </restriction>
 * </simpleType>
 * } </pre>
 * 
 */
@XmlType(name = "ShowRating")
@XmlEnum
public enum ShowRating {

    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("very poor")
    VERY_POOR("very poor"),
    @XmlEnumValue("poor")
    POOR("poor"),
    @XmlEnumValue("fair")
    FAIR("fair"),
    @XmlEnumValue("good")
    GOOD("good"),
    @XmlEnumValue("very good")
    VERY_GOOD("very good"),

    /**
     * The value is not known. This value should not be used
     * 					in normal situations. All reasonable attempts should be made to determine
     * 					the appropriate value. Use of this value may result in rejection in some situations.
     * 
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    ShowRating(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ShowRating fromValue(String v) {
        for (ShowRating c: ShowRating.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
