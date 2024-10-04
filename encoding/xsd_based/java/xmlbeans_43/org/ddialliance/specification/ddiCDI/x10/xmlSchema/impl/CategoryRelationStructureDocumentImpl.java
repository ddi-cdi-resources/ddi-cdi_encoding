/*
 * An XML document type.
 * Localname: CategoryRelationStructure
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationStructureDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one CategoryRelationStructure(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class CategoryRelationStructureDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationStructureDocument {
    private static final long serialVersionUID = 1L;

    public CategoryRelationStructureDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "CategoryRelationStructure"),
    };


    /**
     * Gets the "CategoryRelationStructure" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationStructure getCategoryRelationStructure() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationStructure target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationStructure)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "CategoryRelationStructure" element
     */
    @Override
    public void setCategoryRelationStructure(org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationStructure categoryRelationStructure) {
        generatedSetterHelperImpl(categoryRelationStructure, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "CategoryRelationStructure" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationStructure addNewCategoryRelationStructure() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationStructure target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationStructure)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
