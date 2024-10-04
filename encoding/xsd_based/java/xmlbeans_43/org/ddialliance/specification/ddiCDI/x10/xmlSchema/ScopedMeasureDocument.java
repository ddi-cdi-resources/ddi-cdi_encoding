/*
 * An XML document type.
 * Localname: ScopedMeasure
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.ScopedMeasureDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one ScopedMeasure(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface ScopedMeasureDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ScopedMeasureDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s65F2E4CDA8D692346164D243434CB4E1.TypeSystemHolder.typeSystem, "scopedmeasured60adoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "ScopedMeasure" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ScopedMeasure getScopedMeasure();

    /**
     * Sets the "ScopedMeasure" element
     */
    void setScopedMeasure(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ScopedMeasure scopedMeasure);

    /**
     * Appends and returns a new empty "ScopedMeasure" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ScopedMeasure addNewScopedMeasure();
}
