/*
 * An XML document type.
 * Localname: ClassificationIndexEntry
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndexEntryDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one ClassificationIndexEntry(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface ClassificationIndexEntryDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndexEntryDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "classificationindexentry6534doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "ClassificationIndexEntry" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndexEntry getClassificationIndexEntry();

    /**
     * Sets the "ClassificationIndexEntry" element
     */
    void setClassificationIndexEntry(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndexEntry classificationIndexEntry);

    /**
     * Appends and returns a new empty "ClassificationIndexEntry" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndexEntry addNewClassificationIndexEntry();
}
