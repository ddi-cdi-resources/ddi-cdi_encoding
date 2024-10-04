set XSD_HOME=..\..\model_based\xsd_variants

process_includes.py %XSD_HOME%\ddi-cdi_42_noXsdTypeInName.xsd ddi-cdi_42_noXsdTypeInName_complete.xsd
generateDS.py --export=etree --no-warnings -o ddi-cdi_42.py ddi-cdi_42_noXsdTypeInName_complete.xsd

process_includes.py %XSD_HOME%\ddi-cdi_43_noXsdTypeInName.xsd ddi-cdi_43_noXsdTypeInName_complete.xsd
generateDS.py --export=etree --no-warnings -o ddi-cdi_43.py ddi-cdi_43_noXsdTypeInName_complete.xsd

process_includes.py %XSD_HOME%\ddi-cdi_44_noXsdTypeInName.xsd ddi-cdi_44_noXsdTypeInName_complete.xsd
generateDS.py --export=etree --no-warnings -o ddi-cdi_44.py ddi-cdi_44_noXsdTypeInName_complete.xsd

process_includes.py %XSD_HOME%\ddi-cdi_45_noXsdTypeInName.xsd ddi-cdi_45_noXsdTypeInName_complete.xsd
generateDS.py --export=etree --no-warnings -o ddi-cdi_45.py ddi-cdi_45_noXsdTypeInName_complete.xsd

set XSD_HOME=
