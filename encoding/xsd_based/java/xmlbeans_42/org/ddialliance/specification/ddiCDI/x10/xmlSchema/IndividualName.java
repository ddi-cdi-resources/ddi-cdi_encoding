/*
 * XML Type:  IndividualName
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.IndividualName
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML IndividualName(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public interface IndividualName extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.IndividualName> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "individualnamee6e2type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "abbreviation" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString getAbbreviation();

    /**
     * True if has "abbreviation" element
     */
    boolean isSetAbbreviation();

    /**
     * Sets the "abbreviation" element
     */
    void setAbbreviation(org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString abbreviation);

    /**
     * Appends and returns a new empty "abbreviation" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString addNewAbbreviation();

    /**
     * Unsets the "abbreviation" element
     */
    void unsetAbbreviation();

    /**
     * Gets the "context" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry getContext();

    /**
     * True if has "context" element
     */
    boolean isSetContext();

    /**
     * Sets the "context" element
     */
    void setContext(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry context);

    /**
     * Appends and returns a new empty "context" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry addNewContext();

    /**
     * Unsets the "context" element
     */
    void unsetContext();

    /**
     * Gets the "effectiveDates" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DateRange getEffectiveDates();

    /**
     * True if has "effectiveDates" element
     */
    boolean isSetEffectiveDates();

    /**
     * Sets the "effectiveDates" element
     */
    void setEffectiveDates(org.ddialliance.specification.ddiCDI.x10.xmlSchema.DateRange effectiveDates);

    /**
     * Appends and returns a new empty "effectiveDates" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DateRange addNewEffectiveDates();

    /**
     * Unsets the "effectiveDates" element
     */
    void unsetEffectiveDates();

    /**
     * Gets the "firstGiven" element
     */
    java.lang.String getFirstGiven();

    /**
     * Gets (as xml) the "firstGiven" element
     */
    org.apache.xmlbeans.XmlString xgetFirstGiven();

    /**
     * True if has "firstGiven" element
     */
    boolean isSetFirstGiven();

    /**
     * Sets the "firstGiven" element
     */
    void setFirstGiven(java.lang.String firstGiven);

    /**
     * Sets (as xml) the "firstGiven" element
     */
    void xsetFirstGiven(org.apache.xmlbeans.XmlString firstGiven);

    /**
     * Unsets the "firstGiven" element
     */
    void unsetFirstGiven();

    /**
     * Gets the "fullName" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString getFullName();

    /**
     * True if has "fullName" element
     */
    boolean isSetFullName();

    /**
     * Sets the "fullName" element
     */
    void setFullName(org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString fullName);

    /**
     * Appends and returns a new empty "fullName" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString addNewFullName();

    /**
     * Unsets the "fullName" element
     */
    void unsetFullName();

    /**
     * Gets the "isFormal" element
     */
    boolean getIsFormal();

    /**
     * Gets (as xml) the "isFormal" element
     */
    org.apache.xmlbeans.XmlBoolean xgetIsFormal();

    /**
     * True if has "isFormal" element
     */
    boolean isSetIsFormal();

    /**
     * Sets the "isFormal" element
     */
    void setIsFormal(boolean isFormal);

    /**
     * Sets (as xml) the "isFormal" element
     */
    void xsetIsFormal(org.apache.xmlbeans.XmlBoolean isFormal);

    /**
     * Unsets the "isFormal" element
     */
    void unsetIsFormal();

    /**
     * Gets the "isPreferred" element
     */
    boolean getIsPreferred();

    /**
     * Gets (as xml) the "isPreferred" element
     */
    org.apache.xmlbeans.XmlBoolean xgetIsPreferred();

    /**
     * True if has "isPreferred" element
     */
    boolean isSetIsPreferred();

    /**
     * Sets the "isPreferred" element
     */
    void setIsPreferred(boolean isPreferred);

    /**
     * Sets (as xml) the "isPreferred" element
     */
    void xsetIsPreferred(org.apache.xmlbeans.XmlBoolean isPreferred);

    /**
     * Unsets the "isPreferred" element
     */
    void unsetIsPreferred();

    /**
     * Gets the "lastFamily" element
     */
    java.lang.String getLastFamily();

    /**
     * Gets (as xml) the "lastFamily" element
     */
    org.apache.xmlbeans.XmlString xgetLastFamily();

    /**
     * True if has "lastFamily" element
     */
    boolean isSetLastFamily();

    /**
     * Sets the "lastFamily" element
     */
    void setLastFamily(java.lang.String lastFamily);

    /**
     * Sets (as xml) the "lastFamily" element
     */
    void xsetLastFamily(org.apache.xmlbeans.XmlString lastFamily);

    /**
     * Unsets the "lastFamily" element
     */
    void unsetLastFamily();

    /**
     * Gets a List of "middle" elements
     */
    java.util.List<java.lang.String> getMiddleList();

    /**
     * Gets array of all "middle" elements
     */
    java.lang.String[] getMiddleArray();

    /**
     * Gets ith "middle" element
     */
    java.lang.String getMiddleArray(int i);

    /**
     * Gets (as xml) a List of "middle" elements
     */
    java.util.List<org.apache.xmlbeans.XmlString> xgetMiddleList();

    /**
     * Gets (as xml) array of all "middle" elements
     */
    org.apache.xmlbeans.XmlString[] xgetMiddleArray();

    /**
     * Gets (as xml) ith "middle" element
     */
    org.apache.xmlbeans.XmlString xgetMiddleArray(int i);

    /**
     * Returns number of "middle" element
     */
    int sizeOfMiddleArray();

    /**
     * Sets array of all "middle" element
     */
    void setMiddleArray(java.lang.String[] middleArray);

    /**
     * Sets ith "middle" element
     */
    void setMiddleArray(int i, java.lang.String middle);

    /**
     * Sets (as xml) array of all "middle" element
     */
    void xsetMiddleArray(org.apache.xmlbeans.XmlString[] middleArray);

    /**
     * Sets (as xml) ith "middle" element
     */
    void xsetMiddleArray(int i, org.apache.xmlbeans.XmlString middle);

    /**
     * Inserts the value as the ith "middle" element
     */
    void insertMiddle(int i, java.lang.String middle);

    /**
     * Appends the value as the last "middle" element
     */
    void addMiddle(java.lang.String middle);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "middle" element
     */
    org.apache.xmlbeans.XmlString insertNewMiddle(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "middle" element
     */
    org.apache.xmlbeans.XmlString addNewMiddle();

    /**
     * Removes the ith "middle" element
     */
    void removeMiddle(int i);

    /**
     * Gets the "prefix" element
     */
    java.lang.String getPrefix();

    /**
     * Gets (as xml) the "prefix" element
     */
    org.apache.xmlbeans.XmlString xgetPrefix();

    /**
     * True if has "prefix" element
     */
    boolean isSetPrefix();

    /**
     * Sets the "prefix" element
     */
    void setPrefix(java.lang.String prefix);

    /**
     * Sets (as xml) the "prefix" element
     */
    void xsetPrefix(org.apache.xmlbeans.XmlString prefix);

    /**
     * Unsets the "prefix" element
     */
    void unsetPrefix();

    /**
     * Gets the "sex" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.SexSpecification.Enum getSex();

    /**
     * Gets (as xml) the "sex" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.SexSpecification xgetSex();

    /**
     * True if has "sex" element
     */
    boolean isSetSex();

    /**
     * Sets the "sex" element
     */
    void setSex(org.ddialliance.specification.ddiCDI.x10.xmlSchema.SexSpecification.Enum sex);

    /**
     * Sets (as xml) the "sex" element
     */
    void xsetSex(org.ddialliance.specification.ddiCDI.x10.xmlSchema.SexSpecification sex);

    /**
     * Unsets the "sex" element
     */
    void unsetSex();

    /**
     * Gets the "suffix" element
     */
    java.lang.String getSuffix();

    /**
     * Gets (as xml) the "suffix" element
     */
    org.apache.xmlbeans.XmlString xgetSuffix();

    /**
     * True if has "suffix" element
     */
    boolean isSetSuffix();

    /**
     * Sets the "suffix" element
     */
    void setSuffix(java.lang.String suffix);

    /**
     * Sets (as xml) the "suffix" element
     */
    void xsetSuffix(org.apache.xmlbeans.XmlString suffix);

    /**
     * Unsets the "suffix" element
     */
    void unsetSuffix();

    /**
     * Gets the "typeOfIndividualName" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry getTypeOfIndividualName();

    /**
     * True if has "typeOfIndividualName" element
     */
    boolean isSetTypeOfIndividualName();

    /**
     * Sets the "typeOfIndividualName" element
     */
    void setTypeOfIndividualName(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry typeOfIndividualName);

    /**
     * Appends and returns a new empty "typeOfIndividualName" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry addNewTypeOfIndividualName();

    /**
     * Unsets the "typeOfIndividualName" element
     */
    void unsetTypeOfIndividualName();
}
