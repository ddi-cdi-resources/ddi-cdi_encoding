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
 *             Listing of agents of any type who may be organized to describe relationships between agents.  
 *             
 *             Examples 
 *             ========== 
 *             Organizations contributing to a project. Individuals within an agency. All organizations, individuals, and machines identified within the collections of an archive. A listing of organizations contributing to a network for the purposes of providing data.
 *             
 *             Explanatory notes 
 *             =================== 
 *             Relationships between agents are fluid and reflect effective dates of the relationship. An agent may have multiple relationships which may be sequential or concurrent. Relationships may or may not be hierarchical in nature. All Agents are serialized individually and brought into relationships as appropriate.
 * 
 * <p>Java class for AgentListing complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AgentListing">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="allowsDuplicates" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="identifier" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}Identifier" minOccurs="0"/>
 *         <element name="name" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}ObjectName" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="purpose" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}InternationalString" minOccurs="0"/>
 *         <element name="AgentListing_isDefinedBy_Concept" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}AssociationReference">
 *                 <sequence>
 *                   <element name="ddiReference" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}InternationalRegistrationDataIdentifier" minOccurs="0"/>
 *                   <element name="validType" maxOccurs="unbounded" minOccurs="0">
 *                     <simpleType>
 *                       <restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                         <enumeration value="Category"/>
 *                         <enumeration value="Concept"/>
 *                         <enumeration value="ConceptualValue"/>
 *                         <enumeration value="ConceptualVariable"/>
 *                         <enumeration value="DescriptorVariable"/>
 *                         <enumeration value="DimensionalKeyDefinitionMember"/>
 *                         <enumeration value="InstanceVariable"/>
 *                         <enumeration value="KeyDefinitionMember"/>
 *                         <enumeration value="Population"/>
 *                         <enumeration value="ReferenceVariable"/>
 *                         <enumeration value="RepresentedVariable"/>
 *                         <enumeration value="UnitType"/>
 *                         <enumeration value="Universe"/>
 *                       </restriction>
 *                     </simpleType>
 *                   </element>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="AgentListing_isMaintainedBy_Agent" minOccurs="0">
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
 *         <element name="AgentListing_has_AgentPosition" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}AssociationReference">
 *                 <sequence>
 *                   <element name="ddiReference" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}InternationalRegistrationDataIdentifier" minOccurs="0"/>
 *                   <element name="validType">
 *                     <simpleType>
 *                       <restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                         <enumeration value="AgentPosition"/>
 *                       </restriction>
 *                     </simpleType>
 *                   </element>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="AgentListing_has_Agent" maxOccurs="unbounded" minOccurs="0">
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
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgentListing", propOrder = {
    "allowsDuplicates",
    "identifier",
    "name",
    "purpose",
    "agentListingIsDefinedByConcept",
    "agentListingIsMaintainedByAgent",
    "agentListingHasAgentPosition",
    "agentListingHasAgent"
})
public class AgentListing {

    protected boolean allowsDuplicates;
    protected Identifier identifier;
    protected List<ObjectName> name;
    protected InternationalString purpose;
    @XmlElement(name = "AgentListing_isDefinedBy_Concept")
    protected List<AgentListing.AgentListingIsDefinedByConcept> agentListingIsDefinedByConcept;
    @XmlElement(name = "AgentListing_isMaintainedBy_Agent")
    protected AgentListing.AgentListingIsMaintainedByAgent agentListingIsMaintainedByAgent;
    @XmlElement(name = "AgentListing_has_AgentPosition")
    protected List<AgentListing.AgentListingHasAgentPosition> agentListingHasAgentPosition;
    @XmlElement(name = "AgentListing_has_Agent")
    protected List<AgentListing.AgentListingHasAgent> agentListingHasAgent;

    /**
     * Gets the value of the allowsDuplicates property.
     * 
     */
    public boolean isAllowsDuplicates() {
        return allowsDuplicates;
    }

    /**
     * Sets the value of the allowsDuplicates property.
     * 
     */
    public void setAllowsDuplicates(boolean value) {
        this.allowsDuplicates = value;
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
     * Gets the value of the name property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the name property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectName }
     * 
     * 
     * @return
     *     The value of the name property.
     */
    public List<ObjectName> getName() {
        if (name == null) {
            name = new ArrayList<>();
        }
        return this.name;
    }

    /**
     * Gets the value of the purpose property.
     * 
     * @return
     *     possible object is
     *     {@link InternationalString }
     *     
     */
    public InternationalString getPurpose() {
        return purpose;
    }

    /**
     * Sets the value of the purpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalString }
     *     
     */
    public void setPurpose(InternationalString value) {
        this.purpose = value;
    }

    /**
     * Gets the value of the agentListingIsDefinedByConcept property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the agentListingIsDefinedByConcept property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAgentListingIsDefinedByConcept().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AgentListing.AgentListingIsDefinedByConcept }
     * 
     * 
     * @return
     *     The value of the agentListingIsDefinedByConcept property.
     */
    public List<AgentListing.AgentListingIsDefinedByConcept> getAgentListingIsDefinedByConcept() {
        if (agentListingIsDefinedByConcept == null) {
            agentListingIsDefinedByConcept = new ArrayList<>();
        }
        return this.agentListingIsDefinedByConcept;
    }

    /**
     * Gets the value of the agentListingIsMaintainedByAgent property.
     * 
     * @return
     *     possible object is
     *     {@link AgentListing.AgentListingIsMaintainedByAgent }
     *     
     */
    public AgentListing.AgentListingIsMaintainedByAgent getAgentListingIsMaintainedByAgent() {
        return agentListingIsMaintainedByAgent;
    }

    /**
     * Sets the value of the agentListingIsMaintainedByAgent property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgentListing.AgentListingIsMaintainedByAgent }
     *     
     */
    public void setAgentListingIsMaintainedByAgent(AgentListing.AgentListingIsMaintainedByAgent value) {
        this.agentListingIsMaintainedByAgent = value;
    }

    /**
     * Gets the value of the agentListingHasAgentPosition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the agentListingHasAgentPosition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAgentListingHasAgentPosition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AgentListing.AgentListingHasAgentPosition }
     * 
     * 
     * @return
     *     The value of the agentListingHasAgentPosition property.
     */
    public List<AgentListing.AgentListingHasAgentPosition> getAgentListingHasAgentPosition() {
        if (agentListingHasAgentPosition == null) {
            agentListingHasAgentPosition = new ArrayList<>();
        }
        return this.agentListingHasAgentPosition;
    }

    /**
     * Gets the value of the agentListingHasAgent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the agentListingHasAgent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAgentListingHasAgent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AgentListing.AgentListingHasAgent }
     * 
     * 
     * @return
     *     The value of the agentListingHasAgent property.
     */
    public List<AgentListing.AgentListingHasAgent> getAgentListingHasAgent() {
        if (agentListingHasAgent == null) {
            agentListingHasAgent = new ArrayList<>();
        }
        return this.agentListingHasAgent;
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
    public static class AgentListingHasAgent
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
     *         <element name="validType">
     *           <simpleType>
     *             <restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
     *               <enumeration value="AgentPosition"/>
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
    public static class AgentListingHasAgentPosition
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
     *               <enumeration value="Category"/>
     *               <enumeration value="Concept"/>
     *               <enumeration value="ConceptualValue"/>
     *               <enumeration value="ConceptualVariable"/>
     *               <enumeration value="DescriptorVariable"/>
     *               <enumeration value="DimensionalKeyDefinitionMember"/>
     *               <enumeration value="InstanceVariable"/>
     *               <enumeration value="KeyDefinitionMember"/>
     *               <enumeration value="Population"/>
     *               <enumeration value="ReferenceVariable"/>
     *               <enumeration value="RepresentedVariable"/>
     *               <enumeration value="UnitType"/>
     *               <enumeration value="Universe"/>
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
    public static class AgentListingIsDefinedByConcept
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
    public static class AgentListingIsMaintainedByAgent
        extends AssociationReference
    {


    }

}
