/*
 * An XML document type.
 * Localname: DimensionalKeyMember
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyMemberDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one DimensionalKeyMember(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface DimensionalKeyMemberDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyMemberDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "dimensionalkeymember4c36doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "DimensionalKeyMember" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyMember getDimensionalKeyMember();

    /**
     * Sets the "DimensionalKeyMember" element
     */
    void setDimensionalKeyMember(org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyMember dimensionalKeyMember);

    /**
     * Appends and returns a new empty "DimensionalKeyMember" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyMember addNewDimensionalKeyMember();
}
