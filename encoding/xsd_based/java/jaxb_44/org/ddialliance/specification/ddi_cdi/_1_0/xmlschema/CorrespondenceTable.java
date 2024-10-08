//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package org.ddialliance.specification.ddi_cdi._1_0.xmlschema;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Definition 
 *             ============ 
 *             Set of relationships between the members within or between statistical classifications.  
 *             
 *             Examples 
 *             ========== 
 *             Correspondence between the U.S. Standard Industrial Classification (SIC) and North American Industrial Classification System (NAICS).  
 *             
 *             Explanatory notes 
 *             =================== 
 *             Correspondence tables are used with statistical classifications. For instance, it can relate two versions from the same classification series; statistical classifications from different classification series; a variant and the version on which it is based; or different versions of a variant. In the first and last examples, the correspondence table facilitates comparability over time.
 * 
 * <p>Java class for CorrespondenceTable complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CorrespondenceTable">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="catalogDetails" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}CatalogDetails" minOccurs="0"/>
 *         <element name="effectiveDates" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}DateRange" minOccurs="0"/>
 *         <element name="identifier" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}Identifier" minOccurs="0"/>
 *         <element name="CorrespondenceTable_hasSource_Level" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}AssociationReference">
 *                 <sequence>
 *                   <element name="ddiReference" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}InternationalRegistrationDataIdentifier" minOccurs="0"/>
 *                   <element name="validType" maxOccurs="unbounded" minOccurs="0">
 *                     <simpleType>
 *                       <restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                         <enumeration value="Level"/>
 *                       </restriction>
 *                     </simpleType>
 *                   </element>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="CorrespondenceTable_hasTarget_Level" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}AssociationReference">
 *                 <sequence>
 *                   <element name="ddiReference" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}InternationalRegistrationDataIdentifier" minOccurs="0"/>
 *                   <element name="validType" maxOccurs="unbounded" minOccurs="0">
 *                     <simpleType>
 *                       <restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                         <enumeration value="Level"/>
 *                       </restriction>
 *                     </simpleType>
 *                   </element>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="CorrespondenceTable_isOwnedBy_Agent" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}AssociationReference">
 *                 <sequence>
 *                   <element name="ddiReference" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}InternationalRegistrationDataIdentifier" minOccurs="0"/>
 *                   <element name="validType" maxOccurs="unbounded" minOccurs="0">
 *                     <simpleType>
 *                       <restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                         <enumeration value="Agent"/>
 *                         <enumeration value="Curator"/>
 *                         <enumeration value="Individual"/>
 *                         <enumeration value="Machine"/>
 *                         <enumeration value="Organization"/>
 *                         <enumeration value="ProcessingAgent"/>
 *                         <enumeration value="Service"/>
 *                       </restriction>
 *                     </simpleType>
 *                   </element>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="CorrespondenceTable_mapsTo_StatisticalClassification" maxOccurs="unbounded" minOccurs="2">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}AssociationReference">
 *                 <sequence>
 *                   <element name="ddiReference" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}InternationalRegistrationDataIdentifier" minOccurs="0"/>
 *                   <element name="validType" maxOccurs="unbounded" minOccurs="0">
 *                     <simpleType>
 *                       <restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                         <enumeration value="StatisticalClassification"/>
 *                       </restriction>
 *                     </simpleType>
 *                   </element>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="CorrespondenceTable_hasContact_Agent" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}AssociationReference">
 *                 <sequence>
 *                   <element name="ddiReference" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}InternationalRegistrationDataIdentifier" minOccurs="0"/>
 *                   <element name="validType" maxOccurs="unbounded" minOccurs="0">
 *                     <simpleType>
 *                       <restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                         <enumeration value="Agent"/>
 *                         <enumeration value="Curator"/>
 *                         <enumeration value="Individual"/>
 *                         <enumeration value="Machine"/>
 *                         <enumeration value="Organization"/>
 *                         <enumeration value="ProcessingAgent"/>
 *                         <enumeration value="Service"/>
 *                       </restriction>
 *                     </simpleType>
 *                   </element>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="CorrespondenceTable_isMaintainedBy_Agent" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}AssociationReference">
 *                 <sequence>
 *                   <element name="ddiReference" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}InternationalRegistrationDataIdentifier" minOccurs="0"/>
 *                   <element name="validType" maxOccurs="unbounded" minOccurs="0">
 *                     <simpleType>
 *                       <restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                         <enumeration value="Agent"/>
 *                         <enumeration value="Curator"/>
 *                         <enumeration value="Individual"/>
 *                         <enumeration value="Machine"/>
 *                         <enumeration value="Organization"/>
 *                         <enumeration value="ProcessingAgent"/>
 *                         <enumeration value="Service"/>
 *                       </restriction>
 *                     </simpleType>
 *                   </element>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="CorrespondenceTable_has_ConceptMap" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}AssociationReference">
 *                 <sequence>
 *                   <element name="ddiReference" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}InternationalRegistrationDataIdentifier" minOccurs="0"/>
 *                   <element name="validType" minOccurs="0">
 *                     <simpleType>
 *                       <restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                         <enumeration value="ConceptMap"/>
 *                       </restriction>
 *                     </simpleType>
 *                   </element>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorrespondenceTable", propOrder = {
    "catalogDetails",
    "effectiveDates",
    "identifier",
    "correspondenceTableHasSourceLevel",
    "correspondenceTableHasTargetLevel",
    "correspondenceTableIsOwnedByAgent",
    "correspondenceTableMapsToStatisticalClassification",
    "correspondenceTableHasContactAgent",
    "correspondenceTableIsMaintainedByAgent",
    "correspondenceTableHasConceptMap"
})
public class CorrespondenceTable {

    protected CatalogDetails catalogDetails;
    protected DateRange effectiveDates;
    protected Identifier identifier;
    @XmlElement(name = "CorrespondenceTable_hasSource_Level")
    protected CorrespondenceTable.CorrespondenceTableHasSourceLevel correspondenceTableHasSourceLevel;
    @XmlElement(name = "CorrespondenceTable_hasTarget_Level")
    protected CorrespondenceTable.CorrespondenceTableHasTargetLevel correspondenceTableHasTargetLevel;
    @XmlElement(name = "CorrespondenceTable_isOwnedBy_Agent")
    protected List<CorrespondenceTable.CorrespondenceTableIsOwnedByAgent> correspondenceTableIsOwnedByAgent;
    @XmlElement(name = "CorrespondenceTable_mapsTo_StatisticalClassification", required = true)
    protected List<CorrespondenceTable.CorrespondenceTableMapsToStatisticalClassification> correspondenceTableMapsToStatisticalClassification;
    @XmlElement(name = "CorrespondenceTable_hasContact_Agent")
    protected List<CorrespondenceTable.CorrespondenceTableHasContactAgent> correspondenceTableHasContactAgent;
    @XmlElement(name = "CorrespondenceTable_isMaintainedBy_Agent")
    protected CorrespondenceTable.CorrespondenceTableIsMaintainedByAgent correspondenceTableIsMaintainedByAgent;
    @XmlElement(name = "CorrespondenceTable_has_ConceptMap")
    protected List<CorrespondenceTable.CorrespondenceTableHasConceptMap> correspondenceTableHasConceptMap;

    /**
     * Gets the value of the catalogDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CatalogDetails }
     *     
     */
    public CatalogDetails getCatalogDetails() {
        return catalogDetails;
    }

    /**
     * Sets the value of the catalogDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CatalogDetails }
     *     
     */
    public void setCatalogDetails(CatalogDetails value) {
        this.catalogDetails = value;
    }

    /**
     * Gets the value of the effectiveDates property.
     * 
     * @return
     *     possible object is
     *     {@link DateRange }
     *     
     */
    public DateRange getEffectiveDates() {
        return effectiveDates;
    }

    /**
     * Sets the value of the effectiveDates property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateRange }
     *     
     */
    public void setEffectiveDates(DateRange value) {
        this.effectiveDates = value;
    }

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link Identifier }
     *     
     */
    public Identifier getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Identifier }
     *     
     */
    public void setIdentifier(Identifier value) {
        this.identifier = value;
    }

    /**
     * Gets the value of the correspondenceTableHasSourceLevel property.
     * 
     * @return
     *     possible object is
     *     {@link CorrespondenceTable.CorrespondenceTableHasSourceLevel }
     *     
     */
    public CorrespondenceTable.CorrespondenceTableHasSourceLevel getCorrespondenceTableHasSourceLevel() {
        return correspondenceTableHasSourceLevel;
    }

    /**
     * Sets the value of the correspondenceTableHasSourceLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorrespondenceTable.CorrespondenceTableHasSourceLevel }
     *     
     */
    public void setCorrespondenceTableHasSourceLevel(CorrespondenceTable.CorrespondenceTableHasSourceLevel value) {
        this.correspondenceTableHasSourceLevel = value;
    }

    /**
     * Gets the value of the correspondenceTableHasTargetLevel property.
     * 
     * @return
     *     possible object is
     *     {@link CorrespondenceTable.CorrespondenceTableHasTargetLevel }
     *     
     */
    public CorrespondenceTable.CorrespondenceTableHasTargetLevel getCorrespondenceTableHasTargetLevel() {
        return correspondenceTableHasTargetLevel;
    }

    /**
     * Sets the value of the correspondenceTableHasTargetLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorrespondenceTable.CorrespondenceTableHasTargetLevel }
     *     
     */
    public void setCorrespondenceTableHasTargetLevel(CorrespondenceTable.CorrespondenceTableHasTargetLevel value) {
        this.correspondenceTableHasTargetLevel = value;
    }

    /**
     * Gets the value of the correspondenceTableIsOwnedByAgent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the correspondenceTableIsOwnedByAgent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCorrespondenceTableIsOwnedByAgent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CorrespondenceTable.CorrespondenceTableIsOwnedByAgent }
     * 
     * 
     * @return
     *     The value of the correspondenceTableIsOwnedByAgent property.
     */
    public List<CorrespondenceTable.CorrespondenceTableIsOwnedByAgent> getCorrespondenceTableIsOwnedByAgent() {
        if (correspondenceTableIsOwnedByAgent == null) {
            correspondenceTableIsOwnedByAgent = new ArrayList<>();
        }
        return this.correspondenceTableIsOwnedByAgent;
    }

    /**
     * Gets the value of the correspondenceTableMapsToStatisticalClassification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the correspondenceTableMapsToStatisticalClassification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCorrespondenceTableMapsToStatisticalClassification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CorrespondenceTable.CorrespondenceTableMapsToStatisticalClassification }
     * 
     * 
     * @return
     *     The value of the correspondenceTableMapsToStatisticalClassification property.
     */
    public List<CorrespondenceTable.CorrespondenceTableMapsToStatisticalClassification> getCorrespondenceTableMapsToStatisticalClassification() {
        if (correspondenceTableMapsToStatisticalClassification == null) {
            correspondenceTableMapsToStatisticalClassification = new ArrayList<>();
        }
        return this.correspondenceTableMapsToStatisticalClassification;
    }

    /**
     * Gets the value of the correspondenceTableHasContactAgent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the correspondenceTableHasContactAgent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCorrespondenceTableHasContactAgent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CorrespondenceTable.CorrespondenceTableHasContactAgent }
     * 
     * 
     * @return
     *     The value of the correspondenceTableHasContactAgent property.
     */
    public List<CorrespondenceTable.CorrespondenceTableHasContactAgent> getCorrespondenceTableHasContactAgent() {
        if (correspondenceTableHasContactAgent == null) {
            correspondenceTableHasContactAgent = new ArrayList<>();
        }
        return this.correspondenceTableHasContactAgent;
    }

    /**
     * Gets the value of the correspondenceTableIsMaintainedByAgent property.
     * 
     * @return
     *     possible object is
     *     {@link CorrespondenceTable.CorrespondenceTableIsMaintainedByAgent }
     *     
     */
    public CorrespondenceTable.CorrespondenceTableIsMaintainedByAgent getCorrespondenceTableIsMaintainedByAgent() {
        return correspondenceTableIsMaintainedByAgent;
    }

    /**
     * Sets the value of the correspondenceTableIsMaintainedByAgent property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorrespondenceTable.CorrespondenceTableIsMaintainedByAgent }
     *     
     */
    public void setCorrespondenceTableIsMaintainedByAgent(CorrespondenceTable.CorrespondenceTableIsMaintainedByAgent value) {
        this.correspondenceTableIsMaintainedByAgent = value;
    }

    /**
     * Gets the value of the correspondenceTableHasConceptMap property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the correspondenceTableHasConceptMap property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCorrespondenceTableHasConceptMap().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CorrespondenceTable.CorrespondenceTableHasConceptMap }
     * 
     * 
     * @return
     *     The value of the correspondenceTableHasConceptMap property.
     */
    public List<CorrespondenceTable.CorrespondenceTableHasConceptMap> getCorrespondenceTableHasConceptMap() {
        if (correspondenceTableHasConceptMap == null) {
            correspondenceTableHasConceptMap = new ArrayList<>();
        }
        return this.correspondenceTableHasConceptMap;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}AssociationReference">
     *       <sequence>
     *         <element name="ddiReference" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}InternationalRegistrationDataIdentifier" minOccurs="0"/>
     *         <element name="validType" minOccurs="0">
     *           <simpleType>
     *             <restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
     *               <enumeration value="ConceptMap"/>
     *             </restriction>
     *           </simpleType>
     *         </element>
     *       </sequence>
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class CorrespondenceTableHasConceptMap
        extends AssociationReference
    {


    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}AssociationReference">
     *       <sequence>
     *         <element name="ddiReference" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}InternationalRegistrationDataIdentifier" minOccurs="0"/>
     *         <element name="validType" maxOccurs="unbounded" minOccurs="0">
     *           <simpleType>
     *             <restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
     *               <enumeration value="Agent"/>
     *               <enumeration value="Curator"/>
     *               <enumeration value="Individual"/>
     *               <enumeration value="Machine"/>
     *               <enumeration value="Organization"/>
     *               <enumeration value="ProcessingAgent"/>
     *               <enumeration value="Service"/>
     *             </restriction>
     *           </simpleType>
     *         </element>
     *       </sequence>
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class CorrespondenceTableHasContactAgent
        extends AssociationReference
    {


    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}AssociationReference">
     *       <sequence>
     *         <element name="ddiReference" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}InternationalRegistrationDataIdentifier" minOccurs="0"/>
     *         <element name="validType" maxOccurs="unbounded" minOccurs="0">
     *           <simpleType>
     *             <restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
     *               <enumeration value="Level"/>
     *             </restriction>
     *           </simpleType>
     *         </element>
     *       </sequence>
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class CorrespondenceTableHasSourceLevel
        extends AssociationReference
    {


    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}AssociationReference">
     *       <sequence>
     *         <element name="ddiReference" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}InternationalRegistrationDataIdentifier" minOccurs="0"/>
     *         <element name="validType" maxOccurs="unbounded" minOccurs="0">
     *           <simpleType>
     *             <restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
     *               <enumeration value="Level"/>
     *             </restriction>
     *           </simpleType>
     *         </element>
     *       </sequence>
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class CorrespondenceTableHasTargetLevel
        extends AssociationReference
    {


    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}AssociationReference">
     *       <sequence>
     *         <element name="ddiReference" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}InternationalRegistrationDataIdentifier" minOccurs="0"/>
     *         <element name="validType" maxOccurs="unbounded" minOccurs="0">
     *           <simpleType>
     *             <restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
     *               <enumeration value="Agent"/>
     *               <enumeration value="Curator"/>
     *               <enumeration value="Individual"/>
     *               <enumeration value="Machine"/>
     *               <enumeration value="Organization"/>
     *               <enumeration value="ProcessingAgent"/>
     *               <enumeration value="Service"/>
     *             </restriction>
     *           </simpleType>
     *         </element>
     *       </sequence>
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class CorrespondenceTableIsMaintainedByAgent
        extends AssociationReference
    {


    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}AssociationReference">
     *       <sequence>
     *         <element name="ddiReference" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}InternationalRegistrationDataIdentifier" minOccurs="0"/>
     *         <element name="validType" maxOccurs="unbounded" minOccurs="0">
     *           <simpleType>
     *             <restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
     *               <enumeration value="Agent"/>
     *               <enumeration value="Curator"/>
     *               <enumeration value="Individual"/>
     *               <enumeration value="Machine"/>
     *               <enumeration value="Organization"/>
     *               <enumeration value="ProcessingAgent"/>
     *               <enumeration value="Service"/>
     *             </restriction>
     *           </simpleType>
     *         </element>
     *       </sequence>
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class CorrespondenceTableIsOwnedByAgent
        extends AssociationReference
    {


    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}AssociationReference">
     *       <sequence>
     *         <element name="ddiReference" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}InternationalRegistrationDataIdentifier" minOccurs="0"/>
     *         <element name="validType" maxOccurs="unbounded" minOccurs="0">
     *           <simpleType>
     *             <restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
     *               <enumeration value="StatisticalClassification"/>
     *             </restriction>
     *           </simpleType>
     *         </element>
     *       </sequence>
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class CorrespondenceTableMapsToStatisticalClassification
        extends AssociationReference
    {


    }

}
