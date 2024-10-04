/*
 * An XML document type.
 * Localname: RevisableDatum
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.RevisableDatumDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one RevisableDatum(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface RevisableDatumDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.RevisableDatumDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "revisabledatum76f6doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "RevisableDatum" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.RevisableDatum getRevisableDatum();

    /**
     * Sets the "RevisableDatum" element
     */
    void setRevisableDatum(org.ddialliance.specification.ddiCDI.x10.xmlSchema.RevisableDatum revisableDatum);

    /**
     * Appends and returns a new empty "RevisableDatum" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.RevisableDatum addNewRevisableDatum();
}
