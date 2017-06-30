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
 * <p>Java class for TrajStationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre> {@code
 * <simpleType name="TrajStationType">
 *   <restriction base="{http://www.witsml.org/schemas/1series}abstractTypeEnum">
 *     <enumeration value="azimuth on plane"/>
 *     <enumeration value="buildrate to delta-MD"/>
 *     <enumeration value="buildrate to INCL"/>
 *     <enumeration value="buildrate to MD"/>
 *     <enumeration value="buildrate and turnrate to AZI"/>
 *     <enumeration value="buildrate and turnrate to delta-MD"/>
 *     <enumeration value="buildrate and turnrate to INCL"/>
 *     <enumeration value="buildrate and turnrate to INCL and AZI"/>
 *     <enumeration value="buildrate and turnrate to MD"/>
 *     <enumeration value="buildrate and turnrate to TVD"/>
 *     <enumeration value="buildrate TVD"/>
 *     <enumeration value="casing MD"/>
 *     <enumeration value="casing TVD"/>
 *     <enumeration value="DLS"/>
 *     <enumeration value="DLS to AZI and MD"/>
 *     <enumeration value="DLS to AZI-TVD"/>
 *     <enumeration value="DLS to INCL"/>
 *     <enumeration value="DLS to INCL and AZI"/>
 *     <enumeration value="DLS to INCL and MD"/>
 *     <enumeration value="DLS to INCL and TVD"/>
 *     <enumeration value="DLS to NS, EW and TVD"/>
 *     <enumeration value="DLS and toolface to AZI"/>
 *     <enumeration value="DLS and toolface to delta-MD"/>
 *     <enumeration value="DLS and toolface to INCL"/>
 *     <enumeration value="DLS and toolface to INCL-AZI"/>
 *     <enumeration value="DLS and toolface to MD"/>
 *     <enumeration value="DLS and toolface to TVD"/>
 *     <enumeration value="formation MD"/>
 *     <enumeration value="formation TVD"/>
 *     <enumeration value="gyro inertial"/>
 *     <enumeration value="gyro MWD"/>
 *     <enumeration value="gyro north seeking"/>
 *     <enumeration value="hold to delta-MD"/>
 *     <enumeration value="hold to MD"/>
 *     <enumeration value="hold to TVD"/>
 *     <enumeration value="INCL, AZI and TVD"/>
 *     <enumeration value="magnetic multi-shot"/>
 *     <enumeration value="magnetic MWD"/>
 *     <enumeration value="magnetic single shot"/>
 *     <enumeration value="marker MD"/>
 *     <enumeration value="marker TVD"/>
 *     <enumeration value="NS, EW and TVD"/>
 *     <enumeration value="target center"/>
 *     <enumeration value="target offset"/>
 *     <enumeration value="tie in point"/>
 *     <enumeration value="turnrate to AZI"/>
 *     <enumeration value="turnrate to delta-MD"/>
 *     <enumeration value="turnrate to MD"/>
 *     <enumeration value="turnrate to TVD"/>
 *     <enumeration value="unknown"/>
 *   </restriction>
 * </simpleType>
 * } </pre>
 * 
 */
@XmlType(name = "TrajStationType")
@XmlEnum
public enum TrajStationType {


    /**
     * Section terminates at a given azimuth on a given plane target, requires target id
     * 
     */
    @XmlEnumValue("azimuth on plane")
    AZIMUTH_ON_PLANE("azimuth on plane"),

    /**
     * Section follows a given buildrate to a specified delta measured depth
     * 
     */
    @XmlEnumValue("buildrate to delta-MD")
    BUILDRATE_TO_DELTA_MD("buildrate to delta-MD"),

    /**
     * Section follows a given buildrate to a specified inclination
     * 
     */
    @XmlEnumValue("buildrate to INCL")
    BUILDRATE_TO_INCL("buildrate to INCL"),

    /**
     * Section follows a given buildrate to a specified measured depth
     * 
     */
    @XmlEnumValue("buildrate to MD")
    BUILDRATE_TO_MD("buildrate to MD"),

    /**
     * Section follows a given buildrate and turnrate to a specified azimuth
     * 
     */
    @XmlEnumValue("buildrate and turnrate to AZI")
    BUILDRATE_AND_TURNRATE_TO_AZI("buildrate and turnrate to AZI"),

    /**
     * Section follows a given buildrate and turnrate to a specified delta measured depth
     * 
     */
    @XmlEnumValue("buildrate and turnrate to delta-MD")
    BUILDRATE_AND_TURNRATE_TO_DELTA_MD("buildrate and turnrate to delta-MD"),

    /**
     * Section follows a given buildrate and turnrate to a specified inclination
     * 
     */
    @XmlEnumValue("buildrate and turnrate to INCL")
    BUILDRATE_AND_TURNRATE_TO_INCL("buildrate and turnrate to INCL"),

    /**
     * Section follows a given buildrate and turnrate to a specified inclination and azimuth
     * 
     */
    @XmlEnumValue("buildrate and turnrate to INCL and AZI")
    BUILDRATE_AND_TURNRATE_TO_INCL_AND_AZI("buildrate and turnrate to INCL and AZI"),

    /**
     * Section follows a given buildrate and turnrate to a specified measured depth
     * 
     */
    @XmlEnumValue("buildrate and turnrate to MD")
    BUILDRATE_AND_TURNRATE_TO_MD("buildrate and turnrate to MD"),

    /**
     * Section follows a given buildrate and turnrate to a specified TVD
     * 
     */
    @XmlEnumValue("buildrate and turnrate to TVD")
    BUILDRATE_AND_TURNRATE_TO_TVD("buildrate and turnrate to TVD"),

    /**
     * Section follows a given buildrate to a specified TVD
     * 
     */
    @XmlEnumValue("buildrate TVD")
    BUILDRATE_TVD("buildrate TVD"),

    /**
     * Measured depth casing point, can be inserted within actual survey stations also
     * 
     */
    @XmlEnumValue("casing MD")
    CASING_MD("casing MD"),

    /**
     * TVD casing point, can be inserted within actual survey stations also
     * 
     */
    @XmlEnumValue("casing TVD")
    CASING_TVD("casing TVD"),

    /**
     * Section follows a given dogleg severity 
     * 
     */
    DLS("DLS"),

    /**
     * Section follows a given dogleg severity to a specified measured depth and azimuth
     * 
     */
    @XmlEnumValue("DLS to AZI and MD")
    DLS_TO_AZI_AND_MD("DLS to AZI and MD"),

    /**
     * Section follows a given dogleg severity until a specified TVD and Azimuth
     * 
     */
    @XmlEnumValue("DLS to AZI-TVD")
    DLS_TO_AZI_TVD("DLS to AZI-TVD"),

    /**
     * Section follows a given dogleg severity until a specified Inclination
     * 
     */
    @XmlEnumValue("DLS to INCL")
    DLS_TO_INCL("DLS to INCL"),

    /**
     * Section follows a given dogleg severity to a inclination and azimuth
     * 
     */
    @XmlEnumValue("DLS to INCL and AZI")
    DLS_TO_INCL_AND_AZI("DLS to INCL and AZI"),

    /**
     * Section follows a given dogleg severity to a specified measured depth and inclination
     * 
     */
    @XmlEnumValue("DLS to INCL and MD")
    DLS_TO_INCL_AND_MD("DLS to INCL and MD"),

    /**
     * Section follows a given dogleg severity until a specified TVD and Inclination
     * 
     */
    @XmlEnumValue("DLS to INCL and TVD")
    DLS_TO_INCL_AND_TVD("DLS to INCL and TVD"),

    /**
     * Section follows a given dogleg severity to a specified target TVD, NS, EW
     * 
     */
    @XmlEnumValue("DLS to NS, EW and TVD")
    DLS_TO_NS_EW_AND_TVD("DLS to NS, EW and TVD"),

    /**
     * Section follows a given toolface angle and  dogleg severity to a specified azimuth
     * 
     */
    @XmlEnumValue("DLS and toolface to AZI")
    DLS_AND_TOOLFACE_TO_AZI("DLS and toolface to AZI"),

    /**
     * Section follows a given toolface angle and dogleg severity to a specified delta measured depth
     * 
     */
    @XmlEnumValue("DLS and toolface to delta-MD")
    DLS_AND_TOOLFACE_TO_DELTA_MD("DLS and toolface to delta-MD"),

    /**
     * Section follows a given toolface angle and dogleg severity to a specified inclination
     * 
     */
    @XmlEnumValue("DLS and toolface to INCL")
    DLS_AND_TOOLFACE_TO_INCL("DLS and toolface to INCL"),

    /**
     * Section follows a given toolface angle and dogleg severity to a specified inclination and azimuth
     * 
     */
    @XmlEnumValue("DLS and toolface to INCL-AZI")
    DLS_AND_TOOLFACE_TO_INCL_AZI("DLS and toolface to INCL-AZI"),

    /**
     * Section follows a given toolface angle and dogleg severity to a specified measured depth
     * 
     */
    @XmlEnumValue("DLS and toolface to MD")
    DLS_AND_TOOLFACE_TO_MD("DLS and toolface to MD"),

    /**
     * Section follows a given toolface angle and DLS to a specified TVD
     * 
     */
    @XmlEnumValue("DLS and toolface to TVD")
    DLS_AND_TOOLFACE_TO_TVD("DLS and toolface to TVD"),

    /**
     * Measured depth formation, can be inserted within actual survey stations also
     * 
     */
    @XmlEnumValue("formation MD")
    FORMATION_MD("formation MD"),

    /**
     * TVD formation, can be inserted within actual survey stations also
     * 
     */
    @XmlEnumValue("formation TVD")
    FORMATION_TVD("formation TVD"),

    /**
     * DEPRECATED. Inertial Gyro
     * 
     */
    @XmlEnumValue("gyro inertial")
    GYRO_INERTIAL("gyro inertial"),

    /**
     * DEPRECATED. MWD Gyro measurement
     * 
     */
    @XmlEnumValue("gyro MWD")
    GYRO_MWD("gyro MWD"),

    /**
     * DEPRECATED. North seeking gyro
     * 
     */
    @XmlEnumValue("gyro north seeking")
    GYRO_NORTH_SEEKING("gyro north seeking"),

    /**
     * Section holds angle, azimuth to a specified delta measured depth
     * 
     */
    @XmlEnumValue("hold to delta-MD")
    HOLD_TO_DELTA_MD("hold to delta-MD"),

    /**
     * Section holds angle, azimuth to a specified measured depth
     * 
     */
    @XmlEnumValue("hold to MD")
    HOLD_TO_MD("hold to MD"),

    /**
     * Section holds angle, azimuth to a specified TVD
     * 
     */
    @XmlEnumValue("hold to TVD")
    HOLD_TO_TVD("hold to TVD"),

    /**
     * Section follows a continuous curve to a specified inclination, azimuth and measured depth
     * 
     */
    @XmlEnumValue("INCL, AZI and TVD")
    INCL_AZI_AND_TVD("INCL, AZI and TVD"),

    /**
     * DEPRECATED. Magnetic Multi shot
     * 
     */
    @XmlEnumValue("magnetic multi-shot")
    MAGNETIC_MULTI_SHOT("magnetic multi-shot"),

    /**
     * DEPRECATED. Measurements while Drilling tool, magnetic
     * 
     */
    @XmlEnumValue("magnetic MWD")
    MAGNETIC_MWD("magnetic MWD"),

    /**
     * DEPRECATED. Magnetic Single shot
     * 
     */
    @XmlEnumValue("magnetic single shot")
    MAGNETIC_SINGLE_SHOT("magnetic single shot"),

    /**
     * Measured depth marker, can be inserted within actual survey stations also
     * 
     */
    @XmlEnumValue("marker MD")
    MARKER_MD("marker MD"),

    /**
     * TVD marker, can be inserted within actual survey stations also
     * 
     */
    @XmlEnumValue("marker TVD")
    MARKER_TVD("marker TVD"),

    /**
     * Specified as TVD, NS, EW, could be used for point or drilling target (non geological target)
     * 
     */
    @XmlEnumValue("NS, EW and TVD")
    NS_EW_AND_TVD("NS, EW and TVD"),

    /**
     * Specified as TVD, NS, EW of target center, requires target id association
     * 
     */
    @XmlEnumValue("target center")
    TARGET_CENTER("target center"),

    /**
     * Specified as TVD, NS, EW of target offset, requires target id association
     * 
     */
    @XmlEnumValue("target offset")
    TARGET_OFFSET("target offset"),

    /**
     * Tie in point for the survey
     * 
     */
    @XmlEnumValue("tie in point")
    TIE_IN_POINT("tie in point"),

    /**
     * Section follows a given turn rate to a azimuth
     * 
     */
    @XmlEnumValue("turnrate to AZI")
    TURNRATE_TO_AZI("turnrate to AZI"),

    /**
     * Section follows a given turn rate to a given delta measured depth
     * 
     */
    @XmlEnumValue("turnrate to delta-MD")
    TURNRATE_TO_DELTA_MD("turnrate to delta-MD"),

    /**
     * Section follows a given turn rate to a given measured depth
     * 
     */
    @XmlEnumValue("turnrate to MD")
    TURNRATE_TO_MD("turnrate to MD"),

    /**
     * Section follows a given turn rate to a given TVD
     * 
     */
    @XmlEnumValue("turnrate to TVD")
    TURNRATE_TO_TVD("turnrate to TVD"),

    /**
     * The value is not known. This value should not be used
     * 					in normal situations. All reasonable attempts should be made to determine
     * 					the appropriate value. Use of this value may result in rejection in some situations.
     * 
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    TrajStationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TrajStationType fromValue(String v) {
        for (TrajStationType c: TrajStationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}