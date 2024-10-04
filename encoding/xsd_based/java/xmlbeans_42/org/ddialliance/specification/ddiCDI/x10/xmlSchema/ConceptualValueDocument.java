/*
 * An XML document type.
 * Localname: ConceptualValue
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualValueDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one ConceptualValue(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface ConceptualValueDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualValueDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "conceptualvaluee375doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "ConceptualValue" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualValue getConceptualValue();

    /**
     * Sets the "ConceptualValue" element
     */
    void setConceptualValue(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualValue conceptualValue);

    /**
     * Appends and returns a new empty "ConceptualValue" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualValue addNewConceptualValue();
}
