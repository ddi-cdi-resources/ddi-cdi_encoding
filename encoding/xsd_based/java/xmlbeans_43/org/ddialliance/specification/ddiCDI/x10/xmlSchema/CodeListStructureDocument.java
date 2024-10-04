/*
 * An XML document type.
 * Localname: CodeListStructure
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeListStructureDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one CodeListStructure(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface CodeListStructureDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeListStructureDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s65F2E4CDA8D692346164D243434CB4E1.TypeSystemHolder.typeSystem, "codeliststructureb264doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "CodeListStructure" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeListStructure getCodeListStructure();

    /**
     * Sets the "CodeListStructure" element
     */
    void setCodeListStructure(org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeListStructure codeListStructure);

    /**
     * Appends and returns a new empty "CodeListStructure" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeListStructure addNewCodeListStructure();
}
