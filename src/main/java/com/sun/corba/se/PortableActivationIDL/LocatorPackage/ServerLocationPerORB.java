package com.sun.corba.se.PortableActivationIDL.LocatorPackage;


/**
 * com/sun/corba/se/PortableActivationIDL/LocatorPackage/ServerLocationPerORB.java .
 * Generated by the IDL-to-Java compiler (portable), version "3.2"
 * from c:/re/workspace/8-2-build-windows-amd64-cygwin/jdk8u60/4407/corba/src/share/classes/com/sun/corba/se/PortableActivationIDL/activation.idl
 * Tuesday, August 4, 2015 11:07:52 AM PDT
 */

public final class ServerLocationPerORB implements org.omg.CORBA.portable.IDLEntity {
    public String hostname = null;
    public com.sun.corba.se.PortableActivationIDL.EndPointInfo ports[] = null;

    public ServerLocationPerORB() {
    } // ctor

    public ServerLocationPerORB(String _hostname, com.sun.corba.se.PortableActivationIDL.EndPointInfo[] _ports) {
        hostname = _hostname;
        ports = _ports;
    } // ctor

} // class ServerLocationPerORB