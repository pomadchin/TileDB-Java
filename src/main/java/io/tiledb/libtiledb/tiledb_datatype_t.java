/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.tiledb.libtiledb;

public enum tiledb_datatype_t {
  TILEDB_INT32,
  TILEDB_INT64,
  TILEDB_FLOAT32,
  TILEDB_FLOAT64,
  TILEDB_CHAR,
  TILEDB_INT8,
  TILEDB_UINT8,
  TILEDB_INT16,
  TILEDB_UINT16,
  TILEDB_UINT32,
  TILEDB_UINT64;

  public final int swigValue() {
    return swigValue;
  }

  public static tiledb_datatype_t swigToEnum(int swigValue) {
    tiledb_datatype_t[] swigValues = tiledb_datatype_t.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (tiledb_datatype_t swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + tiledb_datatype_t.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private tiledb_datatype_t() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private tiledb_datatype_t(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private tiledb_datatype_t(tiledb_datatype_t swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

