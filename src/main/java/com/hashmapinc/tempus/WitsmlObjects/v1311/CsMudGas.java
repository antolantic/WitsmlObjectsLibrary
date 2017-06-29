package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * WITSML Mud Gas Component Schema
 * 
 * <p>Java class for cs_mudGas complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="cs_mudGas">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="gasAv" type="{http://www.witsml.org/schemas/131}volumePerVolumeMeasure" minOccurs="0"/>
 *         <element name="gasPeak" type="{http://www.witsml.org/schemas/131}volumePerVolumeMeasure" minOccurs="0"/>
 *         <element name="gasPeakType" type="{http://www.witsml.org/schemas/131}GasPeakType" minOccurs="0"/>
 *         <element name="gasBackgnd" type="{http://www.witsml.org/schemas/131}volumePerVolumeMeasure" minOccurs="0"/>
 *         <element name="gasConAv" type="{http://www.witsml.org/schemas/131}volumePerVolumeMeasure" minOccurs="0"/>
 *         <element name="gasConMx" type="{http://www.witsml.org/schemas/131}volumePerVolumeMeasure" minOccurs="0"/>
 *         <element name="gasTrip" type="{http://www.witsml.org/schemas/131}volumePerVolumeMeasure" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * } </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cs_mudGas", propOrder = {
    "gasAv",
    "gasPeak",
    "gasPeakType",
    "gasBackgnd",
    "gasConAv",
    "gasConMx",
    "gasTrip"
})
public class CsMudGas {

    protected VolumePerVolumeMeasure gasAv;
    protected VolumePerVolumeMeasure gasPeak;
    @XmlSchemaType(name = "string")
    protected GasPeakType gasPeakType;
    protected VolumePerVolumeMeasure gasBackgnd;
    protected VolumePerVolumeMeasure gasConAv;
    protected VolumePerVolumeMeasure gasConMx;
    protected VolumePerVolumeMeasure gasTrip;

    /**
     * Gets the value of the gasAv property.
     * 
     * @return
     *     possible object is
     *     {@link VolumePerVolumeMeasure }
     *     
     */
    public VolumePerVolumeMeasure getGasAv() {
        return gasAv;
    }

    /**
     * Sets the value of the gasAv property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumePerVolumeMeasure }
     *     
     */
    public void setGasAv(VolumePerVolumeMeasure value) {
        this.gasAv = value;
    }

    /**
     * Gets the value of the gasPeak property.
     * 
     * @return
     *     possible object is
     *     {@link VolumePerVolumeMeasure }
     *     
     */
    public VolumePerVolumeMeasure getGasPeak() {
        return gasPeak;
    }

    /**
     * Sets the value of the gasPeak property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumePerVolumeMeasure }
     *     
     */
    public void setGasPeak(VolumePerVolumeMeasure value) {
        this.gasPeak = value;
    }

    /**
     * Gets the value of the gasPeakType property.
     * 
     * @return
     *     possible object is
     *     {@link GasPeakType }
     *     
     */
    public GasPeakType getGasPeakType() {
        return gasPeakType;
    }

    /**
     * Sets the value of the gasPeakType property.
     * 
     * @param value
     *     allowed object is
     *     {@link GasPeakType }
     *     
     */
    public void setGasPeakType(GasPeakType value) {
        this.gasPeakType = value;
    }

    /**
     * Gets the value of the gasBackgnd property.
     * 
     * @return
     *     possible object is
     *     {@link VolumePerVolumeMeasure }
     *     
     */
    public VolumePerVolumeMeasure getGasBackgnd() {
        return gasBackgnd;
    }

    /**
     * Sets the value of the gasBackgnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumePerVolumeMeasure }
     *     
     */
    public void setGasBackgnd(VolumePerVolumeMeasure value) {
        this.gasBackgnd = value;
    }

    /**
     * Gets the value of the gasConAv property.
     * 
     * @return
     *     possible object is
     *     {@link VolumePerVolumeMeasure }
     *     
     */
    public VolumePerVolumeMeasure getGasConAv() {
        return gasConAv;
    }

    /**
     * Sets the value of the gasConAv property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumePerVolumeMeasure }
     *     
     */
    public void setGasConAv(VolumePerVolumeMeasure value) {
        this.gasConAv = value;
    }

    /**
     * Gets the value of the gasConMx property.
     * 
     * @return
     *     possible object is
     *     {@link VolumePerVolumeMeasure }
     *     
     */
    public VolumePerVolumeMeasure getGasConMx() {
        return gasConMx;
    }

    /**
     * Sets the value of the gasConMx property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumePerVolumeMeasure }
     *     
     */
    public void setGasConMx(VolumePerVolumeMeasure value) {
        this.gasConMx = value;
    }

    /**
     * Gets the value of the gasTrip property.
     * 
     * @return
     *     possible object is
     *     {@link VolumePerVolumeMeasure }
     *     
     */
    public VolumePerVolumeMeasure getGasTrip() {
        return gasTrip;
    }

    /**
     * Sets the value of the gasTrip property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumePerVolumeMeasure }
     *     
     */
    public void setGasTrip(VolumePerVolumeMeasure value) {
        this.gasTrip = value;
    }

}
