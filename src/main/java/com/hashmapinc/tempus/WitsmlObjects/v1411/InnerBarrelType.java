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
 * <p>Java class for InnerBarrelType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre> {@code
 * <simpleType name="InnerBarrelType">
 *   <restriction base="{http://www.witsml.org/schemas/1series}abstractTypeEnum">
 *     <enumeration value="undifferented"/>
 *     <enumeration value="aluminum"/>
 *     <enumeration value="gel"/>
 *     <enumeration value="fiberglass"/>
 *     <enumeration value="unknown"/>
 *   </restriction>
 * </simpleType>
 * } </pre>
 * 
 */
@XmlType(name = "InnerBarrelType")
@XmlEnum
public enum InnerBarrelType {


    /**
     * A pipe that is located inside a core barrel to hold the core sample.
     * 
     */
    @XmlEnumValue("undifferented")
    UNDIFFERENTED("undifferented"),

    /**
     * An inner core barrel made of aluminium.
     * 
     */
    @XmlEnumValue("aluminum")
    ALUMINUM("aluminum"),

    /**
     * An inner core barrel that that seals off the core 
     * 					sample using gel as the sealing material.
     * 
     */
    @XmlEnumValue("gel")
    GEL("gel"),

    /**
     * An inner core barrel made of glass fiber reinforced plastic.
     * 
     */
    @XmlEnumValue("fiberglass")
    FIBERGLASS("fiberglass"),

    /**
     * The value is not known. This value should not be used
     * 					in normal situations. All reasonable attempts should be made to determine
     * 					the appropriate value. Use of this value may result in rejection in some situations.
     * 
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    InnerBarrelType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InnerBarrelType fromValue(String v) {
        for (InnerBarrelType c: InnerBarrelType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
