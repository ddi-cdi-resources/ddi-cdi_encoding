/*
 * XML Type:  RevisableDatum
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.RevisableDatum
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML RevisableDatum(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public interface RevisableDatum extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.Datum {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.RevisableDatum> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s65F2E4CDA8D692346164D243434CB4E1.TypeSystemHolder.typeSystem, "revisabledatum4ce6type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "vintage" element
     */
    java.math.BigInteger getVintage();

    /**
     * Gets (as xml) the "vintage" element
     */
    org.apache.xmlbeans.XmlInteger xgetVintage();

    /**
     * Sets the "vintage" element
     */
    void setVintage(java.math.BigInteger vintage);

    /**
     * Sets (as xml) the "vintage" element
     */
    void xsetVintage(org.apache.xmlbeans.XmlInteger vintage);

    /**
     * Gets the "RevisableDatum_correspondsTo_Revision" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.RevisableDatum.RevisableDatumCorrespondsToRevision getRevisableDatumCorrespondsToRevision();

    /**
     * True if has "RevisableDatum_correspondsTo_Revision" element
     */
    boolean isSetRevisableDatumCorrespondsToRevision();

    /**
     * Sets the "RevisableDatum_correspondsTo_Revision" element
     */
    void setRevisableDatumCorrespondsToRevision(org.ddialliance.specification.ddiCDI.x10.xmlSchema.RevisableDatum.RevisableDatumCorrespondsToRevision revisableDatumCorrespondsToRevision);

    /**
     * Appends and returns a new empty "RevisableDatum_correspondsTo_Revision" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.RevisableDatum.RevisableDatumCorrespondsToRevision addNewRevisableDatumCorrespondsToRevision();

    /**
     * Unsets the "RevisableDatum_correspondsTo_Revision" element
     */
    void unsetRevisableDatumCorrespondsToRevision();

    /**
     * An XML RevisableDatum_correspondsTo_Revision(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface RevisableDatumCorrespondsToRevision extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.RevisableDatum.RevisableDatumCorrespondsToRevision> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s65F2E4CDA8D692346164D243434CB4E1.TypeSystemHolder.typeSystem, "revisabledatumcorrespondstorevisione568elemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.RevisableDatum$RevisableDatumCorrespondsToRevision$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.RevisableDatum.RevisableDatumCorrespondsToRevision.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s65F2E4CDA8D692346164D243434CB4E1.TypeSystemHolder.typeSystem, "validtypef2e6elemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum REVISION = Enum.forString("Revision");

            int INT_REVISION = Enum.INT_REVISION;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.RevisableDatum$RevisableDatumCorrespondsToRevision$ValidType.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_REVISION
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

                static final int INT_REVISION = 1;

                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                    new Enum("Revision", INT_REVISION),
                });
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() {
                    return forInt(intValue());
                }
            }
        }
    }
}
