package org.omg.IOP.CodecPackage;


/**
 * org/omg/IOP/CodecPackage/InvalidTypeForEncoding.java .
 * Generated by the IDL-to-Java compiler (portable), version "3.2"
 * from c:/re/workspace/8-2-build-windows-amd64-cygwin/jdk8u60/4407/corba/src/share/classes/org/omg/PortableInterceptor/IOP.idl
 * Tuesday, August 4, 2015 11:07:53 AM PDT
 */

public final class InvalidTypeForEncoding extends org.omg.CORBA.UserException {

    public InvalidTypeForEncoding() {
        super(InvalidTypeForEncodingHelper.id());
    } // ctor


    public InvalidTypeForEncoding(String $reason) {
        super(InvalidTypeForEncodingHelper.id() + "  " + $reason);
    } // ctor

} // class InvalidTypeForEncoding
