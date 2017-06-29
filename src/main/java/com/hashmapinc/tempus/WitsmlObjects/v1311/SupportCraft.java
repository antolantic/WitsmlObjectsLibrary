package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SupportCraft.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre> {@code
 * <simpleType name="SupportCraft">
 *   <restriction base="{http://www.witsml.org/schemas/131}abstractTypeEnum">
 *     <enumeration value="barge"/>
 *     <enumeration value="standby boat"/>
 *     <enumeration value="helicopter"/>
 *     <enumeration value="supply boat"/>
 *     <enumeration value="truck"/>
 *     <enumeration value="crew vehicle"/>
 *     <enumeration value="tug boat"/>
 *     <enumeration value="unknown"/>
 *   </restriction>
 * </simpleType>
 * } </pre>
 * 
 */
@XmlType(name = "SupportCraft")
@XmlEnum
public enum SupportCraft {

    @XmlEnumValue("barge")
    BARGE("barge"),
    @XmlEnumValue("standby boat")
    STANDBY_BOAT("standby boat"),
    @XmlEnumValue("helicopter")
    HELICOPTER("helicopter"),
    @XmlEnumValue("supply boat")
    SUPPLY_BOAT("supply boat"),
    @XmlEnumValue("truck")
    TRUCK("truck"),
    @XmlEnumValue("crew vehicle")
    CREW_VEHICLE("crew vehicle"),
    @XmlEnumValue("tug boat")
    TUG_BOAT("tug boat"),

    /**
     * The value is not known. This value should not be used
     * 					in normal situations. All reasonable attempts should be made to determine
     * 					the appropriate value. Use of this value may result in rejection in some situations.
     * 
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    SupportCraft(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SupportCraft fromValue(String v) {
        for (SupportCraft c: SupportCraft.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
