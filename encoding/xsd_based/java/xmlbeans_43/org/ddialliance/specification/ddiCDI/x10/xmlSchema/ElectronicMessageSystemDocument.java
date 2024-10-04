/*
 * An XML document type.
 * Localname: ElectronicMessageSystem
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.ElectronicMessageSystemDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one ElectronicMessageSystem(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface ElectronicMessageSystemDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ElectronicMessageSystemDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s65F2E4CDA8D692346164D243434CB4E1.TypeSystemHolder.typeSystem, "electronicmessagesystem5496doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "ElectronicMessageSystem" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ElectronicMessageSystem getElectronicMessageSystem();

    /**
     * Sets the "ElectronicMessageSystem" element
     */
    void setElectronicMessageSystem(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ElectronicMessageSystem electronicMessageSystem);

    /**
     * Appends and returns a new empty "ElectronicMessageSystem" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ElectronicMessageSystem addNewElectronicMessageSystem();
}
