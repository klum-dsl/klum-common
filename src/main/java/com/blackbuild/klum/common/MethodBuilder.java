package com.blackbuild.klum.common;

import groovyjarjarasm.asm.Opcodes;

public final class MethodBuilder extends GenericsMethodBuilder<MethodBuilder> {

    private MethodBuilder(String name) {
        super(name);
    }

    public static MethodBuilder createMethod(String name) {
        return new MethodBuilder(name);
    }

    public static MethodBuilder createPublicMethod(String name) {
        return new MethodBuilder(name).mod(Opcodes.ACC_PUBLIC);
    }

    public static MethodBuilder createOptionalPublicMethod(String name) {
        return new MethodBuilder(name).mod(Opcodes.ACC_PUBLIC).optional();
    }

    public static MethodBuilder createProtectedMethod(String name) {
        return new MethodBuilder(name).mod(Opcodes.ACC_PROTECTED);
    }

    public static MethodBuilder createPrivateMethod(String name) {
        return new MethodBuilder(name).mod(Opcodes.ACC_PRIVATE);
    }

}
