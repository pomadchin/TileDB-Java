/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.tiledb.libtiledb;

public class uint16_tArray {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected uint16_tArray(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(uint16_tArray obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        tiledbJNI.delete_uint16_tArray(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public uint16_tArray(int nelements) {
    this(tiledbJNI.new_uint16_tArray(nelements), true);
  }

  public int getitem(int index) {
    return tiledbJNI.uint16_tArray_getitem(swigCPtr, this, index);
  }

  public void setitem(int index, int value) {
    tiledbJNI.uint16_tArray_setitem(swigCPtr, this, index, value);
  }

  public SWIGTYPE_p_unsigned_short cast() {
    long cPtr = tiledbJNI.uint16_tArray_cast(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_unsigned_short(cPtr, false);
  }

  public static uint16_tArray frompointer(SWIGTYPE_p_unsigned_short t) {
    long cPtr = tiledbJNI.uint16_tArray_frompointer(SWIGTYPE_p_unsigned_short.getCPtr(t));
    return (cPtr == 0) ? null : new uint16_tArray(cPtr, false);
  }

}
