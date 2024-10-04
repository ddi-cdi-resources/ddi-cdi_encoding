/*
 * XML Type:  AuthorizationSource
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.AuthorizationSource
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML AuthorizationSource(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public interface AuthorizationSource extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.AuthorizationSource> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s65F2E4CDA8D692346164D243434CB4E1.TypeSystemHolder.typeSystem, "authorizationsource5f20type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "authorizationDate" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CombinedDate getAuthorizationDate();

    /**
     * True if has "authorizationDate" element
     */
    boolean isSetAuthorizationDate();

    /**
     * Sets the "authorizationDate" element
     */
    void setAuthorizationDate(org.ddialliance.specification.ddiCDI.x10.xmlSchema.CombinedDate authorizationDate);

    /**
     * Appends and returns a new empty "authorizationDate" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CombinedDate addNewAuthorizationDate();

    /**
     * Unsets the "authorizationDate" element
     */
    void unsetAuthorizationDate();

    /**
     * Gets the "catalogDetails" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CatalogDetails getCatalogDetails();

    /**
     * True if has "catalogDetails" element
     */
    boolean isSetCatalogDetails();

    /**
     * Sets the "catalogDetails" element
     */
    void setCatalogDetails(org.ddialliance.specification.ddiCDI.x10.xmlSchema.CatalogDetails catalogDetails);

    /**
     * Appends and returns a new empty "catalogDetails" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CatalogDetails addNewCatalogDetails();

    /**
     * Unsets the "catalogDetails" element
     */
    void unsetCatalogDetails();

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
     * Gets the "legalMandate" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString getLegalMandate();

    /**
     * True if has "legalMandate" element
     */
    boolean isSetLegalMandate();

    /**
     * Sets the "legalMandate" element
     */
    void setLegalMandate(org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString legalMandate);

    /**
     * Appends and returns a new empty "legalMandate" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString addNewLegalMandate();

    /**
     * Unsets the "legalMandate" element
     */
    void unsetLegalMandate();

    /**
     * Gets the "purpose" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString getPurpose();

    /**
     * True if has "purpose" element
     */
    boolean isSetPurpose();

    /**
     * Sets the "purpose" element
     */
    void setPurpose(org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString purpose);

    /**
     * Appends and returns a new empty "purpose" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString addNewPurpose();

    /**
     * Unsets the "purpose" element
     */
    void unsetPurpose();

    /**
     * Gets the "statementOfAuthorization" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString getStatementOfAuthorization();

    /**
     * True if has "statementOfAuthorization" element
     */
    boolean isSetStatementOfAuthorization();

    /**
     * Sets the "statementOfAuthorization" element
     */
    void setStatementOfAuthorization(org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString statementOfAuthorization);

    /**
     * Appends and returns a new empty "statementOfAuthorization" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString addNewStatementOfAuthorization();

    /**
     * Unsets the "statementOfAuthorization" element
     */
    void unsetStatementOfAuthorization();

    /**
     * Gets a List of "AuthorizationSource_has_Agent" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.AuthorizationSource.AuthorizationSourceHasAgent> getAuthorizationSourceHasAgentList();

    /**
     * Gets array of all "AuthorizationSource_has_Agent" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.AuthorizationSource.AuthorizationSourceHasAgent[] getAuthorizationSourceHasAgentArray();

    /**
     * Gets ith "AuthorizationSource_has_Agent" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.AuthorizationSource.AuthorizationSourceHasAgent getAuthorizationSourceHasAgentArray(int i);

    /**
     * Returns number of "AuthorizationSource_has_Agent" element
     */
    int sizeOfAuthorizationSourceHasAgentArray();

    /**
     * Sets array of all "AuthorizationSource_has_Agent" element
     */
    void setAuthorizationSourceHasAgentArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.AuthorizationSource.AuthorizationSourceHasAgent[] authorizationSourceHasAgentArray);

    /**
     * Sets ith "AuthorizationSource_has_Agent" element
     */
    void setAuthorizationSourceHasAgentArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.AuthorizationSource.AuthorizationSourceHasAgent authorizationSourceHasAgent);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "AuthorizationSource_has_Agent" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.AuthorizationSource.AuthorizationSourceHasAgent insertNewAuthorizationSourceHasAgent(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "AuthorizationSource_has_Agent" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.AuthorizationSource.AuthorizationSourceHasAgent addNewAuthorizationSourceHasAgent();

    /**
     * Removes the ith "AuthorizationSource_has_Agent" element
     */
    void removeAuthorizationSourceHasAgent(int i);

    /**
     * An XML AuthorizationSource_has_Agent(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface AuthorizationSourceHasAgent extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.AuthorizationSource.AuthorizationSourceHasAgent> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s65F2E4CDA8D692346164D243434CB4E1.TypeSystemHolder.typeSystem, "authorizationsourcehasagent13a1elemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.AuthorizationSource$AuthorizationSourceHasAgent$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.AuthorizationSource.AuthorizationSourceHasAgent.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s65F2E4CDA8D692346164D243434CB4E1.TypeSystemHolder.typeSystem, "validtype26e3elemtype");
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
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.AuthorizationSource$AuthorizationSourceHasAgent$ValidType.
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
