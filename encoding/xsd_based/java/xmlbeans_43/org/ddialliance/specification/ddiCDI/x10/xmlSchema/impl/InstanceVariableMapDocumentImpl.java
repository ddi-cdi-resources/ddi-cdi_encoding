/*
 * An XML document type.
 * Localname: InstanceVariableMap
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceVariableMapDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one InstanceVariableMap(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class InstanceVariableMapDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceVariableMapDocument {
    private static final long serialVersionUID = 1L;

    public InstanceVariableMapDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "InstanceVariableMap"),
    };


    /**
     * Gets the "InstanceVariableMap" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceVariableMap getInstanceVariableMap() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceVariableMap target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceVariableMap)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "InstanceVariableMap" element
     */
    @Override
    public void setInstanceVariableMap(org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceVariableMap instanceVariableMap) {
        generatedSetterHelperImpl(instanceVariableMap, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "InstanceVariableMap" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceVariableMap addNewInstanceVariableMap() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceVariableMap target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceVariableMap)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
