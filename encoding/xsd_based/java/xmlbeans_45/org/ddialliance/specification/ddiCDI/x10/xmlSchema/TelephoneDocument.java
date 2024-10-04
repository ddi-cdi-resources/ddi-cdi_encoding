/*
 * An XML document type.
 * Localname: Telephone
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.TelephoneDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one Telephone(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface TelephoneDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.TelephoneDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "telephone61e0doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "Telephone" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Telephone getTelephone();

    /**
     * Sets the "Telephone" element
     */
    void setTelephone(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Telephone telephone);

    /**
     * Appends and returns a new empty "Telephone" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Telephone addNewTelephone();
}
