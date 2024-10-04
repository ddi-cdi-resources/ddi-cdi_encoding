/*
 * An XML document type.
 * Localname: ClassificationItemRelationship
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemRelationshipDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one ClassificationItemRelationship(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface ClassificationItemRelationshipDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemRelationshipDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "classificationitemrelationship059fdoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "ClassificationItemRelationship" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemRelationship getClassificationItemRelationship();

    /**
     * Sets the "ClassificationItemRelationship" element
     */
    void setClassificationItemRelationship(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemRelationship classificationItemRelationship);

    /**
     * Appends and returns a new empty "ClassificationItemRelationship" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemRelationship addNewClassificationItemRelationship();
}
