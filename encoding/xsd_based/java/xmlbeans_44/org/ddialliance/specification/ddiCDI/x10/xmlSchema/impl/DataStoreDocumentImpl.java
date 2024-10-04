/*
 * An XML document type.
 * Localname: DataStore
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStoreDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one DataStore(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class DataStoreDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStoreDocument {
    private static final long serialVersionUID = 1L;

    public DataStoreDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "DataStore"),
    };


    /**
     * Gets the "DataStore" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStore getDataStore() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStore target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStore)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "DataStore" element
     */
    @Override
    public void setDataStore(org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStore dataStore) {
        generatedSetterHelperImpl(dataStore, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "DataStore" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStore addNewDataStore() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStore target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStore)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
