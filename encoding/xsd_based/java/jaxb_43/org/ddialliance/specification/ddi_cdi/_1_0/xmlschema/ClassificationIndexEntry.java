//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package org.ddialliance.specification.ddi_cdi._1_0.xmlschema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Definition
 *             ============
 *             Word or a short phrase corresponding to a classification item in a statistical classification, together with the code of the corresponding classification item.
 *             
 *             Examples
 *             ==========
 *             The name of a locality, an economic activity, or an occupational title with the associated code from a corresponding classification item.
 *             
 *             Explanatory notes
 *             ===================
 *             Each Classification Index Entry (CIE) typically corresponds to one item of a Statistical Classification (SC). Although a CIE may be associated with a Classification Item (CI) at any Level of a SC, CIEs are normally associated with items at the lowest Level.
 *             A CIE corresponds to a CI if the CI classifies the CIE with respect to the SC of which the CI is a member.
 *             CIEs typically come from responses to survey questions or are verbatim descriptions in administrative records.
 * 
 * <p>Java class for ClassificationIndexEntry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ClassificationIndexEntry">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="catalogDetails" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}CatalogDetails" minOccurs="0"/>
 *         <element name="codingInstruction" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}CommandCode" minOccurs="0"/>
 *         <element name="entry" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}InternationalString" minOccurs="0"/>
 *         <element name="identifier" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}Identifier" minOccurs="0"/>
 *         <element name="validDates" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}DateRange" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClassificationIndexEntry", propOrder = {
    "catalogDetails",
    "codingInstruction",
    "entry",
    "identifier",
    "validDates"
})
public class ClassificationIndexEntry {

    protected CatalogDetails catalogDetails;
    protected CommandCode codingInstruction;
    protected InternationalString entry;
    protected Identifier identifier;
    protected DateRange validDates;

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
     * Gets the value of the codingInstruction property.
     * 
     * @return
     *     possible object is
     *     {@link CommandCode }
     *     
     */
    public CommandCode getCodingInstruction() {
        return codingInstruction;
    }

    /**
     * Sets the value of the codingInstruction property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommandCode }
     *     
     */
    public void setCodingInstruction(CommandCode value) {
        this.codingInstruction = value;
    }

    /**
     * Gets the value of the entry property.
     * 
     * @return
     *     possible object is
     *     {@link InternationalString }
     *     
     */
    public InternationalString getEntry() {
        return entry;
    }

    /**
     * Sets the value of the entry property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalString }
     *     
     */
    public void setEntry(InternationalString value) {
        this.entry = value;
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
     * Gets the value of the validDates property.
     * 
     * @return
     *     possible object is
     *     {@link DateRange }
     *     
     */
    public DateRange getValidDates() {
        return validDates;
    }

    /**
     * Sets the value of the validDates property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateRange }
     *     
     */
    public void setValidDates(DateRange value) {
        this.validDates = value;
    }

}
