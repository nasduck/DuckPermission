package com.nasduck.duckpermission.result;

import android.app.Activity;
import android.content.pm.PackageManager;
import android.support.annotation.NonNull;

/**
 * Do nothing if not granted
 */
public class RequestPermissionsResultNothing implements IDuckPermissionResult {

    @Override
    public boolean onPermissionsResult(Activity activity, @NonNull String[] permissions, @NonNull int[] grantResults) {
        for (int grant : grantResults) {
            if (grant == PackageManager.PERMISSION_DENIED) {
                // do nothing if permission denied
                return false;
            }
        }

        return true;
    }
}