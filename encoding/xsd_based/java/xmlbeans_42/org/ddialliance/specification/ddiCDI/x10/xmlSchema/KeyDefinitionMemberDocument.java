/*
 * An XML document type.
 * Localname: KeyDefinitionMember
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyDefinitionMemberDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one KeyDefinitionMember(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface KeyDefinitionMemberDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyDefinitionMemberDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "keydefinitionmember5b68doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "KeyDefinitionMember" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyDefinitionMember getKeyDefinitionMember();

    /**
     * Sets the "KeyDefinitionMember" element
     */
    void setKeyDefinitionMember(org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyDefinitionMember keyDefinitionMember);

    /**
     * Appends and returns a new empty "KeyDefinitionMember" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyDefinitionMember addNewKeyDefinitionMember();
}
