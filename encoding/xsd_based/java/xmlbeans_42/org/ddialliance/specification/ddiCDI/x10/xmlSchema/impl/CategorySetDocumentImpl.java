/*
 * An XML document type.
 * Localname: CategorySet
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategorySetDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one CategorySet(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class CategorySetDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategorySetDocument {
    private static final long serialVersionUID = 1L;

    public CategorySetDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "CategorySet"),
    };


    /**
     * Gets the "CategorySet" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategorySet getCategorySet() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategorySet target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategorySet)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "CategorySet" element
     */
    @Override
    public void setCategorySet(org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategorySet categorySet) {
        generatedSetterHelperImpl(categorySet, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "CategorySet" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategorySet addNewCategorySet() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategorySet target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategorySet)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
