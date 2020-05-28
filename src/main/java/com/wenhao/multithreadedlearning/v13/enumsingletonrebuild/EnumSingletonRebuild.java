package com.wenhao.multithreadedlearning.v13.enumsingletonrebuild;

public class EnumSingletonRebuild {

    private EnumSingletonRebuild() {

    }

    private enum EnmuHolder {
        INSTANCE;

        private EnumSingletonRebuild instance;

        EnmuHolder() {
            this.instance = new EnumSingletonRebuild();
        }

        private EnumSingletonRebuild getEnumSingletonRebuild() {
            return instance;
        }
    }

    public static EnumSingletonRebuild getInstance() {
        return EnmuHolder.INSTANCE.getEnumSingletonRebuild();
    }
}
