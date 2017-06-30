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
 * <p>Java class for StimStageFlowPathType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre> {@code
 * <simpleType name="StimStageFlowPathType">
 *   <restriction base="{http://www.witsml.org/schemas/1series}abstractTypeEnum">
 *     <enumeration value="annulus"/>
 *     <enumeration value="casing"/>
 *     <enumeration value="coiled tubing"/>
 *     <enumeration value="drill pipe"/>
 *     <enumeration value="open hole"/>
 *     <enumeration value="tubing"/>
 *     <enumeration value="tubing and annulus"/>
 *     <enumeration value="unknown"/>
 *   </restriction>
 * </simpleType>
 * } </pre>
 * 
 */
@XmlType(name = "StimStageFlowPathType")
@XmlEnum
public enum StimStageFlowPathType {


    /**
     * Fluid is conducted through the annulus, (volume between casing and 					tubing).
     * 
     */
    @XmlEnumValue("annulus")
    ANNULUS("annulus"),

    /**
     * Fluid is conducted through the casing, (no tubing 					present).
     * 
     */
    @XmlEnumValue("casing")
    CASING("casing"),

    /**
     * Fluid is conducted through the coiled tubing, including some length of 
     * 					tubing on the reel at surface.
     * 
     */
    @XmlEnumValue("coiled tubing")
    COILED_TUBING("coiled tubing"),

    /**
     * Fluid is conducted through the drill pipe.
     * 
     */
    @XmlEnumValue("drill pipe")
    DRILL_PIPE("drill pipe"),

    /**
     * Fluid is conducted through the open hole.
     * 
     */
    @XmlEnumValue("open hole")
    OPEN_HOLE("open hole"),

    /**
     * Fluid is conducted through the tubing.
     * 
     */
    @XmlEnumValue("tubing")
    TUBING("tubing"),

    /**
     * Fluid is conducted through 
     * 					both the tubing and annulus, simultaneously.
     * 
     */
    @XmlEnumValue("tubing and annulus")
    TUBING_AND_ANNULUS("tubing and annulus"),

    /**
     * The value is not known. This value should not be used
     * 					in normal situations. All reasonable attempts should be made to determine
     * 					the appropriate value. Use of this value may result in rejection in some 					situations.
     * 
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    StimStageFlowPathType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StimStageFlowPathType fromValue(String v) {
        for (StimStageFlowPathType c: StimStageFlowPathType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}