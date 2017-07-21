package com.phonemetra.turbo.launcher.beta.userevent.nano;

public final class LauncherLogProto {

    public static class Target {
        public static final int NONE = 0;
        public static final int ITEM = 1;
        public static final int CONTROL = 2;
        public static final int CONTAINER = 3;

        public int type;
        public int containerType = DEFAULT_CONTAINERTYPE;
        public int controlType = DEFAULT_CONTROLTYPE;
        public int itemType = DEFAULT_ITEMTYPE;

        public int pageIndex;
        public int rank;
        public int gridX;
        public int gridY;
        public int cardinality;
        public int packageNameHash;
        public int componentHash;
        public int intentHash;
        public int spanX = 1;
        public int spanY = 1;
        public int predictedRank;
        public int action;
    }

    // Item Type
    public static final int DEFAULT_ITEMTYPE = 0;
    public static final int APP_ICON = 1;
    public static final int SHORTCUT = 2;
    public static final int WIDGET = 3;
    public static final int FOLDER_ICON = 4;
    public static final int DEEPSHORTCUT = 5;
    public static final int SEARCHBOX = 6;

    // Container Types
    public static final int DEFAULT_CONTAINERTYPE = 0;
    public static final int WORKSPACE = 1;
    public static final int HOTSEAT = 2;
    public static final int FOLDER = 3;
    public static final int ALLAPPS = 4;
    public static final int WIDGETS = 5;
    public static final int OVERVIEW = 6;
    public static final int PREDICTION = 7;
    public static final int SEARCHRESULT = 8;
    public static final int DEEPSHORTCUTS = 9;

    // Control Type
    public static final int DEFAULT_CONTROLTYPE = 0;
    public static final int ALL_APPS_BUTTON = 1;
    public static final int WIDGETS_BUTTON = 2;
    public static final int WALLPAPER_BUTTON = 3;
    public static final int SETTINGS_BUTTON = 4;
    public static final int REMOVE_TARGET = 5;
    public static final int UNINSTALL_TARGET = 6;
    public static final int APPINFO_TARGET = 7;
    public static final int RESIZE_HANDLE = 8;
    public static final int VERTICAL_SCROLL = 9;

    public static class Action {
        public static final int TOUCH = 0;
        public static final int AUTOMATED = 1;

        public static final int TAP = 0;
        public static final int LONGPRESS = 1;
        public static final int DRAGDROP = 2;
        public static final int SWIPE = 3;
        public static final int FLING = 4;
        public static final int PINCH = 5;

        public static final int NONE = 0;
        public static final int UP = 1;
        public static final int DOWN = 2;
        public static final int LEFT = 3;
        public static final int RIGHT = 4;

        public int type;
        public int touch;
        public int dir;
    }

    public static class LauncherEvent {
        public Action action;

        public Target[] srcTarget;
        public Target[] destTarget;

        public long actionDurationMillis;
        public long elapsedContainerMillis;
        public long elapsedSessionMillis;
    }


}