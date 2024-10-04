/*
 * An XML document type.
 * Localname: KeyValueStructure
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyValueStructureDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one KeyValueStructure(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface KeyValueStructureDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyValueStructureDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "keyvaluestructure989ddoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "KeyValueStructure" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyValueStructure getKeyValueStructure();

    /**
     * Sets the "KeyValueStructure" element
     */
    void setKeyValueStructure(org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyValueStructure keyValueStructure);

    /**
     * Appends and returns a new empty "KeyValueStructure" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyValueStructure addNewKeyValueStructure();
}
