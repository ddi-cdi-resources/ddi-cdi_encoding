/*
 * An XML document type.
 * Localname: NonDeterministicDeclarative
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.NonDeterministicDeclarativeDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one NonDeterministicDeclarative(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface NonDeterministicDeclarativeDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.NonDeterministicDeclarativeDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "nondeterministicdeclaratived161doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "NonDeterministicDeclarative" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.NonDeterministicDeclarative getNonDeterministicDeclarative();

    /**
     * Sets the "NonDeterministicDeclarative" element
     */
    void setNonDeterministicDeclarative(org.ddialliance.specification.ddiCDI.x10.xmlSchema.NonDeterministicDeclarative nonDeterministicDeclarative);

    /**
     * Appends and returns a new empty "NonDeterministicDeclarative" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.NonDeterministicDeclarative addNewNonDeterministicDeclarative();
}
