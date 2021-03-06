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
 * <p>Java class for WellNamingSystem.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre> {@code
 * <simpleType name="WellNamingSystem">
 *   <restriction base="{http://www.witsml.org/schemas/1series}abstractTypeEnum">
 *     <enumeration value="DTI"/>
 *     <enumeration value="API"/>
 *     <enumeration value="NPD code"/>
 *     <enumeration value="NPD number"/>
 *     <enumeration value="local field"/>
 *     <enumeration value="prospect"/>
 *     <enumeration value="unknown"/>
 *   </restriction>
 * </simpleType>
 * } </pre>
 * 
 */
@XmlType(name = "WellNamingSystem")
@XmlEnum
public enum WellNamingSystem {


    /**
     * United Kingdom Department of Trade and Industry
     * 
     */
    DTI("DTI"),

    /**
     * American Petroleum Institute well number (10,12 or 14 digits).
     * 
     */
    API("API"),

    /**
     * Norwegian Petroleum Directorate wellbore code
     * 
     */
    @XmlEnumValue("NPD code")
    NPD_CODE("NPD code"),

    /**
     * Norwegian Petroleum Directorate wellbore number
     * 
     */
    @XmlEnumValue("NPD number")
    NPD_NUMBER("NPD number"),

    /**
     * A name assigned that is meaningful within the context of 
     * 					the field in which it is located. There are not specifications on how to 
     * 					form this name.
     * 
     */
    @XmlEnumValue("local field")
    LOCAL_FIELD("local field"),

    /**
     * A name assigned to a prospect - a well that has not yet been drilled.
     * 
     */
    @XmlEnumValue("prospect")
    PROSPECT("prospect"),

    /**
     * The naming system is not known.
     * 
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    WellNamingSystem(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WellNamingSystem fromValue(String v) {
        for (WellNamingSystem c: WellNamingSystem.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
