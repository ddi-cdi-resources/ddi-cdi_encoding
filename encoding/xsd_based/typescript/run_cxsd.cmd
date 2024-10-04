set XSD_HOME=..\..\model_based\xsd_variants

rem from https://github.com/charto/cxsd
rem   The first line just sets up NPM to allow calling cxsd without installing it globally. It also works on Windows if you omit the single quotes (').

rem echo { "scripts": { "cxsd": "cxsd" } } > package.json
rem npm install cxsd

start python -m http.server --directory %XSD_HOME%
TIMEOUT /T 10

IF EXIST xmlns RMDIR /S /Q xmlns
IF EXIST 42 RMDIR /S /Q 42
IF NOT EXIST 42 MKDIR 42
call npm run cxsd http://localhost:8000/ddi-cdi_42_noXsdTypeInName.xsd > 42.log 2>&1
move xmlns 42

IF EXIST xmlns RMDIR /S /Q xmlns
IF EXIST 43 RMDIR /S /Q 43
IF NOT EXIST 43 MKDIR 43
call npm run cxsd http://localhost:8000/ddi-cdi_43_noXsdTypeInName.xsd > 43.log 2>&1
move xmlns 43

IF EXIST xmlns RMDIR /S /Q xmlns
IF EXIST 44 RMDIR /S /Q 44
IF NOT EXIST 44 MKDIR 44
call npm run cxsd http://localhost:8000/ddi-cdi_44_noXsdTypeInName.xsd > 44.log 2>&1
move xmlns 44

IF EXIST xmlns RMDIR /S /Q xmlns
IF EXIST 45 RMDIR /S /Q 45
IF NOT EXIST 45 MKDIR 45
call npm run cxsd http://localhost:8000/ddi-cdi_45_noXsdTypeInName.xsd > 45.log 2>&1
move xmlns 45

set XSD_HOME=
