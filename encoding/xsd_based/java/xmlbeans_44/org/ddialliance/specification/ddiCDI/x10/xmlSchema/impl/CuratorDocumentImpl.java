/*
 * An XML document type.
 * Localname: Curator
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.CuratorDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one Curator(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class CuratorDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.CuratorDocument {
    private static final long serialVersionUID = 1L;

    public CuratorDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "Curator"),
    };


    /**
     * Gets the "Curator" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Curator getCurator() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Curator target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Curator)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "Curator" element
     */
    @Override
    public void setCurator(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Curator curator) {
        generatedSetterHelperImpl(curator, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "Curator" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Curator addNewCurator() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Curator target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Curator)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
