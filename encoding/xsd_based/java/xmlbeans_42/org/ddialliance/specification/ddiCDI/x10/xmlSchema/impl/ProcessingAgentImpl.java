/*
 * XML Type:  ProcessingAgent
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProcessingAgent
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML ProcessingAgent(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public class ProcessingAgentImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.AgentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProcessingAgent {
    private static final long serialVersionUID = 1L;

    public ProcessingAgentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "ProcessingAgent_performs_Activity"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "ProcessingAgent_operatesOn_ProductionEnvironment"),
    };


    /**
     * Gets a List of "ProcessingAgent_performs_Activity" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProcessingAgent.ProcessingAgentPerformsActivity> getProcessingAgentPerformsActivityList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getProcessingAgentPerformsActivityArray,
                this::setProcessingAgentPerformsActivityArray,
                this::insertNewProcessingAgentPerformsActivity,
                this::removeProcessingAgentPerformsActivity,
                this::sizeOfProcessingAgentPerformsActivityArray
            );
        }
    }

    /**
     * Gets array of all "ProcessingAgent_performs_Activity" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProcessingAgent.ProcessingAgentPerformsActivity[] getProcessingAgentPerformsActivityArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProcessingAgent.ProcessingAgentPerformsActivity[0]);
    }

    /**
     * Gets ith "ProcessingAgent_performs_Activity" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProcessingAgent.ProcessingAgentPerformsActivity getProcessingAgentPerformsActivityArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProcessingAgent.ProcessingAgentPerformsActivity target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProcessingAgent.ProcessingAgentPerformsActivity)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "ProcessingAgent_performs_Activity" element
     */
    @Override
    public int sizeOfProcessingAgentPerformsActivityArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets array of all "ProcessingAgent_performs_Activity" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setProcessingAgentPerformsActivityArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProcessingAgent.ProcessingAgentPerformsActivity[] processingAgentPerformsActivityArray) {
        check_orphaned();
        arraySetterHelper(processingAgentPerformsActivityArray, PROPERTY_QNAME[0]);
    }

    /**
     * Sets ith "ProcessingAgent_performs_Activity" element
     */
    @Override
    public void setProcessingAgentPerformsActivityArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProcessingAgent.ProcessingAgentPerformsActivity processingAgentPerformsActivity) {
        generatedSetterHelperImpl(processingAgentPerformsActivity, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ProcessingAgent_performs_Activity" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProcessingAgent.ProcessingAgentPerformsActivity insertNewProcessingAgentPerformsActivity(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProcessingAgent.ProcessingAgentPerformsActivity target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProcessingAgent.ProcessingAgentPerformsActivity)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "ProcessingAgent_performs_Activity" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProcessingAgent.ProcessingAgentPerformsActivity addNewProcessingAgentPerformsActivity() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProcessingAgent.ProcessingAgentPerformsActivity target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProcessingAgent.ProcessingAgentPerformsActivity)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "ProcessingAgent_performs_Activity" element
     */
    @Override
    public void removeProcessingAgentPerformsActivity(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }

    /**
     * Gets a List of "ProcessingAgent_operatesOn_ProductionEnvironment" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProcessingAgent.ProcessingAgentOperatesOnProductionEnvironment> getProcessingAgentOperatesOnProductionEnvironmentList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getProcessingAgentOperatesOnProductionEnvironmentArray,
                this::setProcessingAgentOperatesOnProductionEnvironmentArray,
                this::insertNewProcessingAgentOperatesOnProductionEnvironment,
                this::removeProcessingAgentOperatesOnProductionEnvironment,
                this::sizeOfProcessingAgentOperatesOnProductionEnvironmentArray
            );
        }
    }

    /**
     * Gets array of all "ProcessingAgent_operatesOn_ProductionEnvironment" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProcessingAgent.ProcessingAgentOperatesOnProductionEnvironment[] getProcessingAgentOperatesOnProductionEnvironmentArray() {
        return getXmlObjectArray(PROPERTY_QNAME[1], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProcessingAgent.ProcessingAgentOperatesOnProductionEnvironment[0]);
    }

    /**
     * Gets ith "ProcessingAgent_operatesOn_ProductionEnvironment" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProcessingAgent.ProcessingAgentOperatesOnProductionEnvironment getProcessingAgentOperatesOnProductionEnvironmentArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProcessingAgent.ProcessingAgentOperatesOnProductionEnvironment target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProcessingAgent.ProcessingAgentOperatesOnProductionEnvironment)get_store().find_element_user(PROPERTY_QNAME[1], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "ProcessingAgent_operatesOn_ProductionEnvironment" element
     */
    @Override
    public int sizeOfProcessingAgentOperatesOnProductionEnvironmentArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]);
        }
    }

    /**
     * Sets array of all "ProcessingAgent_operatesOn_ProductionEnvironment" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setProcessingAgentOperatesOnProductionEnvironmentArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProcessingAgent.ProcessingAgentOperatesOnProductionEnvironment[] processingAgentOperatesOnProductionEnvironmentArray) {
        check_orphaned();
        arraySetterHelper(processingAgentOperatesOnProductionEnvironmentArray, PROPERTY_QNAME[1]);
    }

    /**
     * Sets ith "ProcessingAgent_operatesOn_ProductionEnvironment" element
     */
    @Override
    public void setProcessingAgentOperatesOnProductionEnvironmentArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProcessingAgent.ProcessingAgentOperatesOnProductionEnvironment processingAgentOperatesOnProductionEnvironment) {
        generatedSetterHelperImpl(processingAgentOperatesOnProductionEnvironment, PROPERTY_QNAME[1], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ProcessingAgent_operatesOn_ProductionEnvironment" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProcessingAgent.ProcessingAgentOperatesOnProductionEnvironment insertNewProcessingAgentOperatesOnProductionEnvironment(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProcessingAgent.ProcessingAgentOperatesOnProductionEnvironment target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProcessingAgent.ProcessingAgentOperatesOnProductionEnvironment)get_store().insert_element_user(PROPERTY_QNAME[1], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "ProcessingAgent_operatesOn_ProductionEnvironment" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProcessingAgent.ProcessingAgentOperatesOnProductionEnvironment addNewProcessingAgentOperatesOnProductionEnvironment() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProcessingAgent.ProcessingAgentOperatesOnProductionEnvironment target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProcessingAgent.ProcessingAgentOperatesOnProductionEnvironment)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Removes the ith "ProcessingAgent_operatesOn_ProductionEnvironment" element
     */
    @Override
    public void removeProcessingAgentOperatesOnProductionEnvironment(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], i);
        }
    }
    /**
     * An XML ProcessingAgent_performs_Activity(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public static class ProcessingAgentPerformsActivityImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.ReferenceImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProcessingAgent.ProcessingAgentPerformsActivity {
        private static final long serialVersionUID = 1L;

        public ProcessingAgentPerformsActivityImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType);
        }

        private static final QName[] PROPERTY_QNAME = {
            new QName("", "isAssociationReference"),
        };


        /**
         * Gets the "isAssociationReference" attribute
         */
        @Override
        public boolean getIsAssociationReference() {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
                if (target == null) {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PROPERTY_QNAME[0]);
                }
                return (target == null) ? false : target.getBooleanValue();
            }
        }

        /**
         * Gets (as xml) the "isAssociationReference" attribute
         */
        @Override
        public org.apache.xmlbeans.XmlBoolean xgetIsAssociationReference() {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[0]);
                if (target == null) {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(PROPERTY_QNAME[0]);
                }
                return target;
            }
        }

        /**
         * True if has "isAssociationReference" attribute
         */
        @Override
        public boolean isSetIsAssociationReference() {
            synchronized (monitor()) {
                check_orphaned();
                return get_store().find_attribute_user(PROPERTY_QNAME[0]) != null;
            }
        }

        /**
         * Sets the "isAssociationReference" attribute
         */
        @Override
        public void setIsAssociationReference(boolean isAssociationReference) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
                if (target == null) {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[0]);
                }
                target.setBooleanValue(isAssociationReference);
            }
        }

        /**
         * Sets (as xml) the "isAssociationReference" attribute
         */
        @Override
        public void xsetIsAssociationReference(org.apache.xmlbeans.XmlBoolean isAssociationReference) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[0]);
                if (target == null) {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(PROPERTY_QNAME[0]);
                }
                target.set(isAssociationReference);
            }
        }

        /**
         * Unsets the "isAssociationReference" attribute
         */
        @Override
        public void unsetIsAssociationReference() {
            synchronized (monitor()) {
                check_orphaned();
                get_store().remove_attribute(PROPERTY_QNAME[0]);
            }
        }
        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProcessingAgent$ProcessingAgentPerformsActivity$ValidType.
         */
        public static class ValidTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProcessingAgent.ProcessingAgentPerformsActivity.ValidType {
            private static final long serialVersionUID = 1L;

            public ValidTypeImpl(org.apache.xmlbeans.SchemaType sType) {
                super(sType, false);
            }

            protected ValidTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b) {
                super(sType, b);
            }
        }
    }
    /**
     * An XML ProcessingAgent_operatesOn_ProductionEnvironment(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public static class ProcessingAgentOperatesOnProductionEnvironmentImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.ReferenceImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProcessingAgent.ProcessingAgentOperatesOnProductionEnvironment {
        private static final long serialVersionUID = 1L;

        public ProcessingAgentOperatesOnProductionEnvironmentImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType);
        }

        private static final QName[] PROPERTY_QNAME = {
            new QName("", "isAssociationReference"),
        };


        /**
         * Gets the "isAssociationReference" attribute
         */
        @Override
        public boolean getIsAssociationReference() {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
                if (target == null) {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PROPERTY_QNAME[0]);
                }
                return (target == null) ? false : target.getBooleanValue();
            }
        }

        /**
         * Gets (as xml) the "isAssociationReference" attribute
         */
        @Override
        public org.apache.xmlbeans.XmlBoolean xgetIsAssociationReference() {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[0]);
                if (target == null) {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(PROPERTY_QNAME[0]);
                }
                return target;
            }
        }

        /**
         * True if has "isAssociationReference" attribute
         */
        @Override
        public boolean isSetIsAssociationReference() {
            synchronized (monitor()) {
                check_orphaned();
                return get_store().find_attribute_user(PROPERTY_QNAME[0]) != null;
            }
        }

        /**
         * Sets the "isAssociationReference" attribute
         */
        @Override
        public void setIsAssociationReference(boolean isAssociationReference) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
                if (target == null) {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[0]);
                }
                target.setBooleanValue(isAssociationReference);
            }
        }

        /**
         * Sets (as xml) the "isAssociationReference" attribute
         */
        @Override
        public void xsetIsAssociationReference(org.apache.xmlbeans.XmlBoolean isAssociationReference) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[0]);
                if (target == null) {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(PROPERTY_QNAME[0]);
                }
                target.set(isAssociationReference);
            }
        }

        /**
         * Unsets the "isAssociationReference" attribute
         */
        @Override
        public void unsetIsAssociationReference() {
            synchronized (monitor()) {
                check_orphaned();
                get_store().remove_attribute(PROPERTY_QNAME[0]);
            }
        }
        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProcessingAgent$ProcessingAgentOperatesOnProductionEnvironment$ValidType.
         */
        public static class ValidTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProcessingAgent.ProcessingAgentOperatesOnProductionEnvironment.ValidType {
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
