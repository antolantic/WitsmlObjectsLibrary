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
import javax.xml.bind.annotation.XmlType;


/**
 * Diagnostic test involving flowing a well back after treatment.
 * 
 * <p>Java class for cs_stimStepDownTest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="cs_stimStepDownTest">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="initialShutinPres" type="{http://www.witsml.org/schemas/1series}pressureMeasure" minOccurs="0"/>
 *         <element name="bottomholeFluidDensity" type="{http://www.witsml.org/schemas/1series}densityMeasure" minOccurs="0"/>
 *         <element name="diameterEntryHole" type="{http://www.witsml.org/schemas/1series}lengthMeasure" minOccurs="0"/>
 *         <element name="perforationCount" type="{http://www.witsml.org/schemas/1series}nonNegativeCount" minOccurs="0"/>
 *         <element name="dischargeCoefficient" type="{http://www.witsml.org/schemas/1series}unitlessQuantity" minOccurs="0"/>
 *         <element name="effectivePerfs" type="{http://www.witsml.org/schemas/1series}unitlessQuantity" minOccurs="0"/>
 *         <element name="step" type="{http://www.witsml.org/schemas/1series}cs_stimTestStep" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "cs_stimStepDownTest", propOrder = {
    "initialShutinPres",
    "bottomholeFluidDensity",
    "diameterEntryHole",
    "perforationCount",
    "dischargeCoefficient",
    "effectivePerfs",
    "step",
    "extensionNameValue"
})
public class CsStimStepDownTest {

    protected PressureMeasure initialShutinPres;
    protected DensityMeasure bottomholeFluidDensity;
    protected LengthMeasure diameterEntryHole;
    protected Short perforationCount;
    protected Double dischargeCoefficient;
    protected Double effectivePerfs;
    protected List<CsStimTestStep> step;
    protected List<CsExtensionNameValue> extensionNameValue;
    @XmlAttribute(name = "uid")
    protected String uid;

    /**
     * Gets the value of the initialShutinPres property.
     * 
     * @return
     *     possible object is
     *     {@link PressureMeasure }
     *     
     */
    public PressureMeasure getInitialShutinPres() {
        return initialShutinPres;
    }

    /**
     * Sets the value of the initialShutinPres property.
     * 
     * @param value
     *     allowed object is
     *     {@link PressureMeasure }
     *     
     */
    public void setInitialShutinPres(PressureMeasure value) {
        this.initialShutinPres = value;
    }

    /**
     * Gets the value of the bottomholeFluidDensity property.
     * 
     * @return
     *     possible object is
     *     {@link DensityMeasure }
     *     
     */
    public DensityMeasure getBottomholeFluidDensity() {
        return bottomholeFluidDensity;
    }

    /**
     * Sets the value of the bottomholeFluidDensity property.
     * 
     * @param value
     *     allowed object is
     *     {@link DensityMeasure }
     *     
     */
    public void setBottomholeFluidDensity(DensityMeasure value) {
        this.bottomholeFluidDensity = value;
    }

    /**
     * Gets the value of the diameterEntryHole property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getDiameterEntryHole() {
        return diameterEntryHole;
    }

    /**
     * Sets the value of the diameterEntryHole property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setDiameterEntryHole(LengthMeasure value) {
        this.diameterEntryHole = value;
    }

    /**
     * Gets the value of the perforationCount property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getPerforationCount() {
        return perforationCount;
    }

    /**
     * Sets the value of the perforationCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setPerforationCount(Short value) {
        this.perforationCount = value;
    }

    /**
     * Gets the value of the dischargeCoefficient property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDischargeCoefficient() {
        return dischargeCoefficient;
    }

    /**
     * Sets the value of the dischargeCoefficient property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDischargeCoefficient(Double value) {
        this.dischargeCoefficient = value;
    }

    /**
     * Gets the value of the effectivePerfs property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getEffectivePerfs() {
        return effectivePerfs;
    }

    /**
     * Sets the value of the effectivePerfs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setEffectivePerfs(Double value) {
        this.effectivePerfs = value;
    }

    /**
     * Gets the value of the step property.
     * 
     *
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the step property.
     * 
     *
     * For example, to add a new item, do as follows:
     * <pre> {@code
     *    getStep().add(newItem);
     * } </pre>
     * 
     * 
     *
     * Objects of the following type(s) are allowed in the list
     * {@link CsStimTestStep }
     * 
     * 
     */
    public List<CsStimTestStep> getStep() {
        if (step == null) {
            step = new ArrayList<CsStimTestStep>();
        }
        return this.step;
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
