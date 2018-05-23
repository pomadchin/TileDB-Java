/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2018 TileDB, Inc.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.tiledb.java.api;

import io.tiledb.libtiledb.*;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;

public class NativeArray implements AutoCloseable {
  private tiledb_datatype_t nativeType;
  private Class javaType;
  private floatArray floatArray;
  private doubleArray doubleArray;
  private int8_tArray int8_tArray;
  private int16_tArray int16_tArray;
  private int32_tArray int32_tArray;
  private int64_tArray int64_tArray;
  private uint8_tArray uint8_tArray;
  private uint16_tArray uint16_tArray;
  private uint32_tArray uint32_tArray;
  private uint64_tArray uint64_tArray;
  private int size;
//  private charArray charArray;

  /**
   * Creates an empty native array using a native datatype and a provided size
   * @param ctx
   * @param size
   * @param nativeType
   * @throws TileDBError
   */
  public NativeArray(Context ctx, int size, tiledb_datatype_t nativeType) throws TileDBError {
    ctx.deleterAdd(this);
    this.size = size;
    this.javaType = Types.getJavaType(nativeType);
    this.nativeType = nativeType;
    allocateEmptyArray();
  }

  /**
   * Creates an empty native array using a java datatype and a provided size
   * @param ctx
   * @param size
   * @param javaType
   * @throws TileDBError
   */
  public NativeArray(Context ctx, int size, Class javaType) throws TileDBError {
    ctx.deleterAdd(this);
    this.size = size;
    this.javaType = javaType;
    this.nativeType = Types.getNativeType(javaType);
    allocateEmptyArray();
  }

  /**
   * Creates a native array using a java datatype. It takes as input a Java buffer (i.e long[], int[]) and
   * copies its values to the C native array.
   * @param ctx
   * @param buffer
   * @param javaType
   * @throws TileDBError
   * @throws UnsupportedEncodingException
   */
  public NativeArray(Context ctx, Object buffer, Class javaType) throws TileDBError, UnsupportedEncodingException {
    ctx.deleterAdd(this);
    this.javaType = javaType;
    this.nativeType = Types.getNativeType(javaType);
    this.size = getSize(buffer);
    createNativeArrayFromBuffer(buffer);
  }

  /**
   * Creates a native array using a native datatype. It takes as input a Java buffer (i.e long[], int[]) and
   * copies its values to the C native array.
   * @param ctx
   * @param buffer
   * @param nativeType
   * @throws TileDBError
   * @throws UnsupportedEncodingException
   */
  public NativeArray(Context ctx, Object buffer, tiledb_datatype_t nativeType) throws TileDBError, UnsupportedEncodingException {
    ctx.deleterAdd(this);
    this.javaType = Types.getJavaType(nativeType);
    this.nativeType = nativeType;
    this.size = getSize(buffer);
    createNativeArrayFromBuffer(buffer);
  }

  protected NativeArray(Context ctx, tiledb_datatype_t nativeType, SWIGTYPE_p_p_void pointer) throws TileDBError {
    ctx.deleterAdd(this);
    this.javaType = Types.getJavaType(nativeType);
    this.nativeType = nativeType;
    createNativeArrayFromVoidPointer(pointer);
  }

  protected NativeArray(Context ctx, tiledb_datatype_t nativeType, SWIGTYPE_p_void pointer) throws TileDBError {
    ctx.deleterAdd(this);
    this.javaType = Types.getJavaType(nativeType);
    this.nativeType = nativeType;
    createNativeArrayFromVoidPointer(pointer);
  }

  private int getSize(Object buffer) throws UnsupportedEncodingException, TileDBError {
    switch(nativeType){
      case TILEDB_FLOAT32:{
        return ((float[])buffer).length;
      }
      case TILEDB_FLOAT64:{
        return ((double[])buffer).length;
      }
      case TILEDB_INT8:{
        return ((byte[])buffer).length;
      }
      case TILEDB_INT16:{
        return ((short[])buffer).length;
      }
      case TILEDB_INT32:{
        return ((int[])buffer).length;
      }
      case TILEDB_INT64:{
        return ((long[])buffer).length;
      }
      case TILEDB_UINT8:{
        return ((short[])buffer).length;
      }
      case TILEDB_UINT16:{
        return ((int[])buffer).length;
      }
      case TILEDB_UINT32: {
        return ((long[])buffer).length;
      }
      case TILEDB_UINT64: {
        return ((long[])buffer).length;
      }
      case TILEDB_CHAR: {
        return stringToBytes(buffer).length;
      }
      default:{
        throw new TileDBError("Not supported getDomain getType "+nativeType);
      }
    }
  }

  private void createNativeArrayFromBuffer(Object buffer) throws TileDBError, UnsupportedEncodingException {
    switch(nativeType){
      case TILEDB_FLOAT32:{
        size = ((float[])buffer).length;
        floatArray = Utils.newFloatArray((float[])buffer);
        break;
      }
      case TILEDB_FLOAT64:{
        size = ((double[])buffer).length;
        doubleArray = Utils.newDoubleArray((double[])buffer);
        break;
      }
      case TILEDB_INT8:{
        size = ((byte[])buffer).length;
        int8_tArray = Utils.newInt8_tArray((byte[])buffer);
        break;
      }
      case TILEDB_INT16:{
        size = ((short[])buffer).length;
        int16_tArray = Utils.newInt16_tArray((short[])buffer);
        break;
      }
      case TILEDB_INT32:{
        size = ((int[])buffer).length;
        int32_tArray = Utils.newInt32_tArray((int[])buffer);
        break;
      }
      case TILEDB_INT64:{
        size = ((long[])buffer).length;
        int64_tArray = Utils.newInt64_tArray((long[])buffer);
        break;
      }
      case TILEDB_UINT8:{
        size = ((short[])buffer).length;
        uint8_tArray = Utils.newUint8_tArray((short[])buffer);
        break;
      }
      case TILEDB_UINT16:{
        size = ((int[])buffer).length;
        uint16_tArray = Utils.newUint16_tArray((int[])buffer);
        break;
      }
      case TILEDB_UINT32: {
        size = ((long[])buffer).length;
        uint32_tArray = Utils.newUint32_tArray((long[])buffer);
        break;
      }
      case TILEDB_UINT64: {
        size = ((long[])buffer).length;
        uint64_tArray = Utils.newUint64Array((long[])buffer);
        break;
      }
      case TILEDB_CHAR: {
        byte[] bytes = stringToBytes(buffer);
        size = bytes.length;
        int8_tArray = Utils.newInt8_tArray(bytes);
        break;
      }
      default:{
        throw new TileDBError("Not supported getDomain getType "+nativeType);
      }
    }
  }

  private void allocateEmptyArray() throws TileDBError {
    switch (nativeType) {
      case TILEDB_FLOAT32: {
        floatArray = new floatArray(size);
        break;
      }
      case TILEDB_FLOAT64: {
        doubleArray = new doubleArray(size);
        break;
      }
      case TILEDB_INT8: {
        int8_tArray = new int8_tArray(size);
        break;
      }
      case TILEDB_INT16: {
        int16_tArray = new int16_tArray(size);
        break;
      }
      case TILEDB_INT32: {
        int32_tArray = new int32_tArray(size);
        break;
      }
      case TILEDB_INT64: {
        int64_tArray = new int64_tArray(size);
        break;
      }
      case TILEDB_UINT8: {
        uint8_tArray = new uint8_tArray(size);
        break;
      }
      case TILEDB_UINT16: {
        uint16_tArray = new uint16_tArray(size);
        break;
      }
      case TILEDB_UINT32: {
        uint32_tArray = new uint32_tArray(size);
        break;
      }
      case TILEDB_UINT64: {
        uint64_tArray = new uint64_tArray(size);
        break;
      }
      case TILEDB_CHAR: {
        int8_tArray = new int8_tArray(size);
        break;
      }
      default: {
        throw new TileDBError("Not supported native array getType " + nativeType);
      }
    }
  }

  /**
   * Returns the item on index position of the native array.
   * @param index
   * @return
   * @throws TileDBError
   */
  public Object getItem(int index) throws TileDBError {
    switch (nativeType) {
      case TILEDB_FLOAT32: {
        return floatArray.getitem(index);
      }
      case TILEDB_FLOAT64: {
        return doubleArray.getitem(index);
      }
      case TILEDB_INT8: {
        return int8_tArray.getitem(index);
      }
      case TILEDB_INT16: {
        return int16_tArray.getitem(index);
      }
      case TILEDB_INT32: {
        return int32_tArray.getitem(index);
      }
      case TILEDB_INT64: {
        return int64_tArray.getitem(index);
      }
      case TILEDB_UINT8: {
        return uint8_tArray.getitem(index);
      }
      case TILEDB_UINT16: {
        return uint16_tArray.getitem(index);
      }
      case TILEDB_UINT32: {
        return uint32_tArray.getitem(index);
      }
      case TILEDB_UINT64: {
        return uint64_tArray.getitem(index);
      }
      case TILEDB_CHAR: {
        return int8_tArray.getitem(index);
      }
      default: {
        throw new TileDBError("Not supported getDomain getType " + nativeType);
      }
    }
  }

  /**
   * Sets the item on index position of the native array.
   * @param index
   * @param value
   * @throws Exception
   */
  public void setItem(int index, Object value) throws Exception {
    switch (nativeType) {
      case TILEDB_FLOAT32: {
        floatArray.setitem(index, (float) value);
        break;
      }
      case TILEDB_FLOAT64: {
        doubleArray.setitem(index, (double) value);
        break;
      }
      case TILEDB_INT8: {
        int8_tArray.setitem(index, (byte) value);
        break;
      }
      case TILEDB_INT16: {
        int16_tArray.setitem(index, (short) value);
        break;
      }
      case TILEDB_INT32: {
        int32_tArray.setitem(index, (int) value);
        break;
      }
      case TILEDB_INT64: {
        int64_tArray.setitem(index, (long) value);
        break;
      }
      case TILEDB_UINT8: {
        uint8_tArray.setitem(index, (short) value);
        break;
      }
      case TILEDB_UINT16: {
        uint16_tArray.setitem(index, (int) value);
        break;
      }
      case TILEDB_UINT32: {
        uint32_tArray.setitem(index, (long) value);
        break;
      }
      case TILEDB_UINT64: {
        uint64_tArray.setitem(index, new BigInteger(value +""));
        break;
      }
      case TILEDB_CHAR: {
        for(byte b : stringToBytes(value)) {
          int8_tArray.setitem(index, b);
          index++;
        }
        break;
      }
      default: {
        throw new TileDBError("Not supported getDomain getType " + nativeType);
      }
    }
  }

  protected SWIGTYPE_p_void toVoidPointer() throws TileDBError {
    switch (nativeType) {
      case TILEDB_FLOAT32: {
        return PointerUtils.toVoid(floatArray);
      }
      case TILEDB_FLOAT64: {
        return PointerUtils.toVoid(doubleArray);
      }
      case TILEDB_INT8: {
        return PointerUtils.toVoid(int8_tArray);
      }
      case TILEDB_INT16: {
        return PointerUtils.toVoid(int16_tArray);
      }
      case TILEDB_INT32: {
        return PointerUtils.toVoid(int32_tArray);
      }
      case TILEDB_INT64: {
        return PointerUtils.toVoid(int64_tArray);
      }
      case TILEDB_UINT8: {
        return PointerUtils.toVoid(uint8_tArray);
      }
      case TILEDB_UINT16: {
        return PointerUtils.toVoid(uint16_tArray);
      }
      case TILEDB_UINT32: {
        return PointerUtils.toVoid(uint32_tArray);
      }
      case TILEDB_UINT64: {
        return PointerUtils.toVoid(uint64_tArray);
      }
      case TILEDB_CHAR: {
        return PointerUtils.toVoid(int8_tArray);
      }
      default: {
        throw new TileDBError("Not supported getDomain getType " + nativeType);
      }
    }
  }

  /**
   * Return a Java array (i.e. int[], long[]) that is a copy of the native array values with the given size.
   * @param elements
   * @return
   * @throws TileDBError
   */
  public Object toJavaArray(int elements) throws TileDBError {
    switch (nativeType) {
      case TILEDB_FLOAT32: {
        return Utils.floatArrayGet(floatArray,elements);
      }
      case TILEDB_FLOAT64: {
        return Utils.doubleArrayGet(doubleArray,elements);
      }
      case TILEDB_INT8: {
        return Utils.int8ArrayGet(int8_tArray,elements);
      }
      case TILEDB_INT16: {
        return Utils.int16ArrayGet(int16_tArray,elements);
      }
      case TILEDB_INT32: {
        return Utils.int32ArrayGet(int32_tArray,elements);
      }
      case TILEDB_INT64: {
        return Utils.int64ArrayGet(int64_tArray,elements);
      }
      case TILEDB_UINT8: {
        return Utils.uint8ArrayGet(uint8_tArray,elements);
      }
      case TILEDB_UINT16: {
        return Utils.uint16ArrayGet(uint16_tArray,elements);
      }
      case TILEDB_UINT32: {
        return Utils.uint32ArrayGet(uint32_tArray,elements);
      }
      case TILEDB_UINT64: {
        return Utils.uint64ArrayGet(uint64_tArray,elements);
      }
      case TILEDB_CHAR: {
        return Utils.int8ArrayGet(int8_tArray,elements);
      }
      default: {
        throw new TileDBError("Not supported getDomain getType " + nativeType);
      }
    }
  }

  private void createNativeArrayFromVoidPointer(SWIGTYPE_p_p_void pointer) throws TileDBError {
    switch (nativeType) {
      case TILEDB_FLOAT32: {
        floatArray = PointerUtils.floatArrayFromVoid(pointer);
        break;
      }
      case TILEDB_FLOAT64: {
        doubleArray = PointerUtils.doubleArrayFromVoid(pointer);
        break;
      }
      case TILEDB_INT8: {
        int8_tArray = PointerUtils.int8_tArrayFromVoid(pointer);
        break;
      }
      case TILEDB_INT16: {
        int16_tArray = PointerUtils.int16_tArrayFromVoid(pointer);
        break;
      }
      case TILEDB_INT32: {
        int32_tArray = PointerUtils.int32_tArrayFromVoid(pointer);
        break;
      }
      case TILEDB_INT64: {
        int64_tArray = PointerUtils.int64_tArrayFromVoid(pointer);
        break;
      }
      case TILEDB_UINT8: {
        uint8_tArray = PointerUtils.uint8_tArrayFromVoid(pointer);
        break;
      }
      case TILEDB_UINT16: {
        uint16_tArray = PointerUtils.uint16_tArrayFromVoid(pointer);
        break;
      }
      case TILEDB_UINT32: {
        uint32_tArray = PointerUtils.uint32_tArrayFromVoid(pointer);
        break;
      }
      case TILEDB_UINT64: {
        uint64_tArray = PointerUtils.uint64_tArrayFromVoid(pointer);
        break;
      }
      default: {
        throw new TileDBError("Not supported getDomain getType " + nativeType);
      }
    }
  }

  private void createNativeArrayFromVoidPointer(SWIGTYPE_p_void pointer) throws TileDBError {
    switch (nativeType) {
      case TILEDB_FLOAT32: {
        floatArray = PointerUtils.floatArrayFromVoid(pointer);
        break;
      }
      case TILEDB_FLOAT64: {
        doubleArray = PointerUtils.doubleArrayFromVoid(pointer);
        break;
      }
      case TILEDB_INT8: {
        int8_tArray = PointerUtils.int8_tArrayFromVoid(pointer);
        break;
      }
      case TILEDB_INT16: {
        int16_tArray = PointerUtils.int16_tArrayFromVoid(pointer);
        break;
      }
      case TILEDB_INT32: {
        int32_tArray = PointerUtils.int32_tArrayFromVoid(pointer);
        break;
      }
      case TILEDB_INT64: {
        int64_tArray = PointerUtils.int64_tArrayFromVoid(pointer);
        break;
      }
      case TILEDB_UINT8: {
        uint8_tArray = PointerUtils.uint8_tArrayFromVoid(pointer);
        break;
      }
      case TILEDB_UINT16: {
        uint16_tArray = PointerUtils.uint16_tArrayFromVoid(pointer);
        break;
      }
      case TILEDB_UINT32: {
        uint32_tArray = PointerUtils.uint32_tArrayFromVoid(pointer);
        break;
      }
      case TILEDB_UINT64: {
        uint64_tArray = PointerUtils.uint64_tArrayFromVoid(pointer);
        break;
      }
      default: {
        throw new TileDBError("Not supported getDomain getType " + nativeType);
      }
    }
  }

  private byte[] stringToBytes(Object buffer) throws UnsupportedEncodingException {
    return ((String) buffer).getBytes("UTF-8");
  }

  protected tiledb_datatype_t getNativeType() {
    return nativeType;
  }

  public Class getJavaType() {
    return javaType;
  }

  public int getSize() {
    return size;
  }

  /**
   * Delete the native object.
   */
  public void close() throws TileDBError {
    if(floatArray != null){
      floatArray.delete();
    }
    if(doubleArray != null){
      doubleArray.delete();
    }
    if(int8_tArray != null){
      int8_tArray.delete();
    }
    if(int16_tArray != null){
      int16_tArray.delete();
    }
    if(int32_tArray != null){
      int32_tArray.delete();
    }
    if(int64_tArray != null){
      int64_tArray.delete();
    }
    if(uint8_tArray != null){
      uint8_tArray.delete();
    }
    if(uint16_tArray != null){
      uint16_tArray.delete();
    }
    if(uint32_tArray != null){
      uint32_tArray.delete();
    }
    if(uint64_tArray != null){
      uint64_tArray.delete();
    }
  }

  @Override
  protected void finalize() throws Throwable {
    close();
    super.finalize();
  }
}