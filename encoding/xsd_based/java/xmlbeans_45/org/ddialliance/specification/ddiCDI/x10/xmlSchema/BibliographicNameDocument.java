/*
 * An XML document type.
 * Localname: BibliographicName
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.BibliographicNameDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one BibliographicName(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface BibliographicNameDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.BibliographicNameDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "bibliographicname7858doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "BibliographicName" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.BibliographicName getBibliographicName();

    /**
     * Sets the "BibliographicName" element
     */
    void setBibliographicName(org.ddialliance.specification.ddiCDI.x10.xmlSchema.BibliographicName bibliographicName);

    /**
     * Appends and returns a new empty "BibliographicName" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.BibliographicName addNewBibliographicName();
}
