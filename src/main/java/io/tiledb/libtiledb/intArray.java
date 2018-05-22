/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.tiledb.libtiledb;

public class intArray {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected intArray(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(intArray obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        tiledbJNI.delete_intArray(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public intArray(int nelements) {
    this(tiledbJNI.new_intArray(nelements), true);
  }

  public int getitem(int index) {
    return tiledbJNI.intArray_getitem(swigCPtr, this, index);
  }

  public void setitem(int index, int value) {
    tiledbJNI.intArray_setitem(swigCPtr, this, index, value);
  }

  public SWIGTYPE_p_int cast() {
    long cPtr = tiledbJNI.intArray_cast(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_int(cPtr, false);
  }

  public static intArray frompointer(SWIGTYPE_p_int t) {
    long cPtr = tiledbJNI.intArray_frompointer(SWIGTYPE_p_int.getCPtr(t));
    return (cPtr == 0) ? null : new intArray(cPtr, false);
  }

}
