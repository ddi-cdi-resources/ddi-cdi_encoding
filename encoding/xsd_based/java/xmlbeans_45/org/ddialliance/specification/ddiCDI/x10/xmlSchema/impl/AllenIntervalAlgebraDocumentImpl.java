/*
 * An XML document type.
 * Localname: AllenIntervalAlgebra
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.AllenIntervalAlgebraDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one AllenIntervalAlgebra(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class AllenIntervalAlgebraDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.AllenIntervalAlgebraDocument {
    private static final long serialVersionUID = 1L;

    public AllenIntervalAlgebraDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "AllenIntervalAlgebra"),
    };


    /**
     * Gets the "AllenIntervalAlgebra" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.AllenIntervalAlgebra getAllenIntervalAlgebra() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.AllenIntervalAlgebra target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.AllenIntervalAlgebra)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "AllenIntervalAlgebra" element
     */
    @Override
    public void setAllenIntervalAlgebra(org.ddialliance.specification.ddiCDI.x10.xmlSchema.AllenIntervalAlgebra allenIntervalAlgebra) {
        generatedSetterHelperImpl(allenIntervalAlgebra, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "AllenIntervalAlgebra" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.AllenIntervalAlgebra addNewAllenIntervalAlgebra() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.AllenIntervalAlgebra target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.AllenIntervalAlgebra)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
