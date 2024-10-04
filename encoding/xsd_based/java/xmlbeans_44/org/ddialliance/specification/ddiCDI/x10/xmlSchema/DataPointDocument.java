/*
 * An XML document type.
 * Localname: DataPoint
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPointDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one DataPoint(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface DataPointDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPointDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "datapoint9ee2doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "DataPoint" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPoint getDataPoint();

    /**
     * Sets the "DataPoint" element
     */
    void setDataPoint(org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPoint dataPoint);

    /**
     * Appends and returns a new empty "DataPoint" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPoint addNewDataPoint();
}
