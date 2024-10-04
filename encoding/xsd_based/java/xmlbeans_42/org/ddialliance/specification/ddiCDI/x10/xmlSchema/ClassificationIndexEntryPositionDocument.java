/*
 * An XML document type.
 * Localname: ClassificationIndexEntryPosition
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndexEntryPositionDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one ClassificationIndexEntryPosition(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface ClassificationIndexEntryPositionDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndexEntryPositionDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "classificationindexentrypositiond7fddoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "ClassificationIndexEntryPosition" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndexEntryPosition getClassificationIndexEntryPosition();

    /**
     * Sets the "ClassificationIndexEntryPosition" element
     */
    void setClassificationIndexEntryPosition(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndexEntryPosition classificationIndexEntryPosition);

    /**
     * Appends and returns a new empty "ClassificationIndexEntryPosition" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndexEntryPosition addNewClassificationIndexEntryPosition();
}
