/*
 * An XML document type.
 * Localname: CategoryRelationStructure
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationStructureDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one CategoryRelationStructure(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface CategoryRelationStructureDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationStructureDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "categoryrelationstructurec7d5doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "CategoryRelationStructure" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationStructure getCategoryRelationStructure();

    /**
     * Sets the "CategoryRelationStructure" element
     */
    void setCategoryRelationStructure(org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationStructure categoryRelationStructure);

    /**
     * Appends and returns a new empty "CategoryRelationStructure" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationStructure addNewCategoryRelationStructure();
}
