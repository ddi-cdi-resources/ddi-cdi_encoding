set XSD_HOME=..\..\model_based\xsd_variants
set XSD_EXE_FOLDER=C:\Programs\c++xsd\xsd-4.2.0-x86_64-windows10\bin
rem set XSD_EXE_FOLDER=E:\DDI\CDI\SyntaxRepresentation\encoding\c++\xsd-4.2.0-x86_64-windows10\bin

%XSD_EXE_FOLDER%\xsd.exe cxx-tree --root-element DDICDIModels %XSD_HOME%\ddi-cdi_42_noXsdTypeInName.xsd
rem %XSD_EXE_FOLDER%\xsd.exe cxx-tree --root-element DDICDIModels %XSD_HOME%\ddi-cdi_43_noXsdTypeInName.xsd
rem %XSD_EXE_FOLDER%\xsd.exe cxx-tree --root-element DDICDIModels %XSD_HOME%\ddi-cdi_44_noXsdTypeInName.xsd
rem %XSD_EXE_FOLDER%\xsd.exe cxx-tree --root-element DDICDIModels %XSD_HOME%\ddi-cdi_45_noXsdTypeInName.xsd

set XSD_HOME=
set XSD_EXE_FOLDER=
