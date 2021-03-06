package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 *  WITSML - Cement Pump Schedule Component Schema 
 * 
 * <p>Java class for cs_cementPumpSchedule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="cs_cementPumpSchedule">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="eTimPump" type="{http://www.witsml.org/schemas/131}timeMeasure" minOccurs="0"/>
 *         <element name="ratePump" type="{http://www.witsml.org/schemas/131}volumeFlowRateMeasure" minOccurs="0"/>
 *         <element name="volPump" type="{http://www.witsml.org/schemas/131}volumeMeasure" minOccurs="0"/>
 *         <element name="strokePump" type="{http://www.witsml.org/schemas/131}nonNegativeCount" minOccurs="0"/>
 *         <element name="presBack" type="{http://www.witsml.org/schemas/131}pressureMeasure" minOccurs="0"/>
 *         <element name="eTimShutdown" type="{http://www.witsml.org/schemas/131}timeMeasure" minOccurs="0"/>
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
@XmlType(name = "cs_cementPumpSchedule", propOrder = {
    "eTimPump",
    "ratePump",
    "volPump",
    "strokePump",
    "presBack",
    "eTimShutdown",
    "comments"
})
public class CsCementPumpSchedule {

    protected TimeMeasure eTimPump;
    protected VolumeFlowRateMeasure ratePump;
    protected VolumeMeasure volPump;
    protected Short strokePump;
    protected PressureMeasure presBack;
    protected TimeMeasure eTimShutdown;
    protected String comments;

    /**
     * Gets the value of the eTimPump property.
     * 
     * @return
     *     possible object is
     *     {@link TimeMeasure }
     *     
     */
    public TimeMeasure getETimPump() {
        return eTimPump;
    }

    /**
     * Sets the value of the eTimPump property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeMeasure }
     *     
     */
    public void setETimPump(TimeMeasure value) {
        this.eTimPump = value;
    }

    /**
     * Gets the value of the ratePump property.
     * 
     * @return
     *     possible object is
     *     {@link VolumeFlowRateMeasure }
     *     
     */
    public VolumeFlowRateMeasure getRatePump() {
        return ratePump;
    }

    /**
     * Sets the value of the ratePump property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeFlowRateMeasure }
     *     
     */
    public void setRatePump(VolumeFlowRateMeasure value) {
        this.ratePump = value;
    }

    /**
     * Gets the value of the volPump property.
     * 
     * @return
     *     possible object is
     *     {@link VolumeMeasure }
     *     
     */
    public VolumeMeasure getVolPump() {
        return volPump;
    }

    /**
     * Sets the value of the volPump property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeMeasure }
     *     
     */
    public void setVolPump(VolumeMeasure value) {
        this.volPump = value;
    }

    /**
     * Gets the value of the strokePump property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getStrokePump() {
        return strokePump;
    }

    /**
     * Sets the value of the strokePump property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setStrokePump(Short value) {
        this.strokePump = value;
    }

    /**
     * Gets the value of the presBack property.
     * 
     * @return
     *     possible object is
     *     {@link PressureMeasure }
     *     
     */
    public PressureMeasure getPresBack() {
        return presBack;
    }

    /**
     * Sets the value of the presBack property.
     * 
     * @param value
     *     allowed object is
     *     {@link PressureMeasure }
     *     
     */
    public void setPresBack(PressureMeasure value) {
        this.presBack = value;
    }

    /**
     * Gets the value of the eTimShutdown property.
     * 
     * @return
     *     possible object is
     *     {@link TimeMeasure }
     *     
     */
    public TimeMeasure getETimShutdown() {
        return eTimShutdown;
    }

    /**
     * Sets the value of the eTimShutdown property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeMeasure }
     *     
     */
    public void setETimShutdown(TimeMeasure value) {
        this.eTimShutdown = value;
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
