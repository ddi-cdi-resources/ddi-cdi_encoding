/*
 * An XML document type.
 * Localname: ClassificationIndex
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndexDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one ClassificationIndex(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface ClassificationIndexDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndexDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "classificationindex99a8doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "ClassificationIndex" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex getClassificationIndex();

    /**
     * Sets the "ClassificationIndex" element
     */
    void setClassificationIndex(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex classificationIndex);

    /**
     * Appends and returns a new empty "ClassificationIndex" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex addNewClassificationIndex();
}
