package org.omg.PortableServer.POAPackage;


/**
 * org/omg/PortableServer/POAPackage/ServantNotActive.java .
 * Generated by the IDL-to-Java compiler (portable), version "3.2"
 * from c:/re/workspace/8-2-build-windows-amd64-cygwin/jdk8u60/4407/corba/src/share/classes/org/omg/PortableServer/poa.idl
 * Tuesday, August 4, 2015 11:07:54 AM PDT
 */

public final class ServantNotActive extends org.omg.CORBA.UserException {

    public ServantNotActive() {
        super(ServantNotActiveHelper.id());
    } // ctor


    public ServantNotActive(String $reason) {
        super(ServantNotActiveHelper.id() + "  " + $reason);
    } // ctor

} // class ServantNotActive
