# tiledb-jni

## Build

To build the jni library run:

`./gradlew assemble`

This will create the tiledb JNI library in build/libtiledb.jnilib.

Before running the JAVA code you should copy this file in your machine library path. Alternatively you can add the build folder in your LD_LIBRARY_PATH env variable.

## Tests

To run the tests use:

`./gradlew test`

## Examples

You can run the examples located in src/main/java/examples using you IDE or from a terminal.

To run an example from the terminal use:

`java -cp build/libs/tiledb-jni-1.0-SNAPSHOT.jar examples.TiledbArraySchema`