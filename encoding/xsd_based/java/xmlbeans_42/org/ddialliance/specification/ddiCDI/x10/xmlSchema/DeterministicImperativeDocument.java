/*
 * An XML document type.
 * Localname: DeterministicImperative
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.DeterministicImperativeDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one DeterministicImperative(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface DeterministicImperativeDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.DeterministicImperativeDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "deterministicimperative2e3adoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "DeterministicImperative" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DeterministicImperative getDeterministicImperative();

    /**
     * Sets the "DeterministicImperative" element
     */
    void setDeterministicImperative(org.ddialliance.specification.ddiCDI.x10.xmlSchema.DeterministicImperative deterministicImperative);

    /**
     * Appends and returns a new empty "DeterministicImperative" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DeterministicImperative addNewDeterministicImperative();
}
