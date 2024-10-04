/*
 * An XML document type.
 * Localname: QualifiedMeasure
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.QualifiedMeasureDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one QualifiedMeasure(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface QualifiedMeasureDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.QualifiedMeasureDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "qualifiedmeasure1610doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "QualifiedMeasure" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.QualifiedMeasure getQualifiedMeasure();

    /**
     * Sets the "QualifiedMeasure" element
     */
    void setQualifiedMeasure(org.ddialliance.specification.ddiCDI.x10.xmlSchema.QualifiedMeasure qualifiedMeasure);

    /**
     * Appends and returns a new empty "QualifiedMeasure" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.QualifiedMeasure addNewQualifiedMeasure();
}
