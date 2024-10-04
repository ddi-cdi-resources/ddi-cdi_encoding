/*
 * An XML document type.
 * Localname: StatisticalClassificationRelationship
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassificationRelationshipDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one StatisticalClassificationRelationship(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface StatisticalClassificationRelationshipDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassificationRelationshipDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "statisticalclassificationrelationship46f5doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "StatisticalClassificationRelationship" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassificationRelationship getStatisticalClassificationRelationship();

    /**
     * Sets the "StatisticalClassificationRelationship" element
     */
    void setStatisticalClassificationRelationship(org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassificationRelationship statisticalClassificationRelationship);

    /**
     * Appends and returns a new empty "StatisticalClassificationRelationship" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassificationRelationship addNewStatisticalClassificationRelationship();
}
