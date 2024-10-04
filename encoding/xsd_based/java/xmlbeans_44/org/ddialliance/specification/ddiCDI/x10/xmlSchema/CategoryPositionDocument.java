/*
 * An XML document type.
 * Localname: CategoryPosition
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryPositionDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one CategoryPosition(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface CategoryPositionDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryPositionDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "categorypositionffb5doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "CategoryPosition" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryPosition getCategoryPosition();

    /**
     * Sets the "CategoryPosition" element
     */
    void setCategoryPosition(org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryPosition categoryPosition);

    /**
     * Appends and returns a new empty "CategoryPosition" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryPosition addNewCategoryPosition();
}
