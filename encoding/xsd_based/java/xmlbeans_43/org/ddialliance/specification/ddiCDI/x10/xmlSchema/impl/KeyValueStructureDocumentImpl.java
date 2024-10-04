/*
 * An XML document type.
 * Localname: KeyValueStructure
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyValueStructureDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one KeyValueStructure(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class KeyValueStructureDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyValueStructureDocument {
    private static final long serialVersionUID = 1L;

    public KeyValueStructureDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "KeyValueStructure"),
    };


    /**
     * Gets the "KeyValueStructure" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyValueStructure getKeyValueStructure() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyValueStructure target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyValueStructure)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "KeyValueStructure" element
     */
    @Override
    public void setKeyValueStructure(org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyValueStructure keyValueStructure) {
        generatedSetterHelperImpl(keyValueStructure, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "KeyValueStructure" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyValueStructure addNewKeyValueStructure() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyValueStructure target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyValueStructure)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
