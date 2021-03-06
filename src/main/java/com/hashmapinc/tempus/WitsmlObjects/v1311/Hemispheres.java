package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Hemispheres.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre> {@code
 * <simpleType name="Hemispheres">
 *   <restriction base="{http://www.witsml.org/schemas/131}abstractTypeEnum">
 *     <enumeration value="northern"/>
 *     <enumeration value="southern"/>
 *     <enumeration value="unknown"/>
 *   </restriction>
 * </simpleType>
 * } </pre>
 * 
 */
@XmlType(name = "Hemispheres")
@XmlEnum
public enum Hemispheres {


    /**
     * Northern hemisphere.
     * 
     */
    @XmlEnumValue("northern")
    NORTHERN("northern"),

    /**
     * Southern hemisphere.
     * 
     */
    @XmlEnumValue("southern")
    SOUTHERN("southern"),

    /**
     * The value is not known. This value should not be used
     * 					in normal situations. All reasonable attempts should be made to determine
     * 					the appropriate value. Use of this value may result in rejection in some situations.
     * 
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    Hemispheres(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Hemispheres fromValue(String v) {
        for (Hemispheres c: Hemispheres.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
