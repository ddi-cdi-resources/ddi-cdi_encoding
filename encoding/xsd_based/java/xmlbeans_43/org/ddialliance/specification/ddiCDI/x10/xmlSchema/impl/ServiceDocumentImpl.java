/*
 * An XML document type.
 * Localname: Service
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.ServiceDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one Service(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class ServiceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.ServiceDocument {
    private static final long serialVersionUID = 1L;

    public ServiceDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "Service"),
    };


    /**
     * Gets the "Service" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Service getService() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Service target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Service)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "Service" element
     */
    @Override
    public void setService(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Service service) {
        generatedSetterHelperImpl(service, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "Service" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Service addNewService() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Service target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Service)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
