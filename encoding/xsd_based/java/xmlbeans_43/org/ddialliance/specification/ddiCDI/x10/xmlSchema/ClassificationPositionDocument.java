/*
 * An XML document type.
 * Localname: ClassificationPosition
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationPositionDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one ClassificationPosition(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface ClassificationPositionDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationPositionDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s65F2E4CDA8D692346164D243434CB4E1.TypeSystemHolder.typeSystem, "classificationposition0bdddoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "ClassificationPosition" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationPosition getClassificationPosition();

    /**
     * Sets the "ClassificationPosition" element
     */
    void setClassificationPosition(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationPosition classificationPosition);

    /**
     * Appends and returns a new empty "ClassificationPosition" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationPosition addNewClassificationPosition();
}
