/*
 * An XML document type.
 * Localname: InternationalRegistrationDataIdentifier
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalRegistrationDataIdentifierDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one InternationalRegistrationDataIdentifier(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface InternationalRegistrationDataIdentifierDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalRegistrationDataIdentifierDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "internationalregistrationdataidentifier80d6doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "InternationalRegistrationDataIdentifier" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalRegistrationDataIdentifier getInternationalRegistrationDataIdentifier();

    /**
     * Sets the "InternationalRegistrationDataIdentifier" element
     */
    void setInternationalRegistrationDataIdentifier(org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalRegistrationDataIdentifier internationalRegistrationDataIdentifier);

    /**
     * Appends and returns a new empty "InternationalRegistrationDataIdentifier" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalRegistrationDataIdentifier addNewInternationalRegistrationDataIdentifier();
}
