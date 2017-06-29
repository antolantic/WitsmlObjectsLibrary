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
 *  WITSML - Rig Pump Component Schema 
 * 
 * <p>Java class for cs_pump complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="cs_pump">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="index" type="{http://www.witsml.org/schemas/131}positiveCount"/>
 *         <element name="manufacturer" type="{http://www.witsml.org/schemas/131}nameString" minOccurs="0"/>
 *         <element name="model" type="{http://www.witsml.org/schemas/131}str32" minOccurs="0"/>
 *         <element name="dTimInstall" type="{http://www.witsml.org/schemas/131}timestamp" minOccurs="0"/>
 *         <element name="dTimRemove" type="{http://www.witsml.org/schemas/131}timestamp" minOccurs="0"/>
 *         <element name="owner" type="{http://www.witsml.org/schemas/131}str32" minOccurs="0"/>
 *         <element name="typePump" type="{http://www.witsml.org/schemas/131}PumpType" minOccurs="0"/>
 *         <element name="numCyl" type="{http://www.witsml.org/schemas/131}positiveCount" minOccurs="0"/>
 *         <element name="odRod" type="{http://www.witsml.org/schemas/131}lengthMeasure" minOccurs="0"/>
 *         <element name="idLiner" type="{http://www.witsml.org/schemas/131}lengthMeasure"/>
 *         <element name="pumpAction" type="{http://www.witsml.org/schemas/131}pumpActionIntegerCode" minOccurs="0"/>
 *         <element name="eff" type="{http://www.witsml.org/schemas/131}relativePowerMeasure" minOccurs="0"/>
 *         <element name="lenStroke" type="{http://www.witsml.org/schemas/131}lengthMeasure" minOccurs="0"/>
 *         <element name="presMx" type="{http://www.witsml.org/schemas/131}pressureMeasure" minOccurs="0"/>
 *         <element name="powHydMx" type="{http://www.witsml.org/schemas/131}powerMeasure" minOccurs="0"/>
 *         <element name="spmMx" type="{http://www.witsml.org/schemas/131}anglePerTimeMeasure" minOccurs="0"/>
 *         <element name="displacement" type="{http://www.witsml.org/schemas/131}volumeMeasure"/>
 *         <element name="presDamp" type="{http://www.witsml.org/schemas/131}pressureMeasure" minOccurs="0"/>
 *         <element name="volDamp" type="{http://www.witsml.org/schemas/131}volumeMeasure" minOccurs="0"/>
 *         <element name="powMechMx" type="{http://www.witsml.org/schemas/131}powerMeasure" minOccurs="0"/>
 *         <element name="nameTag" type="{http://www.witsml.org/schemas/131}cs_nameTag" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "cs_pump", propOrder = {
    "index",
    "manufacturer",
    "model",
    "dTimInstall",
    "dTimRemove",
    "owner",
    "typePump",
    "numCyl",
    "odRod",
    "idLiner",
    "pumpAction",
    "eff",
    "lenStroke",
    "presMx",
    "powHydMx",
    "spmMx",
    "displacement",
    "presDamp",
    "volDamp",
    "powMechMx",
    "nameTag"
})
public class CsPump {

    protected short index;
    protected String manufacturer;
    protected String model;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dTimInstall;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dTimRemove;
    protected String owner;
    @XmlSchemaType(name = "string")
    protected PumpType typePump;
    protected Short numCyl;
    protected LengthMeasure odRod;
    @XmlElement(required = true)
    protected LengthMeasure idLiner;
    protected Short pumpAction;
    protected RelativePowerMeasure eff;
    protected LengthMeasure lenStroke;
    protected PressureMeasure presMx;
    protected PowerMeasure powHydMx;
    protected AnglePerTimeMeasure spmMx;
    @XmlElement(required = true)
    protected VolumeMeasure displacement;
    protected PressureMeasure presDamp;
    protected VolumeMeasure volDamp;
    protected PowerMeasure powMechMx;
    protected List<CsNameTag> nameTag;
    @XmlAttribute(name = "uid")
    protected String uid;

    /**
     * Gets the value of the index property.
     * 
     */
    public short getIndex() {
        return index;
    }

    /**
     * Sets the value of the index property.
     * 
     */
    public void setIndex(short value) {
        this.index = value;
    }

    /**
     * Gets the value of the manufacturer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /**
     * Sets the value of the manufacturer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufacturer(String value) {
        this.manufacturer = value;
    }

    /**
     * Gets the value of the model property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModel() {
        return model;
    }

    /**
     * Sets the value of the model property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModel(String value) {
        this.model = value;
    }

    /**
     * Gets the value of the dTimInstall property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDTimInstall() {
        return dTimInstall;
    }

    /**
     * Sets the value of the dTimInstall property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDTimInstall(XMLGregorianCalendar value) {
        this.dTimInstall = value;
    }

    /**
     * Gets the value of the dTimRemove property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDTimRemove() {
        return dTimRemove;
    }

    /**
     * Sets the value of the dTimRemove property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDTimRemove(XMLGregorianCalendar value) {
        this.dTimRemove = value;
    }

    /**
     * Gets the value of the owner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwner() {
        return owner;
    }

    /**
     * Sets the value of the owner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwner(String value) {
        this.owner = value;
    }

    /**
     * Gets the value of the typePump property.
     * 
     * @return
     *     possible object is
     *     {@link PumpType }
     *     
     */
    public PumpType getTypePump() {
        return typePump;
    }

    /**
     * Sets the value of the typePump property.
     * 
     * @param value
     *     allowed object is
     *     {@link PumpType }
     *     
     */
    public void setTypePump(PumpType value) {
        this.typePump = value;
    }

    /**
     * Gets the value of the numCyl property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getNumCyl() {
        return numCyl;
    }

    /**
     * Sets the value of the numCyl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setNumCyl(Short value) {
        this.numCyl = value;
    }

    /**
     * Gets the value of the odRod property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getOdRod() {
        return odRod;
    }

    /**
     * Sets the value of the odRod property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setOdRod(LengthMeasure value) {
        this.odRod = value;
    }

    /**
     * Gets the value of the idLiner property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getIdLiner() {
        return idLiner;
    }

    /**
     * Sets the value of the idLiner property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setIdLiner(LengthMeasure value) {
        this.idLiner = value;
    }

    /**
     * Gets the value of the pumpAction property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getPumpAction() {
        return pumpAction;
    }

    /**
     * Sets the value of the pumpAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setPumpAction(Short value) {
        this.pumpAction = value;
    }

    /**
     * Gets the value of the eff property.
     * 
     * @return
     *     possible object is
     *     {@link RelativePowerMeasure }
     *     
     */
    public RelativePowerMeasure getEff() {
        return eff;
    }

    /**
     * Sets the value of the eff property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelativePowerMeasure }
     *     
     */
    public void setEff(RelativePowerMeasure value) {
        this.eff = value;
    }

    /**
     * Gets the value of the lenStroke property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getLenStroke() {
        return lenStroke;
    }

    /**
     * Sets the value of the lenStroke property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setLenStroke(LengthMeasure value) {
        this.lenStroke = value;
    }

    /**
     * Gets the value of the presMx property.
     * 
     * @return
     *     possible object is
     *     {@link PressureMeasure }
     *     
     */
    public PressureMeasure getPresMx() {
        return presMx;
    }

    /**
     * Sets the value of the presMx property.
     * 
     * @param value
     *     allowed object is
     *     {@link PressureMeasure }
     *     
     */
    public void setPresMx(PressureMeasure value) {
        this.presMx = value;
    }

    /**
     * Gets the value of the powHydMx property.
     * 
     * @return
     *     possible object is
     *     {@link PowerMeasure }
     *     
     */
    public PowerMeasure getPowHydMx() {
        return powHydMx;
    }

    /**
     * Sets the value of the powHydMx property.
     * 
     * @param value
     *     allowed object is
     *     {@link PowerMeasure }
     *     
     */
    public void setPowHydMx(PowerMeasure value) {
        this.powHydMx = value;
    }

    /**
     * Gets the value of the spmMx property.
     * 
     * @return
     *     possible object is
     *     {@link AnglePerTimeMeasure }
     *     
     */
    public AnglePerTimeMeasure getSpmMx() {
        return spmMx;
    }

    /**
     * Sets the value of the spmMx property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnglePerTimeMeasure }
     *     
     */
    public void setSpmMx(AnglePerTimeMeasure value) {
        this.spmMx = value;
    }

    /**
     * Gets the value of the displacement property.
     * 
     * @return
     *     possible object is
     *     {@link VolumeMeasure }
     *     
     */
    public VolumeMeasure getDisplacement() {
        return displacement;
    }

    /**
     * Sets the value of the displacement property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeMeasure }
     *     
     */
    public void setDisplacement(VolumeMeasure value) {
        this.displacement = value;
    }

    /**
     * Gets the value of the presDamp property.
     * 
     * @return
     *     possible object is
     *     {@link PressureMeasure }
     *     
     */
    public PressureMeasure getPresDamp() {
        return presDamp;
    }

    /**
     * Sets the value of the presDamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link PressureMeasure }
     *     
     */
    public void setPresDamp(PressureMeasure value) {
        this.presDamp = value;
    }

    /**
     * Gets the value of the volDamp property.
     * 
     * @return
     *     possible object is
     *     {@link VolumeMeasure }
     *     
     */
    public VolumeMeasure getVolDamp() {
        return volDamp;
    }

    /**
     * Sets the value of the volDamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeMeasure }
     *     
     */
    public void setVolDamp(VolumeMeasure value) {
        this.volDamp = value;
    }

    /**
     * Gets the value of the powMechMx property.
     * 
     * @return
     *     possible object is
     *     {@link PowerMeasure }
     *     
     */
    public PowerMeasure getPowMechMx() {
        return powMechMx;
    }

    /**
     * Sets the value of the powMechMx property.
     * 
     * @param value
     *     allowed object is
     *     {@link PowerMeasure }
     *     
     */
    public void setPowMechMx(PowerMeasure value) {
        this.powMechMx = value;
    }

    /**
     * Gets the value of the nameTag property.
     * 
     *
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nameTag property.
     * 
     *
     * For example, to add a new item, do as follows:
     * <pre> {@code
     *    getNameTag().add(newItem);
     * } </pre>
     * 
     * 
     *
     * Objects of the following type(s) are allowed in the list
     * {@link CsNameTag }
     * 
     * 
     */
    public List<CsNameTag> getNameTag() {
        if (nameTag == null) {
            nameTag = new ArrayList<CsNameTag>();
        }
        return this.nameTag;
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
