/*
 * An XML document type.
 * Localname: Category
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one Category(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class CategoryDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryDocument {
    private static final long serialVersionUID = 1L;

    public CategoryDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "Category"),
    };


    /**
     * Gets the "Category" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Category getCategory() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Category target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Category)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "Category" element
     */
    @Override
    public void setCategory(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Category category) {
        generatedSetterHelperImpl(category, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "Category" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Category addNewCategory() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Category target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Category)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
