package com.hashmapinc.tempus.WitsmlObjects.v1311;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 *  WITSML - fluids component schema 
 * 
 * <p>Java class for cs_fluid complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="cs_fluid">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="type" type="{http://www.witsml.org/schemas/131}str32" minOccurs="0"/>
 *         <element name="locationSample" type="{http://www.witsml.org/schemas/131}str32" minOccurs="0"/>
 *         <element name="dTim" type="{http://www.witsml.org/schemas/131}timestamp" minOccurs="0"/>
 *         <element name="md" type="{http://www.witsml.org/schemas/131}measuredDepthCoord" minOccurs="0"/>
 *         <element name="density" type="{http://www.witsml.org/schemas/131}densityMeasure" minOccurs="0"/>
 *         <element name="visFunnel" type="{http://www.witsml.org/schemas/131}timeMeasure" minOccurs="0"/>
 *         <element name="tempVis" type="{http://www.witsml.org/schemas/131}thermodynamicTemperatureMeasure" minOccurs="0"/>
 *         <element name="pv" type="{http://www.witsml.org/schemas/131}dynamicViscosityMeasure" minOccurs="0"/>
 *         <element name="yp" type="{http://www.witsml.org/schemas/131}pressureMeasure" minOccurs="0"/>
 *         <element name="gel10Sec" type="{http://www.witsml.org/schemas/131}pressureMeasure" minOccurs="0"/>
 *         <element name="gel10Min" type="{http://www.witsml.org/schemas/131}pressureMeasure" minOccurs="0"/>
 *         <element name="gel30Min" type="{http://www.witsml.org/schemas/131}pressureMeasure" minOccurs="0"/>
 *         <element name="filterCakeLtlp" type="{http://www.witsml.org/schemas/131}lengthMeasure" minOccurs="0"/>
 *         <element name="filtrateLtlp" type="{http://www.witsml.org/schemas/131}volumeMeasure" minOccurs="0"/>
 *         <element name="tempHthp" type="{http://www.witsml.org/schemas/131}thermodynamicTemperatureMeasure" minOccurs="0"/>
 *         <element name="presHthp" type="{http://www.witsml.org/schemas/131}pressureMeasure" minOccurs="0"/>
 *         <element name="filtrateHthp" type="{http://www.witsml.org/schemas/131}volumeMeasure" minOccurs="0"/>
 *         <element name="filterCakeHthp" type="{http://www.witsml.org/schemas/131}lengthMeasure" minOccurs="0"/>
 *         <element name="solidsPc" type="{http://www.witsml.org/schemas/131}volumePerVolumeMeasure" minOccurs="0"/>
 *         <element name="waterPc" type="{http://www.witsml.org/schemas/131}volumePerVolumeMeasure" minOccurs="0"/>
 *         <element name="oilPc" type="{http://www.witsml.org/schemas/131}volumePerVolumeMeasure" minOccurs="0"/>
 *         <element name="sandPc" type="{http://www.witsml.org/schemas/131}volumePerVolumeMeasure" minOccurs="0"/>
 *         <element name="solidsLowGravPc" type="{http://www.witsml.org/schemas/131}volumePerVolumeMeasure" minOccurs="0"/>
 *         <element name="solidsCalcPc" type="{http://www.witsml.org/schemas/131}volumePerVolumeMeasure" minOccurs="0"/>
 *         <element name="baritePc" type="{http://www.witsml.org/schemas/131}volumePerVolumeMeasure" minOccurs="0"/>
 *         <element name="lcm" type="{http://www.witsml.org/schemas/131}densityMeasure" minOccurs="0"/>
 *         <element name="mbt" type="{http://www.witsml.org/schemas/131}equivalentPerMassMeasure" minOccurs="0"/>
 *         <element name="ph" type="{http://www.witsml.org/schemas/131}unitlessQuantity" minOccurs="0"/>
 *         <element name="tempPh" type="{http://www.witsml.org/schemas/131}thermodynamicTemperatureMeasure" minOccurs="0"/>
 *         <element name="pm" type="{http://www.witsml.org/schemas/131}volumeMeasure" minOccurs="0"/>
 *         <element name="pmFiltrate" type="{http://www.witsml.org/schemas/131}volumeMeasure" minOccurs="0"/>
 *         <element name="mf" type="{http://www.witsml.org/schemas/131}volumeMeasure" minOccurs="0"/>
 *         <element name="alkalinityP1" type="{http://www.witsml.org/schemas/131}volumeMeasure" minOccurs="0"/>
 *         <element name="alkalinityP2" type="{http://www.witsml.org/schemas/131}volumeMeasure" minOccurs="0"/>
 *         <element name="chloride" type="{http://www.witsml.org/schemas/131}densityMeasure" minOccurs="0"/>
 *         <element name="calcium" type="{http://www.witsml.org/schemas/131}densityMeasure" minOccurs="0"/>
 *         <element name="magnesium" type="{http://www.witsml.org/schemas/131}densityMeasure" minOccurs="0"/>
 *         <element name="potassium" type="{http://www.witsml.org/schemas/131}densityMeasure" minOccurs="0"/>
 *         <element name="rheometer" type="{http://www.witsml.org/schemas/131}cs_rheometer" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="brinePc" type="{http://www.witsml.org/schemas/131}volumePerVolumeMeasure" minOccurs="0"/>
 *         <element name="lime" type="{http://www.witsml.org/schemas/131}densityMeasure" minOccurs="0"/>
 *         <element name="electStab" type="{http://www.witsml.org/schemas/131}electricPotentialMeasure" minOccurs="0"/>
 *         <element name="calciumChloride" type="{http://www.witsml.org/schemas/131}densityMeasure" minOccurs="0"/>
 *         <element name="company" type="{http://www.witsml.org/schemas/131}str32" minOccurs="0"/>
 *         <element name="engineer" type="{http://www.witsml.org/schemas/131}nameString" minOccurs="0"/>
 *         <element name="asg" type="{http://www.witsml.org/schemas/131}unitlessQuantity" minOccurs="0"/>
 *         <element name="solidsHiGravPc" type="{http://www.witsml.org/schemas/131}volumePerVolumeMeasure" minOccurs="0"/>
 *         <element name="polymer" type="{http://www.witsml.org/schemas/131}volumePerVolumeMeasure" minOccurs="0"/>
 *         <element name="polyType" type="{http://www.witsml.org/schemas/131}str32" minOccurs="0"/>
 *         <element name="solCorPc" type="{http://www.witsml.org/schemas/131}volumePerVolumeMeasure" minOccurs="0"/>
 *         <element name="oilCtg" type="{http://www.witsml.org/schemas/131}massConcentrationMeasure" minOccurs="0"/>
 *         <element name="hardnessCa" type="{http://www.witsml.org/schemas/131}massConcentrationMeasure" minOccurs="0"/>
 *         <element name="sulfide" type="{http://www.witsml.org/schemas/131}densityMeasure" minOccurs="0"/>
 *         <element name="comments" type="{http://www.witsml.org/schemas/131}commentString" minOccurs="0"/>
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
@XmlType(name = "cs_fluid", propOrder = {
    "type",
    "locationSample",
    "dTim",
    "md",
    "density",
    "visFunnel",
    "tempVis",
    "pv",
    "yp",
    "gel10Sec",
    "gel10Min",
    "gel30Min",
    "filterCakeLtlp",
    "filtrateLtlp",
    "tempHthp",
    "presHthp",
    "filtrateHthp",
    "filterCakeHthp",
    "solidsPc",
    "waterPc",
    "oilPc",
    "sandPc",
    "solidsLowGravPc",
    "solidsCalcPc",
    "baritePc",
    "lcm",
    "mbt",
    "ph",
    "tempPh",
    "pm",
    "pmFiltrate",
    "mf",
    "alkalinityP1",
    "alkalinityP2",
    "chloride",
    "calcium",
    "magnesium",
    "potassium",
    "rheometer",
    "brinePc",
    "lime",
    "electStab",
    "calciumChloride",
    "company",
    "engineer",
    "asg",
    "solidsHiGravPc",
    "polymer",
    "polyType",
    "solCorPc",
    "oilCtg",
    "hardnessCa",
    "sulfide",
    "comments"
})
public class CsFluid {

    protected String type;
    protected String locationSample;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dTim;
    protected MeasuredDepthCoord md;
    protected DensityMeasure density;
    protected TimeMeasure visFunnel;
    protected ThermodynamicTemperatureMeasure tempVis;
    protected DynamicViscosityMeasure pv;
    protected PressureMeasure yp;
    protected PressureMeasure gel10Sec;
    protected PressureMeasure gel10Min;
    protected PressureMeasure gel30Min;
    protected LengthMeasure filterCakeLtlp;
    protected VolumeMeasure filtrateLtlp;
    protected ThermodynamicTemperatureMeasure tempHthp;
    protected PressureMeasure presHthp;
    protected VolumeMeasure filtrateHthp;
    protected LengthMeasure filterCakeHthp;
    protected VolumePerVolumeMeasure solidsPc;
    protected VolumePerVolumeMeasure waterPc;
    protected VolumePerVolumeMeasure oilPc;
    protected VolumePerVolumeMeasure sandPc;
    protected VolumePerVolumeMeasure solidsLowGravPc;
    protected VolumePerVolumeMeasure solidsCalcPc;
    protected VolumePerVolumeMeasure baritePc;
    protected DensityMeasure lcm;
    protected EquivalentPerMassMeasure mbt;
    protected Double ph;
    protected ThermodynamicTemperatureMeasure tempPh;
    protected VolumeMeasure pm;
    protected VolumeMeasure pmFiltrate;
    protected VolumeMeasure mf;
    protected VolumeMeasure alkalinityP1;
    protected VolumeMeasure alkalinityP2;
    protected DensityMeasure chloride;
    protected DensityMeasure calcium;
    protected DensityMeasure magnesium;
    protected DensityMeasure potassium;
    protected List<CsRheometer> rheometer;
    protected VolumePerVolumeMeasure brinePc;
    protected DensityMeasure lime;
    protected ElectricPotentialMeasure electStab;
    protected DensityMeasure calciumChloride;
    protected String company;
    protected String engineer;
    protected Double asg;
    protected VolumePerVolumeMeasure solidsHiGravPc;
    protected VolumePerVolumeMeasure polymer;
    protected String polyType;
    protected VolumePerVolumeMeasure solCorPc;
    protected MassConcentrationMeasure oilCtg;
    protected MassConcentrationMeasure hardnessCa;
    protected DensityMeasure sulfide;
    protected String comments;
    @XmlAttribute(name = "uid")
    protected String uid;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the locationSample property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationSample() {
        return locationSample;
    }

    /**
     * Sets the value of the locationSample property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationSample(String value) {
        this.locationSample = value;
    }

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
     * Gets the value of the md property.
     * 
     * @return
     *     possible object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public MeasuredDepthCoord getMd() {
        return md;
    }

    /**
     * Sets the value of the md property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public void setMd(MeasuredDepthCoord value) {
        this.md = value;
    }

    /**
     * Gets the value of the density property.
     * 
     * @return
     *     possible object is
     *     {@link DensityMeasure }
     *     
     */
    public DensityMeasure getDensity() {
        return density;
    }

    /**
     * Sets the value of the density property.
     * 
     * @param value
     *     allowed object is
     *     {@link DensityMeasure }
     *     
     */
    public void setDensity(DensityMeasure value) {
        this.density = value;
    }

    /**
     * Gets the value of the visFunnel property.
     * 
     * @return
     *     possible object is
     *     {@link TimeMeasure }
     *     
     */
    public TimeMeasure getVisFunnel() {
        return visFunnel;
    }

    /**
     * Sets the value of the visFunnel property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeMeasure }
     *     
     */
    public void setVisFunnel(TimeMeasure value) {
        this.visFunnel = value;
    }

    /**
     * Gets the value of the tempVis property.
     * 
     * @return
     *     possible object is
     *     {@link ThermodynamicTemperatureMeasure }
     *     
     */
    public ThermodynamicTemperatureMeasure getTempVis() {
        return tempVis;
    }

    /**
     * Sets the value of the tempVis property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThermodynamicTemperatureMeasure }
     *     
     */
    public void setTempVis(ThermodynamicTemperatureMeasure value) {
        this.tempVis = value;
    }

    /**
     * Gets the value of the pv property.
     * 
     * @return
     *     possible object is
     *     {@link DynamicViscosityMeasure }
     *     
     */
    public DynamicViscosityMeasure getPv() {
        return pv;
    }

    /**
     * Sets the value of the pv property.
     * 
     * @param value
     *     allowed object is
     *     {@link DynamicViscosityMeasure }
     *     
     */
    public void setPv(DynamicViscosityMeasure value) {
        this.pv = value;
    }

    /**
     * Gets the value of the yp property.
     * 
     * @return
     *     possible object is
     *     {@link PressureMeasure }
     *     
     */
    public PressureMeasure getYp() {
        return yp;
    }

    /**
     * Sets the value of the yp property.
     * 
     * @param value
     *     allowed object is
     *     {@link PressureMeasure }
     *     
     */
    public void setYp(PressureMeasure value) {
        this.yp = value;
    }

    /**
     * Gets the value of the gel10Sec property.
     * 
     * @return
     *     possible object is
     *     {@link PressureMeasure }
     *     
     */
    public PressureMeasure getGel10Sec() {
        return gel10Sec;
    }

    /**
     * Sets the value of the gel10Sec property.
     * 
     * @param value
     *     allowed object is
     *     {@link PressureMeasure }
     *     
     */
    public void setGel10Sec(PressureMeasure value) {
        this.gel10Sec = value;
    }

    /**
     * Gets the value of the gel10Min property.
     * 
     * @return
     *     possible object is
     *     {@link PressureMeasure }
     *     
     */
    public PressureMeasure getGel10Min() {
        return gel10Min;
    }

    /**
     * Sets the value of the gel10Min property.
     * 
     * @param value
     *     allowed object is
     *     {@link PressureMeasure }
     *     
     */
    public void setGel10Min(PressureMeasure value) {
        this.gel10Min = value;
    }

    /**
     * Gets the value of the gel30Min property.
     * 
     * @return
     *     possible object is
     *     {@link PressureMeasure }
     *     
     */
    public PressureMeasure getGel30Min() {
        return gel30Min;
    }

    /**
     * Sets the value of the gel30Min property.
     * 
     * @param value
     *     allowed object is
     *     {@link PressureMeasure }
     *     
     */
    public void setGel30Min(PressureMeasure value) {
        this.gel30Min = value;
    }

    /**
     * Gets the value of the filterCakeLtlp property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getFilterCakeLtlp() {
        return filterCakeLtlp;
    }

    /**
     * Sets the value of the filterCakeLtlp property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setFilterCakeLtlp(LengthMeasure value) {
        this.filterCakeLtlp = value;
    }

    /**
     * Gets the value of the filtrateLtlp property.
     * 
     * @return
     *     possible object is
     *     {@link VolumeMeasure }
     *     
     */
    public VolumeMeasure getFiltrateLtlp() {
        return filtrateLtlp;
    }

    /**
     * Sets the value of the filtrateLtlp property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeMeasure }
     *     
     */
    public void setFiltrateLtlp(VolumeMeasure value) {
        this.filtrateLtlp = value;
    }

    /**
     * Gets the value of the tempHthp property.
     * 
     * @return
     *     possible object is
     *     {@link ThermodynamicTemperatureMeasure }
     *     
     */
    public ThermodynamicTemperatureMeasure getTempHthp() {
        return tempHthp;
    }

    /**
     * Sets the value of the tempHthp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThermodynamicTemperatureMeasure }
     *     
     */
    public void setTempHthp(ThermodynamicTemperatureMeasure value) {
        this.tempHthp = value;
    }

    /**
     * Gets the value of the presHthp property.
     * 
     * @return
     *     possible object is
     *     {@link PressureMeasure }
     *     
     */
    public PressureMeasure getPresHthp() {
        return presHthp;
    }

    /**
     * Sets the value of the presHthp property.
     * 
     * @param value
     *     allowed object is
     *     {@link PressureMeasure }
     *     
     */
    public void setPresHthp(PressureMeasure value) {
        this.presHthp = value;
    }

    /**
     * Gets the value of the filtrateHthp property.
     * 
     * @return
     *     possible object is
     *     {@link VolumeMeasure }
     *     
     */
    public VolumeMeasure getFiltrateHthp() {
        return filtrateHthp;
    }

    /**
     * Sets the value of the filtrateHthp property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeMeasure }
     *     
     */
    public void setFiltrateHthp(VolumeMeasure value) {
        this.filtrateHthp = value;
    }

    /**
     * Gets the value of the filterCakeHthp property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getFilterCakeHthp() {
        return filterCakeHthp;
    }

    /**
     * Sets the value of the filterCakeHthp property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setFilterCakeHthp(LengthMeasure value) {
        this.filterCakeHthp = value;
    }

    /**
     * Gets the value of the solidsPc property.
     * 
     * @return
     *     possible object is
     *     {@link VolumePerVolumeMeasure }
     *     
     */
    public VolumePerVolumeMeasure getSolidsPc() {
        return solidsPc;
    }

    /**
     * Sets the value of the solidsPc property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumePerVolumeMeasure }
     *     
     */
    public void setSolidsPc(VolumePerVolumeMeasure value) {
        this.solidsPc = value;
    }

    /**
     * Gets the value of the waterPc property.
     * 
     * @return
     *     possible object is
     *     {@link VolumePerVolumeMeasure }
     *     
     */
    public VolumePerVolumeMeasure getWaterPc() {
        return waterPc;
    }

    /**
     * Sets the value of the waterPc property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumePerVolumeMeasure }
     *     
     */
    public void setWaterPc(VolumePerVolumeMeasure value) {
        this.waterPc = value;
    }

    /**
     * Gets the value of the oilPc property.
     * 
     * @return
     *     possible object is
     *     {@link VolumePerVolumeMeasure }
     *     
     */
    public VolumePerVolumeMeasure getOilPc() {
        return oilPc;
    }

    /**
     * Sets the value of the oilPc property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumePerVolumeMeasure }
     *     
     */
    public void setOilPc(VolumePerVolumeMeasure value) {
        this.oilPc = value;
    }

    /**
     * Gets the value of the sandPc property.
     * 
     * @return
     *     possible object is
     *     {@link VolumePerVolumeMeasure }
     *     
     */
    public VolumePerVolumeMeasure getSandPc() {
        return sandPc;
    }

    /**
     * Sets the value of the sandPc property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumePerVolumeMeasure }
     *     
     */
    public void setSandPc(VolumePerVolumeMeasure value) {
        this.sandPc = value;
    }

    /**
     * Gets the value of the solidsLowGravPc property.
     * 
     * @return
     *     possible object is
     *     {@link VolumePerVolumeMeasure }
     *     
     */
    public VolumePerVolumeMeasure getSolidsLowGravPc() {
        return solidsLowGravPc;
    }

    /**
     * Sets the value of the solidsLowGravPc property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumePerVolumeMeasure }
     *     
     */
    public void setSolidsLowGravPc(VolumePerVolumeMeasure value) {
        this.solidsLowGravPc = value;
    }

    /**
     * Gets the value of the solidsCalcPc property.
     * 
     * @return
     *     possible object is
     *     {@link VolumePerVolumeMeasure }
     *     
     */
    public VolumePerVolumeMeasure getSolidsCalcPc() {
        return solidsCalcPc;
    }

    /**
     * Sets the value of the solidsCalcPc property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumePerVolumeMeasure }
     *     
     */
    public void setSolidsCalcPc(VolumePerVolumeMeasure value) {
        this.solidsCalcPc = value;
    }

    /**
     * Gets the value of the baritePc property.
     * 
     * @return
     *     possible object is
     *     {@link VolumePerVolumeMeasure }
     *     
     */
    public VolumePerVolumeMeasure getBaritePc() {
        return baritePc;
    }

    /**
     * Sets the value of the baritePc property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumePerVolumeMeasure }
     *     
     */
    public void setBaritePc(VolumePerVolumeMeasure value) {
        this.baritePc = value;
    }

    /**
     * Gets the value of the lcm property.
     * 
     * @return
     *     possible object is
     *     {@link DensityMeasure }
     *     
     */
    public DensityMeasure getLcm() {
        return lcm;
    }

    /**
     * Sets the value of the lcm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DensityMeasure }
     *     
     */
    public void setLcm(DensityMeasure value) {
        this.lcm = value;
    }

    /**
     * Gets the value of the mbt property.
     * 
     * @return
     *     possible object is
     *     {@link EquivalentPerMassMeasure }
     *     
     */
    public EquivalentPerMassMeasure getMbt() {
        return mbt;
    }

    /**
     * Sets the value of the mbt property.
     * 
     * @param value
     *     allowed object is
     *     {@link EquivalentPerMassMeasure }
     *     
     */
    public void setMbt(EquivalentPerMassMeasure value) {
        this.mbt = value;
    }

    /**
     * Gets the value of the ph property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPh() {
        return ph;
    }

    /**
     * Sets the value of the ph property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPh(Double value) {
        this.ph = value;
    }

    /**
     * Gets the value of the tempPh property.
     * 
     * @return
     *     possible object is
     *     {@link ThermodynamicTemperatureMeasure }
     *     
     */
    public ThermodynamicTemperatureMeasure getTempPh() {
        return tempPh;
    }

    /**
     * Sets the value of the tempPh property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThermodynamicTemperatureMeasure }
     *     
     */
    public void setTempPh(ThermodynamicTemperatureMeasure value) {
        this.tempPh = value;
    }

    /**
     * Gets the value of the pm property.
     * 
     * @return
     *     possible object is
     *     {@link VolumeMeasure }
     *     
     */
    public VolumeMeasure getPm() {
        return pm;
    }

    /**
     * Sets the value of the pm property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeMeasure }
     *     
     */
    public void setPm(VolumeMeasure value) {
        this.pm = value;
    }

    /**
     * Gets the value of the pmFiltrate property.
     * 
     * @return
     *     possible object is
     *     {@link VolumeMeasure }
     *     
     */
    public VolumeMeasure getPmFiltrate() {
        return pmFiltrate;
    }

    /**
     * Sets the value of the pmFiltrate property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeMeasure }
     *     
     */
    public void setPmFiltrate(VolumeMeasure value) {
        this.pmFiltrate = value;
    }

    /**
     * Gets the value of the mf property.
     * 
     * @return
     *     possible object is
     *     {@link VolumeMeasure }
     *     
     */
    public VolumeMeasure getMf() {
        return mf;
    }

    /**
     * Sets the value of the mf property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeMeasure }
     *     
     */
    public void setMf(VolumeMeasure value) {
        this.mf = value;
    }

    /**
     * Gets the value of the alkalinityP1 property.
     * 
     * @return
     *     possible object is
     *     {@link VolumeMeasure }
     *     
     */
    public VolumeMeasure getAlkalinityP1() {
        return alkalinityP1;
    }

    /**
     * Sets the value of the alkalinityP1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeMeasure }
     *     
     */
    public void setAlkalinityP1(VolumeMeasure value) {
        this.alkalinityP1 = value;
    }

    /**
     * Gets the value of the alkalinityP2 property.
     * 
     * @return
     *     possible object is
     *     {@link VolumeMeasure }
     *     
     */
    public VolumeMeasure getAlkalinityP2() {
        return alkalinityP2;
    }

    /**
     * Sets the value of the alkalinityP2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeMeasure }
     *     
     */
    public void setAlkalinityP2(VolumeMeasure value) {
        this.alkalinityP2 = value;
    }

    /**
     * Gets the value of the chloride property.
     * 
     * @return
     *     possible object is
     *     {@link DensityMeasure }
     *     
     */
    public DensityMeasure getChloride() {
        return chloride;
    }

    /**
     * Sets the value of the chloride property.
     * 
     * @param value
     *     allowed object is
     *     {@link DensityMeasure }
     *     
     */
    public void setChloride(DensityMeasure value) {
        this.chloride = value;
    }

    /**
     * Gets the value of the calcium property.
     * 
     * @return
     *     possible object is
     *     {@link DensityMeasure }
     *     
     */
    public DensityMeasure getCalcium() {
        return calcium;
    }

    /**
     * Sets the value of the calcium property.
     * 
     * @param value
     *     allowed object is
     *     {@link DensityMeasure }
     *     
     */
    public void setCalcium(DensityMeasure value) {
        this.calcium = value;
    }

    /**
     * Gets the value of the magnesium property.
     * 
     * @return
     *     possible object is
     *     {@link DensityMeasure }
     *     
     */
    public DensityMeasure getMagnesium() {
        return magnesium;
    }

    /**
     * Sets the value of the magnesium property.
     * 
     * @param value
     *     allowed object is
     *     {@link DensityMeasure }
     *     
     */
    public void setMagnesium(DensityMeasure value) {
        this.magnesium = value;
    }

    /**
     * Gets the value of the potassium property.
     * 
     * @return
     *     possible object is
     *     {@link DensityMeasure }
     *     
     */
    public DensityMeasure getPotassium() {
        return potassium;
    }

    /**
     * Sets the value of the potassium property.
     * 
     * @param value
     *     allowed object is
     *     {@link DensityMeasure }
     *     
     */
    public void setPotassium(DensityMeasure value) {
        this.potassium = value;
    }

    /**
     * Gets the value of the rheometer property.
     * 
     *
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rheometer property.
     * 
     *
     * For example, to add a new item, do as follows:
     * <pre> {@code
     *    getRheometer().add(newItem);
     * } </pre>
     * 
     * 
     *
     * Objects of the following type(s) are allowed in the list
     * {@link CsRheometer }
     * 
     * 
     */
    public List<CsRheometer> getRheometer() {
        if (rheometer == null) {
            rheometer = new ArrayList<CsRheometer>();
        }
        return this.rheometer;
    }

    /**
     * Gets the value of the brinePc property.
     * 
     * @return
     *     possible object is
     *     {@link VolumePerVolumeMeasure }
     *     
     */
    public VolumePerVolumeMeasure getBrinePc() {
        return brinePc;
    }

    /**
     * Sets the value of the brinePc property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumePerVolumeMeasure }
     *     
     */
    public void setBrinePc(VolumePerVolumeMeasure value) {
        this.brinePc = value;
    }

    /**
     * Gets the value of the lime property.
     * 
     * @return
     *     possible object is
     *     {@link DensityMeasure }
     *     
     */
    public DensityMeasure getLime() {
        return lime;
    }

    /**
     * Sets the value of the lime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DensityMeasure }
     *     
     */
    public void setLime(DensityMeasure value) {
        this.lime = value;
    }

    /**
     * Gets the value of the electStab property.
     * 
     * @return
     *     possible object is
     *     {@link ElectricPotentialMeasure }
     *     
     */
    public ElectricPotentialMeasure getElectStab() {
        return electStab;
    }

    /**
     * Sets the value of the electStab property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElectricPotentialMeasure }
     *     
     */
    public void setElectStab(ElectricPotentialMeasure value) {
        this.electStab = value;
    }

    /**
     * Gets the value of the calciumChloride property.
     * 
     * @return
     *     possible object is
     *     {@link DensityMeasure }
     *     
     */
    public DensityMeasure getCalciumChloride() {
        return calciumChloride;
    }

    /**
     * Sets the value of the calciumChloride property.
     * 
     * @param value
     *     allowed object is
     *     {@link DensityMeasure }
     *     
     */
    public void setCalciumChloride(DensityMeasure value) {
        this.calciumChloride = value;
    }

    /**
     * Gets the value of the company property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompany() {
        return company;
    }

    /**
     * Sets the value of the company property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompany(String value) {
        this.company = value;
    }

    /**
     * Gets the value of the engineer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEngineer() {
        return engineer;
    }

    /**
     * Sets the value of the engineer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEngineer(String value) {
        this.engineer = value;
    }

    /**
     * Gets the value of the asg property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAsg() {
        return asg;
    }

    /**
     * Sets the value of the asg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAsg(Double value) {
        this.asg = value;
    }

    /**
     * Gets the value of the solidsHiGravPc property.
     * 
     * @return
     *     possible object is
     *     {@link VolumePerVolumeMeasure }
     *     
     */
    public VolumePerVolumeMeasure getSolidsHiGravPc() {
        return solidsHiGravPc;
    }

    /**
     * Sets the value of the solidsHiGravPc property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumePerVolumeMeasure }
     *     
     */
    public void setSolidsHiGravPc(VolumePerVolumeMeasure value) {
        this.solidsHiGravPc = value;
    }

    /**
     * Gets the value of the polymer property.
     * 
     * @return
     *     possible object is
     *     {@link VolumePerVolumeMeasure }
     *     
     */
    public VolumePerVolumeMeasure getPolymer() {
        return polymer;
    }

    /**
     * Sets the value of the polymer property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumePerVolumeMeasure }
     *     
     */
    public void setPolymer(VolumePerVolumeMeasure value) {
        this.polymer = value;
    }

    /**
     * Gets the value of the polyType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolyType() {
        return polyType;
    }

    /**
     * Sets the value of the polyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolyType(String value) {
        this.polyType = value;
    }

    /**
     * Gets the value of the solCorPc property.
     * 
     * @return
     *     possible object is
     *     {@link VolumePerVolumeMeasure }
     *     
     */
    public VolumePerVolumeMeasure getSolCorPc() {
        return solCorPc;
    }

    /**
     * Sets the value of the solCorPc property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumePerVolumeMeasure }
     *     
     */
    public void setSolCorPc(VolumePerVolumeMeasure value) {
        this.solCorPc = value;
    }

    /**
     * Gets the value of the oilCtg property.
     * 
     * @return
     *     possible object is
     *     {@link MassConcentrationMeasure }
     *     
     */
    public MassConcentrationMeasure getOilCtg() {
        return oilCtg;
    }

    /**
     * Sets the value of the oilCtg property.
     * 
     * @param value
     *     allowed object is
     *     {@link MassConcentrationMeasure }
     *     
     */
    public void setOilCtg(MassConcentrationMeasure value) {
        this.oilCtg = value;
    }

    /**
     * Gets the value of the hardnessCa property.
     * 
     * @return
     *     possible object is
     *     {@link MassConcentrationMeasure }
     *     
     */
    public MassConcentrationMeasure getHardnessCa() {
        return hardnessCa;
    }

    /**
     * Sets the value of the hardnessCa property.
     * 
     * @param value
     *     allowed object is
     *     {@link MassConcentrationMeasure }
     *     
     */
    public void setHardnessCa(MassConcentrationMeasure value) {
        this.hardnessCa = value;
    }

    /**
     * Gets the value of the sulfide property.
     * 
     * @return
     *     possible object is
     *     {@link DensityMeasure }
     *     
     */
    public DensityMeasure getSulfide() {
        return sulfide;
    }

    /**
     * Sets the value of the sulfide property.
     * 
     * @param value
     *     allowed object is
     *     {@link DensityMeasure }
     *     
     */
    public void setSulfide(DensityMeasure value) {
        this.sulfide = value;
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
