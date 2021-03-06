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
 * <p>Java class for ElectricPotentialUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre> {@code
 * <simpleType name="ElectricPotentialUom">
 *   <restriction base="{http://www.witsml.org/schemas/1series}abstractUomEnum">
 *     <enumeration value="V"/>
 *     <enumeration value="kV"/>
 *     <enumeration value="mV"/>
 *     <enumeration value="MV"/>
 *     <enumeration value="uV"/>
 *   </restriction>
 * </simpleType>
 * } </pre>
 * 
 */
@XmlType(name = "ElectricPotentialUom")
@XmlEnum
public enum ElectricPotentialUom {

    V("V"),
    @XmlEnumValue("kV")
    K_V("kV"),
    @XmlEnumValue("mV")
    M_V("mV"),
    MV("MV"),
    @XmlEnumValue("uV")
    U_V("uV");
    private final String value;

    ElectricPotentialUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ElectricPotentialUom fromValue(String v) {
        for (ElectricPotentialUom c: ElectricPotentialUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
