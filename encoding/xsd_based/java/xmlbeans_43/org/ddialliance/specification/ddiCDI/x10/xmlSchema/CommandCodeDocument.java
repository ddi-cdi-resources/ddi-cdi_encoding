/*
 * An XML document type.
 * Localname: CommandCode
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.CommandCodeDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one CommandCode(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface CommandCodeDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.CommandCodeDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s65F2E4CDA8D692346164D243434CB4E1.TypeSystemHolder.typeSystem, "commandcoded5f4doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "CommandCode" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CommandCode getCommandCode();

    /**
     * Sets the "CommandCode" element
     */
    void setCommandCode(org.ddialliance.specification.ddiCDI.x10.xmlSchema.CommandCode commandCode);

    /**
     * Appends and returns a new empty "CommandCode" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CommandCode addNewCommandCode();
}
