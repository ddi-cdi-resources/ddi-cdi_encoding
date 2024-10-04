/*
 * An XML document type.
 * Localname: PrimaryKey
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.PrimaryKeyDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one PrimaryKey(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class PrimaryKeyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.PrimaryKeyDocument {
    private static final long serialVersionUID = 1L;

    public PrimaryKeyDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "PrimaryKey"),
    };


    /**
     * Gets the "PrimaryKey" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.PrimaryKey getPrimaryKey() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.PrimaryKey target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.PrimaryKey)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "PrimaryKey" element
     */
    @Override
    public void setPrimaryKey(org.ddialliance.specification.ddiCDI.x10.xmlSchema.PrimaryKey primaryKey) {
        generatedSetterHelperImpl(primaryKey, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "PrimaryKey" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.PrimaryKey addNewPrimaryKey() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.PrimaryKey target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.PrimaryKey)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
