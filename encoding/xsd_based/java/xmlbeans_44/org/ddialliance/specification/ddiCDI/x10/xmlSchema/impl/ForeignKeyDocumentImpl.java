/*
 * An XML document type.
 * Localname: ForeignKey
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.ForeignKeyDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one ForeignKey(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class ForeignKeyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.ForeignKeyDocument {
    private static final long serialVersionUID = 1L;

    public ForeignKeyDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "ForeignKey"),
    };


    /**
     * Gets the "ForeignKey" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ForeignKey getForeignKey() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ForeignKey target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ForeignKey)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "ForeignKey" element
     */
    @Override
    public void setForeignKey(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ForeignKey foreignKey) {
        generatedSetterHelperImpl(foreignKey, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "ForeignKey" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ForeignKey addNewForeignKey() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ForeignKey target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ForeignKey)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
