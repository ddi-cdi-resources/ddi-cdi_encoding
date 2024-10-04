/*
 * An XML document type.
 * Localname: ComponentPosition
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.ComponentPositionDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one ComponentPosition(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface ComponentPositionDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ComponentPositionDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s65F2E4CDA8D692346164D243434CB4E1.TypeSystemHolder.typeSystem, "componentposition6522doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "ComponentPosition" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ComponentPosition getComponentPosition();

    /**
     * Sets the "ComponentPosition" element
     */
    void setComponentPosition(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ComponentPosition componentPosition);

    /**
     * Appends and returns a new empty "ComponentPosition" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ComponentPosition addNewComponentPosition();
}
