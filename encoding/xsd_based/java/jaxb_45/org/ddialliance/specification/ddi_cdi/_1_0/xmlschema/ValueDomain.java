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
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Definition 
 *             ============ 
 *             Set of permissible values for a variable (adapted from ISO/IEC 11179).  
 *             
 *             Examples 
 *             ========== 
 *             Age categories with a numeric code list; Age in years; Young, Middle-aged and Old.  
 *             
 *             Explanatory notes 
 *             =================== 
 *             The values can be described by enumeration or by an expression. Value domains can be either substantive/sentinel, or described/enumeration.
 * 
 * <p>Java class for ValueDomain complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ValueDomain">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="catalogDetails" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}CatalogDetails" minOccurs="0"/>
 *         <element name="displayLabel" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}LabelForDisplay" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="identifier" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}Identifier" minOccurs="0"/>
 *         <element name="recommendedDataType" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}ControlledVocabularyEntry" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValueDomain", propOrder = {
    "catalogDetails",
    "displayLabel",
    "identifier",
    "recommendedDataType"
})
@XmlSeeAlso({
    ReferenceValueDomain.class,
    SentinelValueDomain.class,
    SubstantiveValueDomain.class
})
public class ValueDomain {

    protected CatalogDetails catalogDetails;
    protected List<LabelForDisplay> displayLabel;
    protected Identifier identifier;
    protected List<ControlledVocabularyEntry> recommendedDataType;

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
     * Gets the value of the displayLabel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the displayLabel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDisplayLabel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LabelForDisplay }
     * 
     * 
     * @return
     *     The value of the displayLabel property.
     */
    public List<LabelForDisplay> getDisplayLabel() {
        if (displayLabel == null) {
            displayLabel = new ArrayList<>();
        }
        return this.displayLabel;
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
     * Gets the value of the recommendedDataType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the recommendedDataType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecommendedDataType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ControlledVocabularyEntry }
     * 
     * 
     * @return
     *     The value of the recommendedDataType property.
     */
    public List<ControlledVocabularyEntry> getRecommendedDataType() {
        if (recommendedDataType == null) {
            recommendedDataType = new ArrayList<>();
        }
        return this.recommendedDataType;
    }

}
