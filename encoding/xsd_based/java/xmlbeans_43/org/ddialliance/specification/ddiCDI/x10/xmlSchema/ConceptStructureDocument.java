/*
 * An XML document type.
 * Localname: ConceptStructure
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptStructureDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one ConceptStructure(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface ConceptStructureDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptStructureDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s65F2E4CDA8D692346164D243434CB4E1.TypeSystemHolder.typeSystem, "conceptstructure7d59doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "ConceptStructure" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptStructure getConceptStructure();

    /**
     * Sets the "ConceptStructure" element
     */
    void setConceptStructure(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptStructure conceptStructure);

    /**
     * Appends and returns a new empty "ConceptStructure" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptStructure addNewConceptStructure();
}
