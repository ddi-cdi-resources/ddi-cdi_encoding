//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package org.ddialliance.specification.ddi_cdi._1_0.xmlschema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Definition
 *             ============
 *             The mathematical properties of the structure.
 * 
 * <p>Java class for StructureSpecification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="StructureSpecification">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="reflexive" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}MemberRelationshipScope" minOccurs="0"/>
 *         <element name="symmetric" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}MemberRelationshipScope" minOccurs="0"/>
 *         <element name="transitive" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}MemberRelationshipScope" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StructureSpecification", propOrder = {
    "reflexive",
    "symmetric",
    "transitive"
})
public class StructureSpecification {

    @XmlSchemaType(name = "NMTOKEN")
    protected MemberRelationshipScope reflexive;
    @XmlSchemaType(name = "NMTOKEN")
    protected MemberRelationshipScope symmetric;
    @XmlSchemaType(name = "NMTOKEN")
    protected MemberRelationshipScope transitive;

    /**
     * Gets the value of the reflexive property.
     * 
     * @return
     *     possible object is
     *     {@link MemberRelationshipScope }
     *     
     */
    public MemberRelationshipScope getReflexive() {
        return reflexive;
    }

    /**
     * Sets the value of the reflexive property.
     * 
     * @param value
     *     allowed object is
     *     {@link MemberRelationshipScope }
     *     
     */
    public void setReflexive(MemberRelationshipScope value) {
        this.reflexive = value;
    }

    /**
     * Gets the value of the symmetric property.
     * 
     * @return
     *     possible object is
     *     {@link MemberRelationshipScope }
     *     
     */
    public MemberRelationshipScope getSymmetric() {
        return symmetric;
    }

    /**
     * Sets the value of the symmetric property.
     * 
     * @param value
     *     allowed object is
     *     {@link MemberRelationshipScope }
     *     
     */
    public void setSymmetric(MemberRelationshipScope value) {
        this.symmetric = value;
    }

    /**
     * Gets the value of the transitive property.
     * 
     * @return
     *     possible object is
     *     {@link MemberRelationshipScope }
     *     
     */
    public MemberRelationshipScope getTransitive() {
        return transitive;
    }

    /**
     * Sets the value of the transitive property.
     * 
     * @param value
     *     allowed object is
     *     {@link MemberRelationshipScope }
     *     
     */
    public void setTransitive(MemberRelationshipScope value) {
        this.transitive = value;
    }

}
