/*
 * An XML document type.
 * Localname: TemporalControlConstruct
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.TemporalControlConstructDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one TemporalControlConstruct(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface TemporalControlConstructDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.TemporalControlConstructDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "temporalcontrolconstruct132adoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "TemporalControlConstruct" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.TemporalControlConstruct getTemporalControlConstruct();

    /**
     * Sets the "TemporalControlConstruct" element
     */
    void setTemporalControlConstruct(org.ddialliance.specification.ddiCDI.x10.xmlSchema.TemporalControlConstruct temporalControlConstruct);

    /**
     * Appends and returns a new empty "TemporalControlConstruct" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.TemporalControlConstruct addNewTemporalControlConstruct();
}
