# safe-properties

Simple POC application that demonstrates the use of the Apache [Jaspyt](http://www.jasypt.org/index.html) library support for encrpyted properties. It comes in 2 flavours:

1. SafePropertiesApplication - the raw version
2. SafeProepetiesSwingApplication - the integrated into Swing version

Both version require and environment variable $ENCRYPT_PASSWORD to be set to MYPASSWORD.

e.g. EXPORT $ENCRYPT_PASSWORD=MYPASSWORD

(if your running from within Eclipse on a Mac then you can set the environment variable through the Run Configuration settings)

TODO:

- Integrate BouncyCastle provider (info [here](http://www.jasypt.org/non-default-providers.html))
