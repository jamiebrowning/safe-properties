# safe-properties

Simple POC application that demonstrates the use of the Apache [Jaspyt](http://www.jasypt.org/index.html) library support for encrpyted properties. It comes in 2 flavours:

1. `SafePropertiesApplication` - the raw version
2. `SafePropertiesSwingApplication` - the integrated into Swing version

Both versions require the environment variable `$ENCRYPT_PASSWORD` to be set to **`MYPASSWORD`**. Although this obviously a contrived example, the principle is that the enryption password is not part of the application and can only be set with access to the runtime environment.

(if your running from within Eclipse on a Mac then you can set the environment variable through the Run Configuration settings)

TODO:

- SpringBoot version
- Integrate BouncyCastle provider (info [here](http://www.jasypt.org/non-default-providers.html))
