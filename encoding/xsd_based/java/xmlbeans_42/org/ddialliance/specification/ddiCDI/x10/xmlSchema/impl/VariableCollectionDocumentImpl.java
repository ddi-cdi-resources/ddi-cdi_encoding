/*
 * An XML document type.
 * Localname: VariableCollection
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableCollectionDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one VariableCollection(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class VariableCollectionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableCollectionDocument {
    private static final long serialVersionUID = 1L;

    public VariableCollectionDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "VariableCollection"),
    };


    /**
     * Gets the "VariableCollection" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableCollection getVariableCollection() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableCollection target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableCollection)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "VariableCollection" element
     */
    @Override
    public void setVariableCollection(org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableCollection variableCollection) {
        generatedSetterHelperImpl(variableCollection, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "VariableCollection" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableCollection addNewVariableCollection() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableCollection target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableCollection)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
