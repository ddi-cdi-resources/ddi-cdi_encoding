set RSCRIPT=C:\Program Files\R\R-4.3.2\bin\Rscript.exe
set XSD_HOME=..\..\..\model_based\xsd_variants

REM "%RSCRIPT%" script.R %XSD_HOME%\ddi-cdi_42_noXsdTypeInName.xsd > log42.txt
REM rename cdi.rds cdi42.rds

REM "%RSCRIPT%" script.R %XSD_HOME%\ddi-cdi_43_noXsdTypeInName.xsd > log43.txt
REM rename cdi.rds cdi43.rds

REM "%RSCRIPT%" script.R %XSD_HOME%\ddi-cdi_44_noXsdTypeInName.xsd > log44.txt
REM rename cdi.rds cdi44.rds

"%RSCRIPT%" script.R %XSD_HOME%\ddi-cdi_45_noXsdTypeInName.xsd > log45.txt
REM rename cdi.rds cdi45.rds

set RSCRIPT=
set XSD_HOME=
