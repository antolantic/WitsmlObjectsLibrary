//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.26 at 03:00:38 PM CDT 
//


package com.hashmapinc.tempus.WitsmlObjects.v1411;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AnglePerLengthUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre> {@code
 * <simpleType name="AnglePerLengthUom">
 *   <restriction base="{http://www.witsml.org/schemas/1series}abstractUomEnum">
 *     <enumeration value="rad/m"/>
 *     <enumeration value="dega/30ft"/>
 *     <enumeration value="dega/ft"/>
 *     <enumeration value="dega/100ft"/>
 *     <enumeration value="dega/m"/>
 *     <enumeration value="dega/30m"/>
 *     <enumeration value="rad/ft"/>
 *   </restriction>
 * </simpleType>
 * } </pre>
 * 
 */
@XmlType(name = "AnglePerLengthUom")
@XmlEnum
public enum AnglePerLengthUom {

    @XmlEnumValue("rad/m")
    RAD_M("rad/m"),
    @XmlEnumValue("dega/30ft")
    DEGA_30_FT("dega/30ft"),
    @XmlEnumValue("dega/ft")
    DEGA_FT("dega/ft"),
    @XmlEnumValue("dega/100ft")
    DEGA_100_FT("dega/100ft"),
    @XmlEnumValue("dega/m")
    DEGA_M("dega/m"),
    @XmlEnumValue("dega/30m")
    DEGA_30_M("dega/30m"),
    @XmlEnumValue("rad/ft")
    RAD_FT("rad/ft");
    private final String value;

    AnglePerLengthUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AnglePerLengthUom fromValue(String v) {
        for (AnglePerLengthUom c: AnglePerLengthUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
