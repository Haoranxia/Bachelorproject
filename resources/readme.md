### Resources folder

This folder contains headers for features that require some pre-defined set of items to extract. Currently we use it for opcodes, permissions, hardware features, software features, and string obfuscation sentinels.

For example, the permissions.txt file contains all Android system permissions. We use this file to see what permissions an apk asks for in respect to all the (Android system) permissions

If you wish to change a header file make sure that you start over with a new CSV file for output. If incompatibility between headers is found then the writing to CSV functionality is not guaranteed to succeed.