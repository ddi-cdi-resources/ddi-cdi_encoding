/*
 * An XML document type.
 * Localname: WebLink
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.WebLinkDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one WebLink(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class WebLinkDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.WebLinkDocument {
    private static final long serialVersionUID = 1L;

    public WebLinkDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "WebLink"),
    };


    /**
     * Gets the "WebLink" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.WebLink getWebLink() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.WebLink target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.WebLink)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "WebLink" element
     */
    @Override
    public void setWebLink(org.ddialliance.specification.ddiCDI.x10.xmlSchema.WebLink webLink) {
        generatedSetterHelperImpl(webLink, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "WebLink" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.WebLink addNewWebLink() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.WebLink target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.WebLink)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
