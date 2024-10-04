/*
 * An XML document type.
 * Localname: CategoryRelationship
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationshipDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one CategoryRelationship(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface CategoryRelationshipDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationshipDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "categoryrelationship50c4doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "CategoryRelationship" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationship getCategoryRelationship();

    /**
     * Sets the "CategoryRelationship" element
     */
    void setCategoryRelationship(org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationship categoryRelationship);

    /**
     * Appends and returns a new empty "CategoryRelationship" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationship addNewCategoryRelationship();
}
