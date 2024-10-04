/*
 * An XML document type.
 * Localname: ConceptualVariable
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualVariableDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one ConceptualVariable(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface ConceptualVariableDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualVariableDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s65F2E4CDA8D692346164D243434CB4E1.TypeSystemHolder.typeSystem, "conceptualvariable1642doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "ConceptualVariable" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualVariable getConceptualVariable();

    /**
     * Sets the "ConceptualVariable" element
     */
    void setConceptualVariable(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualVariable conceptualVariable);

    /**
     * Appends and returns a new empty "ConceptualVariable" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualVariable addNewConceptualVariable();
}
