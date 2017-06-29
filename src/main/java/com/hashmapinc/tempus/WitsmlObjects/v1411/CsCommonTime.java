//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.26 at 03:00:38 PM CDT 
//


package com.hashmapinc.tempus.WitsmlObjects.v1411;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 *  WITSML - Common Time Component Schema 
 * 
 * <p>Java class for cs_commonTime complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="cs_commonTime">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="dTimCreation" type="{http://www.witsml.org/schemas/1series}timestamp" minOccurs="0"/>
 *         <element name="dTimLastChange" type="{http://www.witsml.org/schemas/1series}timestamp" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * } </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cs_commonTime", propOrder = {
    "dTimCreation",
    "dTimLastChange"
})
public class CsCommonTime {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dTimCreation;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dTimLastChange;

    /**
     * Gets the value of the dTimCreation property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDTimCreation() {
        return dTimCreation;
    }

    /**
     * Sets the value of the dTimCreation property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDTimCreation(XMLGregorianCalendar value) {
        this.dTimCreation = value;
    }

    /**
     * Gets the value of the dTimLastChange property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDTimLastChange() {
        return dTimLastChange;
    }

    /**
     * Sets the value of the dTimLastChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDTimLastChange(XMLGregorianCalendar value) {
        this.dTimLastChange = value;
    }

}
