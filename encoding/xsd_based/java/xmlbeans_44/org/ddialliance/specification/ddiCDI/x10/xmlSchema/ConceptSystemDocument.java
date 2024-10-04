/*
 * An XML document type.
 * Localname: ConceptSystem
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptSystemDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one ConceptSystem(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface ConceptSystemDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptSystemDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "conceptsystem7693doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "ConceptSystem" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptSystem getConceptSystem();

    /**
     * Sets the "ConceptSystem" element
     */
    void setConceptSystem(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptSystem conceptSystem);

    /**
     * Appends and returns a new empty "ConceptSystem" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptSystem addNewConceptSystem();
}
