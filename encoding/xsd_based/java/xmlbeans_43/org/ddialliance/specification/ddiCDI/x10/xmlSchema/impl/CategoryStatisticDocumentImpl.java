/*
 * An XML document type.
 * Localname: CategoryStatistic
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryStatisticDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one CategoryStatistic(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class CategoryStatisticDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryStatisticDocument {
    private static final long serialVersionUID = 1L;

    public CategoryStatisticDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "CategoryStatistic"),
    };


    /**
     * Gets the "CategoryStatistic" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryStatistic getCategoryStatistic() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryStatistic target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryStatistic)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "CategoryStatistic" element
     */
    @Override
    public void setCategoryStatistic(org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryStatistic categoryStatistic) {
        generatedSetterHelperImpl(categoryStatistic, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "CategoryStatistic" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryStatistic addNewCategoryStatistic() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryStatistic target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryStatistic)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
