set MICROSOFT_XSD=C:\Program Files (x86)\Microsoft SDKs\Windows\v10.0A\bin\NETFX 4.8 Tools\xsd
set XSD_HOME=..\..\model_based\xsd_variants

"%MICROSOFT_XSD%" "%XSD_HOME%\ddi-cdi_42_noXsdTypeInName.xsd" /classes /language:CS
"%MICROSOFT_XSD%" "%XSD_HOME%\ddi-cdi_43_noXsdTypeInName.xsd" /classes /language:CS
"%MICROSOFT_XSD%" "%XSD_HOME%\ddi-cdi_44_noXsdTypeInName.xsd" /classes /language:CS
"%MICROSOFT_XSD%" "%XSD_HOME%\ddi-cdi_45_noXsdTypeInName.xsd" /classes /language:CS

set MICROSOFT_XSD=
set XSD_HOME=
