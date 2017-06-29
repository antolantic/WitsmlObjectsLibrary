package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MudLogParameterType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre> {@code
 * <simpleType name="MudLogParameterType">
 *   <restriction base="{http://www.witsml.org/schemas/131}abstractTypeEnum">
 *     <enumeration value="bit parameters"/>
 *     <enumeration value="bit type comment"/>
 *     <enumeration value="casing point comment"/>
 *     <enumeration value="chromatograph comment"/>
 *     <enumeration value="circulation system comment"/>
 *     <enumeration value="core interval comment"/>
 *     <enumeration value="cuttings gas"/>
 *     <enumeration value="direct fracture pressure"/>
 *     <enumeration value="direct pore pressure measurements"/>
 *     <enumeration value="drilling data comment"/>
 *     <enumeration value="fracture PG estimate most likely"/>
 *     <enumeration value="gas peaks comment"/>
 *     <enumeration value="gas ratio comment"/>
 *     <enumeration value="general engineering comment"/>
 *     <enumeration value="kicks and flows"/>
 *     <enumeration value="lithlog comment"/>
 *     <enumeration value="lost returns"/>
 *     <enumeration value="LWD comment"/>
 *     <enumeration value="marker or formation top comment"/>
 *     <enumeration value="midnight depth date"/>
 *     <enumeration value="mud check comment"/>
 *     <enumeration value="mud data comment"/>
 *     <enumeration value="mudlog comment"/>
 *     <enumeration value="overburden gradient"/>
 *     <enumeration value="overpull on connection"/>
 *     <enumeration value="overpull on trip"/>
 *     <enumeration value="pore PG estimate most likely"/>
 *     <enumeration value="pore pressure estimate while drilling"/>
 *     <enumeration value="pressure data comment"/>
 *     <enumeration value="shale density comment"/>
 *     <enumeration value="short trip comment"/>
 *     <enumeration value="show report comment"/>
 *     <enumeration value="sidewall core comment"/>
 *     <enumeration value="sliding Interval"/>
 *     <enumeration value="steam still results comment"/>
 *     <enumeration value="survey comment"/>
 *     <enumeration value="temperature data comment"/>
 *     <enumeration value="temperature trend comment"/>
 *     <enumeration value="wireline log comment"/>
 *     <enumeration value="unknown"/>
 *   </restriction>
 * </simpleType>
 * } </pre>
 * 
 */
@XmlType(name = "MudLogParameterType")
@XmlEnum
public enum MudLogParameterType {


    /**
     * Summarizes basic drilling parameters (or changes) at 
     * 					specified depth. Text value only.
     * 
     */
    @XmlEnumValue("bit parameters")
    BIT_PARAMETERS("bit parameters"),

    /**
     * Text gives bitname and manufacturer. May have other 
     * 					bit parameters typical for bit run. Depth recorded at depth bit 
     * 					run starts. Text value only.
     * 
     */
    @XmlEnumValue("bit type comment")
    BIT_TYPE_COMMENT("bit type comment"),

    /**
     * Text may include casing depth, size and LOT 
     * 					information. Depth recorded is usually depth of shoe. A top depth 
     * 					is typically not required as it is usually the rig floor, mud line 
     * 					or other datum. However a top depth may be required if referenced 
     * 					to a casing or liner hanger etc Text value only.
     * 
     */
    @XmlEnumValue("casing point comment")
    CASING_POINT_COMMENT("casing point comment"),

    /**
     * Any general comments pertinent to chromatograph 
     * 					readings and equipment calibrations, gas reading anomalies, etc. Text value only.
     * 
     */
    @XmlEnumValue("chromatograph comment")
    CHROMATOGRAPH_COMMENT("chromatograph comment"),

    /**
     * Text indicating flowchecks, result, kick details, 
     * 					fluid loss. Any event associated with mud circulation. Text value only.
     * 
     */
    @XmlEnumValue("circulation system comment")
    CIRCULATION_SYSTEM_COMMENT("circulation system comment"),

    /**
     * Associated text with core interval usually 
     * 					summarizing core number core,  cut, core recovered and percent 
     * 					recovery. Not meant for core description. Text value only.
     * 
     */
    @XmlEnumValue("core interval comment")
    CORE_INTERVAL_COMMENT("core interval comment"),

    /**
     * Gas from blendorized cutting samples (possibly 
     * 					every 30ft). Concentration value only.
     * 
     */
    @XmlEnumValue("cuttings gas")
    CUTTINGS_GAS("cuttings gas"),

    /**
     * LOT (Leak off) and PIT (Pressure Integrity 
     * 					Test) Results. Pressure value only. 
     * 
     */
    @XmlEnumValue("direct fracture pressure")
    DIRECT_FRACTURE_PRESSURE("direct fracture pressure"),

    /**
     * Wireline Formation Testing (WFT) pressure  (e.g., MDT, RCI, FMT, RFT) as a 
     * 					gradient. Pressure gradient value only.
     * 
     */
    @XmlEnumValue("direct pore pressure measurements")
    DIRECT_PORE_PRESSURE_MEASUREMENTS("direct pore pressure measurements"),

    /**
     * Text comments highlighting anomalies in 
     * 					data or interpretation of drill data: Hookload/WOB, RPM/Torque, 
     * 					PumpFlow. Text value only.
     * 
     */
    @XmlEnumValue("drilling data comment")
    DRILLING_DATA_COMMENT("drilling data comment"),

    /**
     * Fracture Pressure Gradient - Most Likely. Pressure gradient value only.
     * 
     */
    @XmlEnumValue("fracture PG estimate most likely")
    FRACTURE_PG_ESTIMATE_MOST_LIKELY("fracture PG estimate most likely"),

    /**
     * Text giving gas peak type and magnitude.
     * 					Text value only.
     * 
     */
    @XmlEnumValue("gas peaks comment")
    GAS_PEAKS_COMMENT("gas peaks comment"),

    /**
     * Comments on gas ratio curve data. Text value only.
     * 
     */
    @XmlEnumValue("gas ratio comment")
    GAS_RATIO_COMMENT("gas ratio comment"),

    /**
     * Text describes general engineering/drilling 
     * 					related events Text value only.
     * 
     */
    @XmlEnumValue("general engineering comment")
    GENERAL_ENGINEERING_COMMENT("general engineering comment"),

    /**
     * Pressure gradients derived from kicks and flows 
     * 					while drilling. Pressure gradient value only.
     * 
     */
    @XmlEnumValue("kicks and flows")
    KICKS_AND_FLOWS("kicks and flows"),

    /**
     * Lithlog general comments - would typically appear 
     * 					in 'Remarks' column along with lithologic descriptions. Text value only.
     * 
     */
    @XmlEnumValue("lithlog comment")
    LITHLOG_COMMENT("lithlog comment"),

    /**
     * Pressures gradients derived from lost returns. Pressure gradient value only.
     * 
     */
    @XmlEnumValue("lost returns")
    LOST_RETURNS("lost returns"),

    /**
     * Data on Logging While Drilling tool failures, 
     * 					anomalies etc. Text value only.
     * 
     */
    @XmlEnumValue("LWD comment")
    LWD_COMMENT("LWD comment"),

    /**
     * Indicates a formation or biostratigraphic 
     * 					marker etc. - may include name, measured and subsea depth plus two way time. Text value only.
     * 
     */
    @XmlEnumValue("marker or formation top comment")
    MARKER_OR_FORMATION_TOP_COMMENT("marker or formation top comment"),

    /**
     * Comment signifying depth at 00:00 hrs. 
     * 					Date is usual text. Text value only.
     * 
     */
    @XmlEnumValue("midnight depth date")
    MIDNIGHT_DEPTH_DATE("midnight depth date"),

    /**
     * Mud check parameters and changes. Data will be 
     * 					key mud information, MWt, PV/YP, Gels, Viscosity etc. May be just 
     * 					one parameter if change made etc. Text value only.
     * 
     */
    @XmlEnumValue("mud check comment")
    MUD_CHECK_COMMENT("mud check comment"),

    /**
     * Gives text comments on mud weight etc. As opposed 
     * 					to mud check (see previously). Text value only.
     * 
     */
    @XmlEnumValue("mud data comment")
    MUD_DATA_COMMENT("mud data comment"),

    /**
     * General mudlog comments that are normally found 
     * 					in Remarks column with Lith descriptions. May include time / date 
     * 					/ depth mudlogging was commenced or other information.  Text value only.
     * 
     */
    @XmlEnumValue("mudlog comment")
    MUDLOG_COMMENT("mudlog comment"),

    /**
     * Overburden Gradient. Pressure gradient value only.
     * 
     */
    @XmlEnumValue("overburden gradient")
    OVERBURDEN_GRADIENT("overburden gradient"),

    /**
     * Amount of hookload overpull on connection 
     * 					(maximum); Text giving amount of overpull (max) on connections, 
     * 					trips and other. Text should state type of overpull. Both text and force value.
     * 
     */
    @XmlEnumValue("overpull on connection")
    OVERPULL_ON_CONNECTION("overpull on connection"),

    /**
     * Amount of hookload overpull on Trip 
     * 					(maximum per stand); Text giving amount of overpull (max) 
     * 					on connections, trips and other. Text should state type of 
     * 					overpull. Both text and force value.
     * 
     */
    @XmlEnumValue("overpull on trip")
    OVERPULL_ON_TRIP("overpull on trip"),

    /**
     * Pore Pressure Gradient - Most Likely. Pressure gradient value only.
     * 
     */
    @XmlEnumValue("pore PG estimate most likely")
    PORE_PG_ESTIMATE_MOST_LIKELY("pore PG estimate most likely"),

    /**
     * Estimates of pore pressure made while drilling. Pressure value only.
     * 
     */
    @XmlEnumValue("pore pressure estimate while drilling")
    PORE_PRESSURE_ESTIMATE_WHILE_DRILLING("pore pressure estimate while drilling"),

    /**
     * Text comments highlighting anomalies in 
     * 					data or interpretation. Text value only.
     * 
     */
    @XmlEnumValue("pressure data comment")
    PRESSURE_DATA_COMMENT("pressure data comment"),

    /**
     * Text comment highlighting shale density 
     * 					anomalies. Text value only.
     * 
     */
    @XmlEnumValue("shale density comment")
    SHALE_DENSITY_COMMENT("shale density comment"),

    /**
     * Text associated with short trip (Wiper Trip) 
     * 					giving details of type and length of trip. Depth is MD at which short trip is made. Text value only.
     * 
     */
    @XmlEnumValue("short trip comment")
    SHORT_TRIP_COMMENT("short trip comment"),

    /**
     * Gives indication of presence of show report 
     * 					(refers to a separate document).  Text value only.
     * 
     */
    @XmlEnumValue("show report comment")
    SHOW_REPORT_COMMENT("show report comment"),

    /**
     * Associated text for a sidewall core at a 
     * 					specific depth or a comment associated with a sidewall core program / interval. Text may give SWC number, status, lithology etc. Text value only.
     * 
     */
    @XmlEnumValue("sidewall core comment")
    SIDEWALL_CORE_COMMENT("sidewall core comment"),

    /**
     * Interval over which drill bit slides - drilling 
     * 					with no surface rotation. Usually seen as a symbol with 
     * 					generally no associated text.
     * 
     */
    @XmlEnumValue("sliding Interval")
    SLIDING_INTERVAL("sliding Interval"),

    /**
     * Text listing steam still result - chromatographic 
     * 					breakdown of sample from steam still.  Text value only.
     * 
     */
    @XmlEnumValue("steam still results comment")
    STEAM_STILL_RESULTS_COMMENT("steam still results comment"),

    /**
     * Comment in regards to drilling survey; may include 
     * 					summary of survey data such as direction, dip and azimuth of survey and 
     * 					measured and TVD depths.  Text value only.
     * 
     */
    @XmlEnumValue("survey comment")
    SURVEY_COMMENT("survey comment"),

    /**
     * Text giving comments on temperature data and curves. 
     * 					Text value only.
     * 
     */
    @XmlEnumValue("temperature data comment")
    TEMPERATURE_DATA_COMMENT("temperature data comment"),

    /**
     * Text comments highlighting anomalies in temperature 
     * 					trend data or interpretation. Text value only.
     * 
     */
    @XmlEnumValue("temperature trend comment")
    TEMPERATURE_TREND_COMMENT("temperature trend comment"),

    /**
     * List of wireline logging tools run in this job, 
     * 					usually in run order. Will also include run numbers. Text value only.
     * 
     */
    @XmlEnumValue("wireline log comment")
    WIRELINE_LOG_COMMENT("wireline log comment"),

    /**
     * The value is not known. This value should not be used
     * 					in normal situations. All reasonable attempts should be made to determine
     * 					the appropriate value. Use of this value may result in rejection in some situations.
     * 
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    MudLogParameterType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MudLogParameterType fromValue(String v) {
        for (MudLogParameterType c: MudLogParameterType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
