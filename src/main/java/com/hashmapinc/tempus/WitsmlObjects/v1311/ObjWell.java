package com.hashmapinc.tempus.WitsmlObjects.v1311;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for obj_well complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="obj_well">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="name" type="{http://www.witsml.org/schemas/131}nameString"/>
 *         <group ref="{http://www.witsml.org/schemas/131}grp_well" minOccurs="0"/>
 *         <element name="commonData" type="{http://www.witsml.org/schemas/131}cs_commonData" minOccurs="0"/>
 *         <element name="customData" type="{http://www.witsml.org/schemas/131}cs_customData" minOccurs="0"/>
 *       </sequence>
 *       <attGroup ref="{http://www.witsml.org/schemas/131}attgrp_uid"/>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * } </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obj_well", propOrder = {
    "name",
    "nameLegal",
    "numLicense",
    "numGovt",
    "dTimLicense",
    "field",
    "country",
    "state",
    "county",
    "region",
    "district",
    "block",
    "timeZone",
    "operator",
    "operatorDiv",
    "pcInterest",
    "numAPI",
    "statusWell",
    "purposeWell",
    "fluidWell",
    "directionWell",
    "dTimSpud",
    "dTimPa",
    "wellheadElevation",
    "wellDatum",
    "groundElevation",
    "waterDepth",
    "wellLocation",
    "referencePoint",
    "wellCRS",
    "commonData",
    "customData"
})
public class ObjWell implements WitsmlObj {

    @XmlElement(required = true)
    protected String name;
    protected String nameLegal;
    protected String numLicense;
    protected String numGovt;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dTimLicense;
    protected String field;
    protected String country;
    protected String state;
    protected String county;
    protected String region;
    protected String district;
    protected String block;
    protected String timeZone;
    protected String operator;
    protected String operatorDiv;
    protected DimensionlessMeasure pcInterest;
    protected String numAPI;
    @XmlSchemaType(name = "string")
    protected WellStatus statusWell;
    @XmlSchemaType(name = "string")
    protected WellPurpose purposeWell;
    @XmlSchemaType(name = "string")
    protected WellFluid fluidWell;
    @XmlSchemaType(name = "string")
    protected WellDirection directionWell;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dTimSpud;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dTimPa;
    protected WellElevationCoord wellheadElevation;
    protected List<CsWellDatum> wellDatum;
    protected WellElevationCoord groundElevation;
    protected WellVerticalDepthCoord waterDepth;
    protected List<CsLocation> wellLocation;
    protected List<CsReferencePoint> referencePoint;
    protected List<CsWellCRS> wellCRS;
    protected CsCommonData commonData;
    protected CsCustomData customData;
    @XmlAttribute(name = "uid")
    protected String uid;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the nameLegal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameLegal() {
        return nameLegal;
    }

    /**
     * Sets the value of the nameLegal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameLegal(String value) {
        this.nameLegal = value;
    }

    /**
     * Gets the value of the numLicense property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumLicense() {
        return numLicense;
    }

    /**
     * Sets the value of the numLicense property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumLicense(String value) {
        this.numLicense = value;
    }

    /**
     * Gets the value of the numGovt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumGovt() {
        return numGovt;
    }

    /**
     * Sets the value of the numGovt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumGovt(String value) {
        this.numGovt = value;
    }

    /**
     * Gets the value of the dTimLicense property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDTimLicense() {
        return dTimLicense;
    }

    /**
     * Sets the value of the dTimLicense property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDTimLicense(XMLGregorianCalendar value) {
        this.dTimLicense = value;
    }

    /**
     * Gets the value of the field property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getField() {
        return field;
    }

    /**
     * Sets the value of the field property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setField(String value) {
        this.field = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the county property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCounty() {
        return county;
    }

    /**
     * Sets the value of the county property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCounty(String value) {
        this.county = value;
    }

    /**
     * Gets the value of the region property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegion() {
        return region;
    }

    /**
     * Sets the value of the region property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegion(String value) {
        this.region = value;
    }

    /**
     * Gets the value of the district property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistrict() {
        return district;
    }

    /**
     * Sets the value of the district property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistrict(String value) {
        this.district = value;
    }

    /**
     * Gets the value of the block property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlock() {
        return block;
    }

    /**
     * Sets the value of the block property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlock(String value) {
        this.block = value;
    }

    /**
     * Gets the value of the timeZone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeZone() {
        return timeZone;
    }

    /**
     * Sets the value of the timeZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeZone(String value) {
        this.timeZone = value;
    }

    /**
     * Gets the value of the operator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperator() {
        return operator;
    }

    /**
     * Sets the value of the operator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperator(String value) {
        this.operator = value;
    }

    /**
     * Gets the value of the operatorDiv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatorDiv() {
        return operatorDiv;
    }

    /**
     * Sets the value of the operatorDiv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatorDiv(String value) {
        this.operatorDiv = value;
    }

    /**
     * Gets the value of the pcInterest property.
     * 
     * @return
     *     possible object is
     *     {@link DimensionlessMeasure }
     *     
     */
    public DimensionlessMeasure getPcInterest() {
        return pcInterest;
    }

    /**
     * Sets the value of the pcInterest property.
     * 
     * @param value
     *     allowed object is
     *     {@link DimensionlessMeasure }
     *     
     */
    public void setPcInterest(DimensionlessMeasure value) {
        this.pcInterest = value;
    }

    /**
     * Gets the value of the numAPI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumAPI() {
        return numAPI;
    }

    /**
     * Sets the value of the numAPI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumAPI(String value) {
        this.numAPI = value;
    }

    /**
     * Gets the value of the statusWell property.
     * 
     * @return
     *     possible object is
     *     {@link WellStatus }
     *     
     */
    public WellStatus getStatusWell() {
        return statusWell;
    }

    /**
     * Sets the value of the statusWell property.
     * 
     * @param value
     *     allowed object is
     *     {@link WellStatus }
     *     
     */
    public void setStatusWell(WellStatus value) {
        this.statusWell = value;
    }

    /**
     * Gets the value of the purposeWell property.
     * 
     * @return
     *     possible object is
     *     {@link WellPurpose }
     *     
     */
    public WellPurpose getPurposeWell() {
        return purposeWell;
    }

    /**
     * Sets the value of the purposeWell property.
     * 
     * @param value
     *     allowed object is
     *     {@link WellPurpose }
     *     
     */
    public void setPurposeWell(WellPurpose value) {
        this.purposeWell = value;
    }

    /**
     * Gets the value of the fluidWell property.
     * 
     * @return
     *     possible object is
     *     {@link WellFluid }
     *     
     */
    public WellFluid getFluidWell() {
        return fluidWell;
    }

    /**
     * Sets the value of the fluidWell property.
     * 
     * @param value
     *     allowed object is
     *     {@link WellFluid }
     *     
     */
    public void setFluidWell(WellFluid value) {
        this.fluidWell = value;
    }

    /**
     * Gets the value of the directionWell property.
     * 
     * @return
     *     possible object is
     *     {@link WellDirection }
     *     
     */
    public WellDirection getDirectionWell() {
        return directionWell;
    }

    /**
     * Sets the value of the directionWell property.
     * 
     * @param value
     *     allowed object is
     *     {@link WellDirection }
     *     
     */
    public void setDirectionWell(WellDirection value) {
        this.directionWell = value;
    }

    /**
     * Gets the value of the dTimSpud property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDTimSpud() {
        return dTimSpud;
    }

    /**
     * Sets the value of the dTimSpud property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDTimSpud(XMLGregorianCalendar value) {
        this.dTimSpud = value;
    }

    /**
     * Gets the value of the dTimPa property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDTimPa() {
        return dTimPa;
    }

    /**
     * Sets the value of the dTimPa property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDTimPa(XMLGregorianCalendar value) {
        this.dTimPa = value;
    }

    /**
     * Gets the value of the wellheadElevation property.
     * 
     * @return
     *     possible object is
     *     {@link WellElevationCoord }
     *     
     */
    public WellElevationCoord getWellheadElevation() {
        return wellheadElevation;
    }

    /**
     * Sets the value of the wellheadElevation property.
     * 
     * @param value
     *     allowed object is
     *     {@link WellElevationCoord }
     *     
     */
    public void setWellheadElevation(WellElevationCoord value) {
        this.wellheadElevation = value;
    }

    /**
     * Gets the value of the wellDatum property.
     * 
     *
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wellDatum property.
     * 
     *
     * For example, to add a new item, do as follows:
     * <pre> {@code
     *    getWellDatum().add(newItem);
     * } </pre>
     * 
     * 
     *
     * Objects of the following type(s) are allowed in the list
     * {@link CsWellDatum }
     * 
     * 
     */
    public List<CsWellDatum> getWellDatum() {
        if (wellDatum == null) {
            wellDatum = new ArrayList<CsWellDatum>();
        }
        return this.wellDatum;
    }

    /**
     * Gets the value of the groundElevation property.
     * 
     * @return
     *     possible object is
     *     {@link WellElevationCoord }
     *     
     */
    public WellElevationCoord getGroundElevation() {
        return groundElevation;
    }

    /**
     * Sets the value of the groundElevation property.
     * 
     * @param value
     *     allowed object is
     *     {@link WellElevationCoord }
     *     
     */
    public void setGroundElevation(WellElevationCoord value) {
        this.groundElevation = value;
    }

    /**
     * Gets the value of the waterDepth property.
     * 
     * @return
     *     possible object is
     *     {@link WellVerticalDepthCoord }
     *     
     */
    public WellVerticalDepthCoord getWaterDepth() {
        return waterDepth;
    }

    /**
     * Sets the value of the waterDepth property.
     * 
     * @param value
     *     allowed object is
     *     {@link WellVerticalDepthCoord }
     *     
     */
    public void setWaterDepth(WellVerticalDepthCoord value) {
        this.waterDepth = value;
    }

    /**
     * Gets the value of the wellLocation property.
     * 
     *
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wellLocation property.
     * 
     *
     * For example, to add a new item, do as follows:
     * <pre> {@code
     *    getWellLocation().add(newItem);
     * } </pre>
     * 
     * 
     *
     * Objects of the following type(s) are allowed in the list
     * {@link CsLocation }
     * 
     * 
     */
    public List<CsLocation> getWellLocation() {
        if (wellLocation == null) {
            wellLocation = new ArrayList<CsLocation>();
        }
        return this.wellLocation;
    }

    /**
     * Gets the value of the referencePoint property.
     * 
     *
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the referencePoint property.
     * 
     *
     * For example, to add a new item, do as follows:
     * <pre> {@code
     *    getReferencePoint().add(newItem);
     * } </pre>
     * 
     * 
     *
     * Objects of the following type(s) are allowed in the list
     * {@link CsReferencePoint }
     * 
     * 
     */
    public List<CsReferencePoint> getReferencePoint() {
        if (referencePoint == null) {
            referencePoint = new ArrayList<CsReferencePoint>();
        }
        return this.referencePoint;
    }

    /**
     * Gets the value of the wellCRS property.
     * 
     *
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wellCRS property.
     * 
     *
     * For example, to add a new item, do as follows:
     * <pre> {@code
     *    getWellCRS().add(newItem);
     * } </pre>
     * 
     * 
     *
     * Objects of the following type(s) are allowed in the list
     * {@link CsWellCRS }
     * 
     * 
     */
    public List<CsWellCRS> getWellCRS() {
        if (wellCRS == null) {
            wellCRS = new ArrayList<CsWellCRS>();
        }
        return this.wellCRS;
    }

    /**
     * Gets the value of the commonData property.
     * 
     * @return
     *     possible object is
     *     {@link CsCommonData }
     *     
     */
    public CsCommonData getCommonData() {
        return commonData;
    }

    /**
     * Sets the value of the commonData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CsCommonData }
     *     
     */
    public void setCommonData(CsCommonData value) {
        this.commonData = value;
    }

    /**
     * Gets the value of the customData property.
     * 
     * @return
     *     possible object is
     *     {@link CsCustomData }
     *     
     */
    public CsCustomData getCustomData() {
        return customData;
    }

    /**
     * Sets the value of the customData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CsCustomData }
     *     
     */
    public void setCustomData(CsCustomData value) {
        this.customData = value;
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
