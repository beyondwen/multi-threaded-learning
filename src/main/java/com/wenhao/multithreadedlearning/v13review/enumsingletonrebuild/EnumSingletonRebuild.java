package com.wenhao.multithreadedlearning.v13review.enumsingletonrebuild;

public final class EnumSingletonRebuild {

    private EnumSingletonRebuild() {
    }

    enum EmunHolder {
        INSTANCE;

        private EnumSingletonRebuild instance;

        EmunHolder() {
            this.instance = new EnumSingletonRebuild();
        }

        public EnumSingletonRebuild getInstance() {
            return instance;
        }
    }

    public static EnumSingletonRebuild getInstance() {
        return EmunHolder.INSTANCE.getInstance();
    }
}
