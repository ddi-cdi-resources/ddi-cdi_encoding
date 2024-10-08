//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package org.ddialliance.specification.ddi_cdi._1_0.xmlschema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Definition
 *             ==========
 *             A standard means of expressing a name for a class object. A linguistic signifier. Human understandable name (word, phrase, or mnemonic) that reflects the ISO/IEC 11179-5 naming principles.
 *             
 *             Explanatory notes
 *             =================
 *             Use in model: In general the property name should be "name" as it is the name of the class object of which it is an attribute. Use a specific name (i.e. xxxName) only when naming something other than the class object of which it is an attribute.
 * 
 * <p>Java class for ObjectName complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ObjectName">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="context" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}ControlledVocabularyEntry" minOccurs="0"/>
 *         <element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObjectName", propOrder = {
    "context",
    "name"
})
@XmlSeeAlso({
    OrganizationName.class
})
public class ObjectName {

    protected ControlledVocabularyEntry context;
    protected String name;

    /**
     * Gets the value of the context property.
     * 
     * @return
     *     possible object is
     *     {@link ControlledVocabularyEntry }
     *     
     */
    public ControlledVocabularyEntry getContext() {
        return context;
    }

    /**
     * Sets the value of the context property.
     * 
     * @param value
     *     allowed object is
     *     {@link ControlledVocabularyEntry }
     *     
     */
    public void setContext(ControlledVocabularyEntry value) {
        this.context = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

}
