/*
 * An XML document type.
 * Localname: KeyDefinition
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyDefinitionDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one KeyDefinition(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface KeyDefinitionDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyDefinitionDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "keydefinition9e6edoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "KeyDefinition" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyDefinition getKeyDefinition();

    /**
     * Sets the "KeyDefinition" element
     */
    void setKeyDefinition(org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyDefinition keyDefinition);

    /**
     * Appends and returns a new empty "KeyDefinition" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyDefinition addNewKeyDefinition();
}
