package com.sun.corba.se.spi.activation;

/**
 * com/sun/corba/se/spi/activation/ServerAlreadyInstalledHolder.java .
 * Generated by the IDL-to-Java compiler (portable), version "3.2"
 * from c:/re/workspace/8-2-build-windows-amd64-cygwin/jdk8u60/4407/corba/src/share/classes/com/sun/corba/se/spi/activation/activation.idl
 * Tuesday, August 4, 2015 11:07:52 AM PDT
 */

public final class ServerAlreadyInstalledHolder implements org.omg.CORBA.portable.Streamable {
    public com.sun.corba.se.spi.activation.ServerAlreadyInstalled value = null;

    public ServerAlreadyInstalledHolder() {
    }

    public ServerAlreadyInstalledHolder(com.sun.corba.se.spi.activation.ServerAlreadyInstalled initialValue) {
        value = initialValue;
    }

    public void _read(org.omg.CORBA.portable.InputStream i) {
        value = com.sun.corba.se.spi.activation.ServerAlreadyInstalledHelper.read(i);
    }

    public void _write(org.omg.CORBA.portable.OutputStream o) {
        com.sun.corba.se.spi.activation.ServerAlreadyInstalledHelper.write(o, value);
    }

    public org.omg.CORBA.TypeCode _type() {
        return com.sun.corba.se.spi.activation.ServerAlreadyInstalledHelper.type();
    }

}