/*
 * An XML document type.
 * Localname: CodeList
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeListDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one CodeList(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface CodeListDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeListDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "codelistd299doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "CodeList" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeList getCodeList();

    /**
     * Sets the "CodeList" element
     */
    void setCodeList(org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeList codeList);

    /**
     * Appends and returns a new empty "CodeList" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeList addNewCodeList();
}
