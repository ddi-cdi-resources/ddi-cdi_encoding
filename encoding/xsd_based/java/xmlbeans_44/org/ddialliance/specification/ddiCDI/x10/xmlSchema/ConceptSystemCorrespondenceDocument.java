/*
 * An XML document type.
 * Localname: ConceptSystemCorrespondence
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptSystemCorrespondenceDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one ConceptSystemCorrespondence(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface ConceptSystemCorrespondenceDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptSystemCorrespondenceDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "conceptsystemcorrespondence2acddoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "ConceptSystemCorrespondence" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptSystemCorrespondence getConceptSystemCorrespondence();

    /**
     * Sets the "ConceptSystemCorrespondence" element
     */
    void setConceptSystemCorrespondence(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptSystemCorrespondence conceptSystemCorrespondence);

    /**
     * Appends and returns a new empty "ConceptSystemCorrespondence" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptSystemCorrespondence addNewConceptSystemCorrespondence();
}
