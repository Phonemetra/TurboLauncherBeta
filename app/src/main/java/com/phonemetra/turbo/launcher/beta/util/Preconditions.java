/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.phonemetra.turbo.launcher.beta.util;

import android.os.Looper;

import com.phonemetra.turbo.launcher.beta.LauncherModel;
import com.phonemetra.turbo.launcher.beta.config.ProviderConfig;

/**
 * A set of utility methods for thread verification.
 */
public class Preconditions {

    public static void assertNotNull(Object o) {
        if (o == null) {
            throw new IllegalStateException();
        }
    }

    public static void assertWorkerThread() {
        if (!isSameLooper(LauncherModel.getWorkerLooper())) {
            throw new IllegalStateException();
        }
    }

    public static void assertUIThread() {
        if (!isSameLooper(Looper.getMainLooper())) {
            throw new IllegalStateException();
        }
    }

    public static void assertNonUiThread() {
        if (isSameLooper(Looper.getMainLooper())) {
            throw new IllegalStateException();
        }
    }

    private static boolean isSameLooper(Looper looper) {
        return Looper.myLooper() == looper;
    }
}
