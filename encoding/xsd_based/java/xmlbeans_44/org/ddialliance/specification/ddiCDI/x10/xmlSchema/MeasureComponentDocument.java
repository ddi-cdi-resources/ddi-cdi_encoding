/*
 * An XML document type.
 * Localname: MeasureComponent
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.MeasureComponentDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one MeasureComponent(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface MeasureComponentDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.MeasureComponentDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "measurecomponent60addoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "MeasureComponent" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.MeasureComponent getMeasureComponent();

    /**
     * Sets the "MeasureComponent" element
     */
    void setMeasureComponent(org.ddialliance.specification.ddiCDI.x10.xmlSchema.MeasureComponent measureComponent);

    /**
     * Appends and returns a new empty "MeasureComponent" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.MeasureComponent addNewMeasureComponent();
}
