/*
 * An XML document type.
 * Localname: CodePosition
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodePositionDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one CodePosition(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface CodePositionDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodePositionDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "codeposition5da4doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "CodePosition" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodePosition getCodePosition();

    /**
     * Sets the "CodePosition" element
     */
    void setCodePosition(org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodePosition codePosition);

    /**
     * Appends and returns a new empty "CodePosition" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodePosition addNewCodePosition();
}
