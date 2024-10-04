/*
 * An XML document type.
 * Localname: ConceptRelationship
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptRelationshipDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one ConceptRelationship(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface ConceptRelationshipDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptRelationshipDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "conceptrelationship97dcdoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "ConceptRelationship" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptRelationship getConceptRelationship();

    /**
     * Sets the "ConceptRelationship" element
     */
    void setConceptRelationship(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptRelationship conceptRelationship);

    /**
     * Appends and returns a new empty "ConceptRelationship" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptRelationship addNewConceptRelationship();
}
