/*
 * XML Type:  PhysicalSegmentLayout
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayout
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML PhysicalSegmentLayout(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public interface PhysicalSegmentLayout extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayout> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s65F2E4CDA8D692346164D243434CB4E1.TypeSystemHolder.typeSystem, "physicalsegmentlayout4112type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "allowsDuplicates" element
     */
    boolean getAllowsDuplicates();

    /**
     * Gets (as xml) the "allowsDuplicates" element
     */
    org.apache.xmlbeans.XmlBoolean xgetAllowsDuplicates();

    /**
     * Sets the "allowsDuplicates" element
     */
    void setAllowsDuplicates(boolean allowsDuplicates);

    /**
     * Sets (as xml) the "allowsDuplicates" element
     */
    void xsetAllowsDuplicates(org.apache.xmlbeans.XmlBoolean allowsDuplicates);

    /**
     * Gets the "arrayBase" element
     */
    java.math.BigInteger getArrayBase();

    /**
     * Gets (as xml) the "arrayBase" element
     */
    org.apache.xmlbeans.XmlInteger xgetArrayBase();

    /**
     * True if has "arrayBase" element
     */
    boolean isSetArrayBase();

    /**
     * Sets the "arrayBase" element
     */
    void setArrayBase(java.math.BigInteger arrayBase);

    /**
     * Sets (as xml) the "arrayBase" element
     */
    void xsetArrayBase(org.apache.xmlbeans.XmlInteger arrayBase);

    /**
     * Unsets the "arrayBase" element
     */
    void unsetArrayBase();

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
     * Gets the "commentPrefix" element
     */
    java.lang.String getCommentPrefix();

    /**
     * Gets (as xml) the "commentPrefix" element
     */
    org.apache.xmlbeans.XmlString xgetCommentPrefix();

    /**
     * True if has "commentPrefix" element
     */
    boolean isSetCommentPrefix();

    /**
     * Sets the "commentPrefix" element
     */
    void setCommentPrefix(java.lang.String commentPrefix);

    /**
     * Sets (as xml) the "commentPrefix" element
     */
    void xsetCommentPrefix(org.apache.xmlbeans.XmlString commentPrefix);

    /**
     * Unsets the "commentPrefix" element
     */
    void unsetCommentPrefix();

    /**
     * Gets the "delimiter" element
     */
    java.lang.String getDelimiter();

    /**
     * Gets (as xml) the "delimiter" element
     */
    org.apache.xmlbeans.XmlString xgetDelimiter();

    /**
     * True if has "delimiter" element
     */
    boolean isSetDelimiter();

    /**
     * Sets the "delimiter" element
     */
    void setDelimiter(java.lang.String delimiter);

    /**
     * Sets (as xml) the "delimiter" element
     */
    void xsetDelimiter(org.apache.xmlbeans.XmlString delimiter);

    /**
     * Unsets the "delimiter" element
     */
    void unsetDelimiter();

    /**
     * Gets the "encoding" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry getEncoding();

    /**
     * True if has "encoding" element
     */
    boolean isSetEncoding();

    /**
     * Sets the "encoding" element
     */
    void setEncoding(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry encoding);

    /**
     * Appends and returns a new empty "encoding" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry addNewEncoding();

    /**
     * Unsets the "encoding" element
     */
    void unsetEncoding();

    /**
     * Gets the "escapeCharacter" element
     */
    java.lang.String getEscapeCharacter();

    /**
     * Gets (as xml) the "escapeCharacter" element
     */
    org.apache.xmlbeans.XmlString xgetEscapeCharacter();

    /**
     * True if has "escapeCharacter" element
     */
    boolean isSetEscapeCharacter();

    /**
     * Sets the "escapeCharacter" element
     */
    void setEscapeCharacter(java.lang.String escapeCharacter);

    /**
     * Sets (as xml) the "escapeCharacter" element
     */
    void xsetEscapeCharacter(org.apache.xmlbeans.XmlString escapeCharacter);

    /**
     * Unsets the "escapeCharacter" element
     */
    void unsetEscapeCharacter();

    /**
     * Gets the "hasHeader" element
     */
    boolean getHasHeader();

    /**
     * Gets (as xml) the "hasHeader" element
     */
    org.apache.xmlbeans.XmlBoolean xgetHasHeader();

    /**
     * True if has "hasHeader" element
     */
    boolean isSetHasHeader();

    /**
     * Sets the "hasHeader" element
     */
    void setHasHeader(boolean hasHeader);

    /**
     * Sets (as xml) the "hasHeader" element
     */
    void xsetHasHeader(org.apache.xmlbeans.XmlBoolean hasHeader);

    /**
     * Unsets the "hasHeader" element
     */
    void unsetHasHeader();

    /**
     * Gets the "headerIsCaseSensitive" element
     */
    boolean getHeaderIsCaseSensitive();

    /**
     * Gets (as xml) the "headerIsCaseSensitive" element
     */
    org.apache.xmlbeans.XmlBoolean xgetHeaderIsCaseSensitive();

    /**
     * True if has "headerIsCaseSensitive" element
     */
    boolean isSetHeaderIsCaseSensitive();

    /**
     * Sets the "headerIsCaseSensitive" element
     */
    void setHeaderIsCaseSensitive(boolean headerIsCaseSensitive);

    /**
     * Sets (as xml) the "headerIsCaseSensitive" element
     */
    void xsetHeaderIsCaseSensitive(org.apache.xmlbeans.XmlBoolean headerIsCaseSensitive);

    /**
     * Unsets the "headerIsCaseSensitive" element
     */
    void unsetHeaderIsCaseSensitive();

    /**
     * Gets the "headerRowCount" element
     */
    java.math.BigInteger getHeaderRowCount();

    /**
     * Gets (as xml) the "headerRowCount" element
     */
    org.apache.xmlbeans.XmlInteger xgetHeaderRowCount();

    /**
     * True if has "headerRowCount" element
     */
    boolean isSetHeaderRowCount();

    /**
     * Sets the "headerRowCount" element
     */
    void setHeaderRowCount(java.math.BigInteger headerRowCount);

    /**
     * Sets (as xml) the "headerRowCount" element
     */
    void xsetHeaderRowCount(org.apache.xmlbeans.XmlInteger headerRowCount);

    /**
     * Unsets the "headerRowCount" element
     */
    void unsetHeaderRowCount();

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
     * Gets the "isDelimited" element
     */
    boolean getIsDelimited();

    /**
     * Gets (as xml) the "isDelimited" element
     */
    org.apache.xmlbeans.XmlBoolean xgetIsDelimited();

    /**
     * Sets the "isDelimited" element
     */
    void setIsDelimited(boolean isDelimited);

    /**
     * Sets (as xml) the "isDelimited" element
     */
    void xsetIsDelimited(org.apache.xmlbeans.XmlBoolean isDelimited);

    /**
     * Gets the "isFixedWidth" element
     */
    boolean getIsFixedWidth();

    /**
     * Gets (as xml) the "isFixedWidth" element
     */
    org.apache.xmlbeans.XmlBoolean xgetIsFixedWidth();

    /**
     * Sets the "isFixedWidth" element
     */
    void setIsFixedWidth(boolean isFixedWidth);

    /**
     * Sets (as xml) the "isFixedWidth" element
     */
    void xsetIsFixedWidth(org.apache.xmlbeans.XmlBoolean isFixedWidth);

    /**
     * Gets a List of "lineTerminator" elements
     */
    java.util.List<java.lang.String> getLineTerminatorList();

    /**
     * Gets array of all "lineTerminator" elements
     */
    java.lang.String[] getLineTerminatorArray();

    /**
     * Gets ith "lineTerminator" element
     */
    java.lang.String getLineTerminatorArray(int i);

    /**
     * Gets (as xml) a List of "lineTerminator" elements
     */
    java.util.List<org.apache.xmlbeans.XmlString> xgetLineTerminatorList();

    /**
     * Gets (as xml) array of all "lineTerminator" elements
     */
    org.apache.xmlbeans.XmlString[] xgetLineTerminatorArray();

    /**
     * Gets (as xml) ith "lineTerminator" element
     */
    org.apache.xmlbeans.XmlString xgetLineTerminatorArray(int i);

    /**
     * Returns number of "lineTerminator" element
     */
    int sizeOfLineTerminatorArray();

    /**
     * Sets array of all "lineTerminator" element
     */
    void setLineTerminatorArray(java.lang.String[] lineTerminatorArray);

    /**
     * Sets ith "lineTerminator" element
     */
    void setLineTerminatorArray(int i, java.lang.String lineTerminator);

    /**
     * Sets (as xml) array of all "lineTerminator" element
     */
    void xsetLineTerminatorArray(org.apache.xmlbeans.XmlString[] lineTerminatorArray);

    /**
     * Sets (as xml) ith "lineTerminator" element
     */
    void xsetLineTerminatorArray(int i, org.apache.xmlbeans.XmlString lineTerminator);

    /**
     * Inserts the value as the ith "lineTerminator" element
     */
    void insertLineTerminator(int i, java.lang.String lineTerminator);

    /**
     * Appends the value as the last "lineTerminator" element
     */
    void addLineTerminator(java.lang.String lineTerminator);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "lineTerminator" element
     */
    org.apache.xmlbeans.XmlString insertNewLineTerminator(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "lineTerminator" element
     */
    org.apache.xmlbeans.XmlString addNewLineTerminator();

    /**
     * Removes the ith "lineTerminator" element
     */
    void removeLineTerminator(int i);

    /**
     * Gets a List of "name" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName> getNameList();

    /**
     * Gets array of all "name" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName[] getNameArray();

    /**
     * Gets ith "name" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName getNameArray(int i);

    /**
     * Returns number of "name" element
     */
    int sizeOfNameArray();

    /**
     * Sets array of all "name" element
     */
    void setNameArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName[] nameArray);

    /**
     * Sets ith "name" element
     */
    void setNameArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName name);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "name" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName insertNewName(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "name" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName addNewName();

    /**
     * Removes the ith "name" element
     */
    void removeName(int i);

    /**
     * Gets the "nullSequence" element
     */
    java.lang.String getNullSequence();

    /**
     * Gets (as xml) the "nullSequence" element
     */
    org.apache.xmlbeans.XmlString xgetNullSequence();

    /**
     * True if has "nullSequence" element
     */
    boolean isSetNullSequence();

    /**
     * Sets the "nullSequence" element
     */
    void setNullSequence(java.lang.String nullSequence);

    /**
     * Sets (as xml) the "nullSequence" element
     */
    void xsetNullSequence(org.apache.xmlbeans.XmlString nullSequence);

    /**
     * Unsets the "nullSequence" element
     */
    void unsetNullSequence();

    /**
     * Gets the "overview" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString getOverview();

    /**
     * True if has "overview" element
     */
    boolean isSetOverview();

    /**
     * Sets the "overview" element
     */
    void setOverview(org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString overview);

    /**
     * Appends and returns a new empty "overview" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString addNewOverview();

    /**
     * Unsets the "overview" element
     */
    void unsetOverview();

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
     * Gets the "quoteCharacter" element
     */
    java.lang.String getQuoteCharacter();

    /**
     * Gets (as xml) the "quoteCharacter" element
     */
    org.apache.xmlbeans.XmlString xgetQuoteCharacter();

    /**
     * True if has "quoteCharacter" element
     */
    boolean isSetQuoteCharacter();

    /**
     * Sets the "quoteCharacter" element
     */
    void setQuoteCharacter(java.lang.String quoteCharacter);

    /**
     * Sets (as xml) the "quoteCharacter" element
     */
    void xsetQuoteCharacter(org.apache.xmlbeans.XmlString quoteCharacter);

    /**
     * Unsets the "quoteCharacter" element
     */
    void unsetQuoteCharacter();

    /**
     * Gets the "skipBlankRows" element
     */
    boolean getSkipBlankRows();

    /**
     * Gets (as xml) the "skipBlankRows" element
     */
    org.apache.xmlbeans.XmlBoolean xgetSkipBlankRows();

    /**
     * True if has "skipBlankRows" element
     */
    boolean isSetSkipBlankRows();

    /**
     * Sets the "skipBlankRows" element
     */
    void setSkipBlankRows(boolean skipBlankRows);

    /**
     * Sets (as xml) the "skipBlankRows" element
     */
    void xsetSkipBlankRows(org.apache.xmlbeans.XmlBoolean skipBlankRows);

    /**
     * Unsets the "skipBlankRows" element
     */
    void unsetSkipBlankRows();

    /**
     * Gets the "skipDataColumns" element
     */
    java.math.BigInteger getSkipDataColumns();

    /**
     * Gets (as xml) the "skipDataColumns" element
     */
    org.apache.xmlbeans.XmlInteger xgetSkipDataColumns();

    /**
     * True if has "skipDataColumns" element
     */
    boolean isSetSkipDataColumns();

    /**
     * Sets the "skipDataColumns" element
     */
    void setSkipDataColumns(java.math.BigInteger skipDataColumns);

    /**
     * Sets (as xml) the "skipDataColumns" element
     */
    void xsetSkipDataColumns(org.apache.xmlbeans.XmlInteger skipDataColumns);

    /**
     * Unsets the "skipDataColumns" element
     */
    void unsetSkipDataColumns();

    /**
     * Gets the "skipInitialSpace" element
     */
    boolean getSkipInitialSpace();

    /**
     * Gets (as xml) the "skipInitialSpace" element
     */
    org.apache.xmlbeans.XmlBoolean xgetSkipInitialSpace();

    /**
     * True if has "skipInitialSpace" element
     */
    boolean isSetSkipInitialSpace();

    /**
     * Sets the "skipInitialSpace" element
     */
    void setSkipInitialSpace(boolean skipInitialSpace);

    /**
     * Sets (as xml) the "skipInitialSpace" element
     */
    void xsetSkipInitialSpace(org.apache.xmlbeans.XmlBoolean skipInitialSpace);

    /**
     * Unsets the "skipInitialSpace" element
     */
    void unsetSkipInitialSpace();

    /**
     * Gets the "skipRows" element
     */
    java.math.BigInteger getSkipRows();

    /**
     * Gets (as xml) the "skipRows" element
     */
    org.apache.xmlbeans.XmlInteger xgetSkipRows();

    /**
     * True if has "skipRows" element
     */
    boolean isSetSkipRows();

    /**
     * Sets the "skipRows" element
     */
    void setSkipRows(java.math.BigInteger skipRows);

    /**
     * Sets (as xml) the "skipRows" element
     */
    void xsetSkipRows(org.apache.xmlbeans.XmlInteger skipRows);

    /**
     * Unsets the "skipRows" element
     */
    void unsetSkipRows();

    /**
     * Gets the "tableDirection" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.TableDirectionValues.Enum getTableDirection();

    /**
     * Gets (as xml) the "tableDirection" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.TableDirectionValues xgetTableDirection();

    /**
     * True if has "tableDirection" element
     */
    boolean isSetTableDirection();

    /**
     * Sets the "tableDirection" element
     */
    void setTableDirection(org.ddialliance.specification.ddiCDI.x10.xmlSchema.TableDirectionValues.Enum tableDirection);

    /**
     * Sets (as xml) the "tableDirection" element
     */
    void xsetTableDirection(org.ddialliance.specification.ddiCDI.x10.xmlSchema.TableDirectionValues tableDirection);

    /**
     * Unsets the "tableDirection" element
     */
    void unsetTableDirection();

    /**
     * Gets the "textDirection" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.TextDirectionValues.Enum getTextDirection();

    /**
     * Gets (as xml) the "textDirection" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.TextDirectionValues xgetTextDirection();

    /**
     * True if has "textDirection" element
     */
    boolean isSetTextDirection();

    /**
     * Sets the "textDirection" element
     */
    void setTextDirection(org.ddialliance.specification.ddiCDI.x10.xmlSchema.TextDirectionValues.Enum textDirection);

    /**
     * Sets (as xml) the "textDirection" element
     */
    void xsetTextDirection(org.ddialliance.specification.ddiCDI.x10.xmlSchema.TextDirectionValues textDirection);

    /**
     * Unsets the "textDirection" element
     */
    void unsetTextDirection();

    /**
     * Gets the "treatConsecutiveDelimitersAsOne" element
     */
    boolean getTreatConsecutiveDelimitersAsOne();

    /**
     * Gets (as xml) the "treatConsecutiveDelimitersAsOne" element
     */
    org.apache.xmlbeans.XmlBoolean xgetTreatConsecutiveDelimitersAsOne();

    /**
     * True if has "treatConsecutiveDelimitersAsOne" element
     */
    boolean isSetTreatConsecutiveDelimitersAsOne();

    /**
     * Sets the "treatConsecutiveDelimitersAsOne" element
     */
    void setTreatConsecutiveDelimitersAsOne(boolean treatConsecutiveDelimitersAsOne);

    /**
     * Sets (as xml) the "treatConsecutiveDelimitersAsOne" element
     */
    void xsetTreatConsecutiveDelimitersAsOne(org.apache.xmlbeans.XmlBoolean treatConsecutiveDelimitersAsOne);

    /**
     * Unsets the "treatConsecutiveDelimitersAsOne" element
     */
    void unsetTreatConsecutiveDelimitersAsOne();

    /**
     * Gets the "trim" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.TrimValues.Enum getTrim();

    /**
     * Gets (as xml) the "trim" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.TrimValues xgetTrim();

    /**
     * True if has "trim" element
     */
    boolean isSetTrim();

    /**
     * Sets the "trim" element
     */
    void setTrim(org.ddialliance.specification.ddiCDI.x10.xmlSchema.TrimValues.Enum trim);

    /**
     * Sets (as xml) the "trim" element
     */
    void xsetTrim(org.ddialliance.specification.ddiCDI.x10.xmlSchema.TrimValues trim);

    /**
     * Unsets the "trim" element
     */
    void unsetTrim();

    /**
     * Gets a List of "PhysicalSegmentLayout_isDefinedBy_Concept" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayout.PhysicalSegmentLayoutIsDefinedByConcept> getPhysicalSegmentLayoutIsDefinedByConceptList();

    /**
     * Gets array of all "PhysicalSegmentLayout_isDefinedBy_Concept" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayout.PhysicalSegmentLayoutIsDefinedByConcept[] getPhysicalSegmentLayoutIsDefinedByConceptArray();

    /**
     * Gets ith "PhysicalSegmentLayout_isDefinedBy_Concept" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayout.PhysicalSegmentLayoutIsDefinedByConcept getPhysicalSegmentLayoutIsDefinedByConceptArray(int i);

    /**
     * Returns number of "PhysicalSegmentLayout_isDefinedBy_Concept" element
     */
    int sizeOfPhysicalSegmentLayoutIsDefinedByConceptArray();

    /**
     * Sets array of all "PhysicalSegmentLayout_isDefinedBy_Concept" element
     */
    void setPhysicalSegmentLayoutIsDefinedByConceptArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayout.PhysicalSegmentLayoutIsDefinedByConcept[] physicalSegmentLayoutIsDefinedByConceptArray);

    /**
     * Sets ith "PhysicalSegmentLayout_isDefinedBy_Concept" element
     */
    void setPhysicalSegmentLayoutIsDefinedByConceptArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayout.PhysicalSegmentLayoutIsDefinedByConcept physicalSegmentLayoutIsDefinedByConcept);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "PhysicalSegmentLayout_isDefinedBy_Concept" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayout.PhysicalSegmentLayoutIsDefinedByConcept insertNewPhysicalSegmentLayoutIsDefinedByConcept(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "PhysicalSegmentLayout_isDefinedBy_Concept" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayout.PhysicalSegmentLayoutIsDefinedByConcept addNewPhysicalSegmentLayoutIsDefinedByConcept();

    /**
     * Removes the ith "PhysicalSegmentLayout_isDefinedBy_Concept" element
     */
    void removePhysicalSegmentLayoutIsDefinedByConcept(int i);

    /**
     * Gets the "PhysicalSegmentLayout_formats_LogicalRecord" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayout.PhysicalSegmentLayoutFormatsLogicalRecord getPhysicalSegmentLayoutFormatsLogicalRecord();

    /**
     * True if has "PhysicalSegmentLayout_formats_LogicalRecord" element
     */
    boolean isSetPhysicalSegmentLayoutFormatsLogicalRecord();

    /**
     * Sets the "PhysicalSegmentLayout_formats_LogicalRecord" element
     */
    void setPhysicalSegmentLayoutFormatsLogicalRecord(org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayout.PhysicalSegmentLayoutFormatsLogicalRecord physicalSegmentLayoutFormatsLogicalRecord);

    /**
     * Appends and returns a new empty "PhysicalSegmentLayout_formats_LogicalRecord" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayout.PhysicalSegmentLayoutFormatsLogicalRecord addNewPhysicalSegmentLayoutFormatsLogicalRecord();

    /**
     * Unsets the "PhysicalSegmentLayout_formats_LogicalRecord" element
     */
    void unsetPhysicalSegmentLayoutFormatsLogicalRecord();

    /**
     * Gets a List of "PhysicalSegmentLayout_has_ValueMapping" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayout.PhysicalSegmentLayoutHasValueMapping> getPhysicalSegmentLayoutHasValueMappingList();

    /**
     * Gets array of all "PhysicalSegmentLayout_has_ValueMapping" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayout.PhysicalSegmentLayoutHasValueMapping[] getPhysicalSegmentLayoutHasValueMappingArray();

    /**
     * Gets ith "PhysicalSegmentLayout_has_ValueMapping" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayout.PhysicalSegmentLayoutHasValueMapping getPhysicalSegmentLayoutHasValueMappingArray(int i);

    /**
     * Returns number of "PhysicalSegmentLayout_has_ValueMapping" element
     */
    int sizeOfPhysicalSegmentLayoutHasValueMappingArray();

    /**
     * Sets array of all "PhysicalSegmentLayout_has_ValueMapping" element
     */
    void setPhysicalSegmentLayoutHasValueMappingArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayout.PhysicalSegmentLayoutHasValueMapping[] physicalSegmentLayoutHasValueMappingArray);

    /**
     * Sets ith "PhysicalSegmentLayout_has_ValueMapping" element
     */
    void setPhysicalSegmentLayoutHasValueMappingArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayout.PhysicalSegmentLayoutHasValueMapping physicalSegmentLayoutHasValueMapping);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "PhysicalSegmentLayout_has_ValueMapping" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayout.PhysicalSegmentLayoutHasValueMapping insertNewPhysicalSegmentLayoutHasValueMapping(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "PhysicalSegmentLayout_has_ValueMapping" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayout.PhysicalSegmentLayoutHasValueMapping addNewPhysicalSegmentLayoutHasValueMapping();

    /**
     * Removes the ith "PhysicalSegmentLayout_has_ValueMapping" element
     */
    void removePhysicalSegmentLayoutHasValueMapping(int i);

    /**
     * Gets a List of "PhysicalSegmentLayout_has_ValueMappingPosition" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayout.PhysicalSegmentLayoutHasValueMappingPosition> getPhysicalSegmentLayoutHasValueMappingPositionList();

    /**
     * Gets array of all "PhysicalSegmentLayout_has_ValueMappingPosition" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayout.PhysicalSegmentLayoutHasValueMappingPosition[] getPhysicalSegmentLayoutHasValueMappingPositionArray();

    /**
     * Gets ith "PhysicalSegmentLayout_has_ValueMappingPosition" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayout.PhysicalSegmentLayoutHasValueMappingPosition getPhysicalSegmentLayoutHasValueMappingPositionArray(int i);

    /**
     * Returns number of "PhysicalSegmentLayout_has_ValueMappingPosition" element
     */
    int sizeOfPhysicalSegmentLayoutHasValueMappingPositionArray();

    /**
     * Sets array of all "PhysicalSegmentLayout_has_ValueMappingPosition" element
     */
    void setPhysicalSegmentLayoutHasValueMappingPositionArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayout.PhysicalSegmentLayoutHasValueMappingPosition[] physicalSegmentLayoutHasValueMappingPositionArray);

    /**
     * Sets ith "PhysicalSegmentLayout_has_ValueMappingPosition" element
     */
    void setPhysicalSegmentLayoutHasValueMappingPositionArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayout.PhysicalSegmentLayoutHasValueMappingPosition physicalSegmentLayoutHasValueMappingPosition);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "PhysicalSegmentLayout_has_ValueMappingPosition" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayout.PhysicalSegmentLayoutHasValueMappingPosition insertNewPhysicalSegmentLayoutHasValueMappingPosition(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "PhysicalSegmentLayout_has_ValueMappingPosition" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayout.PhysicalSegmentLayoutHasValueMappingPosition addNewPhysicalSegmentLayoutHasValueMappingPosition();

    /**
     * Removes the ith "PhysicalSegmentLayout_has_ValueMappingPosition" element
     */
    void removePhysicalSegmentLayoutHasValueMappingPosition(int i);

    /**
     * An XML PhysicalSegmentLayout_isDefinedBy_Concept(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface PhysicalSegmentLayoutIsDefinedByConcept extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayout.PhysicalSegmentLayoutIsDefinedByConcept> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s65F2E4CDA8D692346164D243434CB4E1.TypeSystemHolder.typeSystem, "physicalsegmentlayoutisdefinedbyconcept0a84elemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayout$PhysicalSegmentLayoutIsDefinedByConcept$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayout.PhysicalSegmentLayoutIsDefinedByConcept.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s65F2E4CDA8D692346164D243434CB4E1.TypeSystemHolder.typeSystem, "validtype4246elemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum CATEGORY = Enum.forString("Category");
            Enum CONCEPT = Enum.forString("Concept");
            Enum CONCEPTUAL_VALUE = Enum.forString("ConceptualValue");
            Enum CONCEPTUAL_VARIABLE = Enum.forString("ConceptualVariable");
            Enum DESCRIPTOR_VARIABLE = Enum.forString("DescriptorVariable");
            Enum DIMENSIONAL_KEY_DEFINITION_MEMBER = Enum.forString("DimensionalKeyDefinitionMember");
            Enum INSTANCE_VARIABLE = Enum.forString("InstanceVariable");
            Enum KEY_DEFINITION_MEMBER = Enum.forString("KeyDefinitionMember");
            Enum POPULATION = Enum.forString("Population");
            Enum REFERENCE_VARIABLE = Enum.forString("ReferenceVariable");
            Enum REPRESENTED_VARIABLE = Enum.forString("RepresentedVariable");
            Enum UNIT_TYPE = Enum.forString("UnitType");
            Enum UNIVERSE = Enum.forString("Universe");

            int INT_CATEGORY = Enum.INT_CATEGORY;
            int INT_CONCEPT = Enum.INT_CONCEPT;
            int INT_CONCEPTUAL_VALUE = Enum.INT_CONCEPTUAL_VALUE;
            int INT_CONCEPTUAL_VARIABLE = Enum.INT_CONCEPTUAL_VARIABLE;
            int INT_DESCRIPTOR_VARIABLE = Enum.INT_DESCRIPTOR_VARIABLE;
            int INT_DIMENSIONAL_KEY_DEFINITION_MEMBER = Enum.INT_DIMENSIONAL_KEY_DEFINITION_MEMBER;
            int INT_INSTANCE_VARIABLE = Enum.INT_INSTANCE_VARIABLE;
            int INT_KEY_DEFINITION_MEMBER = Enum.INT_KEY_DEFINITION_MEMBER;
            int INT_POPULATION = Enum.INT_POPULATION;
            int INT_REFERENCE_VARIABLE = Enum.INT_REFERENCE_VARIABLE;
            int INT_REPRESENTED_VARIABLE = Enum.INT_REPRESENTED_VARIABLE;
            int INT_UNIT_TYPE = Enum.INT_UNIT_TYPE;
            int INT_UNIVERSE = Enum.INT_UNIVERSE;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayout$PhysicalSegmentLayoutIsDefinedByConcept$ValidType.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_CATEGORY
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

                static final int INT_CATEGORY = 1;
                static final int INT_CONCEPT = 2;
                static final int INT_CONCEPTUAL_VALUE = 3;
                static final int INT_CONCEPTUAL_VARIABLE = 4;
                static final int INT_DESCRIPTOR_VARIABLE = 5;
                static final int INT_DIMENSIONAL_KEY_DEFINITION_MEMBER = 6;
                static final int INT_INSTANCE_VARIABLE = 7;
                static final int INT_KEY_DEFINITION_MEMBER = 8;
                static final int INT_POPULATION = 9;
                static final int INT_REFERENCE_VARIABLE = 10;
                static final int INT_REPRESENTED_VARIABLE = 11;
                static final int INT_UNIT_TYPE = 12;
                static final int INT_UNIVERSE = 13;

                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                    new Enum("Category", INT_CATEGORY),
                    new Enum("Concept", INT_CONCEPT),
                    new Enum("ConceptualValue", INT_CONCEPTUAL_VALUE),
                    new Enum("ConceptualVariable", INT_CONCEPTUAL_VARIABLE),
                    new Enum("DescriptorVariable", INT_DESCRIPTOR_VARIABLE),
                    new Enum("DimensionalKeyDefinitionMember", INT_DIMENSIONAL_KEY_DEFINITION_MEMBER),
                    new Enum("InstanceVariable", INT_INSTANCE_VARIABLE),
                    new Enum("KeyDefinitionMember", INT_KEY_DEFINITION_MEMBER),
                    new Enum("Population", INT_POPULATION),
                    new Enum("ReferenceVariable", INT_REFERENCE_VARIABLE),
                    new Enum("RepresentedVariable", INT_REPRESENTED_VARIABLE),
                    new Enum("UnitType", INT_UNIT_TYPE),
                    new Enum("Universe", INT_UNIVERSE),
                });
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() {
                    return forInt(intValue());
                }
            }
        }
    }

    /**
     * An XML PhysicalSegmentLayout_formats_LogicalRecord(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface PhysicalSegmentLayoutFormatsLogicalRecord extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayout.PhysicalSegmentLayoutFormatsLogicalRecord> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s65F2E4CDA8D692346164D243434CB4E1.TypeSystemHolder.typeSystem, "physicalsegmentlayoutformatslogicalrecord237celemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayout$PhysicalSegmentLayoutFormatsLogicalRecord$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayout.PhysicalSegmentLayoutFormatsLogicalRecord.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s65F2E4CDA8D692346164D243434CB4E1.TypeSystemHolder.typeSystem, "validtype72beelemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum LOGICAL_RECORD = Enum.forString("LogicalRecord");

            int INT_LOGICAL_RECORD = Enum.INT_LOGICAL_RECORD;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayout$PhysicalSegmentLayoutFormatsLogicalRecord$ValidType.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_LOGICAL_RECORD
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

                static final int INT_LOGICAL_RECORD = 1;

                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                    new Enum("LogicalRecord", INT_LOGICAL_RECORD),
                });
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() {
                    return forInt(intValue());
                }
            }
        }
    }

    /**
     * An XML PhysicalSegmentLayout_has_ValueMapping(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface PhysicalSegmentLayoutHasValueMapping extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayout.PhysicalSegmentLayoutHasValueMapping> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s65F2E4CDA8D692346164D243434CB4E1.TypeSystemHolder.typeSystem, "physicalsegmentlayouthasvaluemappingf889elemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayout$PhysicalSegmentLayoutHasValueMapping$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayout.PhysicalSegmentLayoutHasValueMapping.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s65F2E4CDA8D692346164D243434CB4E1.TypeSystemHolder.typeSystem, "validtypea807elemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum VALUE_MAPPING = Enum.forString("ValueMapping");

            int INT_VALUE_MAPPING = Enum.INT_VALUE_MAPPING;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayout$PhysicalSegmentLayoutHasValueMapping$ValidType.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_VALUE_MAPPING
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

                static final int INT_VALUE_MAPPING = 1;

                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                    new Enum("ValueMapping", INT_VALUE_MAPPING),
                });
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() {
                    return forInt(intValue());
                }
            }
        }
    }

    /**
     * An XML PhysicalSegmentLayout_has_ValueMappingPosition(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface PhysicalSegmentLayoutHasValueMappingPosition extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayout.PhysicalSegmentLayoutHasValueMappingPosition> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s65F2E4CDA8D692346164D243434CB4E1.TypeSystemHolder.typeSystem, "physicalsegmentlayouthasvaluemappingposition8c52elemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * Gets a List of "validType" elements
         */
        java.util.List<java.lang.String> getValidTypeList();

        /**
         * Gets array of all "validType" elements
         */
        java.lang.String[] getValidTypeArray();

        /**
         * Gets ith "validType" element
         */
        java.lang.String getValidTypeArray(int i);

        /**
         * Gets (as xml) a List of "validType" elements
         */
        java.util.List<org.apache.xmlbeans.XmlString> xgetValidTypeList();

        /**
         * Gets (as xml) array of all "validType" elements
         */
        org.apache.xmlbeans.XmlString[] xgetValidTypeArray();

        /**
         * Gets (as xml) ith "validType" element
         */
        org.apache.xmlbeans.XmlString xgetValidTypeArray(int i);

        /**
         * Returns number of "validType" element
         */
        int sizeOfValidTypeArray();

        /**
         * Sets array of all "validType" element
         */
        void setValidTypeArray(java.lang.String[] validTypeArray);

        /**
         * Sets ith "validType" element
         */
        void setValidTypeArray(int i, java.lang.String validType);

        /**
         * Sets (as xml) array of all "validType" element
         */
        void xsetValidTypeArray(org.apache.xmlbeans.XmlString[] validTypeArray);

        /**
         * Sets (as xml) ith "validType" element
         */
        void xsetValidTypeArray(int i, org.apache.xmlbeans.XmlString validType);

        /**
         * Inserts the value as the ith "validType" element
         */
        void insertValidType(int i, java.lang.String validType);

        /**
         * Appends the value as the last "validType" element
         */
        void addValidType(java.lang.String validType);

        /**
         * Inserts and returns a new empty value (as xml) as the ith "validType" element
         */
        org.apache.xmlbeans.XmlString insertNewValidType(int i);

        /**
         * Appends and returns a new empty value (as xml) as the last "validType" element
         */
        org.apache.xmlbeans.XmlString addNewValidType();

        /**
         * Removes the ith "validType" element
         */
        void removeValidType(int i);

        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayout$PhysicalSegmentLayoutHasValueMappingPosition$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayout.PhysicalSegmentLayoutHasValueMappingPosition.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s65F2E4CDA8D692346164D243434CB4E1.TypeSystemHolder.typeSystem, "validtypeddd0elemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum VALUE_MAPPING_POSITION = Enum.forString("ValueMappingPosition");

            int INT_VALUE_MAPPING_POSITION = Enum.INT_VALUE_MAPPING_POSITION;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayout$PhysicalSegmentLayoutHasValueMappingPosition$ValidType.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_VALUE_MAPPING_POSITION
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

                static final int INT_VALUE_MAPPING_POSITION = 1;

                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                    new Enum("ValueMappingPosition", INT_VALUE_MAPPING_POSITION),
                });
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() {
                    return forInt(intValue());
                }
            }
        }
    }
}
