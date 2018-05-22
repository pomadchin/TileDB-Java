/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.tiledb.libtiledb;

public class uint32_tArray {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected uint32_tArray(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(uint32_tArray obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        tiledbJNI.delete_uint32_tArray(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public uint32_tArray(int nelements) {
    this(tiledbJNI.new_uint32_tArray(nelements), true);
  }

  public long getitem(int index) {
    return tiledbJNI.uint32_tArray_getitem(swigCPtr, this, index);
  }

  public void setitem(int index, long value) {
    tiledbJNI.uint32_tArray_setitem(swigCPtr, this, index, value);
  }

  public SWIGTYPE_p_unsigned_int cast() {
    long cPtr = tiledbJNI.uint32_tArray_cast(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_unsigned_int(cPtr, false);
  }

  public static uint32_tArray frompointer(SWIGTYPE_p_unsigned_int t) {
    long cPtr = tiledbJNI.uint32_tArray_frompointer(SWIGTYPE_p_unsigned_int.getCPtr(t));
    return (cPtr == 0) ? null : new uint32_tArray(cPtr, false);
  }

}
