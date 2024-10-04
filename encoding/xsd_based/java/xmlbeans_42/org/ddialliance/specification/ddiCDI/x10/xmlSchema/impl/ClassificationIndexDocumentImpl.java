/*
 * An XML document type.
 * Localname: ClassificationIndex
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndexDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one ClassificationIndex(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class ClassificationIndexDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndexDocument {
    private static final long serialVersionUID = 1L;

    public ClassificationIndexDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "ClassificationIndex"),
    };


    /**
     * Gets the "ClassificationIndex" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex getClassificationIndex() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "ClassificationIndex" element
     */
    @Override
    public void setClassificationIndex(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex classificationIndex) {
        generatedSetterHelperImpl(classificationIndex, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "ClassificationIndex" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex addNewClassificationIndex() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
