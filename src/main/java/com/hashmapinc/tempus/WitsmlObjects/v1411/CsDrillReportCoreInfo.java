//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.26 at 03:00:38 PM CDT 
//


package com.hashmapinc.tempus.WitsmlObjects.v1411;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for cs_drillReportCoreInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="cs_drillReportCoreInfo">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="dTim" type="{http://www.witsml.org/schemas/1series}timestamp" minOccurs="0"/>
 *         <element name="coreNumber" type="{http://www.witsml.org/schemas/1series}nameString" minOccurs="0"/>
 *         <element name="mdTop" type="{http://www.witsml.org/schemas/1series}measuredDepthCoord" minOccurs="0"/>
 *         <element name="mdBottom" type="{http://www.witsml.org/schemas/1series}measuredDepthCoord" minOccurs="0"/>
 *         <element name="tvdTop" type="{http://www.witsml.org/schemas/1series}wellVerticalDepthCoord" minOccurs="0"/>
 *         <element name="tvdBottom" type="{http://www.witsml.org/schemas/1series}wellVerticalDepthCoord" minOccurs="0"/>
 *         <element name="lenRecovered" type="{http://www.witsml.org/schemas/1series}lengthMeasure" minOccurs="0"/>
 *         <element name="recoverPc" type="{http://www.witsml.org/schemas/1series}volumePerVolumeMeasurePercent" minOccurs="0"/>
 *         <element name="lenBarrel" type="{http://www.witsml.org/schemas/1series}lengthMeasure" minOccurs="0"/>
 *         <element name="innerBarrelType" type="{http://www.witsml.org/schemas/1series}InnerBarrelType" minOccurs="0"/>
 *         <element name="coreDescription" type="{http://www.witsml.org/schemas/1series}commentString" minOccurs="0"/>
 *         <element name="extensionNameValue" type="{http://www.witsml.org/schemas/1series}cs_extensionNameValue" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *       <attGroup ref="{http://www.witsml.org/schemas/1series}attgrp_uid"/>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * } </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cs_drillReportCoreInfo", propOrder = {
    "dTim",
    "coreNumber",
    "mdTop",
    "mdBottom",
    "tvdTop",
    "tvdBottom",
    "lenRecovered",
    "recoverPc",
    "lenBarrel",
    "innerBarrelType",
    "coreDescription",
    "extensionNameValue"
})
public class CsDrillReportCoreInfo {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dTim;
    protected String coreNumber;
    protected MeasuredDepthCoord mdTop;
    protected MeasuredDepthCoord mdBottom;
    protected WellVerticalDepthCoord tvdTop;
    protected WellVerticalDepthCoord tvdBottom;
    protected LengthMeasure lenRecovered;
    protected VolumePerVolumeMeasurePercent recoverPc;
    protected LengthMeasure lenBarrel;
    @XmlSchemaType(name = "string")
    protected InnerBarrelType innerBarrelType;
    protected String coreDescription;
    protected List<CsExtensionNameValue> extensionNameValue;
    @XmlAttribute(name = "uid")
    protected String uid;

    /**
     * Gets the value of the dTim property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDTim() {
        return dTim;
    }

    /**
     * Sets the value of the dTim property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDTim(XMLGregorianCalendar value) {
        this.dTim = value;
    }

    /**
     * Gets the value of the coreNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoreNumber() {
        return coreNumber;
    }

    /**
     * Sets the value of the coreNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoreNumber(String value) {
        this.coreNumber = value;
    }

    /**
     * Gets the value of the mdTop property.
     * 
     * @return
     *     possible object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public MeasuredDepthCoord getMdTop() {
        return mdTop;
    }

    /**
     * Sets the value of the mdTop property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public void setMdTop(MeasuredDepthCoord value) {
        this.mdTop = value;
    }

    /**
     * Gets the value of the mdBottom property.
     * 
     * @return
     *     possible object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public MeasuredDepthCoord getMdBottom() {
        return mdBottom;
    }

    /**
     * Sets the value of the mdBottom property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public void setMdBottom(MeasuredDepthCoord value) {
        this.mdBottom = value;
    }

    /**
     * Gets the value of the tvdTop property.
     * 
     * @return
     *     possible object is
     *     {@link WellVerticalDepthCoord }
     *     
     */
    public WellVerticalDepthCoord getTvdTop() {
        return tvdTop;
    }

    /**
     * Sets the value of the tvdTop property.
     * 
     * @param value
     *     allowed object is
     *     {@link WellVerticalDepthCoord }
     *     
     */
    public void setTvdTop(WellVerticalDepthCoord value) {
        this.tvdTop = value;
    }

    /**
     * Gets the value of the tvdBottom property.
     * 
     * @return
     *     possible object is
     *     {@link WellVerticalDepthCoord }
     *     
     */
    public WellVerticalDepthCoord getTvdBottom() {
        return tvdBottom;
    }

    /**
     * Sets the value of the tvdBottom property.
     * 
     * @param value
     *     allowed object is
     *     {@link WellVerticalDepthCoord }
     *     
     */
    public void setTvdBottom(WellVerticalDepthCoord value) {
        this.tvdBottom = value;
    }

    /**
     * Gets the value of the lenRecovered property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getLenRecovered() {
        return lenRecovered;
    }

    /**
     * Sets the value of the lenRecovered property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setLenRecovered(LengthMeasure value) {
        this.lenRecovered = value;
    }

    /**
     * Gets the value of the recoverPc property.
     * 
     * @return
     *     possible object is
     *     {@link VolumePerVolumeMeasurePercent }
     *     
     */
    public VolumePerVolumeMeasurePercent getRecoverPc() {
        return recoverPc;
    }

    /**
     * Sets the value of the recoverPc property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumePerVolumeMeasurePercent }
     *     
     */
    public void setRecoverPc(VolumePerVolumeMeasurePercent value) {
        this.recoverPc = value;
    }

    /**
     * Gets the value of the lenBarrel property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getLenBarrel() {
        return lenBarrel;
    }

    /**
     * Sets the value of the lenBarrel property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setLenBarrel(LengthMeasure value) {
        this.lenBarrel = value;
    }

    /**
     * Gets the value of the innerBarrelType property.
     * 
     * @return
     *     possible object is
     *     {@link InnerBarrelType }
     *     
     */
    public InnerBarrelType getInnerBarrelType() {
        return innerBarrelType;
    }

    /**
     * Sets the value of the innerBarrelType property.
     * 
     * @param value
     *     allowed object is
     *     {@link InnerBarrelType }
     *     
     */
    public void setInnerBarrelType(InnerBarrelType value) {
        this.innerBarrelType = value;
    }

    /**
     * Gets the value of the coreDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoreDescription() {
        return coreDescription;
    }

    /**
     * Sets the value of the coreDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoreDescription(String value) {
        this.coreDescription = value;
    }

    /**
     * Gets the value of the extensionNameValue property.
     * 
     *
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extensionNameValue property.
     * 
     *
     * For example, to add a new item, do as follows:
     * <pre> {@code
     *    getExtensionNameValue().add(newItem);
     * } </pre>
     * 
     * 
     *
     * Objects of the following type(s) are allowed in the list
     * {@link CsExtensionNameValue }
     * 
     * 
     */
    public List<CsExtensionNameValue> getExtensionNameValue() {
        if (extensionNameValue == null) {
            extensionNameValue = new ArrayList<CsExtensionNameValue>();
        }
        return this.extensionNameValue;
    }

    /**
     * Gets the value of the uid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUid() {
        return uid;
    }

    /**
     * Sets the value of the uid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUid(String value) {
        this.uid = value;
    }

}
