/*
 * XML Type:  QualifiedMeasure
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.QualifiedMeasure
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML QualifiedMeasure(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public class QualifiedMeasureImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.MeasureComponentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.QualifiedMeasure {
    private static final long serialVersionUID = 1L;

    public QualifiedMeasureImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "QualifiedMeasure_refines_MeasureComponent"),
    };


    /**
     * Gets the "QualifiedMeasure_refines_MeasureComponent" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.QualifiedMeasure.QualifiedMeasureRefinesMeasureComponent getQualifiedMeasureRefinesMeasureComponent() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.QualifiedMeasure.QualifiedMeasureRefinesMeasureComponent target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.QualifiedMeasure.QualifiedMeasureRefinesMeasureComponent)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "QualifiedMeasure_refines_MeasureComponent" element
     */
    @Override
    public boolean isSetQualifiedMeasureRefinesMeasureComponent() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
        }
    }

    /**
     * Sets the "QualifiedMeasure_refines_MeasureComponent" element
     */
    @Override
    public void setQualifiedMeasureRefinesMeasureComponent(org.ddialliance.specification.ddiCDI.x10.xmlSchema.QualifiedMeasure.QualifiedMeasureRefinesMeasureComponent qualifiedMeasureRefinesMeasureComponent) {
        generatedSetterHelperImpl(qualifiedMeasureRefinesMeasureComponent, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "QualifiedMeasure_refines_MeasureComponent" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.QualifiedMeasure.QualifiedMeasureRefinesMeasureComponent addNewQualifiedMeasureRefinesMeasureComponent() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.QualifiedMeasure.QualifiedMeasureRefinesMeasureComponent target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.QualifiedMeasure.QualifiedMeasureRefinesMeasureComponent)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Unsets the "QualifiedMeasure_refines_MeasureComponent" element
     */
    @Override
    public void unsetQualifiedMeasureRefinesMeasureComponent() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], 0);
        }
    }
    /**
     * An XML QualifiedMeasure_refines_MeasureComponent(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public static class QualifiedMeasureRefinesMeasureComponentImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.AssociationReferenceImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.QualifiedMeasure.QualifiedMeasureRefinesMeasureComponent {
        private static final long serialVersionUID = 1L;

        public QualifiedMeasureRefinesMeasureComponentImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType);
        }
        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.QualifiedMeasure$QualifiedMeasureRefinesMeasureComponent$ValidType.
         */
        public static class ValidTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.QualifiedMeasure.QualifiedMeasureRefinesMeasureComponent.ValidType {
            private static final long serialVersionUID = 1L;

            public ValidTypeImpl(org.apache.xmlbeans.SchemaType sType) {
                super(sType, false);
            }

            protected ValidTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b) {
                super(sType, b);
            }
        }
    }
}
