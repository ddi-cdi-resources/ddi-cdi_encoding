/*
 * XML Type:  DateRange
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.DateRange
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML DateRange(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public interface DateRange extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.DateRange> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "daterangecd9btype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "endDate" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CombinedDate getEndDate();

    /**
     * True if has "endDate" element
     */
    boolean isSetEndDate();

    /**
     * Sets the "endDate" element
     */
    void setEndDate(org.ddialliance.specification.ddiCDI.x10.xmlSchema.CombinedDate endDate);

    /**
     * Appends and returns a new empty "endDate" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CombinedDate addNewEndDate();

    /**
     * Unsets the "endDate" element
     */
    void unsetEndDate();

    /**
     * Gets the "startDate" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CombinedDate getStartDate();

    /**
     * True if has "startDate" element
     */
    boolean isSetStartDate();

    /**
     * Sets the "startDate" element
     */
    void setStartDate(org.ddialliance.specification.ddiCDI.x10.xmlSchema.CombinedDate startDate);

    /**
     * Appends and returns a new empty "startDate" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CombinedDate addNewStartDate();

    /**
     * Unsets the "startDate" element
     */
    void unsetStartDate();
}
