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
 * <p>Java class for ProjectionVariantsObliqueMercator.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre> {@code
 * <simpleType name="ProjectionVariantsObliqueMercator">
 *   <restriction base="{http://www.witsml.org/schemas/1series}abstractTypeEnum">
 *     <enumeration value="default"/>
 *     <enumeration value="rectified"/>
 *     <enumeration value="rectified skew"/>
 *     <enumeration value="rectified skew center origin"/>
 *     <enumeration value="unknown"/>
 *   </restriction>
 * </simpleType>
 * } </pre>
 * 
 */
@XmlType(name = "ProjectionVariantsObliqueMercator")
@XmlEnum
public enum ProjectionVariantsObliqueMercator {

    @XmlEnumValue("default")
    DEFAULT("default"),
    @XmlEnumValue("rectified")
    RECTIFIED("rectified"),
    @XmlEnumValue("rectified skew")
    RECTIFIED_SKEW("rectified skew"),
    @XmlEnumValue("rectified skew center origin")
    RECTIFIED_SKEW_CENTER_ORIGIN("rectified skew center origin"),

    /**
     * The value is not known. This value should not be used
     * 					in normal situations. All reasonable attempts should be made to determine
     * 					the appropriate value. Use of this value may result in rejection in some situations.
     * 
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    ProjectionVariantsObliqueMercator(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProjectionVariantsObliqueMercator fromValue(String v) {
        for (ProjectionVariantsObliqueMercator c: ProjectionVariantsObliqueMercator.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
