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
 * <p>Java class for ElectricCurrentUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre> {@code
 * <simpleType name="ElectricCurrentUom">
 *   <restriction base="{http://www.witsml.org/schemas/1series}abstractUomEnum">
 *     <enumeration value="A"/>
 *     <enumeration value="MA"/>
 *     <enumeration value="kA"/>
 *     <enumeration value="mA"/>
 *     <enumeration value="nA"/>
 *     <enumeration value="pA"/>
 *     <enumeration value="uA"/>
 *   </restriction>
 * </simpleType>
 * } </pre>
 * 
 */
@XmlType(name = "ElectricCurrentUom")
@XmlEnum
public enum ElectricCurrentUom {

    A("A"),
    MA("MA"),
    @XmlEnumValue("kA")
    K_A("kA"),
    @XmlEnumValue("mA")
    M_A("mA"),
    @XmlEnumValue("nA")
    N_A("nA"),
    @XmlEnumValue("pA")
    P_A("pA"),
    @XmlEnumValue("uA")
    U_A("uA");
    private final String value;

    ElectricCurrentUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ElectricCurrentUom fromValue(String v) {
        for (ElectricCurrentUom c: ElectricCurrentUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
