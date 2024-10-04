/*
 * An XML document type.
 * Localname: PrivateImage
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.PrivateImageDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one PrivateImage(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class PrivateImageDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.PrivateImageDocument {
    private static final long serialVersionUID = 1L;

    public PrivateImageDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "PrivateImage"),
    };


    /**
     * Gets the "PrivateImage" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.PrivateImage getPrivateImage() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.PrivateImage target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.PrivateImage)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "PrivateImage" element
     */
    @Override
    public void setPrivateImage(org.ddialliance.specification.ddiCDI.x10.xmlSchema.PrivateImage privateImage) {
        generatedSetterHelperImpl(privateImage, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "PrivateImage" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.PrivateImage addNewPrivateImage() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.PrivateImage target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.PrivateImage)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
