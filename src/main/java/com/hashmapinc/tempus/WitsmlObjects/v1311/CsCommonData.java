package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 *  WITSML - Common Data Component Schema 
 * 
 * <p>Java class for cs_commonData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="cs_commonData">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="sourceName" type="{http://www.witsml.org/schemas/131}nameString" minOccurs="0"/>
 *         <element name="dTimCreation" type="{http://www.witsml.org/schemas/131}timestamp" minOccurs="0"/>
 *         <element name="dTimLastChange" type="{http://www.witsml.org/schemas/131}timestamp" minOccurs="0"/>
 *         <element name="itemState" type="{http://www.witsml.org/schemas/131}ItemState" minOccurs="0"/>
 *         <element name="comments" type="{http://www.witsml.org/schemas/131}commentString" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * } </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cs_commonData", propOrder = {
    "sourceName",
    "dTimCreation",
    "dTimLastChange",
    "itemState",
    "comments"
})
public class CsCommonData {

    protected String sourceName;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dTimCreation;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dTimLastChange;
    @XmlSchemaType(name = "string")
    protected ItemState itemState;
    protected String comments;

    /**
     * Gets the value of the sourceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceName() {
        return sourceName;
    }

    /**
     * Sets the value of the sourceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceName(String value) {
        this.sourceName = value;
    }

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

    /**
     * Gets the value of the itemState property.
     * 
     * @return
     *     possible object is
     *     {@link ItemState }
     *     
     */
    public ItemState getItemState() {
        return itemState;
    }

    /**
     * Sets the value of the itemState property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemState }
     *     
     */
    public void setItemState(ItemState value) {
        this.itemState = value;
    }

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
    }

}
