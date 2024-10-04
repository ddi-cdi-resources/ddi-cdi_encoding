/*
 * An XML document type.
 * Localname: StatisticalClassification
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassificationDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one StatisticalClassification(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface StatisticalClassificationDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassificationDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s65F2E4CDA8D692346164D243434CB4E1.TypeSystemHolder.typeSystem, "statisticalclassificationbc9ddoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "StatisticalClassification" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification getStatisticalClassification();

    /**
     * Sets the "StatisticalClassification" element
     */
    void setStatisticalClassification(org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification statisticalClassification);

    /**
     * Appends and returns a new empty "StatisticalClassification" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification addNewStatisticalClassification();
}
