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
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Definition 
 *             ============ 
 *             Single data instance that is part of a key.
 * 
 * <p>Java class for KeyMember complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="KeyMember">
 *   <complexContent>
 *     <extension base="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}InstanceValue">
 *       <sequence>
 *         <element name="KeyMember_isBasedOn_DataStructureComponent" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}Reference">
 *                 <sequence>
 *                   <element name="ddiReference" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}InternationalRegistrationDataIdentifier" minOccurs="0"/>
 *                   <element name="validType" maxOccurs="unbounded" minOccurs="0">
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
 *                 <attribute name="isAssociationReference" type="{http://www.w3.org/2001/XMLSchema}boolean" fixed="true" />
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KeyMember", propOrder = {
    "keyMemberIsBasedOnDataStructureComponent"
})
@XmlSeeAlso({
    Descriptor.class,
    DimensionalKeyMember.class,
    LongMainKeyMember.class,
    MainKeyMember.class,
    WideKeyMember.class
})
public class KeyMember
    extends InstanceValue
{

    @XmlElement(name = "KeyMember_isBasedOn_DataStructureComponent")
    protected List<KeyMember.KeyMemberIsBasedOnDataStructureComponent> keyMemberIsBasedOnDataStructureComponent;

    /**
     * Gets the value of the keyMemberIsBasedOnDataStructureComponent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the keyMemberIsBasedOnDataStructureComponent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeyMemberIsBasedOnDataStructureComponent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeyMember.KeyMemberIsBasedOnDataStructureComponent }
     * 
     * 
     * @return
     *     The value of the keyMemberIsBasedOnDataStructureComponent property.
     */
    public List<KeyMember.KeyMemberIsBasedOnDataStructureComponent> getKeyMemberIsBasedOnDataStructureComponent() {
        if (keyMemberIsBasedOnDataStructureComponent == null) {
            keyMemberIsBasedOnDataStructureComponent = new ArrayList<>();
        }
        return this.keyMemberIsBasedOnDataStructureComponent;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}Reference">
     *       <sequence>
     *         <element name="ddiReference" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}InternationalRegistrationDataIdentifier" minOccurs="0"/>
     *         <element name="validType" maxOccurs="unbounded" minOccurs="0">
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
     *       <attribute name="isAssociationReference" type="{http://www.w3.org/2001/XMLSchema}boolean" fixed="true" />
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class KeyMemberIsBasedOnDataStructureComponent
        extends Reference
    {


    }

}
