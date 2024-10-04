/*
 * XML Type:  ProcessingAgent
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProcessingAgent
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML ProcessingAgent(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public interface ProcessingAgent extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.Agent {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProcessingAgent> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "processingagent235etype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "ProcessingAgent_performs_Activity" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProcessingAgent.ProcessingAgentPerformsActivity> getProcessingAgentPerformsActivityList();

    /**
     * Gets array of all "ProcessingAgent_performs_Activity" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProcessingAgent.ProcessingAgentPerformsActivity[] getProcessingAgentPerformsActivityArray();

    /**
     * Gets ith "ProcessingAgent_performs_Activity" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProcessingAgent.ProcessingAgentPerformsActivity getProcessingAgentPerformsActivityArray(int i);

    /**
     * Returns number of "ProcessingAgent_performs_Activity" element
     */
    int sizeOfProcessingAgentPerformsActivityArray();

    /**
     * Sets array of all "ProcessingAgent_performs_Activity" element
     */
    void setProcessingAgentPerformsActivityArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProcessingAgent.ProcessingAgentPerformsActivity[] processingAgentPerformsActivityArray);

    /**
     * Sets ith "ProcessingAgent_performs_Activity" element
     */
    void setProcessingAgentPerformsActivityArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProcessingAgent.ProcessingAgentPerformsActivity processingAgentPerformsActivity);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ProcessingAgent_performs_Activity" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProcessingAgent.ProcessingAgentPerformsActivity insertNewProcessingAgentPerformsActivity(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "ProcessingAgent_performs_Activity" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProcessingAgent.ProcessingAgentPerformsActivity addNewProcessingAgentPerformsActivity();

    /**
     * Removes the ith "ProcessingAgent_performs_Activity" element
     */
    void removeProcessingAgentPerformsActivity(int i);

    /**
     * Gets a List of "ProcessingAgent_operatesOn_ProductionEnvironment" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProcessingAgent.ProcessingAgentOperatesOnProductionEnvironment> getProcessingAgentOperatesOnProductionEnvironmentList();

    /**
     * Gets array of all "ProcessingAgent_operatesOn_ProductionEnvironment" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProcessingAgent.ProcessingAgentOperatesOnProductionEnvironment[] getProcessingAgentOperatesOnProductionEnvironmentArray();

    /**
     * Gets ith "ProcessingAgent_operatesOn_ProductionEnvironment" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProcessingAgent.ProcessingAgentOperatesOnProductionEnvironment getProcessingAgentOperatesOnProductionEnvironmentArray(int i);

    /**
     * Returns number of "ProcessingAgent_operatesOn_ProductionEnvironment" element
     */
    int sizeOfProcessingAgentOperatesOnProductionEnvironmentArray();

    /**
     * Sets array of all "ProcessingAgent_operatesOn_ProductionEnvironment" element
     */
    void setProcessingAgentOperatesOnProductionEnvironmentArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProcessingAgent.ProcessingAgentOperatesOnProductionEnvironment[] processingAgentOperatesOnProductionEnvironmentArray);

    /**
     * Sets ith "ProcessingAgent_operatesOn_ProductionEnvironment" element
     */
    void setProcessingAgentOperatesOnProductionEnvironmentArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProcessingAgent.ProcessingAgentOperatesOnProductionEnvironment processingAgentOperatesOnProductionEnvironment);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ProcessingAgent_operatesOn_ProductionEnvironment" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProcessingAgent.ProcessingAgentOperatesOnProductionEnvironment insertNewProcessingAgentOperatesOnProductionEnvironment(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "ProcessingAgent_operatesOn_ProductionEnvironment" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProcessingAgent.ProcessingAgentOperatesOnProductionEnvironment addNewProcessingAgentOperatesOnProductionEnvironment();

    /**
     * Removes the ith "ProcessingAgent_operatesOn_ProductionEnvironment" element
     */
    void removeProcessingAgentOperatesOnProductionEnvironment(int i);

    /**
     * An XML ProcessingAgent_performs_Activity(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface ProcessingAgentPerformsActivity extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProcessingAgent.ProcessingAgentPerformsActivity> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "processingagentperformsactivity7eb9elemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProcessingAgent$ProcessingAgentPerformsActivity$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProcessingAgent.ProcessingAgentPerformsActivity.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "validtype91fbelemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum ACTIVITY = Enum.forString("Activity");
            Enum STEP = Enum.forString("Step");

            int INT_ACTIVITY = Enum.INT_ACTIVITY;
            int INT_STEP = Enum.INT_STEP;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProcessingAgent$ProcessingAgentPerformsActivity$ValidType.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_ACTIVITY
             * Enum.forString(s); // returns the enum value for a string
             * Enum.forInt(i); // returns the enum value for an int
             * </pre>
             * Enumeration objects are immutable singleton objects that
             * can be compared using == object equality. They have no
             * public constructor. See the constants defined within this
             * class for all the valid values.
             */
            final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase {
                /**
                 * Returns the enum value for a string, or null if none.
                 */
                public static Enum forString(java.lang.String s) {
                    return (Enum)table.forString(s);
                }

                /**
                 * Returns the enum value corresponding to an int, or null if none.
                 */
                public static Enum forInt(int i) {
                    return (Enum)table.forInt(i);
                }

                private Enum(java.lang.String s, int i) {
                    super(s, i);
                }

                static final int INT_ACTIVITY = 1;
                static final int INT_STEP = 2;

                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                    new Enum("Activity", INT_ACTIVITY),
                    new Enum("Step", INT_STEP),
                });
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() {
                    return forInt(intValue());
                }
            }
        }
    }

    /**
     * An XML ProcessingAgent_operatesOn_ProductionEnvironment(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface ProcessingAgentOperatesOnProductionEnvironment extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProcessingAgent.ProcessingAgentOperatesOnProductionEnvironment> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "processingagentoperatesonproductionenvironment7b30elemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProcessingAgent$ProcessingAgentOperatesOnProductionEnvironment$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProcessingAgent.ProcessingAgentOperatesOnProductionEnvironment.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "validtype3baeelemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum PRODUCTION_ENVIRONMENT = Enum.forString("ProductionEnvironment");

            int INT_PRODUCTION_ENVIRONMENT = Enum.INT_PRODUCTION_ENVIRONMENT;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProcessingAgent$ProcessingAgentOperatesOnProductionEnvironment$ValidType.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_PRODUCTION_ENVIRONMENT
             * Enum.forString(s); // returns the enum value for a string
             * Enum.forInt(i); // returns the enum value for an int
             * </pre>
             * Enumeration objects are immutable singleton objects that
             * can be compared using == object equality. They have no
             * public constructor. See the constants defined within this
             * class for all the valid values.
             */
            final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase {
                /**
                 * Returns the enum value for a string, or null if none.
                 */
                public static Enum forString(java.lang.String s) {
                    return (Enum)table.forString(s);
                }

                /**
                 * Returns the enum value corresponding to an int, or null if none.
                 */
                public static Enum forInt(int i) {
                    return (Enum)table.forInt(i);
                }

                private Enum(java.lang.String s, int i) {
                    super(s, i);
                }

                static final int INT_PRODUCTION_ENVIRONMENT = 1;

                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                    new Enum("ProductionEnvironment", INT_PRODUCTION_ENVIRONMENT),
                });
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() {
                    return forInt(intValue());
                }
            }
        }
    }
}
