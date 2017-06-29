package com.hashmapinc.tempus.WitsmlObjects.v1311;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * WITSML - Operations Rig Response Component Schema
 * 
 * <p>Java class for cs_rigResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="cs_rigResponse">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="anchorTension" type="{http://www.witsml.org/schemas/131}indexedObject" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="anchorAngle" type="{http://www.witsml.org/schemas/131}indexedObject" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="rigHeading" type="{http://www.witsml.org/schemas/131}planeAngleMeasure" minOccurs="0"/>
 *         <element name="rigHeave" type="{http://www.witsml.org/schemas/131}lengthMeasure" minOccurs="0"/>
 *         <element name="rigPitchAngle" type="{http://www.witsml.org/schemas/131}planeAngleMeasure" minOccurs="0"/>
 *         <element name="rigRollAngle" type="{http://www.witsml.org/schemas/131}planeAngleMeasure" minOccurs="0"/>
 *         <element name="riserAngle" type="{http://www.witsml.org/schemas/131}planeAngleMeasure" minOccurs="0"/>
 *         <element name="riserDirection" type="{http://www.witsml.org/schemas/131}planeAngleMeasure" minOccurs="0"/>
 *         <element name="riserTension" type="{http://www.witsml.org/schemas/131}forceMeasure" minOccurs="0"/>
 *         <element name="variableDeckLoad" type="{http://www.witsml.org/schemas/131}forceMeasure" minOccurs="0"/>
 *         <element name="totalDeckLoad" type="{http://www.witsml.org/schemas/131}forceMeasure" minOccurs="0"/>
 *         <element name="guideBaseAngle" type="{http://www.witsml.org/schemas/131}planeAngleMeasure" minOccurs="0"/>
 *         <element name="ballJointAngle" type="{http://www.witsml.org/schemas/131}planeAngleMeasure" minOccurs="0"/>
 *         <element name="ballJointDirection" type="{http://www.witsml.org/schemas/131}planeAngleMeasure" minOccurs="0"/>
 *         <element name="offsetRig" type="{http://www.witsml.org/schemas/131}lengthMeasure" minOccurs="0"/>
 *         <element name="loadLeg1" type="{http://www.witsml.org/schemas/131}forceMeasure" minOccurs="0"/>
 *         <element name="loadLeg2" type="{http://www.witsml.org/schemas/131}forceMeasure" minOccurs="0"/>
 *         <element name="loadLeg3" type="{http://www.witsml.org/schemas/131}forceMeasure" minOccurs="0"/>
 *         <element name="loadLeg4" type="{http://www.witsml.org/schemas/131}forceMeasure" minOccurs="0"/>
 *         <element name="penetrationLeg1" type="{http://www.witsml.org/schemas/131}lengthMeasure" minOccurs="0"/>
 *         <element name="penetrationLeg2" type="{http://www.witsml.org/schemas/131}lengthMeasure" minOccurs="0"/>
 *         <element name="penetrationLeg3" type="{http://www.witsml.org/schemas/131}lengthMeasure" minOccurs="0"/>
 *         <element name="penetrationLeg4" type="{http://www.witsml.org/schemas/131}lengthMeasure" minOccurs="0"/>
 *         <element name="dispRig" type="{http://www.witsml.org/schemas/131}lengthMeasure" minOccurs="0"/>
 *         <element name="meanDraft" type="{http://www.witsml.org/schemas/131}lengthMeasure" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * } </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cs_rigResponse", propOrder = {
    "anchorTension",
    "anchorAngle",
    "rigHeading",
    "rigHeave",
    "rigPitchAngle",
    "rigRollAngle",
    "riserAngle",
    "riserDirection",
    "riserTension",
    "variableDeckLoad",
    "totalDeckLoad",
    "guideBaseAngle",
    "ballJointAngle",
    "ballJointDirection",
    "offsetRig",
    "loadLeg1",
    "loadLeg2",
    "loadLeg3",
    "loadLeg4",
    "penetrationLeg1",
    "penetrationLeg2",
    "penetrationLeg3",
    "penetrationLeg4",
    "dispRig",
    "meanDraft"
})
public class CsRigResponse {

    protected List<IndexedObject> anchorTension;
    protected List<IndexedObject> anchorAngle;
    protected PlaneAngleMeasure rigHeading;
    protected LengthMeasure rigHeave;
    protected PlaneAngleMeasure rigPitchAngle;
    protected PlaneAngleMeasure rigRollAngle;
    protected PlaneAngleMeasure riserAngle;
    protected PlaneAngleMeasure riserDirection;
    protected ForceMeasure riserTension;
    protected ForceMeasure variableDeckLoad;
    protected ForceMeasure totalDeckLoad;
    protected PlaneAngleMeasure guideBaseAngle;
    protected PlaneAngleMeasure ballJointAngle;
    protected PlaneAngleMeasure ballJointDirection;
    protected LengthMeasure offsetRig;
    protected ForceMeasure loadLeg1;
    protected ForceMeasure loadLeg2;
    protected ForceMeasure loadLeg3;
    protected ForceMeasure loadLeg4;
    protected LengthMeasure penetrationLeg1;
    protected LengthMeasure penetrationLeg2;
    protected LengthMeasure penetrationLeg3;
    protected LengthMeasure penetrationLeg4;
    protected LengthMeasure dispRig;
    protected LengthMeasure meanDraft;

    /**
     * Gets the value of the anchorTension property.
     * 
     *
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the anchorTension property.
     * 
     *
     * For example, to add a new item, do as follows:
     * <pre> {@code
     *    getAnchorTension().add(newItem);
     * } </pre>
     * 
     * 
     *
     * Objects of the following type(s) are allowed in the list
     * {@link IndexedObject }
     * 
     * 
     */
    public List<IndexedObject> getAnchorTension() {
        if (anchorTension == null) {
            anchorTension = new ArrayList<IndexedObject>();
        }
        return this.anchorTension;
    }

    /**
     * Gets the value of the anchorAngle property.
     * 
     *
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the anchorAngle property.
     * 
     *
     * For example, to add a new item, do as follows:
     * <pre> {@code
     *    getAnchorAngle().add(newItem);
     * } </pre>
     * 
     * 
     *
     * Objects of the following type(s) are allowed in the list
     * {@link IndexedObject }
     * 
     * 
     */
    public List<IndexedObject> getAnchorAngle() {
        if (anchorAngle == null) {
            anchorAngle = new ArrayList<IndexedObject>();
        }
        return this.anchorAngle;
    }

    /**
     * Gets the value of the rigHeading property.
     * 
     * @return
     *     possible object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public PlaneAngleMeasure getRigHeading() {
        return rigHeading;
    }

    /**
     * Sets the value of the rigHeading property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public void setRigHeading(PlaneAngleMeasure value) {
        this.rigHeading = value;
    }

    /**
     * Gets the value of the rigHeave property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getRigHeave() {
        return rigHeave;
    }

    /**
     * Sets the value of the rigHeave property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setRigHeave(LengthMeasure value) {
        this.rigHeave = value;
    }

    /**
     * Gets the value of the rigPitchAngle property.
     * 
     * @return
     *     possible object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public PlaneAngleMeasure getRigPitchAngle() {
        return rigPitchAngle;
    }

    /**
     * Sets the value of the rigPitchAngle property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public void setRigPitchAngle(PlaneAngleMeasure value) {
        this.rigPitchAngle = value;
    }

    /**
     * Gets the value of the rigRollAngle property.
     * 
     * @return
     *     possible object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public PlaneAngleMeasure getRigRollAngle() {
        return rigRollAngle;
    }

    /**
     * Sets the value of the rigRollAngle property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public void setRigRollAngle(PlaneAngleMeasure value) {
        this.rigRollAngle = value;
    }

    /**
     * Gets the value of the riserAngle property.
     * 
     * @return
     *     possible object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public PlaneAngleMeasure getRiserAngle() {
        return riserAngle;
    }

    /**
     * Sets the value of the riserAngle property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public void setRiserAngle(PlaneAngleMeasure value) {
        this.riserAngle = value;
    }

    /**
     * Gets the value of the riserDirection property.
     * 
     * @return
     *     possible object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public PlaneAngleMeasure getRiserDirection() {
        return riserDirection;
    }

    /**
     * Sets the value of the riserDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public void setRiserDirection(PlaneAngleMeasure value) {
        this.riserDirection = value;
    }

    /**
     * Gets the value of the riserTension property.
     * 
     * @return
     *     possible object is
     *     {@link ForceMeasure }
     *     
     */
    public ForceMeasure getRiserTension() {
        return riserTension;
    }

    /**
     * Sets the value of the riserTension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForceMeasure }
     *     
     */
    public void setRiserTension(ForceMeasure value) {
        this.riserTension = value;
    }

    /**
     * Gets the value of the variableDeckLoad property.
     * 
     * @return
     *     possible object is
     *     {@link ForceMeasure }
     *     
     */
    public ForceMeasure getVariableDeckLoad() {
        return variableDeckLoad;
    }

    /**
     * Sets the value of the variableDeckLoad property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForceMeasure }
     *     
     */
    public void setVariableDeckLoad(ForceMeasure value) {
        this.variableDeckLoad = value;
    }

    /**
     * Gets the value of the totalDeckLoad property.
     * 
     * @return
     *     possible object is
     *     {@link ForceMeasure }
     *     
     */
    public ForceMeasure getTotalDeckLoad() {
        return totalDeckLoad;
    }

    /**
     * Sets the value of the totalDeckLoad property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForceMeasure }
     *     
     */
    public void setTotalDeckLoad(ForceMeasure value) {
        this.totalDeckLoad = value;
    }

    /**
     * Gets the value of the guideBaseAngle property.
     * 
     * @return
     *     possible object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public PlaneAngleMeasure getGuideBaseAngle() {
        return guideBaseAngle;
    }

    /**
     * Sets the value of the guideBaseAngle property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public void setGuideBaseAngle(PlaneAngleMeasure value) {
        this.guideBaseAngle = value;
    }

    /**
     * Gets the value of the ballJointAngle property.
     * 
     * @return
     *     possible object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public PlaneAngleMeasure getBallJointAngle() {
        return ballJointAngle;
    }

    /**
     * Sets the value of the ballJointAngle property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public void setBallJointAngle(PlaneAngleMeasure value) {
        this.ballJointAngle = value;
    }

    /**
     * Gets the value of the ballJointDirection property.
     * 
     * @return
     *     possible object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public PlaneAngleMeasure getBallJointDirection() {
        return ballJointDirection;
    }

    /**
     * Sets the value of the ballJointDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public void setBallJointDirection(PlaneAngleMeasure value) {
        this.ballJointDirection = value;
    }

    /**
     * Gets the value of the offsetRig property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getOffsetRig() {
        return offsetRig;
    }

    /**
     * Sets the value of the offsetRig property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setOffsetRig(LengthMeasure value) {
        this.offsetRig = value;
    }

    /**
     * Gets the value of the loadLeg1 property.
     * 
     * @return
     *     possible object is
     *     {@link ForceMeasure }
     *     
     */
    public ForceMeasure getLoadLeg1() {
        return loadLeg1;
    }

    /**
     * Sets the value of the loadLeg1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForceMeasure }
     *     
     */
    public void setLoadLeg1(ForceMeasure value) {
        this.loadLeg1 = value;
    }

    /**
     * Gets the value of the loadLeg2 property.
     * 
     * @return
     *     possible object is
     *     {@link ForceMeasure }
     *     
     */
    public ForceMeasure getLoadLeg2() {
        return loadLeg2;
    }

    /**
     * Sets the value of the loadLeg2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForceMeasure }
     *     
     */
    public void setLoadLeg2(ForceMeasure value) {
        this.loadLeg2 = value;
    }

    /**
     * Gets the value of the loadLeg3 property.
     * 
     * @return
     *     possible object is
     *     {@link ForceMeasure }
     *     
     */
    public ForceMeasure getLoadLeg3() {
        return loadLeg3;
    }

    /**
     * Sets the value of the loadLeg3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForceMeasure }
     *     
     */
    public void setLoadLeg3(ForceMeasure value) {
        this.loadLeg3 = value;
    }

    /**
     * Gets the value of the loadLeg4 property.
     * 
     * @return
     *     possible object is
     *     {@link ForceMeasure }
     *     
     */
    public ForceMeasure getLoadLeg4() {
        return loadLeg4;
    }

    /**
     * Sets the value of the loadLeg4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForceMeasure }
     *     
     */
    public void setLoadLeg4(ForceMeasure value) {
        this.loadLeg4 = value;
    }

    /**
     * Gets the value of the penetrationLeg1 property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getPenetrationLeg1() {
        return penetrationLeg1;
    }

    /**
     * Sets the value of the penetrationLeg1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setPenetrationLeg1(LengthMeasure value) {
        this.penetrationLeg1 = value;
    }

    /**
     * Gets the value of the penetrationLeg2 property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getPenetrationLeg2() {
        return penetrationLeg2;
    }

    /**
     * Sets the value of the penetrationLeg2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setPenetrationLeg2(LengthMeasure value) {
        this.penetrationLeg2 = value;
    }

    /**
     * Gets the value of the penetrationLeg3 property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getPenetrationLeg3() {
        return penetrationLeg3;
    }

    /**
     * Sets the value of the penetrationLeg3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setPenetrationLeg3(LengthMeasure value) {
        this.penetrationLeg3 = value;
    }

    /**
     * Gets the value of the penetrationLeg4 property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getPenetrationLeg4() {
        return penetrationLeg4;
    }

    /**
     * Sets the value of the penetrationLeg4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setPenetrationLeg4(LengthMeasure value) {
        this.penetrationLeg4 = value;
    }

    /**
     * Gets the value of the dispRig property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getDispRig() {
        return dispRig;
    }

    /**
     * Sets the value of the dispRig property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setDispRig(LengthMeasure value) {
        this.dispRig = value;
    }

    /**
     * Gets the value of the meanDraft property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getMeanDraft() {
        return meanDraft;
    }

    /**
     * Sets the value of the meanDraft property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setMeanDraft(LengthMeasure value) {
        this.meanDraft = value;
    }

}
