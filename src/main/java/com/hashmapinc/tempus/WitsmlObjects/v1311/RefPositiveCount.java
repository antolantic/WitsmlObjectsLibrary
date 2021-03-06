package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * A reference to a index value in another node of the xml hierachy.
 * 			This value represents a foreign key from one element to another.
 * 
 * <p>Java class for refPositiveCount complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="refPositiveCount">
 *   <simpleContent>
 *     <extension base="<http://www.witsml.org/schemas/131>abstractPositiveCount">
 *       <attribute name="uidRef" type="{http://www.witsml.org/schemas/131}refString" />
 *     </extension>
 *   </simpleContent>
 * </complexType>
 * } </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "refPositiveCount", propOrder = {
    "value"
})
public class RefPositiveCount {

    @XmlValue
    protected short value;
    @XmlAttribute(name = "uidRef")
    protected String uidRef;

    /**
     * A positive integer (one based count or index) with a maximum value of 32767 (2-bytes).
     * 
     */
    public short getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     */
    public void setValue(short value) {
        this.value = value;
    }

    /**
     * Gets the value of the uidRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUidRef() {
        return uidRef;
    }

    /**
     * Sets the value of the uidRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUidRef(String value) {
        this.uidRef = value;
    }

}
