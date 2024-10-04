/*
 * An XML document type.
 * Localname: UnitSegmentLayout
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.UnitSegmentLayoutDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one UnitSegmentLayout(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface UnitSegmentLayoutDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.UnitSegmentLayoutDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "unitsegmentlayout6275doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "UnitSegmentLayout" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.UnitSegmentLayout getUnitSegmentLayout();

    /**
     * Sets the "UnitSegmentLayout" element
     */
    void setUnitSegmentLayout(org.ddialliance.specification.ddiCDI.x10.xmlSchema.UnitSegmentLayout unitSegmentLayout);

    /**
     * Appends and returns a new empty "UnitSegmentLayout" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.UnitSegmentLayout addNewUnitSegmentLayout();
}
