/*
 * An XML document type.
 * Localname: SubstantiveValueDomain
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.SubstantiveValueDomainDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one SubstantiveValueDomain(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface SubstantiveValueDomainDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.SubstantiveValueDomainDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "substantivevaluedomaincf71doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "SubstantiveValueDomain" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.SubstantiveValueDomain getSubstantiveValueDomain();

    /**
     * Sets the "SubstantiveValueDomain" element
     */
    void setSubstantiveValueDomain(org.ddialliance.specification.ddiCDI.x10.xmlSchema.SubstantiveValueDomain substantiveValueDomain);

    /**
     * Appends and returns a new empty "SubstantiveValueDomain" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.SubstantiveValueDomain addNewSubstantiveValueDomain();
}
