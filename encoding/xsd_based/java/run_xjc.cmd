set JAXB_HOME=C:\Programs\jaxb\jaxb-ri-4.0.3\jaxb-ri
set XSD_HOME=..\..\model_based\xsd_variants

IF EXIST jaxb_42 RMDIR /S /Q jaxb_42
IF NOT EXIST jaxb_42 MKDIR jaxb_42
call %JAXB_HOME%\bin\xjc.bat -d jaxb_42 "%XSD_HOME%\ddi-cdi_42_noXsdTypeInName.xsd"

IF EXIST jaxb_43 RMDIR /S /Q jaxb_43
IF NOT EXIST jaxb_43 MKDIR jaxb_43
call %JAXB_HOME%\bin\xjc.bat -d jaxb_43 "%XSD_HOME%\ddi-cdi_43_noXsdTypeInName.xsd"

IF EXIST jaxb_44 RMDIR /S /Q jaxb_44
IF NOT EXIST jaxb_44 MKDIR jaxb_44
call %JAXB_HOME%\bin\xjc.bat -d jaxb_44 "%XSD_HOME%\ddi-cdi_44_noXsdTypeInName.xsd"

IF EXIST jaxb_45 RMDIR /S /Q jaxb_45
IF NOT EXIST jaxb_45 MKDIR jaxb_45
call %JAXB_HOME%\bin\xjc.bat -d jaxb_45 "%XSD_HOME%\ddi-cdi_45_noXsdTypeInName.xsd"

set JAXB_HOME=
set XSD_HOME=
