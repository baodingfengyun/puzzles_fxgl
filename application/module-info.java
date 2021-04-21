module application {
    requires com.almasb.fxgl.all;
    requires jdk.crypto.ec; // https://github.com/AlmasB/FXGL/issues/910

    exports application to com.almasb.fxgl.core;
}
