//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.26 at 03:00:38 PM CDT 
//


package com.hashmapinc.tempus.WitsmlObjects.v1411;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for powerMeasure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="powerMeasure">
 *   <simpleContent>
 *     <extension base="<http://www.witsml.org/schemas/1series>abstractMeasure">
 *       <attribute name="uom" use="required" type="{http://www.witsml.org/schemas/1series}PowerUom" />
 *     </extension>
 *   </simpleContent>
 * </complexType>
 * } </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "powerMeasure")
public class PowerMeasure
    extends AbstractMeasure
{

    @XmlAttribute(name = "uom", required = true)
    protected PowerUom uom;

    /**
     * Gets the value of the uom property.
     * 
     * @return
     *     possible object is
     *     {@link PowerUom }
     *     
     */
    public PowerUom getUom() {
        return uom;
    }

    /**
     * Sets the value of the uom property.
     * 
     * @param value
     *     allowed object is
     *     {@link PowerUom }
     *     
     */
    public void setUom(PowerUom value) {
        this.uom = value;
    }

}
