/*
 * An XML document type.
 * Localname: DataStructure
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStructureDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one DataStructure(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class DataStructureDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStructureDocument {
    private static final long serialVersionUID = 1L;

    public DataStructureDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "DataStructure"),
    };


    /**
     * Gets the "DataStructure" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStructure getDataStructure() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStructure target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStructure)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "DataStructure" element
     */
    @Override
    public void setDataStructure(org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStructure dataStructure) {
        generatedSetterHelperImpl(dataStructure, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "DataStructure" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStructure addNewDataStructure() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStructure target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStructure)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
