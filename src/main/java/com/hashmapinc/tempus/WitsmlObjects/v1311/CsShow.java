package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * WITSML Geology Show Component Schema
 * 
 * <p>Java class for cs_show complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="cs_show">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="showRat" type="{http://www.witsml.org/schemas/131}ShowRating" minOccurs="0"/>
 *         <element name="stainColor" type="{http://www.witsml.org/schemas/131}str16" minOccurs="0"/>
 *         <element name="stainDistr" type="{http://www.witsml.org/schemas/131}str16" minOccurs="0"/>
 *         <element name="stainPc" type="{http://www.witsml.org/schemas/131}areaPerAreaMeasure" minOccurs="0"/>
 *         <element name="natFlorColor" type="{http://www.witsml.org/schemas/131}str16" minOccurs="0"/>
 *         <element name="natFlorPc" type="{http://www.witsml.org/schemas/131}areaPerAreaMeasure" minOccurs="0"/>
 *         <element name="natFlorLevel" type="{http://www.witsml.org/schemas/131}ShowFluorescence" minOccurs="0"/>
 *         <element name="natFlorDesc" type="{http://www.witsml.org/schemas/131}shortDescriptionString" minOccurs="0"/>
 *         <element name="cutColor" type="{http://www.witsml.org/schemas/131}str16" minOccurs="0"/>
 *         <element name="cutSpeed" type="{http://www.witsml.org/schemas/131}ShowSpeed" minOccurs="0"/>
 *         <element name="cutStrength" type="{http://www.witsml.org/schemas/131}str16" minOccurs="0"/>
 *         <element name="cutForm" type="{http://www.witsml.org/schemas/131}ShowLevel" minOccurs="0"/>
 *         <element name="cutLevel" type="{http://www.witsml.org/schemas/131}str16" minOccurs="0"/>
 *         <element name="cutFlorColor" type="{http://www.witsml.org/schemas/131}str16" minOccurs="0"/>
 *         <element name="cutFlorSpeed" type="{http://www.witsml.org/schemas/131}ShowSpeed" minOccurs="0"/>
 *         <element name="cutFlorStrength" type="{http://www.witsml.org/schemas/131}str16" minOccurs="0"/>
 *         <element name="cutFlorForm" type="{http://www.witsml.org/schemas/131}ShowLevel" minOccurs="0"/>
 *         <element name="cutFlorLevel" type="{http://www.witsml.org/schemas/131}ShowFluorescence" minOccurs="0"/>
 *         <element name="residueColor" type="{http://www.witsml.org/schemas/131}str16" minOccurs="0"/>
 *         <element name="showDesc" type="{http://www.witsml.org/schemas/131}commentString" minOccurs="0"/>
 *         <element name="impregnatedLitho" type="{http://www.witsml.org/schemas/131}str32" minOccurs="0"/>
 *         <element name="odor" type="{http://www.witsml.org/schemas/131}str32" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * } </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cs_show", propOrder = {
    "showRat",
    "stainColor",
    "stainDistr",
    "stainPc",
    "natFlorColor",
    "natFlorPc",
    "natFlorLevel",
    "natFlorDesc",
    "cutColor",
    "cutSpeed",
    "cutStrength",
    "cutForm",
    "cutLevel",
    "cutFlorColor",
    "cutFlorSpeed",
    "cutFlorStrength",
    "cutFlorForm",
    "cutFlorLevel",
    "residueColor",
    "showDesc",
    "impregnatedLitho",
    "odor"
})
public class CsShow {

    @XmlSchemaType(name = "string")
    protected ShowRating showRat;
    protected String stainColor;
    protected String stainDistr;
    protected AreaPerAreaMeasure stainPc;
    protected String natFlorColor;
    protected AreaPerAreaMeasure natFlorPc;
    @XmlSchemaType(name = "string")
    protected ShowFluorescence natFlorLevel;
    protected String natFlorDesc;
    protected String cutColor;
    @XmlSchemaType(name = "string")
    protected ShowSpeed cutSpeed;
    protected String cutStrength;
    @XmlSchemaType(name = "string")
    protected ShowLevel cutForm;
    protected String cutLevel;
    protected String cutFlorColor;
    @XmlSchemaType(name = "string")
    protected ShowSpeed cutFlorSpeed;
    protected String cutFlorStrength;
    @XmlSchemaType(name = "string")
    protected ShowLevel cutFlorForm;
    @XmlSchemaType(name = "string")
    protected ShowFluorescence cutFlorLevel;
    protected String residueColor;
    protected String showDesc;
    protected String impregnatedLitho;
    protected String odor;

    /**
     * Gets the value of the showRat property.
     * 
     * @return
     *     possible object is
     *     {@link ShowRating }
     *     
     */
    public ShowRating getShowRat() {
        return showRat;
    }

    /**
     * Sets the value of the showRat property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShowRating }
     *     
     */
    public void setShowRat(ShowRating value) {
        this.showRat = value;
    }

    /**
     * Gets the value of the stainColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStainColor() {
        return stainColor;
    }

    /**
     * Sets the value of the stainColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStainColor(String value) {
        this.stainColor = value;
    }

    /**
     * Gets the value of the stainDistr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStainDistr() {
        return stainDistr;
    }

    /**
     * Sets the value of the stainDistr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStainDistr(String value) {
        this.stainDistr = value;
    }

    /**
     * Gets the value of the stainPc property.
     * 
     * @return
     *     possible object is
     *     {@link AreaPerAreaMeasure }
     *     
     */
    public AreaPerAreaMeasure getStainPc() {
        return stainPc;
    }

    /**
     * Sets the value of the stainPc property.
     * 
     * @param value
     *     allowed object is
     *     {@link AreaPerAreaMeasure }
     *     
     */
    public void setStainPc(AreaPerAreaMeasure value) {
        this.stainPc = value;
    }

    /**
     * Gets the value of the natFlorColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNatFlorColor() {
        return natFlorColor;
    }

    /**
     * Sets the value of the natFlorColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNatFlorColor(String value) {
        this.natFlorColor = value;
    }

    /**
     * Gets the value of the natFlorPc property.
     * 
     * @return
     *     possible object is
     *     {@link AreaPerAreaMeasure }
     *     
     */
    public AreaPerAreaMeasure getNatFlorPc() {
        return natFlorPc;
    }

    /**
     * Sets the value of the natFlorPc property.
     * 
     * @param value
     *     allowed object is
     *     {@link AreaPerAreaMeasure }
     *     
     */
    public void setNatFlorPc(AreaPerAreaMeasure value) {
        this.natFlorPc = value;
    }

    /**
     * Gets the value of the natFlorLevel property.
     * 
     * @return
     *     possible object is
     *     {@link ShowFluorescence }
     *     
     */
    public ShowFluorescence getNatFlorLevel() {
        return natFlorLevel;
    }

    /**
     * Sets the value of the natFlorLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShowFluorescence }
     *     
     */
    public void setNatFlorLevel(ShowFluorescence value) {
        this.natFlorLevel = value;
    }

    /**
     * Gets the value of the natFlorDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNatFlorDesc() {
        return natFlorDesc;
    }

    /**
     * Sets the value of the natFlorDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNatFlorDesc(String value) {
        this.natFlorDesc = value;
    }

    /**
     * Gets the value of the cutColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCutColor() {
        return cutColor;
    }

    /**
     * Sets the value of the cutColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCutColor(String value) {
        this.cutColor = value;
    }

    /**
     * Gets the value of the cutSpeed property.
     * 
     * @return
     *     possible object is
     *     {@link ShowSpeed }
     *     
     */
    public ShowSpeed getCutSpeed() {
        return cutSpeed;
    }

    /**
     * Sets the value of the cutSpeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShowSpeed }
     *     
     */
    public void setCutSpeed(ShowSpeed value) {
        this.cutSpeed = value;
    }

    /**
     * Gets the value of the cutStrength property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCutStrength() {
        return cutStrength;
    }

    /**
     * Sets the value of the cutStrength property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCutStrength(String value) {
        this.cutStrength = value;
    }

    /**
     * Gets the value of the cutForm property.
     * 
     * @return
     *     possible object is
     *     {@link ShowLevel }
     *     
     */
    public ShowLevel getCutForm() {
        return cutForm;
    }

    /**
     * Sets the value of the cutForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShowLevel }
     *     
     */
    public void setCutForm(ShowLevel value) {
        this.cutForm = value;
    }

    /**
     * Gets the value of the cutLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCutLevel() {
        return cutLevel;
    }

    /**
     * Sets the value of the cutLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCutLevel(String value) {
        this.cutLevel = value;
    }

    /**
     * Gets the value of the cutFlorColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCutFlorColor() {
        return cutFlorColor;
    }

    /**
     * Sets the value of the cutFlorColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCutFlorColor(String value) {
        this.cutFlorColor = value;
    }

    /**
     * Gets the value of the cutFlorSpeed property.
     * 
     * @return
     *     possible object is
     *     {@link ShowSpeed }
     *     
     */
    public ShowSpeed getCutFlorSpeed() {
        return cutFlorSpeed;
    }

    /**
     * Sets the value of the cutFlorSpeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShowSpeed }
     *     
     */
    public void setCutFlorSpeed(ShowSpeed value) {
        this.cutFlorSpeed = value;
    }

    /**
     * Gets the value of the cutFlorStrength property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCutFlorStrength() {
        return cutFlorStrength;
    }

    /**
     * Sets the value of the cutFlorStrength property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCutFlorStrength(String value) {
        this.cutFlorStrength = value;
    }

    /**
     * Gets the value of the cutFlorForm property.
     * 
     * @return
     *     possible object is
     *     {@link ShowLevel }
     *     
     */
    public ShowLevel getCutFlorForm() {
        return cutFlorForm;
    }

    /**
     * Sets the value of the cutFlorForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShowLevel }
     *     
     */
    public void setCutFlorForm(ShowLevel value) {
        this.cutFlorForm = value;
    }

    /**
     * Gets the value of the cutFlorLevel property.
     * 
     * @return
     *     possible object is
     *     {@link ShowFluorescence }
     *     
     */
    public ShowFluorescence getCutFlorLevel() {
        return cutFlorLevel;
    }

    /**
     * Sets the value of the cutFlorLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShowFluorescence }
     *     
     */
    public void setCutFlorLevel(ShowFluorescence value) {
        this.cutFlorLevel = value;
    }

    /**
     * Gets the value of the residueColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResidueColor() {
        return residueColor;
    }

    /**
     * Sets the value of the residueColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResidueColor(String value) {
        this.residueColor = value;
    }

    /**
     * Gets the value of the showDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShowDesc() {
        return showDesc;
    }

    /**
     * Sets the value of the showDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShowDesc(String value) {
        this.showDesc = value;
    }

    /**
     * Gets the value of the impregnatedLitho property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImpregnatedLitho() {
        return impregnatedLitho;
    }

    /**
     * Sets the value of the impregnatedLitho property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImpregnatedLitho(String value) {
        this.impregnatedLitho = value;
    }

    /**
     * Gets the value of the odor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOdor() {
        return odor;
    }

    /**
     * Sets the value of the odor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOdor(String value) {
        this.odor = value;
    }

}
