/*
 * An XML document type.
 * Localname: DimensionalKeyDefinitionMember
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyDefinitionMemberDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one DimensionalKeyDefinitionMember(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface DimensionalKeyDefinitionMemberDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyDefinitionMemberDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "dimensionalkeydefinitionmember9029doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "DimensionalKeyDefinitionMember" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyDefinitionMember getDimensionalKeyDefinitionMember();

    /**
     * Sets the "DimensionalKeyDefinitionMember" element
     */
    void setDimensionalKeyDefinitionMember(org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyDefinitionMember dimensionalKeyDefinitionMember);

    /**
     * Appends and returns a new empty "DimensionalKeyDefinitionMember" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyDefinitionMember addNewDimensionalKeyDefinitionMember();
}
