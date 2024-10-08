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
 *             Encapsulates contextual information of the key-value datastore to provide a scope to the instance key. The instance key is unique within the scope.
 *             
 *             Examples
 *             ==========
 *             A partition, cluster name and any other key-value datastore organization information. 
 *             
 *             Explanatory notes
 *             ===================
 *             A key-value datastore can be organized into multiple contextual components. 
 *             Other data structure components that are part of the instance key, e.g. identifier and dimension components, guarantee uniqueness only within the scope of a contextual component. 
 *             Synthetic id components do guarantee global uniqueness, but they might complex to setup and maintain in many organizations. 
 *             Contextual components provide a simple mechanism to achieve uniqueness within a single key-value datastore. 
 *             When a key-value datastore is organized in contextual components, a contextual component prefix is added to the instance key to make it unique across the entire key-value datastore.
 * 
 * <p>Java class for ContextualComponent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ContextualComponent">
 *   <complexContent>
 *     <extension base="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}DataStructureComponent">
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContextualComponent")
public class ContextualComponent
    extends DataStructureComponent
{


}
