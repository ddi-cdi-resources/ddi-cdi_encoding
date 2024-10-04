/*
 * An XML document type.
 * Localname: ClassificationItem
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one ClassificationItem(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface ClassificationItemDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "classificationitemaa47doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "ClassificationItem" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItem getClassificationItem();

    /**
     * Sets the "ClassificationItem" element
     */
    void setClassificationItem(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItem classificationItem);

    /**
     * Appends and returns a new empty "ClassificationItem" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItem addNewClassificationItem();
}
