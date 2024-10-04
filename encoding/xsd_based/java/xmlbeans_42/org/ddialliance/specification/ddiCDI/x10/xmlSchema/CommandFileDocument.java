/*
 * An XML document type.
 * Localname: CommandFile
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.CommandFileDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one CommandFile(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface CommandFileDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.CommandFileDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "commandfile4503doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "CommandFile" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CommandFile getCommandFile();

    /**
     * Sets the "CommandFile" element
     */
    void setCommandFile(org.ddialliance.specification.ddiCDI.x10.xmlSchema.CommandFile commandFile);

    /**
     * Appends and returns a new empty "CommandFile" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CommandFile addNewCommandFile();
}
