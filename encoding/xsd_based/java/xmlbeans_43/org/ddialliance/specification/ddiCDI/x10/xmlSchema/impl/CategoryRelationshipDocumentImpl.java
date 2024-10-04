/*
 * An XML document type.
 * Localname: CategoryRelationship
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationshipDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one CategoryRelationship(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class CategoryRelationshipDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationshipDocument {
    private static final long serialVersionUID = 1L;

    public CategoryRelationshipDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "CategoryRelationship"),
    };


    /**
     * Gets the "CategoryRelationship" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationship getCategoryRelationship() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationship target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationship)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "CategoryRelationship" element
     */
    @Override
    public void setCategoryRelationship(org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationship categoryRelationship) {
        generatedSetterHelperImpl(categoryRelationship, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "CategoryRelationship" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationship addNewCategoryRelationship() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationship target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationship)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
