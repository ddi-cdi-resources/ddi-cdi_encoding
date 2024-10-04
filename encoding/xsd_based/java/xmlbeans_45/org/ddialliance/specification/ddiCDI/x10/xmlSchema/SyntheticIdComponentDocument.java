/*
 * An XML document type.
 * Localname: SyntheticIdComponent
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.SyntheticIdComponentDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one SyntheticIdComponent(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface SyntheticIdComponentDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.SyntheticIdComponentDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "syntheticidcomponent0b8bdoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "SyntheticIdComponent" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.SyntheticIdComponent getSyntheticIdComponent();

    /**
     * Sets the "SyntheticIdComponent" element
     */
    void setSyntheticIdComponent(org.ddialliance.specification.ddiCDI.x10.xmlSchema.SyntheticIdComponent syntheticIdComponent);

    /**
     * Appends and returns a new empty "SyntheticIdComponent" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.SyntheticIdComponent addNewSyntheticIdComponent();
}
