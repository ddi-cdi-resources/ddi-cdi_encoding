/*
 * XML Type:  AgentPosition
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentPosition
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML AgentPosition(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public interface AgentPosition extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentPosition> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "agentpositioncebatype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "identifier" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Identifier getIdentifier();

    /**
     * True if has "identifier" element
     */
    boolean isSetIdentifier();

    /**
     * Sets the "identifier" element
     */
    void setIdentifier(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Identifier identifier);

    /**
     * Appends and returns a new empty "identifier" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Identifier addNewIdentifier();

    /**
     * Unsets the "identifier" element
     */
    void unsetIdentifier();

    /**
     * Gets the "value" element
     */
    java.math.BigInteger getValue();

    /**
     * Gets (as xml) the "value" element
     */
    org.apache.xmlbeans.XmlInteger xgetValue();

    /**
     * Sets the "value" element
     */
    void setValue(java.math.BigInteger value);

    /**
     * Sets (as xml) the "value" element
     */
    void xsetValue(org.apache.xmlbeans.XmlInteger value);

    /**
     * Gets the "AgentPosition_indexes_Agent" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentPosition.AgentPositionIndexesAgent getAgentPositionIndexesAgent();

    /**
     * True if has "AgentPosition_indexes_Agent" element
     */
    boolean isSetAgentPositionIndexesAgent();

    /**
     * Sets the "AgentPosition_indexes_Agent" element
     */
    void setAgentPositionIndexesAgent(org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentPosition.AgentPositionIndexesAgent agentPositionIndexesAgent);

    /**
     * Appends and returns a new empty "AgentPosition_indexes_Agent" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentPosition.AgentPositionIndexesAgent addNewAgentPositionIndexesAgent();

    /**
     * Unsets the "AgentPosition_indexes_Agent" element
     */
    void unsetAgentPositionIndexesAgent();

    /**
     * An XML AgentPosition_indexes_Agent(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface AgentPositionIndexesAgent extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentPosition.AgentPositionIndexesAgent> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "agentpositionindexesagent293belemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentPosition$AgentPositionIndexesAgent$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentPosition.AgentPositionIndexesAgent.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "validtype9e7delemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum AGENT = Enum.forString("Agent");
            Enum CURATOR = Enum.forString("Curator");
            Enum INDIVIDUAL = Enum.forString("Individual");
            Enum MACHINE = Enum.forString("Machine");
            Enum ORGANIZATION = Enum.forString("Organization");
            Enum PROCESSING_AGENT = Enum.forString("ProcessingAgent");
            Enum SERVICE = Enum.forString("Service");

            int INT_AGENT = Enum.INT_AGENT;
            int INT_CURATOR = Enum.INT_CURATOR;
            int INT_INDIVIDUAL = Enum.INT_INDIVIDUAL;
            int INT_MACHINE = Enum.INT_MACHINE;
            int INT_ORGANIZATION = Enum.INT_ORGANIZATION;
            int INT_PROCESSING_AGENT = Enum.INT_PROCESSING_AGENT;
            int INT_SERVICE = Enum.INT_SERVICE;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentPosition$AgentPositionIndexesAgent$ValidType.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_AGENT
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

                static final int INT_AGENT = 1;
                static final int INT_CURATOR = 2;
                static final int INT_INDIVIDUAL = 3;
                static final int INT_MACHINE = 4;
                static final int INT_ORGANIZATION = 5;
                static final int INT_PROCESSING_AGENT = 6;
                static final int INT_SERVICE = 7;

                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                    new Enum("Agent", INT_AGENT),
                    new Enum("Curator", INT_CURATOR),
                    new Enum("Individual", INT_INDIVIDUAL),
                    new Enum("Machine", INT_MACHINE),
                    new Enum("Organization", INT_ORGANIZATION),
                    new Enum("ProcessingAgent", INT_PROCESSING_AGENT),
                    new Enum("Service", INT_SERVICE),
                });
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() {
                    return forInt(intValue());
                }
            }
        }
    }
}
