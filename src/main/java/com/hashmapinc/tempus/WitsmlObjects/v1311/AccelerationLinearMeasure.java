package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for accelerationLinearMeasure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="accelerationLinearMeasure">
 *   <simpleContent>
 *     <extension base="<http://www.witsml.org/schemas/131>abstractMeasure">
 *       <attribute name="uom" use="required" type="{http://www.witsml.org/schemas/131}accelerationLinearUom" />
 *     </extension>
 *   </simpleContent>
 * </complexType>
 * } </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "accelerationLinearMeasure")
public class AccelerationLinearMeasure
    extends AbstractMeasure
{

    @XmlAttribute(name = "uom", required = true)
    protected AccelerationLinearUom uom;

    /**
     * Gets the value of the uom property.
     * 
     * @return
     *     possible object is
     *     {@link AccelerationLinearUom }
     *     
     */
    public AccelerationLinearUom getUom() {
        return uom;
    }

    /**
     * Sets the value of the uom property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccelerationLinearUom }
     *     
     */
    public void setUom(AccelerationLinearUom value) {
        this.uom = value;
    }

}
