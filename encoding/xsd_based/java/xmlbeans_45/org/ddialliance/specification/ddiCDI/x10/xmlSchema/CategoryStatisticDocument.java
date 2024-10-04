/*
 * An XML document type.
 * Localname: CategoryStatistic
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryStatisticDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one CategoryStatistic(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface CategoryStatisticDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryStatisticDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "categorystatistic07cedoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "CategoryStatistic" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryStatistic getCategoryStatistic();

    /**
     * Sets the "CategoryStatistic" element
     */
    void setCategoryStatistic(org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryStatistic categoryStatistic);

    /**
     * Appends and returns a new empty "CategoryStatistic" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryStatistic addNewCategoryStatistic();
}
