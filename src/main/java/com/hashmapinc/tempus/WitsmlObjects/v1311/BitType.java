package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BitType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre> {@code
 * <simpleType name="BitType">
 *   <restriction base="{http://www.witsml.org/schemas/131}abstractTypeEnum">
 *     <enumeration value="diamond"/>
 *     <enumeration value="diamond core"/>
 *     <enumeration value="insert roller cone"/>
 *     <enumeration value="PDC"/>
 *     <enumeration value="PDC core"/>
 *     <enumeration value="roller cone"/>
 *     <enumeration value="unknown"/>
 *   </restriction>
 * </simpleType>
 * } </pre>
 * 
 */
@XmlType(name = "BitType")
@XmlEnum
public enum BitType {


    /**
     * Diamond bit
     * 
     */
    @XmlEnumValue("diamond")
    DIAMOND("diamond"),

    /**
     * Diamond core bit
     * 
     */
    @XmlEnumValue("diamond core")
    DIAMOND_CORE("diamond core"),

    /**
     * Insert roller cone bit
     * 
     */
    @XmlEnumValue("insert roller cone")
    INSERT_ROLLER_CONE("insert roller cone"),

    /**
     * polycrystalline diamond compact fixed cutter bit
     * 
     */
    PDC("PDC"),

    /**
     * polycrystalline diamond compact core bit
     * 
     */
    @XmlEnumValue("PDC core")
    PDC_CORE("PDC core"),

    /**
     * Milled tooth roller cone bit
     * 
     */
    @XmlEnumValue("roller cone")
    ROLLER_CONE("roller cone"),

    /**
     * The value is not known. This value should not be used
     * 					in normal situations. All reasonable attempts should be made to determine
     * 					the appropriate value. Use of this value may result in rejection in some situations.
     * 
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    BitType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BitType fromValue(String v) {
        for (BitType c: BitType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
