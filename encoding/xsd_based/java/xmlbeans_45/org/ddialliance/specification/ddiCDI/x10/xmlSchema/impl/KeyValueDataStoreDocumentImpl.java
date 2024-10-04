/*
 * An XML document type.
 * Localname: KeyValueDataStore
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyValueDataStoreDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one KeyValueDataStore(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class KeyValueDataStoreDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyValueDataStoreDocument {
    private static final long serialVersionUID = 1L;

    public KeyValueDataStoreDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "KeyValueDataStore"),
    };


    /**
     * Gets the "KeyValueDataStore" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyValueDataStore getKeyValueDataStore() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyValueDataStore target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyValueDataStore)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "KeyValueDataStore" element
     */
    @Override
    public void setKeyValueDataStore(org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyValueDataStore keyValueDataStore) {
        generatedSetterHelperImpl(keyValueDataStore, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "KeyValueDataStore" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyValueDataStore addNewKeyValueDataStore() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyValueDataStore target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyValueDataStore)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
