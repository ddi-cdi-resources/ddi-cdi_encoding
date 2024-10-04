/*
 * An XML document type.
 * Localname: KeyValueDataStore
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyValueDataStoreDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one KeyValueDataStore(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface KeyValueDataStoreDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyValueDataStoreDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s65F2E4CDA8D692346164D243434CB4E1.TypeSystemHolder.typeSystem, "keyvaluedatastore3081doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "KeyValueDataStore" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyValueDataStore getKeyValueDataStore();

    /**
     * Sets the "KeyValueDataStore" element
     */
    void setKeyValueDataStore(org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyValueDataStore keyValueDataStore);

    /**
     * Appends and returns a new empty "KeyValueDataStore" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyValueDataStore addNewKeyValueDataStore();
}
