/*
 * An XML document type.
 * Localname: DataPointRelationship
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPointRelationshipDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one DataPointRelationship(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface DataPointRelationshipDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPointRelationshipDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "datapointrelationshipe9badoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "DataPointRelationship" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPointRelationship getDataPointRelationship();

    /**
     * Sets the "DataPointRelationship" element
     */
    void setDataPointRelationship(org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPointRelationship dataPointRelationship);

    /**
     * Appends and returns a new empty "DataPointRelationship" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPointRelationship addNewDataPointRelationship();
}
