options(echo=TRUE)

library(sloop)
library(XML)
library(XMLSchema)

args <- commandArgs(TRUE)
print(args[1])

print('--------------------------------------------------')
cdi = readSchema(args[1], createConverters = TRUE, verbose = TRUE)
# cdi = readSchema("E:/Git/ddi-cdi/build/encoding/xml-schema/ddi-cdi.xsd", createConverters = TRUE)

print('--------------------------------------------------')
is(cdi)

print('--------------------------------------------------')
otype(cdi)

print('--------------------------------------------------')
class(cdi)

print('--------------------------------------------------')
names(cdi)

print('--------------------------------------------------')
sapply(cdi, length)

print('--------------------------------------------------')
sapply(cdi, class)

print('--------------------------------------------------')
sapply(cdi, names)

print('--------------------------------------------------')
showMethods( classes=class(cdi) )

print('--------------------------------------------------')
print(cdi)

print('--------------------------------------------------')
saveRDS(cdi, 'cdi.rds')
rm(cdi)
exists("cdi")
cdi <- readRDS('cdi.rds')
otype(cdi)
class(cdi)
names(cdi)

# serialize S4 classes, not sure if this is right
sink("cdi.R")
sapply(cdi, expandS4)
sink()
