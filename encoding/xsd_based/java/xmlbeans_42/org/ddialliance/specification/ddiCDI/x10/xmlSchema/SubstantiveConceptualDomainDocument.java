/*
 * An XML document type.
 * Localname: SubstantiveConceptualDomain
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.SubstantiveConceptualDomainDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one SubstantiveConceptualDomain(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface SubstantiveConceptualDomainDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.SubstantiveConceptualDomainDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "substantiveconceptualdomain678adoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "SubstantiveConceptualDomain" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.SubstantiveConceptualDomain getSubstantiveConceptualDomain();

    /**
     * Sets the "SubstantiveConceptualDomain" element
     */
    void setSubstantiveConceptualDomain(org.ddialliance.specification.ddiCDI.x10.xmlSchema.SubstantiveConceptualDomain substantiveConceptualDomain);

    /**
     * Appends and returns a new empty "SubstantiveConceptualDomain" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.SubstantiveConceptualDomain addNewSubstantiveConceptualDomain();
}
