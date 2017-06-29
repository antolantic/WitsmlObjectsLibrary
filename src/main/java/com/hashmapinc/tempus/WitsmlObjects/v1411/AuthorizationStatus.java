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
 * <p>Java class for AuthorizationStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre> {@code
 * <simpleType name="AuthorizationStatus">
 *   <restriction base="{http://www.witsml.org/schemas/1series}abstractTypeEnum">
 *     <enumeration value="draft"/>
 *     <enumeration value="authorized"/>
 *     <enumeration value="superceded"/>
 *     <enumeration value="withdrawn"/>
 *     <enumeration value="unknown"/>
 *   </restriction>
 * </simpleType>
 * } </pre>
 * 
 */
@XmlType(name = "AuthorizationStatus")
@XmlEnum
public enum AuthorizationStatus {


    /**
     * Not yet approved.
     * 
     */
    @XmlEnumValue("draft")
    DRAFT("draft"),

    /**
     * Approved for use.
     * 
     */
    @XmlEnumValue("authorized")
    AUTHORIZED("authorized"),

    /**
     * Obsolete; there is a newer version available.
     * 
     */
    @XmlEnumValue("superceded")
    SUPERCEDED("superceded"),

    /**
     * No longer approved in this or any other version.
     * 
     */
    @XmlEnumValue("withdrawn")
    WITHDRAWN("withdrawn"),

    /**
     * The value is not known. This value should not be used
     * 					in normal situations. All reasonable attempts should be made to determine
     * 					the appropriate value. Use of this value may result in rejection in some situations.
     * 
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    AuthorizationStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AuthorizationStatus fromValue(String v) {
        for (AuthorizationStatus c: AuthorizationStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
