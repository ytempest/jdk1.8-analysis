package org.omg.DynamicAny.DynAnyFactoryPackage;


/**
 * org/omg/DynamicAny/DynAnyFactoryPackage/InconsistentTypeCode.java .
 * Generated by the IDL-to-Java compiler (portable), version "3.2"
 * from c:/re/workspace/8-2-build-windows-amd64-cygwin/jdk8u60/4407/corba/src/share/classes/org/omg/DynamicAny/DynamicAny.idl
 * Tuesday, August 4, 2015 11:07:52 AM PDT
 */

public final class InconsistentTypeCode extends org.omg.CORBA.UserException {

    public InconsistentTypeCode() {
        super(InconsistentTypeCodeHelper.id());
    } // ctor


    public InconsistentTypeCode(String $reason) {
        super(InconsistentTypeCodeHelper.id() + "  " + $reason);
    } // ctor

} // class InconsistentTypeCode
