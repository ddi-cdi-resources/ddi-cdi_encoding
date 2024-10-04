/*
 * An XML document type.
 * Localname: CategorySet
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategorySetDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one CategorySet(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface CategorySetDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategorySetDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "categorysetc6a0doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "CategorySet" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategorySet getCategorySet();

    /**
     * Sets the "CategorySet" element
     */
    void setCategorySet(org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategorySet categorySet);

    /**
     * Appends and returns a new empty "CategorySet" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategorySet addNewCategorySet();
}
