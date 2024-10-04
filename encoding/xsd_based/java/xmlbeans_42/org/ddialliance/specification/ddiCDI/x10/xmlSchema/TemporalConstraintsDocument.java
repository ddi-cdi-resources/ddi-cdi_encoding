/*
 * An XML document type.
 * Localname: TemporalConstraints
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.TemporalConstraintsDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one TemporalConstraints(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface TemporalConstraintsDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.TemporalConstraintsDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "temporalconstraints26d0doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "TemporalConstraints" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.TemporalConstraints getTemporalConstraints();

    /**
     * Sets the "TemporalConstraints" element
     */
    void setTemporalConstraints(org.ddialliance.specification.ddiCDI.x10.xmlSchema.TemporalConstraints temporalConstraints);

    /**
     * Appends and returns a new empty "TemporalConstraints" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.TemporalConstraints addNewTemporalConstraints();
}
