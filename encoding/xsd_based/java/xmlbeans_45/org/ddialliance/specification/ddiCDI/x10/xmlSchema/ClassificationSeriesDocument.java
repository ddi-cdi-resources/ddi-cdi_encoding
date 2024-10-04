/*
 * An XML document type.
 * Localname: ClassificationSeries
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationSeriesDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one ClassificationSeries(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface ClassificationSeriesDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationSeriesDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "classificationseriesa3ebdoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "ClassificationSeries" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationSeries getClassificationSeries();

    /**
     * Sets the "ClassificationSeries" element
     */
    void setClassificationSeries(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationSeries classificationSeries);

    /**
     * Appends and returns a new empty "ClassificationSeries" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationSeries addNewClassificationSeries();
}
