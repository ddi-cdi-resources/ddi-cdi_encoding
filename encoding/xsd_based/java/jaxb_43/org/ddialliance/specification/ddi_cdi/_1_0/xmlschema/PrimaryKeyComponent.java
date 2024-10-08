//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package org.ddialliance.specification.ddi_cdi._1_0.xmlschema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Definition
 *             ============
 *             Role of a data structure component for content identification purposes
 *             
 *             Explanatory notes
 *             ===================
 *             Equivalent to a primary key attribute (i.e. column) in the relational model.
 *             It can be used in conjunction with a foreign key component to link data structures and their related datasets.
 * 
 * <p>Java class for PrimaryKeyComponent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PrimaryKeyComponent">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="identifier" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}Identifier" minOccurs="0"/>
 *         <element name="PrimaryKeyComponent_correspondsTo_DataStructureComponent">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}AssociationReference">
 *                 <sequence>
 *                   <element name="ddiReference" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}InternationalRegistrationDataIdentifier" minOccurs="0"/>
 *                   <element name="validType" minOccurs="0">
 *                     <simpleType>
 *                       <restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                         <enumeration value="AttributeComponent"/>
 *                         <enumeration value="ContextualComponent"/>
 *                         <enumeration value="DataStructure"/>
 *                         <enumeration value="DataStructureComponent"/>
 *                         <enumeration value="DimensionComponent"/>
 *                         <enumeration value="DimensionalDataStructure"/>
 *                         <enumeration value="IdentifierComponent"/>
 *                         <enumeration value="KeyValueStructure"/>
 *                         <enumeration value="LongDataStructure"/>
 *                         <enumeration value="MeasureComponent"/>
 *                         <enumeration value="QualifiedMeasure"/>
 *                         <enumeration value="SyntheticIdComponent"/>
 *                         <enumeration value="VariableDescriptorComponent"/>
 *                         <enumeration value="VariableValueComponent"/>
 *                         <enumeration value="WideDataStructure"/>
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
@XmlType(name = "PrimaryKeyComponent", propOrder = {
    "identifier",
    "primaryKeyComponentCorrespondsToDataStructureComponent"
})
public class PrimaryKeyComponent {

    protected Identifier identifier;
    @XmlElement(name = "PrimaryKeyComponent_correspondsTo_DataStructureComponent", required = true)
    protected PrimaryKeyComponent.PrimaryKeyComponentCorrespondsToDataStructureComponent primaryKeyComponentCorrespondsToDataStructureComponent;

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
     * Gets the value of the primaryKeyComponentCorrespondsToDataStructureComponent property.
     * 
     * @return
     *     possible object is
     *     {@link PrimaryKeyComponent.PrimaryKeyComponentCorrespondsToDataStructureComponent }
     *     
     */
    public PrimaryKeyComponent.PrimaryKeyComponentCorrespondsToDataStructureComponent getPrimaryKeyComponentCorrespondsToDataStructureComponent() {
        return primaryKeyComponentCorrespondsToDataStructureComponent;
    }

    /**
     * Sets the value of the primaryKeyComponentCorrespondsToDataStructureComponent property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrimaryKeyComponent.PrimaryKeyComponentCorrespondsToDataStructureComponent }
     *     
     */
    public void setPrimaryKeyComponentCorrespondsToDataStructureComponent(PrimaryKeyComponent.PrimaryKeyComponentCorrespondsToDataStructureComponent value) {
        this.primaryKeyComponentCorrespondsToDataStructureComponent = value;
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
     *               <enumeration value="AttributeComponent"/>
     *               <enumeration value="ContextualComponent"/>
     *               <enumeration value="DataStructure"/>
     *               <enumeration value="DataStructureComponent"/>
     *               <enumeration value="DimensionComponent"/>
     *               <enumeration value="DimensionalDataStructure"/>
     *               <enumeration value="IdentifierComponent"/>
     *               <enumeration value="KeyValueStructure"/>
     *               <enumeration value="LongDataStructure"/>
     *               <enumeration value="MeasureComponent"/>
     *               <enumeration value="QualifiedMeasure"/>
     *               <enumeration value="SyntheticIdComponent"/>
     *               <enumeration value="VariableDescriptorComponent"/>
     *               <enumeration value="VariableValueComponent"/>
     *               <enumeration value="WideDataStructure"/>
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
    public static class PrimaryKeyComponentCorrespondsToDataStructureComponent
        extends AssociationReference
    {


    }

}
