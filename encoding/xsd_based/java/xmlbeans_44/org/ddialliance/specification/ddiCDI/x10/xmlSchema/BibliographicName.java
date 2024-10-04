/*
 * XML Type:  BibliographicName
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.BibliographicName
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML BibliographicName(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public interface BibliographicName extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.BibliographicName> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "bibliographicname9c68type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "affiliation" element
     */
    java.lang.String getAffiliation();

    /**
     * Gets (as xml) the "affiliation" element
     */
    org.apache.xmlbeans.XmlString xgetAffiliation();

    /**
     * True if has "affiliation" element
     */
    boolean isSetAffiliation();

    /**
     * Sets the "affiliation" element
     */
    void setAffiliation(java.lang.String affiliation);

    /**
     * Sets (as xml) the "affiliation" element
     */
    void xsetAffiliation(org.apache.xmlbeans.XmlString affiliation);

    /**
     * Unsets the "affiliation" element
     */
    void unsetAffiliation();
}
