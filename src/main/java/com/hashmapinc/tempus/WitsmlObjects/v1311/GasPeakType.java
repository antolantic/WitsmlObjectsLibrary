package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GasPeakType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre> {@code
 * <simpleType name="GasPeakType">
 *   <restriction base="{http://www.witsml.org/schemas/131}abstractTypeEnum">
 *     <enumeration value="circulating background gas"/>
 *     <enumeration value="connection gas"/>
 *     <enumeration value="drilling background gas"/>
 *     <enumeration value="drilling gas peak"/>
 *     <enumeration value="flow check gas"/>
 *     <enumeration value="no readings"/>
 *     <enumeration value="other"/>
 *     <enumeration value="shut down gas"/>
 *     <enumeration value="trip gas"/>
 *     <enumeration value="unknown"/>
 *   </restriction>
 * </simpleType>
 * } </pre>
 * 
 */
@XmlType(name = "GasPeakType")
@XmlEnum
public enum GasPeakType {

    @XmlEnumValue("circulating background gas")
    CIRCULATING_BACKGROUND_GAS("circulating background gas"),
    @XmlEnumValue("connection gas")
    CONNECTION_GAS("connection gas"),
    @XmlEnumValue("drilling background gas")
    DRILLING_BACKGROUND_GAS("drilling background gas"),
    @XmlEnumValue("drilling gas peak")
    DRILLING_GAS_PEAK("drilling gas peak"),
    @XmlEnumValue("flow check gas")
    FLOW_CHECK_GAS("flow check gas"),
    @XmlEnumValue("no readings")
    NO_READINGS("no readings"),
    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("shut down gas")
    SHUT_DOWN_GAS("shut down gas"),
    @XmlEnumValue("trip gas")
    TRIP_GAS("trip gas"),

    /**
     * The value is not known. This value should not be used
     * 					in normal situations. All reasonable attempts should be made to determine
     * 					the appropriate value. Use of this value may result in rejection in some situations.
     * 
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    GasPeakType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GasPeakType fromValue(String v) {
        for (GasPeakType c: GasPeakType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
