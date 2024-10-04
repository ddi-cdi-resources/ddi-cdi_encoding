/*
 * An XML document type.
 * Localname: PrimaryKeyComponent
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.PrimaryKeyComponentDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one PrimaryKeyComponent(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class PrimaryKeyComponentDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.PrimaryKeyComponentDocument {
    private static final long serialVersionUID = 1L;

    public PrimaryKeyComponentDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "PrimaryKeyComponent"),
    };


    /**
     * Gets the "PrimaryKeyComponent" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.PrimaryKeyComponent getPrimaryKeyComponent() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.PrimaryKeyComponent target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.PrimaryKeyComponent)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "PrimaryKeyComponent" element
     */
    @Override
    public void setPrimaryKeyComponent(org.ddialliance.specification.ddiCDI.x10.xmlSchema.PrimaryKeyComponent primaryKeyComponent) {
        generatedSetterHelperImpl(primaryKeyComponent, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "PrimaryKeyComponent" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.PrimaryKeyComponent addNewPrimaryKeyComponent() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.PrimaryKeyComponent target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.PrimaryKeyComponent)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
