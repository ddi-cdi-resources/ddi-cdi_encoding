/*
 * An XML document type.
 * Localname: DateRange
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.DateRangeDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one DateRange(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface DateRangeDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.DateRangeDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "daterange998bdoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "DateRange" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DateRange getDateRange();

    /**
     * Sets the "DateRange" element
     */
    void setDateRange(org.ddialliance.specification.ddiCDI.x10.xmlSchema.DateRange dateRange);

    /**
     * Appends and returns a new empty "DateRange" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DateRange addNewDateRange();
}
