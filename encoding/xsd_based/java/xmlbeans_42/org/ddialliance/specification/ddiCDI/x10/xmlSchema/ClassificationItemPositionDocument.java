/*
 * An XML document type.
 * Localname: ClassificationItemPosition
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemPositionDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one ClassificationItemPosition(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface ClassificationItemPositionDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemPositionDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "classificationitemposition5a10doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "ClassificationItemPosition" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemPosition getClassificationItemPosition();

    /**
     * Sets the "ClassificationItemPosition" element
     */
    void setClassificationItemPosition(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemPosition classificationItemPosition);

    /**
     * Appends and returns a new empty "ClassificationItemPosition" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemPosition addNewClassificationItemPosition();
}
