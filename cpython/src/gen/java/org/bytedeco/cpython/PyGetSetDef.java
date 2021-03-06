// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cpython;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.cpython.global.python.*;


@Properties(inherit = org.bytedeco.cpython.presets.python.class)
public class PyGetSetDef extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PyGetSetDef() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PyGetSetDef(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PyGetSetDef(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PyGetSetDef position(long position) {
        return (PyGetSetDef)super.position(position);
    }

    @MemberGetter public native @Cast("const char*") BytePointer name();
    public native getter get(); public native PyGetSetDef get(getter setter);
    public native setter set(); public native PyGetSetDef set(setter setter);
    @MemberGetter public native @Cast("const char*") BytePointer doc();
    public native Pointer closure(); public native PyGetSetDef closure(Pointer setter);
}
